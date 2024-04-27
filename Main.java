import koneksi.Database;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //tipeData variabel
        int jumlahSks = 144;
        double ipk = 4.0;
        String nama = "Mirza";
        Database.hubungkan();


        //Class object = new Constructor()
        Scanner scanner = new Scanner(System.in);

        System.out.println("Before: ");
        System.out.println(nama);
        System.out.print("Masukkan nama: ");
        nama = scanner.nextLine();
        System.out.println("After: ");
        System.out.println(nama);

    }
}