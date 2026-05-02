import java.util.ArrayList;

public class AracYonetimApp {
    public static void main(String[] args) {
        ArrayList<Arac> araclar = new ArrayList<Arac>();

        Motor toyota = new Motor("Benzinli",132);
        araclar.add(new Otomobil("Toyota","Corolla", toyota, 4));
        Motor yamaha = new Motor("Benzinli",35);
        araclar.add(new Motosiklet("Yamaha","R25",yamaha,true));

        for(Arac arac : araclar){
            arac.bilgiGoster();
            if(arac instanceof Otomobil){
                System.out.println("Bu bir otomobildir.");
            }
            else if(arac instanceof Motosiklet){
                System.out.println("Bu bir motosiklettir.");
            }
            System.out.println();
        }
    }
}
