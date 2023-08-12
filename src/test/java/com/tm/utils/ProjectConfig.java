package com.tm.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ProjectConfig {
    static Properties prop;

    static {
        prop = new Properties();
        try {
            FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\ProjectConfig.properties");
            prop.load(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String getProperty(String key) {
        return prop.getProperty(key);
    }
}
