import java.util.Scanner;
public class decimalKeBiner{
	public static void main(String[] args){
		decimalKeBiner tamp9 = new decimalKeBiner();
		tamp9.tampilDecimalKeBiner();
	}
	public void tampilDecimalKeBiner(){
		String biner = "";
		System.out.println("Masukan jumlah desimal <1-100> :");
		long deci = new Scanner(System.in).nextLong();
		long mod, hasil;
		do{
			mod = deci%2;
			deci = deci/2;
			biner = biner + mod;		
		}while( deci != 0);
		biner = biner + deci ;
		StringBuffer newBiner = new StringBuffer(biner);
		String tambah = " ";
		long xa = biner.length();
		while( xa != 8){
			tambah = tambah + "0";
			xa++;
		}
		System.out.println("Hasil: "+tambah+newBiner.reverse());
	}
}