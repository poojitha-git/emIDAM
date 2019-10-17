package PageFactory;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import Generic_Library.Utility;

public class pf_Apps extends pf_GenericMethods {
	
final static Logger log = Logger.getLogger(pf_Apps.class);
	
	// Apps 
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"accordion\"]/li[9]/a") WebElement app;
	@FindBy(how = How.XPATH, using = "//*[@id=\"collapseSix\"]/ul/li[1]/div/a") WebElement apps;
	@FindBy(how = How.ID, using = "createApp") WebElement createapps;
	@FindBy(how = How.ID, using = "appID") WebElement appid;
	@FindBy(how = How.ID, using = "appLogoutURL") WebElement url;
	@FindBy(how = How.XPATH, using = "//*[@id=\"appForm\"]/div/input") WebElement create;
	@FindBy(how = How.ID, using = "succesMsg") WebElement scsMsg;
	@FindBy(how = How.ID, using = "closeWindowAlert") WebElement close;
	
	@FindBy(how = How.CSS, using = "#manageApp") WebElement mngApp;
	//@FindBy(how = How.ID, using = "manageApp") WebElement mngApp;
	@FindBy(how = How.XPATH, using = "//*[@id=\"manageAppspager_left\"]/table/tbody/tr/td[1]/div") WebElement searchapp;
	@FindBy(how = How.ID, using = "gs_logoutURL") WebElement srchURl;
	
	@FindBy(how = How.ID, using = "gs_appName") WebElement srchappNm;
	@FindBy(how = How.XPATH, using = "//*[@title='Edit']/i") WebElement edit;
	@FindBy(how = How.ID, using = "appNameId") WebElement appNm;
	@FindBy(how = How.ID, using = "logoutURLId") WebElement appURL;
	@FindBy(how = How.XPATH, using = "//*[@id=\"appForm\"]/div/div/div/div/div/input[2]") WebElement updateApp;
	
	@FindBy(how = How.XPATH, using = "//*[@title='Inactive']/i") WebElement inactive;
	@FindBy(how = How.XPATH, using = "//*[@id=\"actionBtns\"]/a[1]") WebElement cnfrm;
	@FindBy(how = How.ID, using = "popupclosebtn1") WebElement close1;
	
	@FindBy(how = How.XPATH, using = "//*[@title='Delete']/i") WebElement dlt;
	@FindBy(how = How.XPATH, using = "//*[@id=\"manageAppspager_left\"]/table/tbody/tr/td[2]/div") WebElement clearApp;
	@FindBy(how = How.XPATH, using = "/html/body/section/article/div[2]/div/div[1]/a/button") WebElement export;
	
	//resources
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"collapseSix\"]/ul/li[2]/div/a") WebElement resources;
	@FindBy(how = How.ID, using = "createResource") WebElement createres;
	@FindBy(how = How.ID, using = "resourceNameId") WebElement resName;
	@FindBy(how = How.XPATH, using = "//select[@name='resourceType']") WebElement restype;
	@FindBy(how = How.ID, using = "appID") WebElement apid;
	@FindBy(how = How.ID, using = "resourceURLId") WebElement resurl;
	@FindBy(how = How.ID, using = "redirectionURLId") WebElement redirectionurl;
	@FindBy(how = How.ID, using = "accessDeniedURLId") WebElement accessurl;
	@FindBy(how = How.XPATH, using = "//*[@id=\"resourceForm\"]/div/div/input") WebElement crte;
	
	@FindBy(how = How.ID, using = "manageResource") WebElement mngRes;
	@FindBy(how = How.XPATH, using = "//*[@id=\"resourcepager_left\"]/table/tbody/tr/td[1]/div") WebElement searchRes;
	@FindBy(how = How.ID, using = "gs_resourceName") WebElement srchResNm;
	@FindBy(how = How.ID, using = "gs_resValue") WebElement srchResVlu;
	@FindBy(how = How.XPATH, using = "//*[@id=\"resourcepager_left\"]/table/tbody/tr/td[2]/div") WebElement clearRes;
	@FindBy(how = How.XPATH, using = "//*[@id=\"popupmsg\"]/p/span") WebElement scs;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"resourceForm\"]/div/div/input[1]") WebElement updateRes;
	@FindBy(how = How.XPATH, using = "popupclosebtn1") WebElement cls;
	@FindBy(how = How.XPATH, using = "/html/body/section/article/div[2]/div/div/div[1]/a/button") WebElement export1;
	
public pf_Apps(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}

public void crtApp(String scriptname,String sheetName,String Nm,String appurl) throws Exception

{
	et = es.startTest("Creating New App");
	cl_click(app);
	cl_click(apps);
	cl_click(createapps);
	cl_entertext(appid,Nm);
	cl_entertext(url,appurl);
	cl_click(create);
	Thread.sleep(2000);
	String msg = scsMsg.getText();
	System.out.println("Create app msg is: " +msg);
	Utility.comparelogic(msg, sheetName, scriptname);
	et.log(LogStatus.PASS, "App created successfully");
	log.info("App created successfully");
	cl_click(close);
	Thread.sleep(5000);
	
}	

