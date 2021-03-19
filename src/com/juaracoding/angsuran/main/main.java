package com.juaracoding.angsuran.main;

import java.util.Scanner;

import com.juaracoding.angsuran.hitung.Perhitungan;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Perhitungan hitung = new Perhitungan();
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukan Besar Pinjaman :");
		double platfon = scan.nextDouble();
		System.out.println("Masukan besar Bunga :");
		double sukuBunga = scan.nextDouble();
		System.out.println("Masukan lama Pinjaman :");
		double lamaPinjaman = scan.nextDouble();
		
		
			for (int i = 1; i <= lamaPinjaman; i++) {
			System.out.println("Angsuran Ke "+i);
			double totalAngsuran = platfon*(sukuBunga/12)/(1-(Math.pow(1+(sukuBunga/12),-i))) ;
			System.out.println("Total Angsuran= " + totalAngsuran);
			double angsuranBunga = platfon*sukuBunga;
			double angsuranPokok= platfon - angsuranBunga;
			double sisaPinjaman = platfon- angsuranPokok;
			System.out.println("Angsuran Pokok =" +angsuranPokok);
			System.out.println("Angsuran Bunga =" +angsuranBunga);
			System.out.println("Sisa Pinjaman = "+sisaPinjaman);
			System.out.println("");
			
			}
	}

}
