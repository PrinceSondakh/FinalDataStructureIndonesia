import java.util.Scanner;
public class binerKeDecimal{
	public static void main(String[] args){
		binerKeDecimal tamp11 = new binerKeDecimal();
		tamp11.binerKeDecimall();
	}
	public void binerKeDecimall(){
		binerKeDecimal obj = new binerKeDecimal();
		String x = "";
		System.out.println("Masukan angka biner (1 / 0): ");
		x = new Scanner(System.in).nextLine();
		int panjangbit = x.length();
		int panjang = 0;
		int sum = 0;		
		while(panjangbit !=0){
			String y = x.charAt(panjangbit-1)+"";
			int cast = 0;
			try{
				cast = Integer.parseInt(y);
			}catch(Exception ex){
				System.out.println(ex);
			}	
			int pangkat = (int)Math.pow(2, panjang); 
			panjangbit --;
			panjang ++;
			int hasil = 0;
			hasil = cast * pangkat;
			System.out.print(cast + " x " + 2 + "(" +pangkat + ")"+ " = "+ hasil + " \n");
			if(cast == 1){
				sum = sum + hasil;
			}
			int hasil2;
			hasil2 = hasil--;
			System.out.println(sum);
		}
		//int xr = (int)Math.pow(2,3);
		//System.out.println(xr);
	}
}	
















// cara casting

//	System.out.print(x.charAt(0));
