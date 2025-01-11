
import java.util.HashMap;

public class ConfigurationPrototypeRegistryImpl implements ConfigurationPrototypeRegistry {

    private HashMap<ConfigurationType, Configuration> map = new HashMap<>();

    public void addPrototype(Configuration user) {
        map.put(user.getType(), user);
    }

    public Configuration getPrototype(ConfigurationType type) {
        if(type != null) {
            return map.get(type);
        }
        return null;

    }

    public Configuration clone(ConfigurationType type) {
        if(type != null) {
            return map.get(type).cloneObject();
        }
        return null;
    }

}
