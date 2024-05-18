/*
 * Bu pattern alt üst ilişkilerinin çok olduğu durumlarda faydalı olur.
 */

import java.util.ArrayList;

class Calisan{
    String isim;
    Calisan yonetici;  //Her çalışanın bir yöneticisi olduğundan, hepsi kendi yönetici bilgisini tutuyor.

    Calisan(String isim){
        this.isim=isim;
    }
}

class Yonetici extends Calisan{
    ArrayList <Calisan> altlar = new ArrayList<>(); //Her yöneticini kendi çalışanlarını bilmesi için bir liste tutuyoruz.

    Yonetici(String isim) {
        super(isim);
        //TODO Auto-generated constructor stub
    }
    void addCalisan(Calisan calisan){
        altlar.add(calisan);
        calisan.yonetici = this;// burada her bir çalışana yöneticisini de atayarak çalışanların yöneticisini bilmesi sağlanıyor.
    }
    void printAltlar(){
        System.out.println(this.isim + " çalışanları:");
        altlar.stream().forEach(alt->{
            System.out.println(alt.isim);
        });
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        
        Calisan ali = new Calisan("Ali");
        Yonetici veli = new Yonetici("Veli");
        Calisan ahmet = new Calisan("Ahmet");
        Yonetici zafer = new Yonetici("Zafer");
        
        zafer.addCalisan(ali);
        veli.addCalisan(zafer);
        veli.addCalisan(ahmet);

        veli.printAltlar();
        zafer.printAltlar();


    }
}
