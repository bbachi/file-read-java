package com.bachinalabs.fileread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadWithFileInputStream {

    public static void main( String[] args )
    {
        FileProperties properties = new FileProperties();

        Logger.getLogger("ReadWithFileInputStream").log(Level.INFO, properties.readProperty("file.name"));
        Logger.getLogger("ReadWithFileInputStream").log(Level.INFO, properties.readProperty("file.extension"));
        Logger.getLogger("ReadWithFileInputStream").log(Level.INFO, properties.readProperty("message.no.property"));

    }
}
