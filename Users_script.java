package Scripts;

import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import Generic_Library.Base_Function;
import Generic_Library.Utility;
import PageFactory.pf_Users;
import PageFactory.pf_loginpage;


public class Users_script extends Base_Function {
	

	final static Logger log = Logger.getLogger(loginpage_script.class);

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
		log.info("Username picked from Excel is "+pas);
		pl.logincredentials(uid, pas );
		log.info("Logged in successfully");

	}
	
	@Test(enabled=true,priority=2,groups={"SMK","REG"})
	public void Users() throws Exception{
	pf_Users usr = new pf_Users(w);
	usr.EnrlUsers();
	}
	
	@Test(dataProvider= "Users_page",dataProviderClass=DataProvider.DP_Login.class,enabled=true,priority=3,groups={"SMK","REG"})
	public void CreateUsers(Map hm) throws Exception{	

		String scriptname=hm.get("Script_Name").toString();
		tcid = hm.get("TC_ID").toString();
		order=hm.get("Order").toString();
		String sheetName ="Users";
		et =  es.startTest("Users: "+tcid+"_" + order + "_" + browser_type);
		String fn=hm.get("First_Name").toString();
		String ln=hm.get("Last_Name").toString();
		String dob=hm.get("DOB").toString();
		String mail=hm.get("Email").toString();
		String g=hm.get("Gender").toString();
		String mbl=hm.get("Mobileno").toString();
		String user=hm.get("UserName").toString();
		String org=hm.get("Organization").toString();
		String eID=hm.get("Emp_ID").toString();
		String dpt=hm.get("User_Dept").toString();
		String adrs=hm.get("Address").toString();
		String cnty=hm.get("Country").toString();
		String zipcd=hm.get("Zipcode").toString();
		String srch=hm.get("Search_User").toString();
		String mblno=hm.get("Mobile_Update").toString();
		
		pf_Users usr = new pf_Users(w);
		//usr.createnewuser();
		if(scriptname.equalsIgnoreCase("Create_User"))
		{
		et =  es.startTest("Users: "+tcid+"_" + order + "_" + browser_type);
		usr.createnewuser(scriptname, sheetName, fn, ln, dob, mail, g, mbl, user, org, eID, dpt, adrs, cnty, zipcd);
		}
		else if(scriptname.equalsIgnoreCase("Create_User1"))
		{
			
			et =  es.startTest("Users1: "+tcid+"_" + order + "_" + browser_type);
			usr.mngUser(scriptname, sheetName, fn, ln, dob, mail, g, mbl, user, org, eID, dpt, adrs, cnty, zipcd);
		}
	
		else if(scriptname.equalsIgnoreCase("Inactive_User"))
		{
			et =  es.startTest("Users1: "+tcid+"_" + order + "_" + browser_type);
			usr.mngUsrinactv(scriptname, sheetName,srch);
		}
		
		else if(scriptname.equalsIgnoreCase("Active_User"))
		{
				et =  es.startTest("Users: "+tcid+"_" + order + "_" + browser_type);
				usr.mngUsrActv(scriptname, sheetName);
		}
	
		
		
		else if(scriptname.equalsIgnoreCase("Edit_User_Details"))
		{
			
			et =  es.startTest("Users1: "+tcid+"_" + order + "_" + browser_type);
			usr.mngUsrEdt(scriptname, sheetName, srch, mblno);
		}
		}
}

