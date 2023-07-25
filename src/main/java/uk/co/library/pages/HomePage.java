package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitle;

    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement location;
    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;



    public void enterJobTitle(String jTitle){
        sendTextToElement(jobTitle,jTitle);

    }

    public void enterLocation(String cityLocation) {
        sendTextToElement(location , cityLocation);
        log.info("Enter location : " + location.toString());

    }
    public void selectDistance(String distance){
        selectByValueFromDropDown(distanceDropDown, distance);
        log.info("Select Distance : " + distanceDropDown.toString());

    }
    public void clickOnMoreSearchOptionLink(){
        clickOnElement(moreSearchOptionsLink);
        log.info("Click on more search option : ");

    }
    public void enterMinSalary(String minSalary){
        sendTextToElement(salaryMin,minSalary);
        log.info("Enter Min Salary : " + salaryMin.toString());

    }
    public void enterMaxSalary(String maxSalary){
        sendTextToElement(salaryMax,maxSalary);
        log.info("Enter Max Salary : " + salaryMax.toString());
    }
    public void selectSalaryType(String sType){
        selectByVisibleTextFromDropDown(salaryTypeDropDown,sType);
        log.info("Select salary type : " + salaryTypeDropDown.toString());
    }
    public void selectJobType(String jobType){
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);
        log.info("Select job type : " + jobTypeDropDown.toString());
    }
    public void clickOnFindJobsButton(){
        clickOnElement(findJobsBtn);
        log.info("Click on Find Jobs Button: ");
    }
}
