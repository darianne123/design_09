package org.example.driver;


import org.example.factory.CasualFactory;
import org.example.factory.GarmentFactory;
import org.example.factory.PartyFactory;
import org.example.factory.ProfessionalFactory;
import org.example.product.Pants;
import org.example.product.Shoes;
import org.example.product.Top;

// Driver class used to test each garment family
public class Driver {

    public static void main(String[] args) {

        System.out.println("Professional Outfit:");
        GarmentFactory professionalFactory = new ProfessionalFactory();
        Top professionalTop = professionalFactory.createTop();
        Pants professionalPants = professionalFactory.createPants();
        Shoes professionalShoes = professionalFactory.createShoes();
        professionalTop.wear();
        professionalPants.wear();
        professionalShoes.wear();

        System.out.println();

        System.out.println("Casual Outfit:");
        GarmentFactory casualFactory = new CasualFactory();
        Top casualTop = casualFactory.createTop();
        Pants casualPants = casualFactory.createPants();
        Shoes casualShoes = casualFactory.createShoes();
        casualTop.wear();
        casualPants.wear();
        casualShoes.wear();

        System.out.println();

        System.out.println("Party Outfit:");
        GarmentFactory partyFactory = new PartyFactory();
        Top partyTop = partyFactory.createTop();
        Pants partyPants = partyFactory.createPants();
        Shoes partyShoes = partyFactory.createShoes();
        partyTop.wear();
        partyPants.wear();
        partyShoes.wear();
    }
}