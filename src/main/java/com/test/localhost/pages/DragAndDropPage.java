package com.test.localhost.pages;

import com.test.localhost.utils.BrowserUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.CompositeAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDropPage {

    public DragAndDropPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText = "Drag and Drop")
    WebElement dragAndDropButton;

    @FindBy(id = "column-a")
    WebElement aBox;

    @FindBy(xpath = "//div[@id='column-b']")
    WebElement bBox;




    public void clickDragAndDropButton(){
        dragAndDropButton.click();
    }
    public void dragAndDrop(WebDriver driver){
        Actions actions = new Actions(driver);
        // actions.clickAndHold(aBox).moveToElement(bBox).release().perform();
        actions.dragAndDrop(aBox,bBox).perform();
    }
    public String getTextBoxA(){
        return BrowserUtils.getText(aBox);
    }
}
