package PageFactory;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import Generic_Library.Utility;

public class pf_Settings extends pf_GenericMethods{

	final static Logger log = Logger.getLogger(pf_Settings.class);
	
	@FindBy(how = How.XPATH, using = "/html/body/header/div[2]/div[2]/ul/li/a/i") WebElement profile;
	@FindBy(how = How.XPATH, using = "/html/body/header/div[2]/div[2]/ul/li/ul/li[1]") WebElement settings;
	
	// Settings --> Block Settings
	
	@FindBy(how = How.XPATH, using = "/html/body/header/div[2]/div[2]/ul/li/ul/li[1]/ul/li[1]/a") WebElement blockStng;
	@FindBy(how = How.ID, using = "max_invalid_attempt_dropdown") WebElement maxInvldAtmpts;
	@FindBy(how = How.ID, using = "time_limit_dropdown") WebElement timeLimitDrp;
	@FindBy(how = How.ID, using = "time_limit_txtbox") WebElement timeLimitTxt;
	@FindBy(how = How.ID, using = "block_user_txtbox") WebElement blockUsrTxt;
	@FindBy(how = How.XPATH, using = "/html/body/section/article/div[2]/div/div/div[4]/a[1]") WebElement save;
	@FindBy(how = How.ID, using = "successMSG") WebElement scsMsg;
	
	// Settings --> Dormant User Settings
	
	@FindBy(how = How.XPATH, using = "/html/body/header/div[2]/div[2]/ul/li/ul/li[1]/ul/li[2]/a") WebElement dormantStng;
	@FindBy(how = How.ID, using = "inActiveUser") WebElement inactvUsr;
	@FindBy(how = How.ID, using = "deleteUser") WebElement dltUsr;
	@FindBy(how = How.ID, using = "remindInActiveUser") WebElement rmndInactvUsr;
	@FindBy(how = How.ID, using = "remindDeleteUser") WebElement rmndDltUsr;
	@FindBy(how = How.XPATH, using = "//*[@id=\"dormantSettingsForm\"]/div/div[2]/a[1]") WebElement save1;
	@FindBy(how = How.XPATH, using = "//*[@id=\"alertSuccessWindow\"]/div/div/div[2]") WebElement scsMsg1;
	@FindBy(how = How.ID, using = "closeWindow") WebElement close;
	
	// Settings --> LDAP User Settings
	
		@FindBy(how = How.XPATH, using = "/html/body/header/div[2]/div[2]/ul/li/ul/li[1]/ul/li[3]/a") WebElement ldapStng;
		@FindBy(how = How.ID, using = "ldapFrequency") WebElement ldapFqncy;
		@FindBy(how = How.XPATH, using = "/html/body/section/article/div[2]/div/div/div/div[4]/a[1]") WebElement save2;
		
	// Settings --> Forget password settings
		
		@FindBy(how = How.XPATH, using = "/html/body/header/div[2]/div[2]/ul/li/ul/li[1]/ul/li[4]/a") WebElement pswdStng;
		@FindBy(how = How.ID, using = "resetPassword") WebElement resetPswd;
		@FindBy(how = How.ID, using = "authType") WebElement authType;
		@FindBy(how = How.XPATH, using = "//*[@id=\"settingsForm\"]/div/div[2]/a[1]") WebElement savePwd;
		//*[@id="alertSuccessWindow"]/div/div/div[2]
		// close
		
		// Settings --> Periodic password reset
		
		@FindBy(how = How.XPATH, using = "/html/body/header/div[2]/div[2]/ul/li/ul/li[1]/ul/li[5]/a") WebElement periodicStng;
		@FindBy(how = How.ID, using = "changePWDID") WebElement chngPswd;
		@FindBy(how = How.ID, using = "notifyUserID") WebElement notifyUserID;
		@FindBy(how = How.XPATH, using = "//*[@id=\"periodicPasswordForm\"]/div/div[2]/input") WebElement save3;
		
		// Settings --> Active Directory
		
