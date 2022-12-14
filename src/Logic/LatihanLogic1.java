package Logic;

public class LatihanLogic1 {
    public static void main(String[] args) {
    Soal1(9);
    Soal2(9);
    Soal3(9);
    Soal4(9);
    Soal5(9);
    Soal6(9);
    Soal7(9);
    Soal8(9);
    Soal9(9);
    Soal10(9);
    }
    public static void Soal1 (int i){
        System.out.println("Soal nomor 1 :"+"\n");
        for (int j = 1; j <= i; j++) {
            System.out.print(j+"\t");
        }
        System.out.println("\n");
    }
    public static void Soal2(int i) {
        int hasil = 0;
        int akhir = 0;
        System.out.println("Soal nomor 2: "+"\n");
        int[] deret = new int[i];
        for (int k = 0; k < deret.length; k++){
            if(k % 2 == 0){
                if(k == 0){
                    hasil = 1;
                    System.out.print(hasil+"\t");
                }else{
                    System.out.print(hasil+"\t");
                }
            }else{
                akhir = hasil *3;
                System.out.print(akhir+"\t");
                hasil = akhir - k;
            }

        }System.out.println("\n");
    }
    private static void Soal3(int i){
        System.out.println("Soal nomor 3 : "+"\n");
        int angka = 0;
        int[] deret = new int [i];
        for (int l = 0; l < deret.length; l++) {
            if (l == 0) {
                deret[l] = angka;
            }else {
                deret[l] = angka +=2;
            }
            System.out.print(deret[l]+"\t");
        }
        System.out.println("\n");

    }
    public static void Soal4(int i){
        System.out.println("Soal nomor 4: "+"\n");
        int[] deret = new int [i];
        for (int m = 0; m < deret.length; m++) {
            if (m == 0 || m == 1){
                deret [m] = 1;
            }else {
                deret[m] = deret[m-1]+deret[m-2];
            }
            System.out.print(deret[m]+"\t");
        }
        System.out.println("\n");
    }
    public static void Soal5(int i){
        System.out.println("Soal nomor 5: "+"\n");
        int[] deret = new int [i];
        for (int n = 0; n < deret.length; n++) {
            if (n == 0 || n == 1 || n == 2){
                deret [n] = 1;
            }else {
                deret[n] = deret[n-1]+deret[n-2] + deret[n-3];
            }
            System.out.print(deret[n]+"\t");
        }
        System.out.println("\n");
    }
    public static void Soal6(int i){
        System.out.println("Soal nomor 6: "+"\n");
        int[] deret = new int[i];
        int a = 0;

        for (int o=0; o<= 99; o++){
            int bil=0;
            for (int p=1;p<=o;p++){
                if (o%p==0){
                    bil=bil+1;
                }
            }
            if (bil==2){
                a+=1;
                if(a <= deret.length){
                    System.out.print(o+"\t");
                }else{
                    i=99;
                }

            }
        }System.out.println("\n");
    }
    public static void Soal7(int i){
        System.out.println("Soal nomor 7: "+"\n");
        String[] deret = new String[i];
        char huruf = 'A';
        for (int p = 0; p < i; p++) {
            deret[p] = String.valueOf(huruf);
            huruf++;
            System.out.print(deret[p]+"\t");
        }
        System.out.println("\n");
    }
    public static void Soal8(int i){
        System.out.println("Soal nomor 8: "+"\n");
        String[] deret = new String[i];
        char huruf = 'A';
        int angka = 2;
        for (int q = 0; q < i; q++) {
            if (q%2 == 0){
                deret[q] = String.valueOf(huruf);
            }else {
                deret[q] = String.valueOf(angka);
                angka += 2;
            }
            huruf++;
            System.out.print(deret[q]+"\t");
        }
        System.out.println("\n");
    }
    public static void Soal9 (int i){
        System.out.println("Soal nomor 9: "+"\n");
        int [] deret = new int[i];
        for (int r = 0; r < deret.length; r++) {
            deret[r] = (int)Math.pow(3,r);
            System.out.print(deret[r]+"\t");
        }
        System.out.println("\n");
    }
    public static void Soal10 (int i){
        System.out.println("Soal nomor 10: "+"\n");
        int [] deret = new int[i];
        for (int s = 0; s < deret.length; s++) {
            deret[s] = (int)Math.pow(s,3);
            System.out.print(deret[s]+"\t");
        }
        System.out.println("\n");
    }
}
