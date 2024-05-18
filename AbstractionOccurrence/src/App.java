import java.util.ArrayList;


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
