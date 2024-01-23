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
    public Rationnel inverse(){
        return Rationnel(this.denominateur, this.numerateur); 
    } 

    
}