package com.radhsyn83;

/*
 *
 * Fathur Radhy
 * 10115046
 * PDO11K
 */

public class Main {

    public static void main(String[] args) {
	// write your code here
        WarnaKoordinat wk = new WarnaKoordinat("Jingga", 10, 4);
        wk.setNamaWarna("Jingga");
        wk.setX(10);
        wk.setY(4);
        System.out.println("Warna Koordinat "+wk.getNamaWarna());
        System.out.println("Kordinat Sumbu x : "+wk.getX()+", y : "+wk.getY());
    }
}
