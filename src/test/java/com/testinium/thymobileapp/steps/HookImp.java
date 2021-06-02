package com.testinium.thymobileapp.steps;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class HookImp {
    protected static AppiumDriver appiumDriver;

    @BeforeScenario
    public void beforeScenario() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.turkishairlines.mobile");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.turkishairlines.mobile.ui.ACSplash");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
        URL url =new URL("http://0.0.0.0:4723/wd/hub");
        appiumDriver = new AndroidDriver(url,desiredCapabilities);

    }

    @AfterScenario
    public void afterScenario(){
        appiumDriver.quit();
    }
}
