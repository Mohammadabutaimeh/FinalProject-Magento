package MagentoTsetCases;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parameters {
	static WebDriver driver= new ChromeDriver() ;
	static Random rand =new Random();
	static int RandomlndexForTheEmail= rand.nextInt(999) ;
	
	static String TheWebSite = "https://magento.softwaretestingboard.com/";
	static String SignupPage = "https://magento.softwaretestingboard.com/customer/account/create/";
	static String LogoutPage = "https://magento.softwaretestingboard.com/customer/account/logout/";
	static String LogoinPage = "https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2luZGV4Lw%2C%2C/";
	
	static String [] firstNames = {"danya" , "mira" , "dana"} ;
	static String [] lastNames = {"omar" , "anas" , "yazan"} ;
	static int RandomlndexForTheNames =rand.nextInt(3) ;
	
	static String firstName = firstNames[RandomlndexForTheNames] ;
	static String lastName = lastNames[RandomlndexForTheNames] ;
	static String Email = firstName +lastName+RandomlndexForTheEmail+"@gmai.com";
	static String password ="ASDasd123!";

}
