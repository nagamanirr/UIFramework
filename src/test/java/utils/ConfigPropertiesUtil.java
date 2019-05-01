package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.Properties;

public class ConfigPropertiesUtil {


    public static final String DEFAULT_PROPERTIES_FILE= "/Users/vapasi/VapsiTraining/VapasiUiFramework/src/test/resources/config.properties";


    public static Properties getProperties() {
        return getProperties(DEFAULT_PROPERTIES_FILE);
    }

    public static Properties getProperties( final String propertiesFile) {
        Properties properties = new Properties();
        try (InputStream in = new FileInputStream(Paths.get(propertiesFile).toFile())) {
            properties.load(in);
        } catch (IOException e) {
            System.out.println("Unable to load properties from file");
        }
        return properties;
    }











}
