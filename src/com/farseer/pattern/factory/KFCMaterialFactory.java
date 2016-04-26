package com.farseer.pattern.factory;

import com.farseer.pattern.material.KFCBacon;
import com.farseer.pattern.material.KFCVegetarian;
import com.farseer.pattern.material.KFCWheat;
import com.farseer.pattern.material.MaterialBacon;
import com.farseer.pattern.material.MaterialVegetarian;
import com.farseer.pattern.material.MaterialWheat;

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