		@FindBy(how = How.XPATH, using = "/html/body/header/div[2]/div[2]/ul/li/ul/li[1]/ul/li[6]/a") WebElement actvDirectoryStng;
		
		// Settings --> Risk profile setting
		
		@FindBy(how = How.XPATH, using = "/html/body/header/div[2]/div[2]/ul/li/ul/li[1]/ul/li[7]/a") WebElement riskStng;
		@FindBy(how = How.XPATH, using = "//*[@id=\"rppBtnID\"]/label[3]") WebElement rolePfl;
		@FindBy(how = How.XPATH, using = "//*[@id=\"riskProfileSettingForm\"]/div/div/input") WebElement save4;
		@FindBy(how = How.ID, using = "closeWindowAlert") WebElement cls;
		@FindBy(how = How.ID, using = "succesMsg") WebElement SCS;
		
		// Settings --> Email Templates
		
		@FindBy(how = How.XPATH, using = "/html/body/header/div[2]/div[2]/ul/li/ul/li[1]/ul/li[8]/a") WebElement emailTmplt;
		@FindBy(how = How.ID, using = "ddl_subject_select_id") WebElement acntActivated;
		@FindBy(how = How.ID, using = "txtSubject") WebElement subject;
		
		// Settings --> cobranding
		
		@FindBy(how = How.XPATH, using = "/html/body/header/div[2]/div[2]/ul/li/ul/li[1]/ul/li[9]/a") WebElement cobrandStng;
		@FindBy(how = How.XPATH, using = "/html/body/section/article/div[2]/div/div/div/div[3]/div[1]/div[2]/div/label[1]") WebElement theme;
		@FindBy(how = How.XPATH, using = "/html/body/section/article/div[2]/div/div/div/div[3]/div[2]/div[2]/div[1]") WebElement cmpnyLogo;
		@FindBy(how = How.XPATH, using = "/html/body/section/article/div[2]/div/div/div/div[3]/div[2]/div[2]/div[4]") WebElement browseImg;
		@FindBy(how = How.ID, using = "btnReset") WebElement reset;
		@FindBy(how = How.ID, using = "txtHttpImageURL") WebElement url;
		@FindBy(how = How.ID, using = "btnSaveThemes") WebElement apply;
		
		//Settings --> IP Address
		
