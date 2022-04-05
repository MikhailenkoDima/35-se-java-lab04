package pkg35.java.lab04;




/**
 *
 * @author Win7
 */
public class Calculation {
    public static void KineticEnergy(String MassTela, String SkorostTela)
{
        
        int m = Integer.parseInt(MassTela);//присвоим целому значению, значение строки
        int v = Integer.parseInt(SkorostTela);
        int KEnergy = (m * (v*v))/2;
        System.out.println("Кинетическая энергия тела равна:" +KEnergy);
                System.out.println("Число " + KEnergy + " в двоичной форме: " + 
                                    Integer.toBinaryString(KEnergy));
        String s = String.valueOf(KEnergy);
        System.out.format("%n+------------+---------------+---------------------+");
        System.out.format("%n| Масса тела | Скорость тела | Кинетическая энергия|");
        System.out.format("%n+------------+---------------+---------------------+");
        System.out.format("%n|%-11s |%-15s|%-21s|",m,v,s);
        System.out.format("%n+------------+---------------+---------------------+%n");       
        
}}