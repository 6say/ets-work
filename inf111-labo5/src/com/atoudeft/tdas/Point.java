package com.atoudeft.tdas;

public class Point {
    private double abs;
    private double ord;

    public double getAbs() { 
        return abs;
    }
    public double getOrd() { 
        return ord;
    }

    public Point(double abs,double ord) { 
        this.abs = abs;
        this.ord = ord;
    }

    public Point(double abs) {
        this(abs,0);
    }

        
    public Point() {
        this(0,0);
    }

    public boolean egaliteP(Point p1, Point p2) {
        if(p1.abs != p2.abs) { 
            return false;
        }else {
            if(p1.ord != p2.ord)
                return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "("+ (int)abs + "," + (int)ord + ")";
    }

    public double dist(Point point) {
        //un ou les deux points peuvent etre nuls
        //Distance entre deux points
        //d  = SQRT((x2 - x1)^2 + (y2 - y1)^2)
        return Math.sqrt((point.abs - this.abs)+(point.ord - this.ord));
    }

    public double dist() { 
         this(new Point());
    }

}
