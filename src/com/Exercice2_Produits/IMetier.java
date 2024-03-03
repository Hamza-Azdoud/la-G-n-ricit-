package com.Exercice2_Produits;

import java.util.List;

public interface IMetier <T,U>{

    public void add(T o);
    public List<T> getAll();
    public T getById(U id);
    public void deleteById(U id);

}
