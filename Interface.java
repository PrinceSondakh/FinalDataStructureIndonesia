//Interface
import java.util.Scanner;
public class Interface implements InterfaceSatu{
	public static void main(String[] args){
		Interface tamp7 = new Interface();
		tamp7.panggilInterface();		
	}
	public void panggilInterface(){
		Interface obj = new Interface(); int r;
		System.out.print("Masukan nilai jari-jari: ");
		r = obj.input();
		obj.kalkulasi(r);
		System.out.print("Luas lingkaran: "+obj.kalkulasi(r));	
	}
	public int input(){
		return new Scanner(System.in).nextInt();
	}
	@Override
	public float kalkulasi(int r){
		return InterfaceSatu.phi * (r * r);
	}
}



/*
public interface class InterfaceSatu{
	public interface final String kalkulasi(double x, double phi);
	public void getTitle(String title){
		System.out.println(title);
	}
}
*/