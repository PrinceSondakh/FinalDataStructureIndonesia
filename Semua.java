import java.util.*;
public class FinalTest{
	public static void main(String[] args){
		FinalTest oby = new FinalTest();
		oby.tampilSemua();
	}
	public void tampilSemua(){
		int x = 0;
		while (x != 15){
			FinalTest tampil = new FinalTest();
			System.out.println("\n-------------------------------------------------------------------------------");
			System.out.println("\nMasukan pilihan");
			System.out.println("1. Algoritma");
			System.out.println("2. Perpangkatan");
			System.out.println("3. Form Login");
			System.out.println("4. Algoritma Panjang Lebar");
			System.out.println("5. Biodata Multidimensi");
			System.out.println("6. Bilangan Prima");
			System.out.println("7. Implements Bebas");
			System.out.println("8. Menggunakan Interface untuk menghitung luas Lingkaran");
			System.out.println("9. Kalkulator Abstract");
			System.out.println("10.Sorting");
			System.out.println("11.Desimal ke Biner");
			System.out.println("12.Desimal ke Biner (Dengan keluaran 8 bit)");
			System.out.println("13.Biner ke Decimal");
			System.out.println("14.Stack");
			System.out.println("15.Keluar");
			System.out.println("Pilihan Anda: ");
			x = tampil.inputN();
			if ( x == 1){
				Algoritma tampp = new Algoritma(7);
				tampp.panggilAlgoritma();
			}
			else if ( x == 2){
				Pangkatpangkat tamp1 = new Pangkatpangkat();
				tamp1.pangkatPangkat();
			}
			else if ( x == 3){
				Login tamp2 = new Login();
				tamp2.login();
			}
			else if ( x == 4){
				AlgoritmaPanjangLebar tamp3 = new AlgoritmaPanjangLebar();
				tamp3.algoritmaPanjangLebarr();
			} 
			else if ( x == 5){
				Biodata3MultidimensiVoid tamp4 = new Biodata3MultidimensiVoid();
				tamp4.panggilBiodata();
			}
			else if ( x == 6){
				BilanganPrima tamp5 = new BilanganPrima();
				tamp5.panggilPrima();
			}
			else if ( x == 7){
				A tamp6 = new A();
				tamp6.ab();
			}
			else if ( x == 8){
				Interface tamp7 = new Interface();
				tamp7.panggilInterface();
			}
			else if ( x == 9){
				Kalkulator tamp8 = new Kalkulator();
				tamp8.panggilKalkulator();
			}		
			else if ( x == 10){
				sorting();
			}
			else if ( x == 12){
				decimalKeBiner tamp9 = new decimalKeBiner();
				tamp9.tampilDecimalKeBiner();
			}	
			else if ( x == 11){
				decimalKeBinerr tamp10 = new decimalKeBinerr();
				tamp10.tampilDecimalKeBinerr();
			}	
			else if ( x == 13){
				binerKeDecimal tamp11 = new binerKeDecimal();
				tamp11.binerKeDecimall();
			}
			else if ( x == 14){
				StackMenumpuk tamp12 = new StackMenumpuk();
				tamp12.tampilStack();
			}
			else if ( x == 15){
				System.out.println("GBU");			
			}
			else{
				System.out.println("Pilihan anda salah");			
			}
		}
	}
	public int inputN(){
		return new Scanner(System.in).nextInt();
	}
	public void sorting(){
		byte pilihan = 0;
		while (pilihan !=4){
			FinalTest oby2 = new FinalTest();
			System.out.println("\n\n1. Bubble Sorting");
			System.out.println("2. Selection Sorting");
			System.out.println("3. Insertion Sorting");
			System.out.println("4. Keluar");
			pilihan = new Scanner(System.in).nextByte();
			if(pilihan == 1){
				BubbleSort1 tamp = new BubbleSort1();
				tamp.tampilBubble();		
			}
			else if (pilihan == 2){
				SelectionSort tamp2 = new SelectionSort();
				tamp2.tampilSelect();			
			}
			else if (pilihan == 3){
				InsertionSort tamp3 = new InsertionSort();
				tamp3.tampilInsert();		
			}
			else if (pilihan == 4){
				System.out.println("\n Anda keluar\nOtomatis beralih ke pilihan awal");		
			}		
			else if (pilihan > 4 && pilihan < 1){
				System.out.println("Pilihan tidak ada");
			}
		}					
	}	
}