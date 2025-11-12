package Shop;

public abstract class User {
    private String userId;
    private String username;
    private String name;
    protected Address address; // Protected to allow easy access by subclasses
    private String role;

    public User(String userId, String username, String name, Address address, String role) {
        this.userId = userId;
        this.username = username;
        this.name = name;
        this.address = address;
        this.role = role;
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getRole() {
        return role;
    }

    public abstract void displayOptions(); // Each user type will implement their own displayOptions method

    @Override
    public String toString() {
        return String.format("User ID: %s, Username: %s, Name: %s, Address: %s, Role: %s",
                userId, username, name, address, role);
    }
}