		@FindBy(how = How.XPATH, using = "/html/body/header/div[2]/div[2]/ul/li/ul/li[1]/ul/li[10]/a") WebElement IPaddress;
		@FindBy(how = How.ID, using = "ipaddressBtn") WebElement addIP;
		@FindBy(how = How.ID, using = "trustedId") WebElement trustID;
		@FindBy(how = How.ID, using = "fromIpAddress") WebElement frmIp;
		@FindBy(how = How.ID, using = "toIpAddress") WebElement toIp;
		@FindBy(how = How.XPATH, using = "//*[@id=\"myModal\"]/div/div/div[2]/div/div/div/div[2]/input") WebElement saveIp;
		@FindBy(how = How.ID, using = "bckpSuccesMsg") WebElement IpScsMsg;
		@FindBy(how = How.XPATH, using = "//*[@id=\"bckpAlertWindow\"]/div/div/div[1]/button") WebElement IpCls;
		 //IP Addresses saved successfully.
		@FindBy(how = How.ID, using = "untrustedId") WebElement untrustID;
		@FindBy(how = How.XPATH, using = "//*[@id=\"trustedPager_left\"]/table/tbody/tr/td[1]/div/span") WebElement srchTrustIp;
		@FindBy(how = How.ID, using = "gs_ipAddress") WebElement srchIp;
		@FindBy(how = How.XPATH, using = "//tr[td[@title='10.80.106.112 To 10.80.106.118']]/td/ul/li/a[@title='Edit']") WebElement edit;
		@FindBy(how = How.XPATH, using = "//tr[td[@title='10.80.106.231 To 10.80.106.239']]/td/ul/li/a[@title='Delete']") WebElement dlt;
		@FindBy(how = How.ID, using = "editFromIpAddress") WebElement editFrmAdrs;
		@FindBy(how = How.ID, using = "editToIpAddress") WebElement editToAdrs;
		@FindBy(how = How.XPATH, using = "//*[@id=\"myEditModal\"]/div/div/div[2]/div/div/div/div[2]/input[2]") WebElement saveEdit;
		@FindBy(how = How.XPATH, using = "//*[@id=\"bckpAlertWindow\"]/div/div/div[1]/button") WebElement clsEdit;
		@FindBy(how = How.XPATH, using = "//*[@id=\"actionBtns\"]/a[1]") WebElement cnfrm;
		@FindBy(how = How.XPATH, using = "//*[@id=\"trustedPager_left\"]/table/tbody/tr/td[2]/div") WebElement clear;
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"Trusted_Untrusted_Tabs\"]/li[2]/a") WebElement unTrusted;
		@FindBy(how = How.XPATH, using = "//*[@id=\"untrustedPager_left\"]/table/tbody/tr/td[1]/div") WebElement srchUnTrustIp;
		@FindBy(how = How.XPATH, using = "//table/thead/tr/th[@id='gsh_untrustedList_ipAddress']/div/table/tbody/tr/td/input[@id='gs_ipAddress']") WebElement srchIp1;
		@FindBy(how = How.XPATH, using = "//tr[td[@title='10.80.106.221 To 10.80.106.229']]/td/ul/li/a[@title='Edit']") WebElement unTrustEdit;
		@FindBy(how = How.XPATH, using = "//tr[td[@title='10.80.106.230 To 10.80.106.240']]/td/ul/li/a[@title='Delete']") WebElement unTrustDlt;
		@FindBy(how = How.XPATH, using = "//*[@id=\"untrustedPager_left\"]/table/tbody/tr/td[2]/div") WebElement clearUnTrust;
		
		// Settings --> Attribute Weightage
		
		@FindBy(how = How.XPATH, using = "/html/body/header/div[2]/div[2]/ul/li/ul/li[1]/ul/li[12]/a") WebElement attributeWght;
		@FindBy(how = How.ID, using = "threshholdScore") WebElement thrsldScr;
		@FindBy(how = How.ID, using = "colorDepth") WebElement clrDpt;
		@FindBy(how = How.ID, using = "deviceLanguage") WebElement dvcLang;
		@FindBy(how = How.ID, using = "devicePlatform") WebElement dvcPltfrm;
		@FindBy(how = How.ID, using = "clientBrowser") WebElement clntBrwsr;
		@FindBy(how = How.ID, using = "clientIPAddress") WebElement clntIPAdrs;
		@FindBy(how = How.ID, using = "clientScreenHeight") WebElement clntScrnHgt;
		@FindBy(how = How.ID, using = "clientScreenWidth") WebElement clntScrnWdth;
		@FindBy(how = How.ID, using = "clientGeoLocation") WebElement clntGeoLctn;
		@FindBy(how = How.ID, using = "clientKeyStrokes") WebElement clntKeyStks;
		@FindBy(how = How.XPATH, using = "/html/body/section/article/div[2]/div/div/div/div/a[1]") WebElement Save;
		
		//*[@id="bckpAlertWindow"]/div/div/div[1]/button
public pf_Settings(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}

public void blockStngs(String scriptname,String sheetName,String maxAtmpt,String timeLimit,String blckUsr) throws Exception
{
	
	et=es.startTest("Block Settings");
	cl_click(profile);
	Thread.sleep(2000);
	Actions action = new Actions(w);
	action.moveToElement(settings).perform();
	Thread.sleep(2000);
	cl_click(blockStng);
	Thread.sleep(3000);
	Select s = new Select(maxInvldAtmpts);
	Thread.sleep(2000);
	s.selectByVisibleText(maxAtmpt);
	Thread.sleep(2000);
	Select s1 = new Select(timeLimitDrp);
	s1.selectByVisibleText(timeLimit);
	Thread.sleep(2000);
	blockUsrTxt.clear();
	cl_entertext(blockUsrTxt,blckUsr);
	Thread.sleep(2000);
	cl_click(save);
	Thread.sleep(2000);
	String msg = scsMsg.getText();
	Utility.comparelogic(msg, sheetName, scriptname);
	log.info("Success!Block settings saved successfully");
	System.out.println("Block Settings msg is :" +msg);
	et.log(LogStatus.PASS, "Success!Block settings saved successfully");
	Thread.sleep(2000);
}

