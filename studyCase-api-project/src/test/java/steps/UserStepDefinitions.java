package steps;

import io.cucumber.docstring.DocString;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.http.HttpStatus;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.is;


public class UserStepDefinitions {

    private Map<String, String> expectedUser = new HashMap<>();

    @When("I do a POST to {word} with the following values:")
    public void iDoAPOSTToUserWithTheFollowingValues(String endpoint, Map<String ,String> user) {
        expectedUser = user;

        given().body(user).when()
                .post(endpoint).
                then().statusCode(HttpStatus.SC_OK);
    }

    @Then("I receive the created user when  I do a Get to {word}")
    public void iReceiveTheCreatedUserWhenIDoAGetToUser(String endpoint) {

        when().
                get( endpoint).
                then().
                statusCode(HttpStatus.SC_OK).body("username", is(expectedUser.get("username")));
    }

    @When("I do a POST to {word} with the docstring:")
    public void iDoAPOSTToUserWithTheDocstring(String endpoint, DocString docString) {
        expectedUser.put("username", "test");

        given().
                body(docString.getContent()).
                when()
                .post(endpoint).
                then().
                statusCode(HttpStatus.SC_OK);

    }
}
