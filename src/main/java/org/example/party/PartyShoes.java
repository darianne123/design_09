package org.example.party;

import org.example.product.Shoes;

public class PartyShoes implements Shoes {

    @Override
    public void wear() {
        System.out.println("Wearing party shoes.");
    }
}