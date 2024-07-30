package src;

import java.util.ArrayList;

public class AuthenticationService implements IAuthenticationService {
    private ArrayList<User> users;

    @Override
    public User signUp(String username, String password) {
        for (User user1 : users) {
            if (user1.getUsername().equals(username)) {
                return null;
            }
        }
        User user = new User(username, password);
        users.add(new User(username, password));
        return user;
    }

    @Override
    public User logIn(String username, String password) {
        for (User user1 : users) {
            if (user1.getUsername().equals(username) && user1.getPassword().equals(password)) {
                return user1;
            }
        }
        return null;
    }

    public AuthenticationService() {
        users = new ArrayList<>();
    }

    // TODO Now: Add a constructor to initialize the users list with the default user

    // TODO Now: Implement the signUp method to add a new user to the list if the username is not taken and return the user; returns null otherwise

    // TODO Now: Implement the logIn method to return the user if the username and password match, and null otherwise
}
