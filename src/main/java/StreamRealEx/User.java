package StreamRealEx;


//Get a list of active users from a user database

import java.util.List;
import java.util.stream.Collectors;

public class User {
    private String name;
    private boolean active;

    public User (String name, boolean active) {
        this.name = name;
        this.active = active;

    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    public class FilterActiveUsers {
        public static void main(String[] args) {
            List<User> users = List.of(
                    new User("Alice",true),
                    new User("Bob",false),
                    new User("Charlie",true)
            );

            List<String> activeUsers = users.stream()
                    .filter(User::isActive)
                    .map(User::getName)
                    .collect(Collectors.toList());

            System.out.println(activeUsers);

        }

    }
}
