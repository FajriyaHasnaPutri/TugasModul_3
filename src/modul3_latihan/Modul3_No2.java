package modul3_latihan;
import java.util.Scanner;
public class Modul3_No2 {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        int data [] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int cari;
        int IndexAwal = 0;
        int IndexAkhir = data.length - 1;
        int ketemu = 0;
        int point = 0;
        System.out.println("Isi data adalah: ");
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        System.out.print("Masukkan data yang dicari: ");
        cari = scan.nextInt ();
        
        while (( IndexAwal <= IndexAkhir ) && (ketemu == 0)){
            point = (IndexAwal + IndexAkhir ) / 2;
            System.out.println("Index Pointer: " + point);
            if(cari == data[point]){
                ketemu = 1;
                System.out.println("Data " + 
                        cari +"Ditemukan di index ke-: " + point);
            } 
            else if (cari < data[point]) {
                System.out.println("cari di kiri ");
            }
            
            else{
                IndexAwal = point+1;
                System.out.println("cari di kanan ");
            }
        }
        
    if (ketemu == 1)
        System.out.println("DATA DAPAT DITEMUKAN");
    else
        System.out.println("DATA TIDAK DAPAT DITEMUKAN");
            
        System.out.println("Fajriya Hasna Putri");
            
        }
    } 
    
    

        