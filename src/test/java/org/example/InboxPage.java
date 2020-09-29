package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class InboxPage {
    public WebDriver driver;

    public InboxPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//div[@class='T-I T-I-KE L3']")
    private WebElement inboxButton;
    @FindBy(xpath = "//textarea[@name='to']")
    private WebElement txtArea;
    @FindBy(xpath = "//input[@name='subjectbox']")
    private WebElement txtSubject;
    @FindBy(xpath = "//div[@class='Am Al editable LW-avf tS-tW']")
    private WebElement txtMessage;
    @FindBy(xpath = "//table/tbody/tr/td/div/span[@class='bA4']/span")
    private List<WebElement> inboxMessage;
    @FindBy(xpath = "//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")
    private WebElement sendButton;

    public int findInboxMessage(String name) {
        int namecount = 0;
        for (int i = 0; i < inboxMessage.size(); i++) {
            if (inboxMessage.get(i).getText().equals(name)) {
                namecount++;
            }

        }
        return namecount;

    }


    public void sendTxtArea() {
        txtArea.sendKeys("farit.valiahmetov@simbirsoft.com");
    }

    public void sendTxtSubject() {
        txtSubject.sendKeys("Тестовое задание. Антонов М.С.");
    }

    public void clickInboxButton() {
        inboxButton.click();
    }

    public void sendTxtMessage(int name) {
        txtMessage.sendKeys("Найдено писем: " + name);
    }

    public void clickSendButton() {
        sendButton.click();
    }
}
