package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by annguyenx1 on 6/29/2017.
 */
public class RegisterPage extends Page {

    @FindBy(id="FirstName")
    private WebElement firstName;

    @FindBy(id="LastName")
    private WebElement lastName;

    @FindBy(id="GmailAddress")
    private WebElement gMail;

    @FindBy(id="Passwd")
    private WebElement passWord;

    @FindBy(id="PasswdAgain")
    private WebElement confirmPw;

    @FindBy(id="submitbutton")
    private WebElement nextStepBtn;

    @FindBy(id="errormsg_0_GmailAddress")
    private WebElement errorMsgGmailAddress;


    public void inputFirstName(String fName) {
        firstName.sendKeys(fName);
    }
    public void inputLastName(String lName) { lastName.sendKeys(lName);}
    public void inputGmail(String mail) { gMail.sendKeys(mail);}
    public void inputPassword(String pw) {passWord.sendKeys(pw);}
    public void inputConfirmPassword(String cpw) {confirmPw.sendKeys(cpw);}
    public void clickNextStepBtn() { nextStepBtn.click();}

}
