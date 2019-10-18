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

public class pf_Policy extends pf_GenericMethods{
	
final static Logger log = Logger.getLogger(pf_Policy.class);
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"accordion\"]/li[11]/a") WebElement policy;
	@FindBy(how = How.ID, using = "createPolicy") WebElement crtpolicy;
	@FindBy(how = How.ID, using = "severityID") WebElement svrtyid;
	@FindBy(how = How.ID, using = "firstFactorAuthVal") WebElement authval1;
	@FindBy(how = How.ID, using = "1stAuthID") WebElement add1;
	@FindBy(how = How.ID, using = "2ndFactorAuthVal") WebElement authval2;
	@FindBy(how = How.ID, using = "2ndAuthID") WebElement add2;
	@FindBy(how = How.ID, using = "3rdFactorAuthVal") WebElement authval3;
	@FindBy(how = How.XPATH, using = "//*[@id=\"policyForm\"]/div/div/input") WebElement create;
	@FindBy(how = How.ID, using = "succesMsg") WebElement scsMsg;
	@FindBy(how = How.ID, using = "closeWindowAlert") WebElement close;
	
	@FindBy(how = How.ID, using = "managePolicy") WebElement mngPolicy;
	@FindBy(how = How.XPATH, using = "//*[@id=\"policypager_left\"]/table/tbody/tr/td[1]/div") WebElement search;
	@FindBy(how = How.ID, using = "gs_severity") WebElement srchSeverity;
	@FindBy(how = How.ID, using = "gs_firstFactor") WebElement srchFactor;
	@FindBy(how = How.XPATH, using = "//*[@title='Edit']/i") WebElement edit;
	@FindBy(how = How.ID, using = "editSeverityID") WebElement editSev;
	@FindBy(how = How.ID, using = "firstFactAuthID") WebElement editAuthType;
	@FindBy(how = How.XPATH, using = "//*[@id=\"3rdFactorAuthID\"]/a") WebElement dltAuth;
	
	@FindBy(how = How.ID, using = "updateBtnId") WebElement updt;
	@FindBy(how = How.XPATH, using = "//*[@title='Delete']/i") WebElement dlt;
	@FindBy(how = How.XPATH, using = "//*[@id=\"actionBtns\"]/a[1]") WebElement cnfrm;
	@FindBy(how = How.XPATH, using = "//*[@id=\"policypager_left\"]/table/tbody/tr/td[2]/div") WebElement clear;
	@FindBy(how = How.XPATH, using = "/html/body/section/article/div[2]/div/div/div[1]/a/button") WebElement export;
	
public pf_Policy(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}

public void crtPlcy(String scriptname,String sheetName,String svrty,String auth1,String auth2,String auth3) throws Exception

{
	et=es.startTest("Creating policy");
	cl_click(policy);
	cl_click(crtpolicy);
	Thread.sleep(2000);
	Select id = new Select(svrtyid);
	id.selectByVisibleText(svrty);
	Thread.sleep(3000);
	Select val1 = new Select(authval1);
	val1.selectByVisibleText(auth1);
	cl_click(add1);
	Thread.sleep(3000);
	Select val2 = new Select(authval2);
	Thread.sleep(2000);
	val2.selectByVisibleText(auth2);
	Thread.sleep(2000);
	cl_click(add2);
	
	Select val3 = new Select(authval3);
	val3.selectByVisibleText(auth3);
	cl_click(create);
	Thread.sleep(2000);
	String msg=scsMsg.getText();
	cl_click(close);
	Utility.comparelogic(msg, sheetName, scriptname);
	log.info("Policy created successfully.");
	System.out.println("Create msg is:" +msg);
	et.log(LogStatus.PASS, "Policy created successfully.");
	Thread.sleep(3000);
	
	
}

	public void mngPlcyEdit(String scriptname,String sheetName,String srchsev,String srchFctr,String svrty,String auth1)throws Exception
	{
		et=es.startTest("Managing the policy and editing the data");
		cl_click(mngPolicy);
		cl_click(search);
		Thread.sleep(2000);
		et.log(LogStatus.PASS, "Searching for required severity");
		cl_entertext(srchSeverity,srchsev);
		Select s = new Select(srchFactor);
		s.selectByVisibleText(srchFctr);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(8000);
	    cl_click(edit);
	    et.log(LogStatus.PASS, "Editing the severity");
	    Thread.sleep(2000);
	    Select id = new Select(editSev);
		id.selectByVisibleText(svrty);
		Select s1=new Select(editAuthType);
		s1.selectByVisibleText(auth1); 
		Thread.sleep(2000);
	    cl_click(dltAuth);
	    cl_click(updt);
	    Thread.sleep(2000);
		String msg=scsMsg.getText();
		cl_click(close);
		Utility.comparelogic(msg, sheetName, scriptname);
		log.info(" Selected policy details updated successfully.");
		et.log(LogStatus.PASS, "Selected policy details updated successfully.");
		System.out.println("Create msg is:" +msg);
		Thread.sleep(3000);
}
	
	public void mngPlcyDlt(String scriptname,String sheetName,String srchsev,String srchFctr)throws Exception
	{
		srchSeverity.clear();
		cl_entertext(srchSeverity,srchsev);
		Thread.sleep(2000);
		Select s = new Select(srchFactor);
		s.selectByVisibleText(srchFctr);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(8000);
		cl_click(dlt);
		et.log(LogStatus.PASS, "Confirmation msg to delete policy");
		Thread.sleep(3000);
		cl_click(cnfrm);
		 Thread.sleep(2000);
		String msg=scsMsg.getText();
		cl_click(close);
		Thread.sleep(2000);
		Utility.comparelogic(msg, sheetName, scriptname);
		log.info(" Selected policy details updated successfully.");
		et.log(LogStatus.PASS, "Selected policy details updated successfully.");
		System.out.println("Create msg is:" +msg);
		cl_click(clear);
		Thread.sleep(3000);
		cl_click(export);
		System.out.println("Details exported to excel successfully");
		Thread.sleep(3000);
	}
	
}
