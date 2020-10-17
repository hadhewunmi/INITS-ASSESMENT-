package com.w2a.testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

import junit.framework.Assert;


public class INITSNG extends TestBase{

	@Test(priority=1)
	public void AboutUs() throws InterruptedException {
		//sysytem click on about us
		driver.findElement(By.xpath(OR.getProperty("About_XPATH"))).click();
		System.out.println("About us clicked");
		Thread.sleep(30000);

		//To verify the appropriate screen is displayed	
		if(driver.findElement(By.xpath(OR.getProperty("WhatWeOffer_XPATH")))!= null){
			System.out.println("Screen is displayed");
		}else{
			System.out.println("Screen not displayed");
			Thread.sleep(30000);
		}
		//To verify services offered contains the appropriate text
		
		if(driver.getPageSource().contains("Web-based Software Development")){
			System.out.println("Web-based Software Development is present");
		}else{
			System.out.println("Web-based Software Development is absent");
		}
		if(driver.getPageSource().contains("Mobile Apps Development")){
			System.out.println("Mobile Apps Development is present");
		}else{
			System.out.println("Mobile Apps Development is absent");
		}
		if(driver.getPageSource().contains("Identity Management & Verification")){
			System.out.println("Identity Management & Verification is present");
		}else{
			System.out.println("Identity Management & Verification is absent");
		}
		if(driver.getPageSource().contains("Identity Management & Verification")){
			System.out.println("IT Consulting & Advisory is present");
		}else{
			System.out.println("IT Consulting & Advisory is absent");
		}
		if(driver.getPageSource().contains("Data Acquisition")){
			System.out.println("Data Acquisition is present");
		}else{
			System.out.println("Data Acquisition is absent");
		}
		if(driver.getPageSource().contains("Desktop & Embedded Devices")){
			System.out.println("Desktop & Embedded Devices is present");
		}else{
			System.out.println("Desktop & Embedded Devices is absent");
		}

	}


	@Test(priority=2)
	public void JoinTheTeam() throws InterruptedException, IOException {

		driver.findElement(By.xpath(OR.getProperty("JoinTeam_XPATH"))).click();
		System.out.println("Join team clicked");
		Thread.sleep(30000);

		//To verify the appropriate screen is displayed	
		if(driver.findElement(By.xpath(OR.getProperty("WantToJoin_XPATH")))!= null){
			System.out.println("Element is Present");
		}else{
			System.out.println("Element is Absent");
			Thread.sleep(30000);
		}
	}



	@Test(priority=3)
	public void ContactUS() throws InterruptedException, IOException {

		driver.findElement(By.xpath(OR.getProperty("Contactus_XPATH"))).click();
		System.out.println("Contact us clicked");
		Thread.sleep(30000);

		//To verify the appropriate screen is displayed	
		if(driver.findElement(By.xpath(OR.getProperty("We'rehere_XPATH")))!= null){
			System.out.println("Element is Present");
		}else{
			System.out.println("Element is Absent");
			Thread.sleep(30000);
		}

		driver.findElement(By.name(OR.getProperty("NameField_NAME"))).sendKeys(OR.getProperty("Name_TEXT"));
		System.out.println("name entered");
		driver.findElement(By.name(OR.getProperty("EmailField_NAME"))).sendKeys(OR.getProperty("Email_TEXT"));
		System.out.println("email entered");
		driver.findElement(By.name(OR.getProperty("CompanyField_NAME"))).sendKeys(OR.getProperty("Company_TEXT"));
		System.out.println("company eentered");
		driver.findElement(By.name(OR.getProperty("ContactnoField_NAME"))).sendKeys(OR.getProperty("Contact_TEXT"));
		System.out.println("contact entered");
		driver.findElement(By.name(OR.getProperty("MessageField_NAME"))).sendKeys(OR.getProperty("Message_TEXT"));
		System.out.println("messege entered");
		Thread.sleep(4000);
		click("Sendmessagebtn_XPATH");
		System.out.println("send button clicked");

		WebElement successMsg = driver.findElement(By.xpath(OR.getProperty("successMSg_XPATH")));
		//successMsg.click();
		if (successMsg.isDisplayed()) {
			System.out.println("Alert is displayed");
		}else {
			System.out.println("No alert");
		}
		String successAlert = successMsg.getText();
		System.out.println(successAlert);

		Thread.sleep(6000);
	}






}
