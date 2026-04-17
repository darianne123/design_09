package org.example.factory;

import org.example.party.PartyPants;
import org.example.party.PartyShoes;
import org.example.party.PartyTop;
import org.example.product.Pants;
import org.example.product.Shoes;
import org.example.product.Top;

public class PartyFactory implements GarmentFactory {

    @Override
    public Top createTop() {
        return new PartyTop();
    }

    @Override
    public Pants createPants() {
        return new PartyPants();
    }

    @Override
    public Shoes createShoes() {
        return new PartyShoes();
    }
}