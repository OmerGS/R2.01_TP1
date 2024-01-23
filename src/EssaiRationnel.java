/**
*  
*/
class EssaiRationnel{
    public static void main(String[] args){
        Rationnel rationnel;
        rationnel = new Rationnel(5, 8);


        System.out.println("Le numerateur : " + rationnel.getNumerateur());
        System.out.println("Le denominateur : " + rationnel.getDenominateur());

        System.out.println("Set des nouveaux variables : ");

        rationnel.setNumerateur(10);
        rationnel.setDenominateur(50);

        System.out.println("Le numerateur : " + rationnel.getNumerateur());
        System.out.println("Le denominateur : " + rationnel.getDenominateur());
    }
}