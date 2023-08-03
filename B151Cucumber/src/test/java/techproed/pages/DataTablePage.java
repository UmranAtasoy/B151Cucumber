package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class DataTablePage {
    public DataTablePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//button)[1]")
    public WebElement newButton;


    @FindBy(xpath = "//*[@id='DTE_Field_first_name']")
    public WebElement firstname;

    @FindBy(xpath = "(//button)[4]")
    public WebElement createButton;

    @FindBy(xpath = "//*[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//tbody//tr[1]//td[2]")
    public WebElement verify;

}
