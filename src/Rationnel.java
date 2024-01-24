/**
*  
*/
class Rationnel{
    // Commente
    private int numerateur;
    // Commente
    private int denominateur;

    /**
    *  
    */
    public Rationnel(int n, int d){
        if(d >= 0){
            this.numerateur = n;
            this.denominateur = d;
        } else {
            this.denominateur = d;
            System.out.println("Rationnel : Il faut changer le signe du numerateur ! ");
        }
    }

    /**
    *  
    */
    public int getNumerateur(){
        return this.numerateur;
    }

    /**
    *  
    */
    public int setNumerateur(int numerateur){
        return this.numerateur = numerateur;
    }

    /**
    *  
    */
    public int getDenominateur(){
        return this.denominateur;
    }

    /**
    *  
    */
    public int setDenominateur(int denominateur){
        return this.denominateur = denominateur;
    }

    /**
    *  
    */
    public Rationnel inverse() {
        Rationnel resultatARetourne;

        if(this.numerateur == 0){
            resultatARetourne = null;
            System.out.println("Ce rationnel est nul");
        } 
        else 
        {
            Rationnel rationnelInverse = new Rationnel(this.denominateur, this.numerateur);
            resultatARetourne = rationnelInverse;
        }

        return resultatARetourne;
    }

    /**
    *  
    */
    private int pgcd(int a, int b) {
        int valeurARetourne;
        if (b == 0) {
            valeurARetourne = a;
        } else {
            valeurARetourne = pgcd(b, a % b);
        }

        return(valeurARetourne);
    }

    private void reduit() {
        int communDiviseur;
        communDiviseur = pgcd(this.numerateur, this.denominateur);

        this.numerateur /= communDiviseur;
        this.denominateur /= communDiviseur;
    }
    
    public Rationnel ajoute(Rationnel unNR){
        Rationnel nbRetourner;
        int sommeNumerateur; 
        int numerateur1;
        int numerateur2;
        int denominateurCommun;

        if(unNR == null){
            System.out.println("Impossible d'ajouter null à ce Rationnel.");
            nbRetourner = null;
        }
        else 
        {

            denominateurCommun = this.denominateur * unNR.denominateur;

            numerateur1 = this.numerateur * unNR.denominateur;
            numerateur2 = unNR.numerateur * this.denominateur;

            sommeNumerateur = numerateur1 + numerateur2;

            nbRetourner = new Rationnel(sommeNumerateur, denominateurCommun);

            nbRetourner.reduit();
        
        }
        return(nbRetourner);
    }
}