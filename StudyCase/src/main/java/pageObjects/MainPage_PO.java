package pageObjects;

import org.apache.commons.lang3.RandomUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage_PO extends Base_PO {

    private String rnd = "#i";
    private @FindBy(xpath = "//*[@id=\"SearchBoxOld\"]/div/div/div[1]/div[2]/input")
    WebElement search_TextField;
    private @FindBy(xpath = "//*[@id=\"SearchBoxOld\"]/div/div/div[2]")
    WebElement search_Button;
    private @FindBy(xpath = "//*[@id=\"fiyat\"]/div/div/div/div/div[1]/div/div[1]/input")
    WebElement range_Input_Min;
    private @FindBy(xpath = "/html//div[@id='fiyat']/div/div/div//div[@class='content-rangeInputContainer']/div[2]/input")
    WebElement range_Input_Max;
    private @FindBy(xpath = "//*[@id=\"fiyat\"]/div/div/div/div/div[1]/button")
    WebElement range_Select_Button;
    private @FindBy(xpath = "/html//td[@id='merchantTabTrigger']")
    WebElement All_Merchants_Tab;
    private @FindBy(xpath = "//table[@id='merchant-list']//tr[@class='title-list']/td[2]/a[.='Satıcı']")
    WebElement sort_Merchants;
    private @FindBy(xpath = "//table[@id='merchant-list']/tbody/tr[3]//form[@action='/ShoppingCart/AddToCart']/button[@class='add-to-basket button']")
    WebElement add_To_Cart_Button;
    private @FindBy(xpath = "//div[@id='pcwrapper']//i[@class='close']")
    WebElement suggested_Product_Close_Button;
    private @FindBy(xpath = "/html/body/div[5]/div//div[@class='checkoutui-AddToCart-137vh']/div[@class='checkoutui-Modal-1Myi1 checkoutui-Modal-2vGqO']/div[@class='checkoutui-Modal-1k7QD']/div[@class='checkoutui-Modal-iooaV']//div[@class='checkoutui-ProductOnBasketHeader-m4tLG']/button[1]")
    WebElement popUp_Go_To_Basket_Button;
    private @FindBy(xpath = "//*[@id=\"onboarding_item_list\"]/div[3]/div")
    WebElement merchantBox;


    public MainPage_PO() {
        super();
    }

    public void set_Search_Input(String searchText) {
        sendKeys(search_TextField, searchText);
    }

    public void click_Search_Button() {
        waitForWebElementAndClick(search_Button);
    }

    public void set_price_range_Input_Min(String min) {
        sendKeys(range_Input_Min, min);
    }

    public void set_price_range_Input_Max(String max) {
        sendKeys(range_Input_Max, max);
    }

    public void click_Range_Search_Button() {
        waitForWebElementAndClick(range_Select_Button);
    }

    public void select_Searched_Item() {
        rnd = rnd + RandomUtils.nextInt(8, 12);
        By select_Searched_Item = By.cssSelector(rnd);
        waitForWebElementAndClick(select_Searched_Item);
    }

    public void click_All_Sellers() {
        switchToNewOpenedChildPage();
        jsPageScroll(100, 100);
        waitForWebElementAndClick(All_Merchants_Tab);
    }

    public void sort_All_Sellers_And_Select_Lowest_Rated_Seller() {
        waitForWebElementAndClick(sort_Merchants);
        waitForWebElementAndClick(add_To_Cart_Button);
    }

    public void close_Suggested_Product_Popup() {
        waitForWebElementAndClick(suggested_Product_Close_Button);
    }

    public void click_Go_To_Basket_Button() {
        waitForWebElementAndClick(popUp_Go_To_Basket_Button);
    }

    public void check_Is_Item_Present() {
        isElementDisplayed(merchantBox);
        System.out.println("Element is displayed : " + merchantBox);
    }


}
