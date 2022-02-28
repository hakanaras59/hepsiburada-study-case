package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Base_PO;
import pageObjects.Login_PO;
import pageObjects.MainPage_PO;


public class Low_Rate_Seller_Item_Add_To_Cart_Steps extends Base_PO {
    private Login_PO login_po;
    private MainPage_PO mainPage_po;

    public Low_Rate_Seller_Item_Add_To_Cart_Steps(Login_PO login_po,MainPage_PO mainPage_po) {
        this.login_po = login_po;
        this.mainPage_po=mainPage_po;
    }

    @Given("I access the hepsi burada login page")
    public void i_access_the_hepsi_burada_login_page()  {
        login_po.navigateTo_HepsiBurada_Login_Page();
    }
    @When("I move to login button")
    public void i_move_to_login_button() throws Exception {
        login_po.moveOn_My_Account_Button();
    }
    @When("I click login")
    public void i_click_login() throws Exception{
        login_po.click_Login_Account();
    }
    @When("I enter a username {}")
    public void i_enter_a_username(String username) {
        login_po.set_Username(username);
    }
    @When("I click on the login button after userName")
    public void i_click_on_the_login_button_after_username() {
        login_po.click_Submit_Button_After_User_Name();
    }
    @When("I enter a password {}")
    public void i_enter_a_password(String password) {
        login_po.set_Password(password);
    }
    @When("I click on the login button after passWord")
    public void i_click_on_the_login_button_after_password() {
        login_po.click_Submit_Button_After_Password();
    }
    @When("I enter a search text {}")
    public void i_enter_a_search_text(String searchText) {
        mainPage_po.set_Search_Input(searchText);
    }
    @When("I click on the search")
    public void i_click_on_the_search() {
        mainPage_po.click_Search_Button();
    }
    @When("I enter a first price range {}")
    public void i_enter_a_first_price_range(String min) {
        mainPage_po.set_price_range_Input_Min(min);

    }
    @When("I enter a second price range {}")
    public void i_enter_a_second_price_range(String max) {
        mainPage_po.set_price_range_Input_Max(max);
    }
    @When("I click on the range search button")
    public void i_click_on_the_range_search_button() {
        mainPage_po.click_Range_Search_Button();
    }
    @When("I select a product")
    public void i_select_a_product() throws InterruptedException {
        Thread.sleep(5000);
        mainPage_po.select_Searched_Item();
    }
    @When("I click on all sellers")
    public void i_click_on_all_sellers() {
        mainPage_po.click_All_Sellers();
    }
    @When("I select lowest rated seller")
    public void i_select_lowest_rated_seller() {
        mainPage_po.sort_All_Sellers_And_Select_Lowest_Rated_Seller();

    }
    @When("I close opened popup")
    public void i_close_opened_popup() throws InterruptedException {
        mainPage_po.close_Suggested_Product_Popup();
    }
    @When("I go cart")
    public void i_go_cart() {
        mainPage_po.click_Go_To_Basket_Button();
    }
    @Then("I should be presented item in cart")
    public void i_should_be_presented_item_in_cart() {
        mainPage_po.check_Is_Item_Present();
    }
}