public void mngeApp(String scriptname,String sheetName,String srch,String Nm,String appurl,String srchinactv) throws Exception
{
	
	et = es.startTest("Managing Apps");
	cl_click(mngApp);
	cl_click(close);
	Thread.sleep(3000);
	et.log(LogStatus.PASS, "Searching required App to update");
	cl_click(searchapp);
	Thread.sleep(3000);
	cl_entertext(srchappNm,srch);
	Thread.sleep(3000);
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(8000);
	cl_click(edit);
	appNm.clear();
	cl_entertext(appNm,Nm);
	appURL.clear();
	cl_entertext(appURL,appurl);
	Thread.sleep(3000);
	cl_click(updateApp);
	Thread.sleep(3000);
	String msg = scsMsg.getText();
	System.out.println("Update app msg is: " +msg);
	Utility.comparelogic(msg, sheetName, scriptname);
	et.log(LogStatus.PASS, "App updated successfully");
	log.info("App updated successfully");
	Thread.sleep(2000);
	cl_click(close);
	Thread.sleep(3000);
	
	cl_click(searchapp);
	Thread.sleep(3000);
	cl_entertext(srchURl,srchinactv);
	Thread.sleep(3000);
	Robot r1 = new Robot();
	r1.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(8000);
	
	cl_click(inactive);
	et.log(LogStatus.PASS, "Confirmation message to inactive the app");
	Thread.sleep(2000);
	cl_click(cnfrm);
	Thread.sleep(2000);
	String msg1 = scsMsg.getText();
	System.out.println("inactive app msg is:" +msg1);
	log.info("App updated successfully");
	et.log(LogStatus.PASS, "App updated successfully");
	Thread.sleep(3000);
	cl_click(close);
	Thread.sleep(3000);
	
	cl_click(dlt);
	et.log(LogStatus.PASS, "Confirmation message to inactive the app");
	Thread.sleep(2000);
	cl_click(cnfrm);
	Thread.sleep(2000);
	String msg2 = scsMsg.getText();
	System.out.println("Delete app msg is:" +msg2);
	log.info("App updated successfully");
	et.log(LogStatus.PASS, "App updated successfully");
	Thread.sleep(2000);
	cl_click(close);
	Thread.sleep(3000);
	cl_click(clearApp);
	et.log(LogStatus.PASS, " Exporting sheet to excel");
	System.out.println("Details exported to excel successfully");
	cl_click(export);
	Thread.sleep(3000);
	
}
public void crtResource(String scriptname,String sheetName,String Nm,String type,String id,String Resurl,String redirecturl,String acsurl) throws Exception
{

	et = es.startTest("Creating New Resource");
	cl_click(resources);
	cl_click(createres);
	cl_entertext(resName,Nm);
	Thread.sleep(2000);
	Select sl = new Select(restype);
	sl.selectByVisibleText(type);
	Thread.sleep(2000);
	Select s = new Select(apid);
	s.selectByVisibleText(id);
	Thread.sleep(2000);
	cl_entertext(resurl,Resurl);
	cl_entertext(redirectionurl,redirecturl);
	Thread.sleep(2000);
	cl_entertext(accessurl,acsurl);
	Thread.sleep(2000);
	cl_click(crte);
	Thread.sleep(2000);
	String msg = scsMsg.getText();
	System.out.println("Create Resource msg is:" +msg);
	log.info("You have successfully created new resource");
	et.log(LogStatus.PASS, "successfully created new resource");
	cl_click(close);
	Thread.sleep(2000);
}

public void mngResource(String scriptname,String sheetName,String Nm,String type,String id,String Resurl,String redirecturl,String acsurl,String srch,String srchRes) throws Exception
{
	
	et = es.startTest("Managing resources");
	cl_click(mngRes);
	Thread.sleep(2000);
	et.log(LogStatus.PASS, "Searching required Resource to update");
	Thread.sleep(3000);
	cl_click(searchRes);
	Thread.sleep(2000);
	cl_entertext(srchResNm,srch);
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(8000);
	
	cl_click(edit);
	resName.clear();
	cl_entertext(resName,Nm);
	Select sl = new Select(restype);
	sl.selectByVisibleText(type);
	
	Select s = new Select(apid);
	s.selectByVisibleText(id);
	resurl.clear();
	cl_entertext(resurl,Resurl);
	redirectionurl.clear();
	cl_entertext(redirectionurl,redirecturl);
	accessurl.clear();
	cl_entertext(accessurl,acsurl);
	Thread.sleep(2000);
	cl_click(updateRes);
	Thread.sleep(2000);
	String msg1 = scsMsg.getText();
	System.out.println("Update Resource msg is: " +msg1);
	Utility.comparelogic(msg1, sheetName, scriptname);
	et.log(LogStatus.PASS, "Details updated successfully");
	log.info("Details updated successfully");
	cl_click(close);
	Thread.sleep(2000);
	cl_click(clearRes);
	Thread.sleep(3000);
	
	cl_entertext(srchResNm,srchRes);
	Robot r1 = new Robot();
	r1.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(8000);
	cl_click(inactive);
	et.log(LogStatus.PASS, "Confirmation message to inactive the Resource");
	Thread.sleep(2000);
	cl_click(cnfrm);
	Thread.sleep(3000);
	String mesg = scs.getText();
	System.out.println("inactive Resource msg is:" +mesg);
	log.info("Resources updated successfully");
	et.log(LogStatus.PASS, "New Transaction got created");
	cl_click(close1);
	Thread.sleep(2000);
	
	cl_click(dlt);
	et.log(LogStatus.PASS, "Confirmation message to delete the Resource");
	Thread.sleep(2000);
	cl_click(cnfrm);
	Thread.sleep(2000);
	String msg2 = scs.getText();
	System.out.println("Delete Resource msg is:" +msg2);
	log.info("Resources updated successfully");
	et.log(LogStatus.PASS, "Resources updated successfully");
	cl_click(close1);
	Thread.sleep(3000);
	cl_click(clearRes);
	et.log(LogStatus.PASS, " Exporting sheet to excel");
	
	cl_click(export1);
	System.out.println("Details exported to excel successfully");
	Thread.sleep(3000);
	
}
	

	
}
