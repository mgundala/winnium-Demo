package testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by mgundala on 11/2/2017.
 */

public class WinniumDemo {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        WiniumDriver driver = null;
        String appPath = "C:\\Windows\\System32\\notepad.exe";
        DesktopOptions option = new DesktopOptions();
        option.setApplicationPath(appPath);
        option.setDebugConnectToRunningApp(false);
        option.setLaunchDelay(2);
        driver = new WiniumDriver(new URL("http://localhost:9999"),option);
        Thread.sleep(1000);
        driver.findElementByClassName("Edit").sendKeys("This is sample test");
        driver.findElementByName("File").click();
        driver.findElementByName("Edit").click();
        driver.findElement(By.xpath("//*[@AutomationId='Item 4']")).click();
        driver.findElement(By.xpath("//*[@AutomationId='Item 5']")).click();
        //driver.findElementByName("Close");
        //driver.findElementByName("Cancel").click();
        System.out.println("*******************Done******************");
        driver.close();
    }

}


