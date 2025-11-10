package com.atoudeft.demos;
import com.atoudeft.tdas.Cercle;
import com.atoudeft.tdas.Dessin;

public class DemoDessin {
    public static void main(String[] args) {
        Dessin d1 = new Dessin();

        Cercle c1 = new Cercle(4.0,3.0,8);
        Cercle c2 = new Cercle(7.0,9.5,3);
        Cercle c3 = new Cercle(4.2,8.9,5);
      

        d1.addCercle(c1);
        d1.addCercle(c2);
        d1.addCercle(c3);
        
        System.out.println(d1.getSurface());

    }
}
