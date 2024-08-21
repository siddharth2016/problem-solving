package src.lld2.singleton;

public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {

    private static FileBasedConfigurationManagerImpl instance;

    private FileBasedConfigurationManagerImpl() {
        super();
    }

    @Override
    public String getConfiguration(String key) {
        // TODO Auto-generated method stub
        Object val = getProperties().get(key);
        if(val != null) return val.toString();
        return null;
    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        // TODO Auto-generated method stub
        Object val = getConfiguration(key);
        if(val != null) return convert(getConfiguration(key), type);
        return null;
    }

    @Override
    public void setConfiguration(String key, String value) {
        // TODO Auto-generated method stub
        getProperties().put(key, value);
    }

    @Override
    public <T> void setConfiguration(String key, T value) {
        // TODO Auto-generated method stub
        getProperties().put(key, value);
    }

    @Override
    public void removeConfiguration(String key) {
        // TODO Auto-generated method stub
        getProperties().remove(key);
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        getProperties().clear();
    }

    public static FileBasedConfigurationManager getInstance() {
        // TODO Auto-generated method stu
        if(instance == null) {
            instance = new FileBasedConfigurationManagerImpl();
        }
        return instance;
    }

    public static void resetInstance() {
        // TODO Auto-generated method stub
        instance = null;
    }

}
