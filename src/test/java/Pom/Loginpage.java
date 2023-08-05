package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//pom class dont have main method ITS HAVE NON STATIC METHODS
//pom is coming fromcoming from selenium support
/**
 * This is a pom class for Login page of ActiTime Application
 * @author  ELCOT
 */

public class Loginpage { //Rule1 : create a seprate pom class for every web pages

	
	//Rule 2: identify the web elements of this page using @FindBy,@FindBys @FindAll anotations
//anotations using private all the elements related to the web page need to identify
	@FindBy(id = "username")  
	private WebElement userNameEdt;//Edt = edit which means its textx field ,this is completely one sentance as per the rule we need to mention private
	//userNameEdt as he is no accessable outside the class 
	
	@FindBy(name = "pwd")
	private WebElement passwordEdt;
	//passwordEdt as he is no accessable outside the class	

	@FindBy(id = "loginButton")
	private WebElement loginLnk; //lnk its a link // Btn button //dropDwn
	//loginLnk as he is no accessable outside the class
	
	
	//Rule 3: create a constructor to initialise the web elements
	//need manitatory its a common code bigot also
	public Loginpage(WebDriver driver)//we need use the clas name in public
//loginpage is a constructor ,paramenter for driver this annotation we can't perform any things
	{
		PageFactory.initElements(driver, this); // current driver reference
	//pagefactory-org.opselen,class overloadmethod-initElements(ElementLocatorFactory.objectpage) 
	}

	//Rule 4: Provide getters to Access these web elements
//**Important
	//we need to generate the class for that we need select the current file(Loginpage)- right click - soruce- generate getterand setter select - we need to select all other wise we need to select what we need
	public WebElement getUserNameEdt() {
		return userNameEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginLnk() {
		return loginLnk;
	}
	
	
	//Business Library - method created using the elements related to this page only
	/**
	 * This method will login to app
	 * @param USERNAME
	 * @param PASSWORD
	 */
	public void loginToApp(String USERNAME, String PASSWORD)
	{
		userNameEdt.sendKeys(USERNAME);
		passwordEdt.sendKeys(PASSWORD);
		loginLnk.click();
	}
	

}
