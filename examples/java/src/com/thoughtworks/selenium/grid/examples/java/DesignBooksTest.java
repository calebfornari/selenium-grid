package com.thoughtworks.selenium.grid.examples.java;

import static com.thoughtworks.selenium.grid.tools.ThreadSafeSeleniumSessionStorage.closeSeleniumSession;
import static com.thoughtworks.selenium.grid.tools.ThreadSafeSeleniumSessionStorage.startSeleniumSession;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


/**
 */
public class DesignBooksTest extends BookTest {


    @Test(groups = {"demo", "firefox", "default"}, description = "Test Amazon Comment Quality Using the Firefox Web Browser (1).")
    @Parameters({"seleniumHost", "seleniumPort", "browser", "webSite"})
    public void refactoring(String seleniumHost, int seleniumPort, String browser, String webSite) throws Throwable {
        try {
            startSeleniumSession(seleniumHost, seleniumPort, browser, webSite);
            checkBook("Refactoring: Improving the Design of Existing Code",
                    "Refactoring: Improving the Design of Existing Code (The Addison-Wesley Object Technology Series)",
                    "Refactoring",
                    "0201485672");
        } finally {
            closeSeleniumSession();

        }
    }


    @Test(groups = {"demo", "firefox", "default"}, description = "Test Amazon Comment Quality Using the Firefox Web Browser (1).")
    @Parameters({"seleniumHost", "seleniumPort", "browser", "webSite"})
    public void designPatterns(String seleniumHost, int seleniumPort, String browser, String webSite) throws Throwable {
        try {
            startSeleniumSession(seleniumHost, seleniumPort, browser, webSite);
            checkBook("Design Patterns: Elements of Reusable Object-Oriented Software",
                    "Design Patterns: Elements of Reusable Object-Oriented Software (Addison-Wesley Professional Computing Series)",
                    "Design Patterns",
                    "0201633612");
        } finally {
            closeSeleniumSession();
        }
    }

    @Test(groups = {"demo", "firefox", "default"}, description = "Test Amazon Comment Quality Using the Firefox Web Browser (1).")
    @Parameters({"seleniumHost", "seleniumPort", "browser", "webSite"})
    public void testDrivenDevelopment(String seleniumHost, int seleniumPort, String browser, String webSite) throws Throwable {
        try {
            startSeleniumSession(seleniumHost, seleniumPort, browser, webSite);
            checkBook("Test Driven Development: By Example",
                    "Test Driven Development: By Example (The Addison-Wesley Signature Series)",
                    "Test Driven Development",
                    "0321146530");
        } finally {
            closeSeleniumSession();
        }
    }

    @Test(groups = {"demo", "firefox", "default"}, description = "Test Amazon Comment Quality Using the Firefox Web Browser (1).")
    @Parameters({"seleniumHost", "seleniumPort", "browser", "webSite"})
    public void enterpriseDesignPatterns(String seleniumHost, int seleniumPort, String browser, String webSite) throws Throwable {
        try {
            startSeleniumSession(seleniumHost, seleniumPort, browser, webSite);
            checkBook("Patterns of Enterprise Application Architecture",
                    "Patterns of Enterprise Application Architecture (The Addison-Wesley Signature Series)",
                    "enterprise design patterns",
                    "0321127420");
        } finally {
            closeSeleniumSession();
        }
    }

    @Test(groups = {"demo", "firefox", "default"}, description = "Test Amazon Comment Quality Using the Firefox Web Browser (1).")
    @Parameters({"seleniumHost", "seleniumPort", "browser", "webSite"})
    public void domainDrivenDesign(String seleniumHost, int seleniumPort, String browser, String webSite) throws Throwable {
        try {
            startSeleniumSession(seleniumHost, seleniumPort, browser, webSite);
            checkBook("Domain-Driven Design: Tackling Complexity in the Heart of Software",
                    "Domain-Driven Design: Tackling Complexity in the Heart of Software",
                    "domain driven design",
                    "0321125215");
        } finally {
            closeSeleniumSession();
        }
    }

}