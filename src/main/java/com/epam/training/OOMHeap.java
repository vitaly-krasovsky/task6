package com.epam.training;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Main application.
 *
 * @author vkrasovsky
 */
public class OOMHeap {
    private static final Logger LOGGER = LogManager.getLogger(OOMHeap.class);

    /**
     * @param args the args
     */
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        while (true) {
            items.add(new Item());
            LOGGER.debug(items.size());
        }
    }
}
