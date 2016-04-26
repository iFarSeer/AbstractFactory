package com.farseer.pattern.factory;

import com.farseer.pattern.material.MaterialBacon;
import com.farseer.pattern.material.MaterialVegetarian;
import com.farseer.pattern.material.MaterialWheat;
import com.farseer.pattern.material.McDonalBacon;
import com.farseer.pattern.material.McDonalVegetarian;
import com.farseer.pattern.material.McDonalWheat;

/**
 * Created by zhaosc on 16/4/18.
 */
public class McDonalMaterialFactory extends AbstractFactory {
    @Override
    public MaterialBacon createBacon() {
        System.out.println("McDonal factory prepare material Bacon");
        return new McDonalBacon();
    }

    @Override
    public MaterialVegetarian createVegetarian() {
        System.out.println("McDonal factory prepare material vegetarian");
        return new McDonalVegetarian();
    }

    @Override
    public MaterialWheat createWheat() {
        System.out.println("McDonal factory prepare material wheat");
        return new McDonalWheat();
    }
}
