public class Algoritma{
	int n;
	public Algoritma (int n) {
		this.n = n ;
	}
	public static void main(String[] args){
		Algoritma tampp = new Algoritma(7);
		tampp.panggilAlgoritma();
	}
	public void panggilAlgoritma(){
		Algoritma obj = new Algoritma(7);
		System.out.println ("Hasil Algoritma A adalah:");
		obj.algoritmaA(1000);
		long x = obj.algoritmaB(1000);
		long y = obj.algoritmaC(1000);
		System.out.println ("Hasil Algoritma B adalah:");
		System.out.println (""+x);
		System.out.println ("Hasil Algoritma C adalah:");
		System.out.println (""+y);		
	}
	public void algoritmaA(int n){
		int hasil = 0; 
		int i;
		for(i=1;i<=n;i++){
			hasil = hasil + i;
		}
		System.out.println(""+hasil);
	}	
	public int algoritmaB(int n){
		int hasil = 0; 
		int i,j;
		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				hasil = hasil + 1;
			}
		}
		return hasil;		
	}
	public int algoritmaC(int n){
		int hasil = 0; 
		hasil = n * (n + 1) /2;
		return hasil;
	}
}