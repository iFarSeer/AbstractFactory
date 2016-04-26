package com.farseer.pattern.store;

import com.farseer.pattern.factory.AbstractFactory;
import com.farseer.pattern.factory.KFCMaterialFactory;
import com.farseer.pattern.factory.McDonalMaterialFactory;
import com.farseer.pattern.hamburg.Hamburg;
import com.farseer.pattern.hamburg.McDonalHamburgA;
import com.farseer.pattern.hamburg.McDonalHamburgB;

/**
 * Created by zhaosc on 16/4/17.
 * 麦当劳
 */
public class McDonaldStore extends HamburgStore {

    @Override
    public Hamburg createHamburg(String type) {
        AbstractFactory factory = new McDonalMaterialFactory();
        Hamburg hamburg = null;
        if ("A".equals(type)) {
            hamburg = new McDonalHamburgA(factory);
        } else if ("B".equals(type)) {
            hamburg = new McDonalHamburgB(factory);
        }
        return hamburg;
    }
}
