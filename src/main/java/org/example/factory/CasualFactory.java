package org.example.factory;

import org.example.casual.CasualPants;
import org.example.casual.CasualShoes;
import org.example.casual.CasualTop;
import org.example.product.Pants;
import org.example.product.Shoes;
import org.example.product.Top;

public class CasualFactory implements GarmentFactory {

    @Override
    public Top createTop() {
        return new CasualTop();
    }

    @Override
    public Pants createPants() {
        return new CasualPants();
    }

    @Override
    public Shoes createShoes() {
        return new CasualShoes();
    }
}