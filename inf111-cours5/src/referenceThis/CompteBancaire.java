package referenceThis;
public class CompteBancaire {
    private String numero;
    private double solde;

    public void crediter(double montant) {
        solde = solde + montant;
    }

    public void debiter(double solde) {
        this.solde -= solde;
    }

    public static void main(String[] args) {
        CompteBancaire cb = new CompteBancaire();
        cb.crediter(150);
        System.out.println(cb.solde);
        cb.debiter(60);
        System.out.println(cb.solde);
    }
}


