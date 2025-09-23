public class Demo {
    public static void main(String[] args) {
        Voiture v1 = new Voiture();
        //int p = v1.getPosition(); //p ici a recu la copie de la position
        //p = 300; //change tout simplement la valeur de p
        Compteur cpt = v1.getCompteur(); //cpt a un reference de l'attribut
        cpt.incrementer();//*DANGER* On pet modifier l'attribut compteur sans que la voiture bouge
    }
}
