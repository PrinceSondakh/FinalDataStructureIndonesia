import java.util.Scanner;
public class Pangkatpangkat{
	public static void main(String[] args){
		Pangkatpangkat tamp1 = new Pangkatpangkat();
		tamp1.pangkatPangkat();		
	}
	public void pangkatPangkat(){
		Pangkatpangkat tamp1 = new Pangkatpangkat();
		System.out.println ("Masukan Nilai: ");
		int nilai = new Scanner(System.in).nextInt();
		System.out.println ("Pangkat: ");
		int pangkat = new Scanner(System.in).nextInt();
		System.out.println ("Hasil ");
		System.out.println (""+tamp1.hitungPangkat(nilai, pangkat));
	}
	public int hitungPangkat(int nilai, int pangkat){
		int hasil = nilai;
		int i = 1;
		do{
			hasil = hasil * nilai;
			i++;
		}while (i < pangkat );
		return hasil;
	}
}

