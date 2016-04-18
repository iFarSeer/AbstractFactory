package com.farseer.pattern.store;

import com.farseer.pattern.factory.AbstractFactory;
import com.farseer.pattern.factory.KFCMaterialFactory;
import com.farseer.pattern.hamburg.Hamburg;
import com.farseer.pattern.hamburg.KFCHamburgA;
import com.farseer.pattern.hamburg.KFCHamburgB;

/**
 * Created by zhaosc on 16/4/17.
 * 肯德基
 */
public class KFCStore extends HamburgStore {
    @Override
    public Hamburg createHamburg(String type) {

        AbstractFactory factory = new KFCMaterialFactory();
        Hamburg hamburg = null;
        if ("A".equals(type)) {
            hamburg = new KFCHamburgA(factory);
        } else if ("B".equals(type)) {
            hamburg = new KFCHamburgB(factory);
        }
        return hamburg;
    }
}
