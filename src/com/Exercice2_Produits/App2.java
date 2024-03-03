package com.Exercice2_Produits;

import java.util.ArrayList;
import java.util.List;

public class App2 {
    public static void main(String[] args) {

        MetierProduitImpl metierProduit = new MetierProduitImpl(new ArrayList<Produit>());
        metierProduit.add(new Produit(1,"p1","m1",1300.0,"d1",52,6));
        metierProduit.add(new Produit(2,"p2","m2",1500.0,"d2",25,5));
        metierProduit.add(new Produit(3,"p3","m3",16000.0,"d3",28,2));
        System.out.println(metierProduit.getById(4L));
        metierProduit.deleteById(3L);
        List<Produit> produits = metierProduit.getAll();
        for (Produit produit: produits){
            System.out.println(produit);
        }
    }


}