public void dormantStngs(String scriptname,String sheetName,String inactv,String dlt,String remindInactv,String remindDlt) throws Exception
{
	
	et=es.startTest("Dormant Settings");
	cl_click(profile);
	Thread.sleep(2000);
	Actions action = new Actions(w);
	action.moveToElement(settings).perform();
	Thread.sleep(2000);
	cl_click(dormantStng);
	inactvUsr.clear();
	cl_entertext(inactvUsr,inactv);
	dltUsr.clear();
	cl_entertext(dltUsr,dlt);
	rmndInactvUsr.clear();
	cl_entertext(rmndInactvUsr,remindInactv);
	rmndDltUsr.clear();
	cl_entertext(rmndDltUsr,remindDlt);
	cl_click(save1);
	Thread.sleep(2000);
	String msg = scsMsg1.getText();
	Utility.comparelogic(msg, sheetName, scriptname);
	log.info("Dormant settings saved successfully");
	System.out.println("Dormant Settings msg is :" +msg);
	et.log(LogStatus.PASS, "Dormant settings saved successfully");
	cl_click(close);
	Thread.sleep(2000);
	
}

public void ldapStngs(String scriptname,String sheetName,String frqncy) throws Exception
{
	
	et=es.startTest("LDAP Settings");
	cl_click(profile);
	Thread.sleep(2000);
	Actions action = new Actions(w);
	action.moveToElement(settings).perform();
	Thread.sleep(2000);
	cl_click(ldapStng);
	cl_entertext(ldapFqncy,frqncy);
	cl_click(save2);
	Thread.sleep(2000);
	String msg = scsMsg.getText();
	Utility.comparelogic(msg, sheetName, scriptname);
	log.info("Success!Ldap settings saved successfully");
	System.out.println("LDAP settings msg is :" +msg);
	et.log(LogStatus.PASS, "Success!LDAP settings saved successfully");
	Thread.sleep(2000);
}

public void frgtPwdStngs(String scriptname,String sheetName,String auth) throws Exception
{
	
	et=es.startTest("Forgot Password Settings");
	cl_click(profile);
	Thread.sleep(2000);
	Actions action = new Actions(w);
	action.moveToElement(settings).perform();
	Thread.sleep(2000);
	cl_click(pswdStng);
	cl_click(resetPswd);
	Select s =new Select(authType);
	s.selectByVisibleText(auth);
	cl_click(savePwd);
	Thread.sleep(2000);
	String msg = scsMsg1.getText();
	Utility.comparelogic(msg, sheetName, scriptname);
	log.info("Forgot password settings saved successfully");
	System.out.println("Forgot password settings msg is :" +msg);
	et.log(LogStatus.PASS, "Forgot password settings saved successfully");
	cl_click(close);
	Thread.sleep(2000);
}

public void actvDirectoryStngs(String scriptname,String sheetName) throws Exception
{
	
	et=es.startTest("Active Directory Settings");
	cl_click(profile);
	Thread.sleep(2000);
	Actions action = new Actions(w);
	action.moveToElement(settings).perform();
	Thread.sleep(2000);
	cl_click(actvDirectoryStng);
	cl_click(save);
	Thread.sleep(3000);
	String msg = scsMsg.getText();
	Utility.comparelogic(msg, sheetName, scriptname);
	Thread.sleep(2000);
	log.info("Success!Active Directory settings saved successfully");
	System.out.println("Active Directory settings msg is :" +msg);
	et.log(LogStatus.PASS, "Success!Active Directory settings saved successfully");
	Thread.sleep(2000);
	
}

