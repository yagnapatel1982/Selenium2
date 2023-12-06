import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1Class {

    public static void main (String[] args){

 //       2. Set up the chromedriver
        System.setProperty("webdriver.chrome.driver","C:\\software\\chromedriver-win64\\chromedriver.exe");
 //     1.Create an instance of WebDriver
         WebDriver driver = new ChromeDriver();
//        3.Navigate to the webpage
        driver.get("https://demo.nopcommerce.com/");
 //       4.Get page Login
 //      i
 //       String PageLogin = driver.getLogin();
 //       System.out.println("Page Login is:"+PageLogin);
  //    ii
  //    System.out.println("page Login is:"+driver.getLogin();
 //        5. Expected vs Actual - validation
            String ExpectedPageLogin = "nopCommerce demo store1";
             if (ExpectedPageLogin.equals(driver.getTitle())){
             System.out.println("Page Login is incorrect");
             }else{
                 System.out.println("Page Login is correct");
             }
//           6. Navigation
            driver.findElement(By.className("ico-login")).click();
//             7. Get current Url
            System.out.println("Correct Url is;"+driver.getCurrentUrl());
//            8.Navigate Login
            driver.findElement(By.className("ico-login")).click();
//            9. E-mail
            System.out.println("Write your e-mail");
//            10. Password
            System.out.println("Enter your password");
//            11. Click Login
             System.out.println("Click Login");
//            12. Login Successfully
            System.out.println("Login successfully");

//







    }

}
