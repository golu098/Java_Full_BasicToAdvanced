//public enum BrowserType {
//    CHROME, EDGE, FIREFOX
//    // Enum to represent supported browser types: CHROME, EDGE, and FIREFOX
//}
//
//public class DriverManager {
//    private static WebDriver driver;
//    // Static WebDriver instance used to ensure a single instance (Singleton)
//
//    private DriverManager() {}
//    // Private constructor to prevent instantiation of the class (Singleton pattern)
//
//    public static WebDriver createDriver(BrowserType type) {
//        // Factory method to create the appropriate WebDriver instance based on the BrowserType
//
//        WebDriver driver = null; // Placeholder for the driver object
//
//        // Switch-case to determine which driver to create based on the browser type
//        switch(type) {
//            case CHROME:
//                driver = new ChromeDriver();
//                break;
//            case EDGE:
//                driver = new EdgeDriver();
//                break;
//            case FIREFOX:
//                driver = new FirefoxDriver();
//                break;
//            default:
//                throw new IllegalArgumentException("Browser Type not supported");
//                // Exception if an unsupported browser type is provided
//        }
//
//        driver.manage().window().maximize(); // Maximize the browser window after initialization
//        return driver; // Return the created driver instance
//    }
//
//    public static WebDriver getDriver(BrowserType type) {
//        // Singleton method to get the WebDriver instance. Ensures only one driver instance is created.
//
//        if (driver == null) {
//            // Check if the driver is already initialized
//
//            synchronized(DriverManager.class) {
//                // Synchronize to ensure thread-safety in case of concurrent access
//
//                if (driver == null) {
//                    driver = createDriver(type);
//                    // Create the driver if it hasn't been initialized yet
//                }
//            }
//        }
//        return driver; // Return the existing or newly created driver instance
//    }
//
//    public static void tearDown() {
//        // Method to safely quit the WebDriver and clean up resources
//
//        if (driver != null) {
//            driver.quit(); // Close the browser and end the session
//            driver = null; // Reset the driver to null to allow for future initialization
//        }
//    }
//}
