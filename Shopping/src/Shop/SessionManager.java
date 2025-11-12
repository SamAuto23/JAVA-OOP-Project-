package Shop;
import java.util.List;
import java.util.Scanner;

public class SessionManager {
    private List<User> users;
    private User currentUser;

    public SessionManager(List<User> users) {
        this.users = users;
    }

    public User selectUser() {
        System.out.println("Select a user:");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < users.size(); i++) {
            System.out.println((i + 1) + ". " + users.get(i).getUsername());
        }
        int choice = scanner.nextInt() - 1;
        if (choice >= 0 && choice < users.size()) {
            currentUser = users.get(choice);
            return currentUser;
        } else {
            System.out.println("Invalid selection. Defaulting to first user.");
            currentUser = users.get(0);
            return currentUser;
        }
    }

    public void logoutUser() {
        currentUser = null;
        System.out.println("Logged out successfully.");
    }
}
