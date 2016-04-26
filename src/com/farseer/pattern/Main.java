package com.farseer.pattern;

import com.farseer.pattern.factory.KFCMaterialFactory;
import com.farseer.pattern.factory.McDonalMaterialFactory;
import com.farseer.pattern.store.HamburgStore;
import com.farseer.pattern.store.KFCStore;
import com.farseer.pattern.store.McDonaldStore;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HamburgStore mcDonaldStore = new McDonaldStore(new McDonalMaterialFactory());
        mcDonaldStore.orderHamburg("A");

        System.out.println("----------------------------------");
        HamburgStore kfcStore = new KFCStore(new KFCMaterialFactory());
        kfcStore.orderHamburg("A");
    }
}
