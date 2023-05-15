package overloading;

import java.util.Scanner;

public class Overloading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nama \t : Nadia Dita Salsabila");
        System.out.println("NPM \t : 21081010181");
        System.out.println("Kelas \t : Pemrograman Berorientasi Objek D081");
        System.out.println("\n");

        System.out.print("Masukkan nilai a b c untuk vektor 1 : ");
        int a1 = input.nextInt();
        int b1 = input.nextInt();
        int c1 = input.nextInt();
        vektor vector1 = new vektor(a1, b1, c1);

        System.out.print("Masukkan nilai a b c untuk vektor 2 : ");
        int a2 = input.nextInt();
        int b2 = input.nextInt();
        int c2 = input.nextInt();
        vektor vector2 = new vektor(a2, b2, c2);

        System.out.print("Masukkan skalar untuk melakukan perkalian vektor : ");
        int scalar = input.nextInt();

        vektor scalarResult = vector1.scalar(scalar);
        System.out.println("\nHasil perkalian vektor dengan skalar " + scalar + " : [" + scalarResult.nilaiX() + ", " + scalarResult.nilaiY() + ", " + scalarResult.nilaiZ() + "]");

        int result = vector1.vektor2(vector2);
        System.out.println("Hasil perkalian vektor 1 dengan vektor 2 : " + result);
    }
}