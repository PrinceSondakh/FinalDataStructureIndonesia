//Author : Prince George Imanuel
import java.util.Scanner;

public class BilanganPrima{
	public static void main(String[] args){
		BilanganPrima tamp5 = new BilanganPrima();
		tamp5.panggilPrima();
	}
	public void panggilPrima(){
		BilanganPrima bPrima = new BilanganPrima();
		int l=0;
		System.out.print("\nMasukan bilangan:");
		l = bPrima.input();
		bPrima.prima(l);		
	}
	public int prima(int k){
		int temp = 0;
		for (int i=1; i<k; i++){
			for(int j=1;j<=i;j++){
				if(i%j==0){
					temp++;
				}
			}
			if(temp==2){
				System.out.println(i+" Bilangan Prima!");	
			}
			temp = 0;
		}
		return temp;			
	}
	public int input(){
		return new Scanner(System.in).nextInt();
	}

}

//Class room ovprx37