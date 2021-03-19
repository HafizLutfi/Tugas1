package com.juaracoding.angsuran.hitung;

public class Perhitungan {
	 
	public double platfon;
	public double sukuBunga;
	public double lamaPinjaman;
	
	public double totalAngsuran(double platfon, double sukuBunga, double lamaPinjaman) {
		
		double totalAngsuran = platfon*(sukuBunga/12)/(1-(Math.pow(1+(sukuBunga/12),-lamaPinjaman))) ;
		
		return totalAngsuran;
	}
	
	public double angsuranBunga(double platfon , double sukuBunga) {
		
		double angsuranBunga = platfon*sukuBunga/12;
		
		return angsuranBunga;
			
	}
	
	public double angsuranPokok(double platfon, double sukuBunga, double lamaPinjam) {
		double angsuranPokok= totalAngsuran(platfon, sukuBunga, lamaPinjaman) - angsuranBunga(platfon, sukuBunga);
		
		return angsuranPokok;
	}
	
	public double sisaPinjaman(double platfon,double sukuBunga, double lamaPinjaman) {
		double sisaPinjaman = platfon - angsuranPokok(platfon, sukuBunga, lamaPinjaman);
		
		return sisaPinjaman;
	}
//	angsuran = bungaperbulan*platfon*(POWER(((1+bungaperbulan)),lamapinjaman))/(POWER(((1+bungaperbulan)),lamapinjaman)-1);
//
//	angsuranBunga =bunga/360*30*sisapinjaman
//
//	angsuran pokok =Total angsuran - angsuranbunga
//
//	sisapinjaman = platfon - angsuran pokok

	public double getPlatfon() {
		return platfon;
	}
	public void setPlatfon(double platfon) {
		this.platfon = platfon;
	}
	public double getSukuBunga() {
		return sukuBunga;
	}
	public void setSukuBunga(double sukuBunga) {
		this.sukuBunga = sukuBunga;
	}
	public double getLamaPinjaman() {
		return lamaPinjaman;
	}
	public void setLamaPinjaman(double lamaPinjaman) {
		this.lamaPinjaman = lamaPinjaman;
	}
}
