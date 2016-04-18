package com.farseer.pattern.hamburg;

import com.farseer.pattern.factory.AbstractFactory;

/**
 * Created by zhaosc on 16/4/12.
 * 培根汉堡
 */
public class McDonalHamburgB extends Hamburg {

    public McDonalHamburgB(AbstractFactory factory) {
        this.factory = factory;
        setName("I'm McDonal hamburg B");
    }

    @Override
    public void prepare() {
        vegetarian = factory.createVegetarian();
        //注意,麦当劳的汉堡是全麦的哦~
        wheat = factory.createWheat();
    }
}
