public class User {
    private String username;
    private String email;
    // Additional fields for user preferences and settings

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    // Additional methods for managing user preferences and settings can be added here
}
