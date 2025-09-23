package com.cndiaga.exercices;

public class De {
  private int nbreFacette;
  
  public De() {
    nbreFacette = 6;
  }
  public De(int nbreFacette) {
      this.nbreFacette = nbreFacette;
  }

  public int lancer(){
    return (int) (Math.floor(Math.random() * (nbreFacette - 1)) + 1);

  }

  public static void main(String [] args) {
    De d1, d2;
    d1 = new De();
    d2 = new De(15);

    for (int i = 0; i<=20; i++) {
        d1.lancer();
        d2.lancer();
        System.out.println("Lancé " + i + ":\nDe 1: "+d1.lancer()+"\nDe 2: "+d2.lancer()+"\n");
    }
    }

}
