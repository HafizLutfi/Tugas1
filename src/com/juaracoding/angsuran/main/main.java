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
		double sisaPinjaman = platfon;
		double angsuranBunga = platfon *sukuBunga;
		double totalAngsuran;
			for (double i = lamaPinjaman; i >= 1; i--) {
			totalAngsuran = platfon*(sukuBunga/12)/(1-(Math.pow(1+(sukuBunga/12),-i))) ;	
			System.out.println("Angsura ke-"+i);
			System.out.println("Besar angsuran= " + totalAngsuran);
			double angsuranPokok= totalAngsuran - angsuranBunga;
			System.out.println("Angsuran Pokok =" +angsuranPokok);
			System.out.println("Angsuran Bunga =" +angsuranBunga);
			System.out.println("Sisa Pinjaman = "+sisaPinjaman);
			System.out.println("");
			
			sisaPinjaman -= totalAngsuran;
			angsuranBunga = sisaPinjaman*sukuBunga;
			
			}
		
	
	}

}
