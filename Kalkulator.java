//Kalkulator 
public class Kalkulator extends KalkulatorAbstract{
	public static void main(String[] args){
		Kalkulator tamp8 = new Kalkulator();
		tamp8.panggilKalkulator();
	}
	public void panggilKalkulator(){
		int a=7, b=4;
		Kalkulator kalkulator = new Kalkulator();
		kalkulator.getTitle("Operasi Aritmatika");
		kalkulator.tambah(a,b);
		System.out.println(a+ " * " +b+ " = " + (a*b));
		System.out.println(a+ " - " +b+ " = " + (a-b));
		System.out.println(a+ " / " +b+ " = " + (a/b));		
	}
	@Override
	public void tambah(int a, int b){
		System.out.println(a+ " + " +b+ " = " + (a+b));
	}
	@Override
	public String kali(int a, int b){
		return (a * b)+"";
	}
	@Override
	public int kurang(int a, int b){
		return a - b;
	} 
	@Override
	public float bagi(int a, int b){
		return a / b;
	}

}





















