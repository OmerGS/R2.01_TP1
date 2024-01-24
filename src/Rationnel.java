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
        } else if (d < 0) {
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
        communDiviseur = pgcd(Math.abs(this.numerateur), this.denominateur);

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

    public Rationnel multiplie(Rationnel unNR) {
        Rationnel nbRetourner;
    
        if (unNR == null) {
            System.out.println("Multiplier : unNR est null, on renvoie l'objet sans modification !");
            nbRetourner = this;
        } else {
            int nouveauNumerateur = this.numerateur * unNR.numerateur;
            int nouveauDenominateur = this.denominateur * unNR.denominateur;
    
            nbRetourner = new Rationnel(nouveauNumerateur, nouveauDenominateur);
        }
    
        return nbRetourner;
    }
    

    public boolean egale(Rationnel another){
        boolean rationnelEgale = false;
        boolean denominateurEgale = false;
        boolean numerateurEgale = false;

        if(another == null){
            System.out.println("egale : unNR est null, on renvoie l'objet sans le modifier !");
            rationnelEgale = false;
        }
        else 
        {
            if(this.numerateur == another.numerateur){
                numerateurEgale = true;
            } 
            
            if(this.denominateur == another.denominateur){
                denominateurEgale = true;
            }

            if(numerateurEgale == true && denominateurEgale == true){
                rationnelEgale = true;
            }
        }
        return(rationnelEgale);
    }

    public String toString(){
        String toReturn = "";
        String numerateur = "";
        String denominateur = "";

        if(this == null){
            System.out.println("toString : Object null ! ");
            toReturn = null;
        }
        else 
        {
            numerateur = String.valueOf(getNumerateur());
            denominateur = String.valueOf(getDenominateur());

            toReturn = (numerateur + "/" + denominateur);
        }



        return(toReturn);
    }
}