package com.singletonpattern;

    import org.openqa.selenium.WebDriver;
    import org.testng.Assert;
    import org.testng.annotations.AfterClass;
    import org.testng.annotations.BeforeClass;
    import org.testng.annotations.Parameters;
    import org.testng.annotations.Test;

    /**
     * {@code AppTest} class is a test class that uses TestNG to perform UI tests on a web browser.
     * It initializes a WebDriver instance using the Singleton pattern via {@code WebDriverManager}
     * to ensure that the same browser instance is used across all tests.
     */
    public class AppTest {
        private WebDriver driver;

        /**
         * Sets up the WebDriver instance before the test class is executed.
         * It retrieves the WebDriver from {@code WebDriverManager} based on the browser type
         * specified in the testng.xml file.
         *
         * @param browser The name of the browser to initialize (e.g., "chrome", "firefox", "edge").
         */
        @BeforeClass
        @Parameters("browser")
        public void setUp(String browser){
          driver= WebDriverManager.getInstance(browser).getDriver();
        }

        /**
         * Tests the Google homepage by navigating to it and asserting that the title is "Google".
         * It also prints the thread name and the title of the page to the console.
         */
        @Test
        public void testGoogle(){
            driver.get("https://www.google.com");
            System.out.println(Thread.currentThread().getName() +" : "+driver.getTitle());
            Assert.assertEquals(driver.getTitle(), "Google");
        }

        /**
         * Tears down the WebDriver instance after all tests in the class have been executed.
         * It quits the browser and cleans up the ThreadLocal variable in {@code WebDriverManager}
         * to avoid memory leaks.
         */
        @AfterClass
        public void tearDown(){
            WebDriverManager.quitBrowser();
        }
    }