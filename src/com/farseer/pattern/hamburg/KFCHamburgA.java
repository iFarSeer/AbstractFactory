package com.farseer.pattern.hamburg;

import com.farseer.pattern.factory.AbstractFactory;

/**
 * Created by zhaosc on 16/4/12.
 * 培根汉堡
 */
public class KFCHamburgA extends Hamburg {

    public KFCHamburgA(AbstractFactory factory) {
        this.factory = factory;
        setName("I'm KFC hamburg A");
    }

    @Override
    public void prepare() {
        bacon = factory.createBacon();
        vegetarian = factory.createVegetarian();
    }
}
