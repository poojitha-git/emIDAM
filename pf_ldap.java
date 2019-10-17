package PageFactory;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Generic_Library.Utility;

public class pf_ldap extends pf_GenericMethods {
	
	final static Logger log = Logger.getLogger(pf_ldap.class);
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"accordion\"]/li[14]/a") WebElement ldap;
	@FindBy(how = How.ID, using = "createLdapConnection") WebElement ldapcntn;
	@FindBy(how = How.ID, using = "connName") WebElement cntnName;
	@FindBy(how = How.ID, using = "url") WebElement url;
	@FindBy(how = How.ID, using = "containerLDAP") WebElement ldapcntnr;
	@FindBy(how = How.ID, using = "adminDN") WebElement admin;
	@FindBy(how = How.ID, using = "password") WebElement pswd;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ldapForm\"]/ul/li[6]/a[1]") WebElement test;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ldapForm\"]/ul/li[6]/a[2]") WebElement save;
	
public pf_ldap(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}

public void LDAP() throws Exception

{
	et=es.startTest("Creating the LDAP Connection");
	cl_click(ldap);
	cl_click(ldapcntn);
	String name = Utility.getpropertydetails("Connection_Name");
	cl_entertext(cntnName,name);
	String u = Utility.getpropertydetails("URL");
	cl_entertext(url,u);
	String cnt = Utility.getpropertydetails("LDAP_Container");
	cl_entertext(ldapcntnr,cnt);
	String ad = Utility.getpropertydetails("Admin");
	cl_entertext(admin,ad);
	String pwd = Utility.getpropertydetails("Password");
	cl_entertext(pswd,pwd);
	Thread.sleep(3000);
	cl_click(test);
	Thread.sleep(3000);
	cl_click(save);
	Thread.sleep(3000);
	
}
}
