package PageFactory;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import Generic_Library.Utility;

public class pf_Backup extends pf_GenericMethods {
	
	final static Logger log = Logger.getLogger(pf_Backup.class);
	
	@FindBy(how = How.ID, using = "backupNav") WebElement backup;
	@FindBy(how = How.XPATH, using = "//*[@id=\"backupForm\"]/div/ul[4]/li[1]/div/label[1]") WebElement local;
	@FindBy(how = How.XPATH, using = "//*[@id=\"backupForm\"]/div/ul[1]/li/div/label[1]") WebElement manual;
	@FindBy(how = How.XPATH, using = "//*[@id=\"backupForm\"]/div/ul[1]/li/div/label[2]") WebElement auto;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"backupForm\"]/div/ul[4]/li[1]/div/label[2]") WebElement rmt;
	@FindBy(how = How.ID, using = "backupFrequency") WebElement freq;
	@FindBy(how = How.ID, using = "ipAddress") WebElement ipadrs;
	@FindBy(how = How.XPATH, using = "//*[@id=\"restorePath\"]") WebElement path;
	@FindBy(how = How.ID, using = "userName") WebElement unme;
	@FindBy(how = How.ID, using = "password") WebElement pswd;
	@FindBy(how = How.XPATH, using = "//*[@id=\"remoteServerDetailsId\"]/li[5]/input") WebElement test;
	@FindBy(how = How.ID, using = "testConnectionSuccess") WebElement scsMsg;	
	@FindBy(how = How.XPATH, using = "/html/body/section/article/div[2]/div/div[1]/input") WebElement Backup;
	@FindBy(how = How.ID, using = "bckpSuccesMsg") WebElement scs;
	@FindBy(how = How.XPATH, using = "//*[@id=\"bckpAlertWindow\"]/div/div/div[1]/button") WebElement close;
	
public pf_Backup(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}

public void crtBkUpManual(String scriptname,String sheetName,String ip,String bk,String un,String pwd) throws Exception

{
	et=es.startTest("Creating manual mode of backup to remote system");
	cl_click(backup);
	Thread.sleep(3000);
	if(!manual.isSelected())
	cl_click(manual);
	cl_click(rmt);
	Thread.sleep(2000);
	ipadrs.clear();
	cl_entertext(ipadrs,ip); 	 	 	                 	
	path.clear();
	cl_entertext(path,bk);
	unme.clear();
	cl_entertext(unme,un);
	pswd.clear();
	cl_entertext(pswd,pwd);
	Thread.sleep(3000);
	cl_click(test);
	Thread.sleep(3000);
	String msg = scsMsg.getText();
	Utility.comparelogic(msg, sheetName, scriptname);
	log.info("Success!Connection established successfully");
	 et.log(LogStatus.PASS, "Success!Connection established successfully");
	cl_click(Backup);
	Thread.sleep(3000);
	String msg1 = scs.getText();
	Utility.comparelogic(msg1, sheetName, scriptname);
	log.info("emIDAM backup completed successfully");
	 et.log(LogStatus.PASS, "emIDAM backup completed successfully");
	cl_click(close);
	Thread.sleep(3000);
	
}

public void crtBkUpAuto(String scriptname,String sheetName,String frq,String ip,String bk,String un,String pwd) throws Exception
{
	
	et=es.startTest("Creating automatic mode of backup to remote system");
	cl_click(backup);
	Thread.sleep(3000);
	if(!auto.isSelected())
	cl_click(auto);
	Select s = new Select(freq);
	s.selectByVisibleText(frq);
	cl_click(rmt);
	Thread.sleep(2000);
	ipadrs.clear();
	cl_entertext(ipadrs,ip);
	path.clear();
	cl_entertext(path,bk);
	unme.clear();
	cl_entertext(unme,un);
	pswd.clear();
	cl_entertext(pswd,pwd);
	Thread.sleep(3000);
	cl_click(test);
	Thread.sleep(3000);
	String msg = scsMsg.getText();
	Utility.comparelogic(msg, sheetName, scriptname);
	log.info("Success!Connection established successfully");
	et.log(LogStatus.PASS, "Success!Connection established successfully");
	cl_click(Backup);
	Thread.sleep(3000);
	String msg1 = scs.getText();
	Utility.comparelogic(msg1, sheetName, scriptname);
	log.info("emIDAM backup completed successfully");
	 et.log(LogStatus.PASS, "emIDAM backup completed successfully");
	cl_click(close);
	Thread.sleep(3000);
}

changing backup content1	
	change content in master branch
	change to check command
}
