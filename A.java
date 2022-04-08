//Saling mengembalikan nilai antar dua file
import java.util.Scanner;
public class A implements B{
	public static void main(String[] args){
		A tamp6 = new A();
		tamp6.ab();
	}
	public void ab(){
		A a = new A();	
		a.show(a);
	}
	public String input(){
		return new Scanner(System.in).nextLine();
	} 
	public void show(A b){
		System.out.print("\nMasukan sembarang karakter: ");		
		String d = b.input();
		System.out.println("Karakter yang diinput adalah: "+d);		
	}
}




































/*public class Data{
	private String nama = "Nama";
	public void tampil(){
		System.out.println("Saya")
	}	
	public String getNama(){
		return nama;
	}
	public File getObjFile(File y){
		return y;
	}
	public int getInt(int x){
		return x;
	}
}
public class file{
	Data data;
	public static void main{
		data = new data();
		data.tampil();
		String x = data.getNama();
		data.get(data, new File());
	}
	public void get(Data x, File y){
		x.getObjFile(y).Call();
		x.getInt(8);
	}
	public void Call(){
		System.out.println("File");
	}
}

*/