package com.bachinalabs.fileread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadWithFileReader {

    public static void main( String[] args )
    {
        DBProperties properties = new DBProperties();

        Logger.getLogger("ReadWithFileReader").log(Level.INFO, properties.readProperty("database.name"));
        Logger.getLogger("ReadWithFileReader").log(Level.INFO, properties.readProperty("database.driver"));
        Logger.getLogger("ReadWithFileReader").log(Level.INFO, properties.readProperty("message.no.property"));

    }
}
