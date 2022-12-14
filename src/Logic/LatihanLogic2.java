package Logic;

public class LatihanLogic2 {
    public static void main(String[] args) {
        Soal1(9);
        Soal2(9);
        Soal3(9);
        Soal4(9);
        Soal5(9);
//        Soal6(9);
//        Soal7(9);
//        Soal8(9);
//        Soal9(9);
//        Soal10(9);
    }

    public static void Soal1(int i) {
        System.out.println("Soal nomor 1: " + "\n");
        String[][] kotak = new String[i][i];
        //isi array
        // baris
        for (int j = 0; j < i; j++) {
            int angka = 1;
            //kolom
            for (int k = 0; k < i; k++) {
                if (j == k) {
                    kotak[j][k] = String.valueOf(angka);
                } else if (j + k == i - 1) {
                    kotak[j][k] = String.valueOf(angka);
                }
                angka++;
            }

        }
        PrintArray.print(kotak);
    }

    public static void Soal2(int i) {
        System.out.println("Soal nomor 2: " + "\n");
        String[][] kotak = new String[i][i];
        //baris
        for (int j = 0; j < i; j++) {
            int angka = 1;
            //kolom
            for (int k = 0; k < i; k++) {
                if (j == 0) {
                    kotak[j][k] = String.valueOf(angka);
                } else if (k == 0) {
                    kotak[j][k] = String.valueOf(1);
                } else if (j == 8) {
                    kotak[j][k] = String.valueOf(angka);
                } else if (k == 8) {
                    kotak[j][k] = String.valueOf(17);
                }
                angka += 2;
            }

        }
        PrintArray.print(kotak);
        System.out.println("\n");
    }

    public static void Soal3(int i) {
        System.out.println("Soal nomor 3: " + "\n");
        String[][] kotak = new String[i][i];
        {
            for (int j = 0; j < i; j++) {
                int angka = 0;
                //kolom
                for (int k = 0; k < i; k++) {
                    if (j == 0) {
                        kotak[j][k] = String.valueOf(angka);
                    } else if (k == 0) {
                        kotak[j][k] = String.valueOf(0);
                    } else if (j == 8) {
                        kotak[j][k] = String.valueOf(angka);
                    } else if (k == 8) {
                        kotak[j][k] = String.valueOf(16);
                    } else if (j == k) {
                        kotak[j][k] = String.valueOf(angka);
                    } else if (j + k == i - 1) {
                        kotak[j][k] = String.valueOf(angka);
                    }
                    angka += 2;
                }

            }
            PrintArray.print(kotak);
        }
        System.out.println("\n");
    }

    public static void Soal4(int i) {
        System.out.println("Soal nomor 4: " + "\n");
        int[][] kotak = new int[i][i];
        for (int j = 0; j < i; j++) {
//            int angka = 1;
            //kolom
            for (int k = 0; k < i; k++) {
                if (j == 0) {
                    if (k == 0 || k == 1) {
                        kotak[j][k] = 1;
                    } else {
                        kotak[j][k] = kotak[0][k - 1] + kotak[0][k - 2];
                    }

                } else if (k == 0) {
                    kotak[j][k] = 1;
                } else if (j == 8) {
                    if (k == 0 || k == 1) {
                        kotak[j][k] = 1;
                    } else {
                        kotak[j][k] = kotak[0][k - 1] + kotak[0][k - 2];
                    }
                } else if (k == 8) {
                    kotak[j][k] = 34;
                } else if (k == 4) {
                    kotak[j][k] = 5;
                } else if (j == 4) {
                    if (k == 0 || k == 1) {
                        kotak[j][k] = 1;
                    } else {
                        kotak[j][k] = kotak[0][k - 1] + kotak[0][k - 2];
                    }
                }

            }

        }
        PrintArray.print(kotak);
        System.out.println("\n");
    }

    public static void Soal5(int i) {
        System.out.println("Soal nomor 5: " + "\n");
        int[][] kotak = new int[i][i];
        for (int j = 0; j < i; j++) {
            //kolom
            for (int k = 0; k < i; k++) {
                if (k == 0) {
                    kotak[j][k] = 1;
                }
                if (j == k) {
                    if (k == 0 || k == 1 || k == 2) {
                        kotak[j][k] = 1;
                    } else {
                        kotak[j][k] = kotak[j - 1][k - 1] + kotak[j - 2][k - 2] + kotak[j - 3][k - 3];
                    }
                }if (j + k == i-1) {
                    if (k == 0 || k == 1 || k == 2) {
                        kotak[j][k] = 1;
                    } else {
                        kotak[j][k] = 1;
                    }
                }if (k == i-1) {
                    kotak[j][k] = 57;
                }

             }
        }
        PrintArray.print(kotak);
        System.out.println("\n");
        }
    }


