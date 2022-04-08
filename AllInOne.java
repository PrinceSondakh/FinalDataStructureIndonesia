import java.util.Scanner;
public class AllInOne{
	public static void main(String[] args){
		AllInOne obj = new AllInOne();	
			System.out.println("Masukan pilihan");
			System.out.println("1. Pangkatpangkat");
			System.out.println("2. Form Login");
			System.out.println("3. Keluar");
			System.out.println("Pilihan Anda: ");
			int x = new Scanner(System.in).nextInt();
			if (x == 1){
				obj.pangkatPangkat();
			}
			else if ( x == 2){
				obj.Login();
			}
			else if ( x == 3){
				obj.panjangLebar();
			}
	}
			
//-------------------------------------------------------------------------
	public void pangkatPangkat(){
		System.out.println ("Masukan Nilai: ");
		int nilai = new Scanner(System.in).nextInt();
		System.out.println ("Pangkat: ");
		int pangkat = new Scanner(System.in).nextInt();
		int hasil = nilai;
		int i = 1;
		do{
			hasil = hasil * nilai;
			i++;
		}while (i < pangkat );
		System.out.println ("Hasil ");
		System.out.println (""+hasil);
	}
//-------------------------------------------------------------------------
	public void Login(){
		boolean cek = false;
		do{
			AllInOne obj2 = new AllInOne();
			System.out.print("Masukan Username: ");
			String username = new Scanner(System.in).nextLine();
			System.out.print("Masukan Password: ");
			String password = new Scanner(System.in).nextLine();
			cek = obj2.ceklogin(username, password);
		}
		while(cek == false);
			System.out.print("ANDA MASUK!"); 
	}
	public boolean ceklogin(String username, String password){
		boolean cek = false; 
		if (username.equals ("12345")&&password.equals("abc")){
			 cek = true;
		}
		return cek;
	}
//-------------------------------------------------------------------------

	public void panjangLebar(){
		AllInOne obj3 = new AllInOne();
		System.out.println ("Masukan Panjang: ");
		int panjang = new Scanner(System.in).nextInt();
		System.out.println ("Lebar: ");
		int lebar = new Scanner(System.in).nextInt();
		System.out.println ("Hasil ");
		System.out.println (""+obj3.panjangLebar(panjang, lebar));
	}
	public int panjangLebar(int panjang, int lebar){
		int hasil;
		hasil = panjang * lebar;
		return hasil;
	}

//-------------------------------------------------------------------------

	public void perpangkatanDenganLogin(){
		boolean cek = false;
		do{
			AllInOne obj4 = new AllInOne(7);
			String nama="", kata_sandi="";
			System.out.println("Nama:");
			nama = obj.inputString();
			System.out.println("Kata sandi:");
			kata_sandi = obj.inputString();
			cek = obj.ceklogin(nama, kata_sandi);
		}while (cek == false);		
		if (cek == true){
		System.out.println ("");
		System.out.println ("BERHASIL MASUK !");
		System.out.println ("");
		int nilai,pangkat;
		AlgoritmaPassword obj = new AlgoritmaPassword(7);
		System.out.println ("Masukan Nilai: ");
		nilai = obj.input();
		System.out.println ("Pangkat: ");
		pangkat = obj.input();
		System.out.println ("Hasil ");
		System.out.println (""+obj.hitungPangkat(nilai, pangkat));
		}		
	}

}


//SELAMAT TINGGAL CARA LAMA , 19/7/2016



		

