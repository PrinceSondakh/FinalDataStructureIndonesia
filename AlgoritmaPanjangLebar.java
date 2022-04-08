//Masukan panjang lebar  nilai luas adalah panjang di kali lebar
//Author: Prince George Imanuel
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AlgoritmaPanjangLebar{
	public static void main(String[] args){
		AlgoritmaPanjangLebar tamp3 = new AlgoritmaPanjangLebar();
		tamp3.algoritmaPanjangLebarr();
	}	
	public void algoritmaPanjangLebarr(){
		int panjang=0, lebar=0;
		AlgoritmaPanjangLebar obj = new AlgoritmaPanjangLebar();
		System.out.println ("Masukan Panjang: ");
		panjang = obj.input();
		System.out.println ("Lebar: ");
		lebar = obj.input();
		System.out.println ("Hasil ");
		System.out.println (""+obj.panjangLebar(panjang, lebar));		
	}
	public int panjangLebar(int panjang, int lebar){
		int hasil;
		hasil = panjang * lebar;
		return hasil;
	}
	public int input(){
		int input=0;
		try{
			InputStreamReader isReader = new InputStreamReader(System.in);
			BufferedReader bReader = new BufferedReader(isReader);
			String getInput = bReader.readLine();
			input = Integer.parseInt(getInput);
		}catch(Exception ex){
			System.out.println(ex);
		}	
		return input;
	}
}