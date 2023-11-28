package com.scaler.lld.design.assignments.singleton;

public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {

    static FileBasedConfigurationManagerImpl instance = null;

    private FileBasedConfigurationManagerImpl(){

    }

    @Override
    public String getConfiguration(String key) {
        if(!properties.isEmpty()) {
            return properties.getProperty(key);
        }else return null;
    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        if(!properties.isEmpty()) {
        return convert(properties.getProperty(key),type);
        }else return null;
    }

    @Override
    public void setConfiguration(String key, String value) {
        properties.setProperty(key,value);
    }

    @Override
    public <T> void setConfiguration(String key, T value) {
      properties.setProperty(key,String.valueOf(value));

    }

    @Override
    public void removeConfiguration(String key) {
        properties.remove(key);
    }

    @Override
    public void clear() {
    properties.clear();
    }

    public static FileBasedConfigurationManager getInstance() {
        if(instance == null){
            synchronized (FileBasedConfigurationManagerImpl.class){
                if(instance == null){
                    instance = new FileBasedConfigurationManagerImpl();
                }
            }
        }
        return instance;
    }

    public static void resetInstance() {
        instance = null;
    }

}