package data;

import models.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private static final String DATA_FILE = "users.dat";

    public static List<User> loadAll() {
        File file = new File(DATA_FILE);
        if (!file.exists()) return new ArrayList<>();

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            return (List<User>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public static void saveAll(List<User> users) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(DATA_FILE))) {
            out.writeObject(users);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static User findByUsername(String username) {
        return loadAll().stream()
                .filter(user -> user.getUsername().equalsIgnoreCase(username))
                .findFirst().orElse(null);
    }

    public static void add(User user) {
        List<User> users = loadAll();
        users.add(user);
        saveAll(users);
    }
}
