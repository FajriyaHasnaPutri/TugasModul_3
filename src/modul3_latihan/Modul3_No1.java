package modul3_latihan;
import java.util.Scanner;
public class Modul3_No1 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        String data[] = {"Galileo", "Archimedes", "Alkhawarizmi", "Aljabar", "Fajriya Hasna Putri", "Tesla"};
        String key;
        System.out.print("Data yang dicari: ");
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        System.out.print("Isi data adalah: ");
        key = scan.nextLine();
        for(int i = 0; i <= data.length; i++) {
            if (key.equalsIgnoreCase(data[i])){
                System.out.print("Data "+key+" berada pada index ke - " + i);
                System.out.println("Fajriya Hasna Putri");
                break; 
                
            }

    }
}
}
