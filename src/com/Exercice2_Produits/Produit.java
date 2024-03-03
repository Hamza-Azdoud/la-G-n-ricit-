package com.Exercice2_Produits;

public class Produit {
    private long id;
    private String name;
    private String marque;
    private double prix ;
    private String description;
    private int nombre_stock;
    private int quatite;

    public Produit() {
    }

    public Produit(long id, String name, String marque, double prix, String description, int nombre_stock, int quatite) {
        this.id = id;
        this.name = name;
        this.marque = marque;
        this.prix = prix;
        this.description = description;
        this.nombre_stock = nombre_stock;
        this.quatite = quatite;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNombre_stock() {
        return nombre_stock;
    }

    public void setNombre_stock(int nombre_stock) {
        this.nombre_stock = nombre_stock;
    }

    public int getQuatite() {
        return quatite;
    }

    public void setQuatite(int quatite) {
        this.quatite = quatite;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", description='" + description + '\'' +
                ", nombre_stock=" + nombre_stock +
                ", quatite=" + quatite +
                '}';
    }
}
