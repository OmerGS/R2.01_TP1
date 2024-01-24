/**
 * The Rationnel class represents a rational number, which is a number that can be
 * expressed as the quotient of two integers.
 * @author O.Gunes
 */
class Rationnel{
    /**
     * Numerator of the rational number.
     */
    private int numerateur;

    /**
     * Denominator of the rational number.
     */
    private int denominateur;

     /**
     * Constructs a Rationnel object with the specified numerator and denominator.
     *
     * @param n The numerator.
     * @param d The denominator.
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
     * Gets the numerator of the rational number.
     *
     * @return The numerator.
     */
    public int getNumerateur(){
        return this.numerateur;
    }

    /**
     * Sets the numerator of the rational number.
     *
     * @param numerateur The new numerator.
     */
    public void setNumerateur(int numerateur){
        this.numerateur = numerateur;
    }

    /**
     * Gets the denominator of the rational number.
     *
     * @return The denominator.
     */
    public int getDenominateur(){
        return this.denominateur;
    }

    /**
     * Sets the denominator of the rational number, checking the validity of the value.
     *
     * @param denominateur The new denominator.
     */
    public void setDenominateur(int denominateur){
        if(denominateur > 0){
            this.denominateur = denominateur;
        } else if (denominateur == 0){
            System.out.println("setDenominateur : Le denominateur est egale a 0 !");
        }
    }

    /**
     * Returns the inverse of the rational number.
     *
     * @return The inverse of the rational number.
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
     * Computes and returns the greatest common divisor (GCD) of two numbers.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The GCD of a and b.
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

    /**
     * Reduces the rational number by simplifying the numerator and denominator
     * using their greatest common divisor (GCD).
     */
    private void reduit() {
        int communDiviseur;
        communDiviseur = pgcd(Math.abs(this.numerateur), this.denominateur);

        this.numerateur /= communDiviseur;
        this.denominateur /= communDiviseur;
    }
    
    /**
     * Add the rational number by another rational number.
     *
     * @param unNR The other rational number.
     * @return The result of the addition.
     */
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

    /**
     * Substract the rational number by another rational number.
     *
     * @param unNR The other rational number.
     * @return The result of the subtraction.
     */
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

    /**
     * Multiplies the rational number by another rational number.
     *
     * @param unNR The other rational number.
     * @return The result of the multiplication.
     */
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
    
    /**
     * Checks if the rational number is equal to another rational number.
     *
     * @param another The other rational number to compare.
     * @return true if the rational numbers are equal, false otherwise.
     */
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

    /**
     * Returns a textual representation of the rational number.
     *
     * @return The textual representation of the rational number.
     */
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