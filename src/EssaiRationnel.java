/**
* 
*/
class EssaiRationnel{
    public static void main(String[] args){
        Rationnel rationnel;


        System.out.println("*** testConstructeur ***\n");

        //Test n°1
        System.out.println("1er test avec 23 et 4, le constructeur doit avoir 23/4");
        rationnel = new Rationnel(23, 4);
        System.out.println("Rationnel contient : " + rationnel.toString());

        System.out.println("----------------------------");

        //Test n°2
        System.out.println("2eme test avec 25 et 8, le constructeur doit avoir 25/8");
        rationnel = new Rationnel(25, 8);
        System.out.println("Rationnel contient : " + rationnel.toString());

        System.out.println("----------------------------");

        //Test n°3
        System.out.println("3eme test avec -5 et 15, le constructeur doit avoir -1/3");
        rationnel = new Rationnel(-5, 15);
        System.out.println("Rationnel contient : " + rationnel.toString());

        System.out.println("----------------------------");

        //Test n°4
        System.out.println("4eme test avec 2 et -8, le constructeur doit avoir -1/4");
        rationnel = new Rationnel(2, -8);
        System.out.println("Rationnel contient : " + rationnel.toString());








        //testGetEtSet

        System.out.println("\n\n*** testGetEtSet ***\n");

        Rationnel rationnelGetSet = new Rationnel(5, 10);
        //Get numbers contained by rationnel
        //reduit method reduct the numbers so 5/10 become 1/2.
        System.out.println("- getNumerateur doit contenir 1\n- getDenominateur doit contenir 2");
        System.out.println("Le numerateur : " + rationnelGetSet.getNumerateur());
        System.out.println("Le denominateur : " + rationnelGetSet.getDenominateur());

        System.out.println("----------------------------");

        System.out.println("Set des nouvelles valeurs");

        System.out.println("----------------------------");

        rationnelGetSet.setNumerateur(35);
        rationnelGetSet.setDenominateur(21);
        System.out.println("Maintenant : \n- le numerateur doit etre egale a 35\n- le denominateur doit etre egale a 21");
        System.out.println("Le numerateur : " + rationnelGetSet.getNumerateur());
        System.out.println("Le denominateur : " + rationnelGetSet.getDenominateur());

        














        //TestInverse

        System.out.println("\n\n*** testInverse ***\n");
        Rationnel rationnelInverse;

        //Test n°1
        System.out.println("1er test avec 54 et 99, l'inverse doit etre 11/6");
        //Inverse of this var is 11/6 because 99/56 is reducible into 11/6.
        rationnel = new Rationnel(54, 99);
        rationnelInverse = rationnel.inverse();
        System.out.println("RationnelInverse contient : " + rationnelInverse.toString());
        
        System.out.println("----------------------------");

        //Test n°2
        System.out.println("2eme test avec 35 et 597, l'inverse doit etre 597/35");
        rationnel = new Rationnel(35, 597);
        rationnelInverse = rationnel.inverse();
        System.out.println("RationnelInverse contient : " + rationnelInverse.toString());

        System.out.println("----------------------------");

        //Test n°3
        System.out.println("3eme test avec 1024 et 20359, l'inverse doit etre 20359/1024");
        //Inverse of this var is 11/6 because 99/56 is reducible into 11/6.
        rationnel = new Rationnel(1024, 20359);
        rationnelInverse = rationnel.inverse();
        System.out.println("RationnelInverse contient : " + rationnelInverse.toString());
        
        
        



        //testAjoute

        System.out.println("\n\n*** Ajoute ***");
        
        //Test n°1
        System.out.println("1er test avec 25/45 + 158/169 qui doit donner : 2267/1521");
        rationnel = new Rationnel(25, 45);
        Rationnel rationnelAddition = new Rationnel(158,169);
        Rationnel addition = rationnel.ajoute(rationnelAddition);

        System.out.println("Resultat : " + addition.toString());

        System.out.println("----------------------------");

        //Test n°2
        System.out.println("2eme test avec 5/10 + 5/10 qui doit donner : 1/1");
        rationnel = new Rationnel(5, 10);
        rationnelAddition = new Rationnel(5,10);
        addition = rationnel.ajoute(rationnelAddition);

        System.out.println("Resultat : " + addition.toString());

        System.out.println("----------------------------");

        //Test n°3
        System.out.println("3eme test avec 9/20 + 1/20 qui doit donner : 1/2");
        rationnel = new Rationnel(9, 20);
        rationnelAddition = new Rationnel(1,20);
        addition = rationnel.ajoute(rationnelAddition);

        System.out.println("Resultat : " + addition.toString());
        





        //testSoustrait

        System.out.println("\n\n*** Soustrait ***");
        
        //Test n°1
        System.out.println("1er test avec 158/180 - 10/90 qui doit donner : 23/30");
        rationnel = new Rationnel(158, 180);
        Rationnel rationnelSoustraction = new Rationnel(10,90);
        Rationnel soustraction = rationnel.soustrait(rationnelSoustraction);

        System.out.println("Resultat : " + soustraction.toString());

        System.out.println("----------------------------");

        //Test n°2
        System.out.println("2eme test avec 5/10 - 5/10 qui doit donner : 0/1");
        rationnel = new Rationnel(5, 10);
        rationnelSoustraction = new Rationnel(5,10);
        soustraction = rationnel.soustrait(rationnelSoustraction);

        System.out.println("Resultat : " + soustraction.toString());

        System.out.println("----------------------------");

        //Test n°3
        System.out.println("3eme test avec 9/20 - 1/20 qui doit donner : 2/5");
        rationnel = new Rationnel(9, 20);
        rationnelSoustraction = new Rationnel(1,20);
        soustraction = rationnel.soustrait(rationnelSoustraction);

        System.out.println("Resultat : " + soustraction.toString());

        




        //testMultiplie

        System.out.println("\n\n*** Multiplie ***");

        //Test n°1
        System.out.println("1er test avec 2/10 * 5/30 qui doit donner : 1/30");
        rationnel = new Rationnel(2, 10);
        Rationnel rationnelMultiplication = new Rationnel(5,30);
        Rationnel multiplication = rationnel.multiplie(rationnelMultiplication);
 
        System.out.println("Resultat : " + multiplication.toString());

        System.out.println("----------------------------");

        //Test n°2
        System.out.println("2eme test avec 5/100 * 208/415 qui doit donner : 1040/41500 soit 52/2075");
        rationnel = new Rationnel(5, 100);
        rationnelMultiplication = new Rationnel(208,415);
        multiplication = rationnel.multiplie(rationnelMultiplication);

        System.out.println("Resultat : " + multiplication.toString());
        
        System.out.println("----------------------------");

        //Test n°3
        System.out.println("3eme test avec 2/4 * 4/4 qui doit donner : 8/16 soit 1/2");
        rationnel = new Rationnel(2, 4);
        rationnelMultiplication = new Rationnel(4,4);
        multiplication = rationnel.multiplie(rationnelMultiplication);

        System.out.println("Resultat : " + multiplication.toString());





        


        //testEgale

        System.out.println("\n\n*** Multiplie ***");

        //Test n°1
        System.out.println("1er test avec 1/10 et 2/20 qui doit donner True");
        rationnel = new Rationnel(1, 10);
        Rationnel rationnelEgale = new Rationnel(2,20);
        boolean egale = rationnel.egale(rationnelEgale);

        System.out.println("Resultat : " + egale);

        System.out.println("----------------------------");
       
        //Test n°2
        System.out.println("2eme test avec 5/10 et 5/20 qui doit donner False");
        rationnel = new Rationnel(5, 10);
        rationnelEgale = new Rationnel(5,20);
        egale = rationnel.egale(rationnelEgale);

        System.out.println("Resultat : " + egale);

        System.out.println("----------------------------");

        //Test n°3
        System.out.println("3eme test avec 1/1 et 35/35 qui doit donner True");
        rationnel = new Rationnel(1, 1);
        rationnelEgale = new Rationnel(35,35);
        egale = rationnel.egale(rationnelEgale);

        System.out.println("Resultat : " + egale);

        System.out.println("----------------------------");

        //Test n°4
        System.out.println("4eme test avec 1/5 et 10/100 qui doit donner False");
        rationnel = new Rationnel(1, 5);
        rationnelEgale = new Rationnel(10,100);
        egale = rationnel.egale(rationnelEgale);

        System.out.println("Resultat : " + egale);

    }
}