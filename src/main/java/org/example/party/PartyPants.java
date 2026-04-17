package org.example.party;

import org.example.product.Pants;

public class PartyPants implements Pants {

    @Override
    public void wear() {
        System.out.println("Wearing party pants.");
    }
}