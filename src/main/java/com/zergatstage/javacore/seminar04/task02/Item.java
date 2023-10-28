package com.zergatstage.javacore.seminar04.task02;

import java.util.List;

public class Item {
    private int itemId;
    private final String itemName;

    public Item(int i, String name) {
        this.itemName = name;
        this.itemId = i;
    }

    public static boolean doesItemExists(int key, List<Item> items){
        return items.stream()
                .anyMatch(localKey -> key == localKey.itemId);
    }
    public static class NoItemsOnStoreAvailableException extends RuntimeException{
        private String userMessage;
        public NoItemsOnStoreAvailableException(int itemId){
            this.userMessage = String.format("There are no items (%d) on storage", itemId);
        }
    }
}
