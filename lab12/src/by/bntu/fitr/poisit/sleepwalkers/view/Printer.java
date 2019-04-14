package by.bntu.fitr.poisit.sleepwalkers.view;

import org.apache.log4j.Logger;

public class Printer {
    private static final Logger LOG;

    static {
        LOG = Logger.getLogger(Printer.class);
    }

    public static void println(String msg) {
        LOG.info(msg);
    }
}
