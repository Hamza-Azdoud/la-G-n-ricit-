package com.Exercice1_Storage;

import java.util.ArrayList;


public class App1 {

    public static void main(String[] args) {
	// write your code here
      StorageGenerique<Integer> storageInteger = new StorageGenerique<Integer>(new ArrayList<Integer>());
      storageInteger.addElement(1);
      storageInteger.addElement(16);
      System.out.println(storageInteger.getSize());

        try {
            System.out.println(storageInteger.getElement(3));
            storageInteger.removeElement(3);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        StorageGenerique<String> storageString = new StorageGenerique<String>(new ArrayList<String>());
        storageString.addElement("Ahmed");
        storageString.addElement("Rachid");
        storageString.addElement("Asmae");
        storageString.addElement("Hajar");

        try {
            System.out.println(storageString.getElement(5));
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        StorageGenerique<Double> storageDouble = new StorageGenerique<Double>(new ArrayList<Double>());
        storageDouble.addElement(1.5);
        storageDouble.addElement(16.0);
        System.out.println(storageDouble.getSize());

        try {
            System.out.println(storageDouble.getElement(0));
            storageDouble.removeElement(1);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