public void riskPflStngs(String scriptname,String sheetName) throws Exception
{
	
	et=es.startTest("Risk Profile Settings");
	cl_click(profile);
	Thread.sleep(2000);
	Actions action = new Actions(w);
	action.moveToElement(settings).perform();
	Thread.sleep(2000);
	cl_click(riskStng);
	cl_click(rolePfl);
	cl_click(save4);
	Thread.sleep(3000);
	String msg = SCS.getText();
	Utility.comparelogic(msg, sheetName, scriptname);
	log.info("Risk profile priority configured successfully");
	System.out.println("Risk Profile settings msg is :" +msg);
	et.log(LogStatus.PASS, "Risk profile priority configured successfully");
	cl_click(cls);
	Thread.sleep(2000);
}

public void ipAdrsTrust(String scriptname,String sheetName,String frmIpAdrs,String toIpAdrs) throws Exception
{
	
	et=es.startTest("Trusted IP Address");
	cl_click(profile);
	Thread.sleep(2000);
	Actions action = new Actions(w);
	action.moveToElement(settings).perform();
	Thread.sleep(2000);
	cl_click(IPaddress);
	cl_click(addIP);
	if(!trustID.isSelected())
		cl_click(trustID);
	cl_entertext(frmIp,frmIpAdrs);
	cl_entertext(toIp,toIpAdrs);
	Thread.sleep(2000);
	cl_click(saveIp);
	Thread.sleep(2000);
	String msg = IpScsMsg.getText();
	Utility.comparelogic(msg, sheetName, scriptname);
	log.info("IP Addresses saved successfully.");
	System.out.println("Trusted IP Address msg is :" +msg);
	et.log(LogStatus.PASS, "IP Addresses saved successfully.");
	cl_click(IpCls);
	Thread.sleep(2000);
}

public void ipAdrsUnTrust(String scriptname,String sheetName,String frmIpAdrs,String toIpAdrs) throws Exception
{
	
	et=es.startTest("Untrusted IP Address");
	cl_click(addIP);
	Thread.sleep(2000);
	if(!untrustID.isSelected())
		cl_click(untrustID);
	cl_entertext(frmIp,frmIpAdrs);
	cl_entertext(toIp,toIpAdrs);
	cl_click(saveIp);
	Thread.sleep(2000);
	String msg = IpScsMsg.getText();
	Utility.comparelogic(msg, sheetName, scriptname);
	log.info("IP Addresses saved successfully.");
	System.out.println("Trusted IP Address msg is :" +msg);
	et.log(LogStatus.PASS, "IP Addresses saved successfully.");
	cl_click(IpCls);
	Thread.sleep(2000);
}

public void editTrustIpAdrs(String scriptname,String sheetName,String searchIp,String frmIpAdrs,String toIpAdrs) throws Exception
{
	
	et=es.startTest("Editing Trusted IP Address");
	cl_click(srchTrustIp);
	cl_entertext(srchIp,searchIp);
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(10000);
	cl_click(edit);
	editFrmAdrs.clear();
	cl_entertext(editFrmAdrs,frmIpAdrs);
	editToAdrs.clear();
	cl_entertext(editToAdrs,toIpAdrs);
	cl_click(saveEdit);
	Thread.sleep(2000);
	String msg = IpScsMsg.getText();
	Utility.comparelogic(msg, sheetName, scriptname);
	log.info("IP Addresses updated successfully.");
	System.out.println("Edit IP Address msg is :" +msg);
	et.log(LogStatus.PASS, "IP Addresses updated successfully.");
	cl_click(clsEdit);
	Thread.sleep(2000);
}

public void dltTrustIpAdrs(String scriptname,String sheetName,String searchIp) throws Exception
{
	
	et=es.startTest("Deleting Trusted IP Address");
	srchIp.clear();
	cl_entertext(srchIp,searchIp);
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(10000);
	cl_click(dlt);
	cl_click(cnfrm);
	Thread.sleep(2000);
	String msg = SCS.getText();
	Utility.comparelogic(msg, sheetName, scriptname);
	log.info("IpAddress deleted successfully.");
	System.out.println("Delete IP address msg is :" +msg);
	et.log(LogStatus.PASS, "IpAddress deleted successfully.");
	cl_click(cls);
	Thread.sleep(3000);
	cl_click(clear);
	Thread.sleep(3000);
}

