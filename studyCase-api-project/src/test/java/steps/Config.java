package steps;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import org.junit.Before;

public class Config {

    @Before
    public void setup() {

        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();

        RestAssured.baseURI="https://petstore.swagger.io";
        RestAssured.basePath="/#";

        RestAssured.requestSpecification = new RequestSpecBuilder().
                addHeader("Authorization", getToken()).
                setContentType(ContentType.JSON).
                build();

        RestAssured.responseSpecification = new ResponseSpecBuilder().
                expectContentType(ContentType.JSON).
                build();
    }
    private String getToken(){

        return "test";
    }
}
