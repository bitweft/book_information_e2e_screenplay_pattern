package book_information.helpers;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

import static book_information.helpers.AppiumServerHelper.getServerUrl;
import static book_information.helpers.CapabilitiesHelper.getDesiredCapabilities;


public class DriverHelper {
    public static WebDriver getDriver() {
        DesiredCapabilities capabilities = getDesiredCapabilities();
        URL serverUrl = getServerUrl();
        return new AndroidDriver<>(serverUrl, capabilities);
    }
}
