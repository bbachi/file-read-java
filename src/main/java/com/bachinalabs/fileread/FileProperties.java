package com.bachinalabs.fileread;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileProperties {

    private final Properties properties;

    FileProperties() {
        properties = new Properties();
        try {
            properties.load(new FileInputStream("src/main/files/file.properties"));

        } catch (FileNotFoundException ex) {
            Logger.getLogger(getClass().getName()).log(Level.ALL, "FileNotFoundException Occured while loading properties file::::" +ex.getMessage());
        } catch (IOException ioex) {
            Logger.getLogger(getClass().getName()).log(Level.ALL, "IOException Occured while loading properties file::::" +ioex.getMessage());
        }
    }

    public String readProperty(String keyName) {
        Logger.getLogger(getClass().getName()).log(Level.INFO, "Reading Property " + keyName);
        return properties.getProperty(keyName, "There is no key in the properties file");
    }
}
