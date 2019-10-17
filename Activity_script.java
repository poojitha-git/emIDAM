package Scripts;

import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import Generic_Library.Base_Function;
import PageFactory.pf_Activity;
import PageFactory.pf_loginpage;

public class Activity_script extends Base_Function{
	
	final static Logger log = Logger.getLogger(pf_Activity.class);
	@Test(dataProvider= "valid_login",dataProviderClass=DataProvider.DP_Login.class,enabled=true,priority=1,groups={"SMK","REG"})
	public void Login(Map hm) throws Exception{	
		PropertyConfigurator.configure(System.getProperty("user.dir") + "\\src\\main\\resources\\log4j.properties");
		//login

		tcid = hm.get("TC_ID").toString();
		order=hm.get("Order").toString();

		et =  es.startTest("Login: "+tcid+"_" + order + "_" + browser_type);
		log.info("this is login information");
		String uid = hm.get("Uname").toString();
		String pas = hm.get("Pwd").toString();
		pf_loginpage pl = new pf_loginpage(w);

		log.info("Username picked from Excel is "+uid);
		log.info("Password picked from Excel is "+pas);
		pl.logincredentials(uid, pas );
		log.info("Logged in successfully");
	}
	
@Test(dataProvider= "Activity_page",dataProviderClass=DataProvider.DP_Login.class,enabled=true,priority=3,groups={"SMK","REG"})
	public void ActivityPage(Map hm) throws Exception{	
	
		String scriptname=hm.get("Script_Name").toString();
		tcid = hm.get("TC_ID").toString();
		order=hm.get("Order").toString();
		String sheetName="Activity";
		String nm=hm.get("Event_Name").toString();
		pf_Activity p= new pf_Activity(w);
		p.Activity(scriptname, sheetName, nm);

}

}
