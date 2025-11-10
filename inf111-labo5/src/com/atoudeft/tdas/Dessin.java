package com.atoudeft.tdas;

import com.atoudeft.tdas.Cercle;

import java.util.ListIterator;
import java.util.Vector;

public class Dessin {
    private Vector<Cercle> cercles = new Vector<Cercle>();

    public void addCercle(Cercle cercle) {
        cercles.add(cercle);
    }
    public void suppCercle(Cercle cercle) { 
        cercles.remove(cercles.indexOf(cercle));
    }
    public Cercle quiContient(Point point) { 
        ListIterator<Cercle> iterateur = cercles.listIterator();
        Cercle c1;
        while(iterateur.hasNext()) {
            c1 = iterateur.next();
            if(c1.contient(point)){
                return c1;
            }
        }
        return null;
    }
    public double getSurface() {
        double surface = 0;
        
        for(int i = 0; i < this.cercles.size() ; i++) { 
            surface += cercles.get(i).getSurface();
        }
        return surface;
    }
}
