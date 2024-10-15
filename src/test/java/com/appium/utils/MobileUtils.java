package com.appium.utils;

import io.appium.java_client.AppiumBy;

public class MobileUtils {

    public static void scrollToEnd(String platformType){
        Driver.getDriver(platformType).findElement( new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(10);"));
    }

    public static void scrollIntoView(String platformType, String text){
        Driver.getDriver(platformType).findElement( new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));"));
    }
}
