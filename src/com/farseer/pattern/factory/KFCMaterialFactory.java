package com.farseer.pattern.factory;

import com.farseer.pattern.material.*;

/**
 * Created by zhaosc on 16/4/18.
 */
public class KFCMaterialFactory extends AbstractFactory {
    @Override
    public MaterialBacon createBacon() {
        System.out.println("Kfc factory prepare material Bacon");
        return new KFCBacon();
    }

    @Override
    public MaterialVegetarian createVegetarian() {
        System.out.println("Kfc factory prepare material vegetarian");

        return new KFCVegetarian();
    }

    @Override
    public MaterialWheat createWheat() {
        System.out.println("Kfc factory prepare material wheat");
        return new KFCWheat();
    }
}
