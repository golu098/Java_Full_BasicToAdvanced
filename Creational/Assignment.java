package Creational;

class BrowserFactory {
    // Step 1: Create a private static instance of the class
    private static BrowserFactory instance;
    private Browser browser;

    // Step 2: Create a private constructor
    private BrowserFactory() {
        // Initialize browser here, e.g., setting up WebDriver
        this.browser = new Browser(); // Replace with actual browser initialization
    }

    // Step 3: Provide a public static method to get the instance
    public static synchronized BrowserFactory getInstance() {
        if (instance == null) {
            instance = new BrowserFactory();
        }
        return instance;
    }

    // Provide a method to access the browser
    public Browser getBrowser() {
        return browser;
    }
}

// Example Creational.Browser class (replace with actual browser class or WebDriver setup)
class Browser {
    // Creational.Browser implementation goes here
}
 class User {
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;

    private User(UserBuilder builder) {
        this.username = builder.username;
        this.password = builder.password;
        this.email = builder.email;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    // Getters
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getEmail() { return email; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }

    @Override
    public String toString() {
        return "Creational.User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    // Static nested Builder class
    public static class UserBuilder {
        private String username;
        private String password;
        private String email;
        private String firstName;
        private String lastName;

        public UserBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
public class Assignment {

    public static void main(String[] args) {
        // Create a Creational.User object using the UserBuilder
        User user = new User.UserBuilder()
                .setUsername("testUser")
                .setPassword("123Jk@34")
                .setEmail("shivkant_kumar@example.com")
                .setFirstName("Shiv")
                .setLastName("Kant")
                .build();

        // Use the created Creational.User object in your test
        System.out.println("Creational.User created: " + user);

        // Example test scenario (pseudo-code)
        // Navigate to registration page
        // Enter user details
        // Submit registration form
        // Validate success message
    }
}
