
import java.util.HashMap;

public class UserPrototypeRegistryImpl implements UserPrototypeRegistry {

    private HashMap<UserType, User> map = new HashMap<>();

    public void addPrototype(User user) {
        map.put(user.getType(), user);
    }

    public User getPrototype(UserType type) {
        if(type != null) {
            return map.get(type);
        }
        return null;
    }

    public User clone(UserType type) {
        if(type != null) {
            return map.get(type).cloneObject();
        }
        return null;
    }

}
