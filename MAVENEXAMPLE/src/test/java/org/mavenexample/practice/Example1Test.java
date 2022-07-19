package org.mavenexample.practice;

import org.testng.annotations.Test;

public class Example1Test {
	@Test
	public void print1Test() {
		String url=System.getProperty("URL");
		String browser=System.getProperty("BROWSER");
		System.out.println(url);
		System.out.println(browser);
		System.out.println("tyss1-test1,true");
	}
	@Test
	public void print2Test() {
		System.out.println("tyss2-test1");
	}
}
