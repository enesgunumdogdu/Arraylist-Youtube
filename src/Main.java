import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> isimler = new ArrayList<>();

        System.out.println("Sıfırıncı durum arraylist=" + isimler);

        isimler.add("Enes");
        isimler.add("Mustafa");
        isimler.add("Kemal");

        System.out.println("Birinci durum arraylist=" + isimler);

        isimler.add(1,"Elif");
        System.out.println("İkinci durum arraylist=" + isimler);

        System.out.println("2.indexdeki eleman=" + isimler.get(2));

        isimler.remove("Enes");
        System.out.println("Üçüncü durum arraylist=" + isimler);

        System.out.println("Listedeki eleman sayısı=" + isimler.size());

        isimler.clear();
        System.out.println("Dördüncü durum arraylist=" + isimler);


    }
}