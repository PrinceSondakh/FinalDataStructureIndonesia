//Array
//type : "[]" bisa ditaruh sesudah tipe data atau sesudah variabel
//Author : Prince George Imanuel 
import java.util.Scanner;
public class Biodata3MultidimensiVoid{
	final String USERNAME = "JAVA";
	final String PASSWORD = "PROGRAMMING";
	static String[][] arrayBiodata; //static = langsung menyediakan memory
	public static void main(String[] args){
		Biodata3MultidimensiVoid tamp4 = new Biodata3MultidimensiVoid();
		tamp4.panggilBiodata();	
	}
	public void panggilBiodata(){
		Biodata3MultidimensiVoid biodata = new Biodata3MultidimensiVoid();
		String username="", password="";
		boolean cek = false;
		System.out.print("---------------------------------------------------------------------\n");	
		System.out.print("|                          SELAMAT DATANG                           |\n");		
		do{
			System.out.print("---------------------------------------------------------------------\n");	
			System.out.print("\n\nNama Pengguna: ");
			username = biodata.inputString();
			System.out.print("\nKata sandi: ");
			password = biodata.inputString();
			cek = biodata.ceklogin(username, password);
		}while (biodata.ceklogin(username, password) == false);				 
		System.out.print("\n\n\n--------------------Selamat! Anda berhasil masuk!--------------------\n\n");
		int k;
		System.out.print("Masukan banyak data: ");
		k = biodata.inputInt();	
		System.out.print("---------------------------------------------------------------------\n");		
		biodata.tampilBiodata(biodata.inputArray(k)); 	
	}
		
	public String[][] inputArray(int jlhData){	
		Biodata3MultidimensiVoid biodata2 = new Biodata3MultidimensiVoid();
		String data[][] = new String[jlhData][4];
		for( int i = 0; i < jlhData ; i++ ){
			System.out.print("\n\n\n"+"---------------------------------------------------------------------\n"+"|                           "+"Data ke - "+(i+1)+"                             |\n"+"---------------------------------------------------------------------\n");
			System.out.print("\nInput Nama: ");
			data[i][0] = biodata2.inputString2();
			System.out.print("\nAlamat: ");
			data[i][1] = biodata2.inputString2();
			System.out.print("\nUmur: ");
			data[i][2]  = biodata2.inputString2();
			System.out.print("\nEmail: ");
			data[i][3] = biodata2.inputString2();
		}	
		return data;
	}
	public int inputInt(){
		return new Scanner(System.in).nextInt();	
	}
	public int inputInt2(){
		return new Scanner(System.in).nextInt();	
	}
	public String inputString(){
		return new Scanner(System.in).nextLine();	
	}
	public String inputString2(){
		return new Scanner(System.in).nextLine();	
	}
	public boolean ceklogin(String...ceklogin){
		boolean cek = false;
		if (ceklogin[0].equals(USERNAME)&&ceklogin[1].equals(PASSWORD)){
			cek = true;
		}
		return cek;
	}
	public void tampilBiodata(String[][] show){
		System.out.println("\n\n\nHASIL YANG TADI DI INPUT ADALAH ...\n");
		for(int i = 0; i < show.length; i++){
			System.out.print("\n\nData ke - "+(i+1)+"\n\n");
			System.out.println("^-^ "+show[i][0]+"\n");
			System.out.println("^-^ "+show[i][1]+"\n");
			System.out.println("^-^ "+show[i][2]+"\n");
			System.out.println("^-^ "+show[i][3]+"\n");			
		}	
	}
}