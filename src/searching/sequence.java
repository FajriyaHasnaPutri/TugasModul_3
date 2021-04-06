package searching;

public class sequence {
    public static void main(String[] args) {
        int A[] = {10, 12, 8, 9, 15};
        int cari = 8;
        int ketemu = 0;
        
        System.out.println("isi data A adalah: ");
            for (int i = 0; i< A.length; i++) {
                System.out.print(A[i] + " ");
                }
        System.out.println("");
        System.out.println ("");
        
        for (int i=0; i< A.length; i++) {
            if (A[i] == cari){
                ketemu = 1;
                System.out.println("data " + cari +" berada di index ke");
            }         
        }
        System.out.println("");
        System.out.println ("");
        
        if (ketemu == 1)
            System.out.println("kesimpulan data ditemukan ");
        else
            System.out.println("kesimpulan data tidak di temukan ");
    }
    
}
