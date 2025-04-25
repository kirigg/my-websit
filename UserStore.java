package auth;

import java.util.HashMap;
import java.util.Map;

public class UserStorage {
    private static final Map<String, String> users = new HashMap<>();

    public static boolean register(String login, String password) {
        if (users.containsKey(login)) return false;
        users.put(login, password);
        return true;
    }

    public static boolean login(String login, String password) {
        return users.containsKey(login) && users.get(login).equals(password);
    }
}
