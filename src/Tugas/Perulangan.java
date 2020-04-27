package Tugas;

public class Perulangan {
        public static void main(String[] args){
            int isiGalon = 0;
            int penuh = 225;

            System.out.println("Isi Galon Sekarang : " + isiGalon + "m1");
            System.out.println("Isi Galon Ketika Penuh : " + penuh + "m1");

            do {
                isiGalon++;
                System.out.println("Sedang mengisi galon..");
                System.out.println("Isi Galon Sekarang : " + isiGalon + "m1");
            }while(isiGalon != penuh);

            System.out.println("Finale: Isi Gelas Sekarang : " + isiGalon + "m1");
        }
    }

