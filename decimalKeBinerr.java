import java.util.Scanner;
public class decimalKeBinerr{
	public static void main(String[] args){
		decimalKeBinerr tamp10 = new decimalKeBinerr();
		tamp10.tampilDecimalKeBinerr();
	}
	public void tampilDecimalKeBinerr(){
		Scanner in = new Scanner(System.in);
		System.out.print("input Desimal : ");
		Long dec=in.nextLong();
		System.out.println("Konversi ke Binary: " + Long.toBinaryString(dec));
	}
}