public void editUnTrustIpAdrs(String scriptname,String sheetName,String searchIp,String frmIpAdrs,String toIpAdrs) throws Exception
{
	
	et=es.startTest("Editing UnTrusted IP Address");
	cl_click(unTrusted);
	Thread.sleep(2000);
	cl_click(srchUnTrustIp);
	Thread.sleep(2000);
	cl_entertext(srchIp1,searchIp);
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(5000);
	cl_click(unTrustEdit);
	editFrmAdrs.clear();
	cl_entertext(editFrmAdrs,frmIpAdrs);
	editToAdrs.clear();
	cl_entertext(editToAdrs,toIpAdrs);
	cl_click(saveEdit);
	Thread.sleep(2000);
	String msg = IpScsMsg.getText();
	Utility.comparelogic(msg, sheetName, scriptname);
	log.info("IP Addresses updated successfully.");
	System.out.println("Edit IP Address msg is :" +msg);
	et.log(LogStatus.PASS, "IP Addresses updated successfully.");
	cl_click(clsEdit);
	Thread.sleep(2000);
}

public void dltUnTrustIpAdrs(String scriptname,String sheetName,String searchIp) throws Exception
{
	
	et=es.startTest("Deleting UnTrusted IP Address");
	srchIp1.clear();
	cl_entertext(srchIp1,searchIp);
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(10000);
	cl_click(unTrustDlt);
	cl_click(cnfrm);
	Thread.sleep(2000);
	String msg = SCS.getText();
	Utility.comparelogic(msg, sheetName, scriptname);
	log.info("IpAddress deleted successfully.");
	System.out.println("Delete IP address msg is :" +msg);
	et.log(LogStatus.PASS, "IpAddress deleted successfully.");
	cl_click(cls);
	Thread.sleep(2000);
	cl_click(clearUnTrust);
	Thread.sleep(2000);
}

public void attributeWghtage(String scriptname,String sheetName,String thScr,String clr,String lang,String pltfrm,String brwsr,String IpAdrs,String scrnHght,String scrnWdth,String geoLctn,String keyStrokes) throws Exception 
{
	
	et=es.startTest("Attributes weightage");
	cl_click(profile);
	Thread.sleep(2000);
	Actions action = new Actions(w);
	action.moveToElement(settings).perform();
	Thread.sleep(2000);
	cl_click(attributeWght);
	thrsldScr.clear();
	cl_entertext(thrsldScr,thScr);
	clrDpt.clear();
	cl_entertext(clrDpt,clr);
	dvcLang.clear();
	cl_entertext(dvcLang,lang);
	dvcPltfrm.clear();
	cl_entertext(dvcPltfrm,pltfrm);
	clntBrwsr.clear();
	cl_entertext(clntBrwsr,brwsr);
	clntIPAdrs.clear();
	cl_entertext(clntIPAdrs,IpAdrs);
	clntScrnHgt.clear();
	cl_entertext(clntScrnHgt,scrnHght);
	clntScrnWdth.clear();
	cl_entertext(clntScrnWdth,scrnWdth);
	clntGeoLctn.clear();
	cl_entertext(clntGeoLctn,geoLctn);
	clntKeyStks.clear();
	cl_entertext(clntKeyStks,keyStrokes);
	cl_click(Save);
	Thread.sleep(2000);
	String msg = IpScsMsg.getText();
	Utility.comparelogic(msg, sheetName, scriptname);
	log.info("Attributes weightage data saved successfully");
	System.out.println("Attributes weightage msg is :" +msg);
	et.log(LogStatus.PASS, "Attributes weightage data saved successfully");
	Thread.sleep(2000);
	cl_click(IpCls);
	Thread.sleep(2000);
	
}
}
