/**
* 
*/
class EssaiRationnel{
    public static void main(String[] args){
        Rationnel rationnel;
        rationnel = new Rationnel(12, 142);


        /*System.out.println("Le numerateur : " + rationnel.getNumerateur());
        System.out.println("Le denominateur : " + rationnel.getDenominateur());

        System.out.println("Set des nouveaux variables : ");

        rationnel.setNumerateur(10);
        rationnel.setDenominateur(50);

        System.out.println("Le numerateur : " + rationnel.getNumerateur());
        System.out.println("Le denominateur : " + rationnel.getDenominateur());

        Rationnel rationnelInverse = rationnel.inverse();
        System.out.println("\n Inverse : ");

        System.out.println("Le numerateur : " + rationnelInverse.getNumerateur());
        System.out.println("Le denominateur : " + rationnelInverse.getDenominateur());
        */

        System.out.println("Ajoute : ");
        Rationnel machine = new Rationnel(158,169);
        Rationnel addition = rationnel.ajoute(machine);

        System.out.println(addition.getNumerateur() + "/" + addition.getDenominateur());
    }
}