package com.farseer.pattern;

import com.farseer.pattern.store.HamburgStore;
import com.farseer.pattern.store.McDonaldStore;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HamburgStore store = new McDonaldStore();
        store.orderHamburg("A");
    }
}
