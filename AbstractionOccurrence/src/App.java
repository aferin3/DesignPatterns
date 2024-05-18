import java.util.ArrayList;

/* 
 * Bir nesne türününün  birden fazla örneğini yönetmek ve takip etmek gerektiğinde.
 * Yani aynı türden çok fazla nesne olduğunda; buradaki bir diziye ait birden çok bölüm olması ve bunların organize edilmesi gibi.
 * Organize için bir arraylist içinde bu nesneler tutulur ve kullanılır. Bunların eklenmesi veya çıkarılması gibi işlemlerin tanımlanmasıda aynı şekilde.
 */
class Dizi{
    String isim;
    String yapimci;
    ArrayList <Bolum> bolumler = new ArrayList<>();

    void bolumEkle(Bolum bolum){
        bolumler.add(bolum);
    }


}
class Bolum{
    String bolumIsim;
    int bolumNo;

    Bolum(String bolumIsim,int bolumNo){
        this.bolumIsim=bolumIsim;
        this.bolumNo = bolumNo;            

    }
}
public class App {

    
    public static void main(String[] args) {
        
        Dizi dizi = new Dizi();

        dizi.isim = "Game of Thrones";

        Bolum bolum = new Bolum("Winter is coming", 1);
        dizi.bolumEkle(bolum);
        bolum = new Bolum("The Kingsroad", 2);
        dizi.bolumEkle(bolum);

        dizi.bolumler.stream().forEach(entry -> {
            System.out.println(entry.bolumIsim);

        });
        
    }
}
