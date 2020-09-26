package com.bachinalabs.fileread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class ReadMain
{
    public static void main( String[] args )
    {
        ApplicationProperties properties = new ApplicationProperties();

        Logger.getLogger("App Main").log(Level.INFO, properties.readProperty("message.one"));
        Logger.getLogger("App Main").log(Level.INFO, properties.readProperty("message.two"));
        Logger.getLogger("App Main").log(Level.INFO, properties.readProperty("message.three"));
        Logger.getLogger("App Main").log(Level.INFO, properties.readProperty("message.four"));
        Logger.getLogger("App Main").log(Level.INFO, properties.readProperty("message.no.property"));

    }
}
