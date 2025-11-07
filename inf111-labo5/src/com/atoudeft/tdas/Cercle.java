package com.atoudeft.tdas;

public class Cercle {
    private Point centre;
    private double rayon;

    public double getRayon() { 
        return rayon;
    }

    public Point getCentre() { 
        return centre;
    }
    
    public Cercle(double abs, double ord, double rayon) { 
        centre = new Point(abs,ord);
        this.rayon = rayon; 
    }
    public Cercle(Point centre, double rayon) { 
        this.centre = centre;
        this.rayon = rayon;
    }
    public Cercle() {
        centre = new Point();
        rayon = 0;
    }

    public double getSurface() {
        return Math.PI*Math.pow(rayon,2);
    }
    
    public boolean contient(Point p) {
        if(p.dist(centre) > rayon)
            return false;
        else
            return true;
    }
    @Override
    public String toString() {
        return "[("+centre.getAbs()+","+centre.getOrd()+") "+";"+ rayon + "]";
    }
    
}
