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
        if(d > 0){
            this.numerateur = n;
            this.denominateur = d;
        } else if (d == 0){
            System.out.println("Le denominateur est egale a 0 !");
        } else {
            this.denominateur = -d;
            this.numerateur = -n;
            System.out.println("Rationnel : Le signe du numerateur est change ! ");
        }

        this.reduit();
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
    public void setNumerateur(int numerateur){
        this.numerateur = numerateur;
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
    public void setDenominateur(int denominateur){
        if(denominateur > 0){
            this.denominateur = denominateur;
        } else if (denominateur == 0){
            System.out.println("setDenominateur : Le denominateur est egale a 0 !");
        }
    }

    /**
    *  
    */
    public Rationnel inverse() {
        Rationnel resultatARetourne = null;

        if(this.numerateur == 0){
            resultatARetourne = null;
            System.out.println("Ce rationnel est nul");
        } 
        else 
        {
            resultatARetourne = new Rationnel(this.denominateur, this.numerateur);
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
            System.out.println("ajoute : unNR est null, on renvoie l'objet sans modification !.");
            nbRetourner = this;
        }
        else 
        {
            denominateurCommun = this.denominateur * unNR.denominateur;

            numerateur1 = this.numerateur * unNR.denominateur;
            numerateur2 = unNR.numerateur * this.denominateur;

            sommeNumerateur = numerateur1 + numerateur2;

            nbRetourner = new Rationnel(sommeNumerateur, denominateurCommun);
        
        }
        return(nbRetourner);
    }

    public Rationnel soustrait(Rationnel unNR){
        Rationnel nbRetourner;
        int sommeNumerateur; 
        int numerateur1;
        int numerateur2;
        int denominateurCommun;

        if(unNR == null){
            System.out.println("Soustrait : unNR est null, on renvoie l'objet sans modification !.");
            nbRetourner = this;
        }
        else 
        {
            denominateurCommun = this.denominateur * unNR.denominateur;

            numerateur1 = this.numerateur * unNR.denominateur;
            numerateur2 = unNR.numerateur * this.denominateur;

            sommeNumerateur = numerateur1 - numerateur2;

            nbRetourner = new Rationnel(sommeNumerateur, denominateurCommun);
        
        }
        return(nbRetourner);
    }

    public Rationnel mutliplie(Rationnel unNR){
        Rationnel nbRetourner;

        if(unNR == null){
            System.out.println("Soustrait : unNR est null, on renvoie l'objet sans modification !.");
            nbRetourner = this;
        }
        else 
        {
            numerateur = this.numerateur * unNR.numerateur;
            denominateur = this.denominateur * unNR.denominateur;

            nbRetourner = new Rationnel(numerateur, denominateur);
        
        }
        return(nbRetourner);
    }
}