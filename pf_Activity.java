package PageFactory;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;

public class pf_Activity extends pf_GenericMethods{
	
	final static Logger log = Logger.getLogger(pf_Activity.class);
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"accordion\"]/li[14]/a") WebElement activity;
	@FindBy(how = How.ID, using = "myActivityLog") WebElement myactivity;
	@FindBy(how = How.XPATH, using = "//*[@id=\"allAdminActivityPager_left\"]/table/tbody/tr/td[1]") WebElement search;
	@FindBy(how = How.ID, using = "gs_event_name") WebElement srchNm;
	@FindBy(how = How.XPATH, using = "//*[@id=\"allAdminActivityPager_left\"]/table/tbody/tr/td[2]/div") WebElement clear;
	
	@FindBy(how = How.XPATH, using = "/html/body/section/article/div[2]/div/div/div[1]/a") WebElement myexport;
	@FindBy(how = How.ID, using = "userActivityLog") WebElement useractivity;
	@FindBy(how = How.XPATH, using = "//*[@id=\"1\"]/td[7]/ul/li/a/i") WebElement view;
	@FindBy(how = How.XPATH, using = "//*[@id=\"viewUserActivityBody\"]/div/div[2]/a[2]") WebElement close;
	@FindBy(how = How.XPATH, using = "/html/body/section/article/div[2]/div/div/div[1]/a") WebElement usrexport;
	
	
public pf_Activity(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}

public void Activity(String scriptname,String sheetName,String nm) throws Exception
{
	
	et=es.startTest("Activity log");
	cl_click(activity);
	cl_click(myactivity);
	cl_click(search);
	Thread.sleep(2000);
	et.log(LogStatus.PASS, "Searching for required event in My Activity");
	cl_entertext(srchNm,nm);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(5000);
	cl_click(clear);
	cl_click(myexport);
	et.log(LogStatus.PASS, " Exporting sheet to excel");
	Thread.sleep(3000);
	cl_click(useractivity);
	et.log(LogStatus.PASS, "Viewing the activity of user");
	cl_click(view);
	Thread.sleep(2000);
	cl_click(close);
	Thread.sleep(2000);
	cl_click(usrexport);
	et.log(LogStatus.PASS, " Exporting sheet to excel");
	Thread.sleep(3000);
	
}
	
}
