package LoginTC;

import LoginTC.loginBaseTC;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class invalidUserNamePasswordLoginTC extends loginBaseTC {

    @Test
    public void invalidUserNamePasswordLoginTC(){
        String username = loginBaseTC.props.getProperty("LOGIN.username.xpath");
        String password = loginBaseTC.props.getProperty("LOGIN.password.xpath");
        String submitBtn = loginBaseTC.props.getProperty("LOGIN.submit.xpath");
        loginBaseTC.driver.findElement(By.xpath(username)).sendKeys("akshst345@gail.com");

        loginBaseTC.driver.findElement(By.xpath(password)).sendKeys("Lenovoex2");


        loginBaseTC.driver.findElement(By.xpath(submitBtn)).click();

    }
}