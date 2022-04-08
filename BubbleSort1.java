import java.util.Scanner;
public class BubbleSort1{
	int z;	
	public BubbleSort1(){
	}
	public static void main(String[] args){
		BubbleSort1 tamp = new BubbleSort1();
		tamp.tampilBubble();
	}
	public void tampilBubble(){
		BubbleSort obj;
		
		System.out.println("Masukan banyaknya data: ");
		int x = new Scanner(System.in).nextInt();
		int[] array = new int[x];
		for(int i = 0; i < x; i++){
		System.out.println("Data ke-"+ (i+1));
		array[i] = new Scanner(System.in).nextInt();
		}
		obj = new BubbleSort();
		obj.cara(array); 
	}
	public int input(){
		return new Scanner(System.in).nextInt();
	}
}















/*		int array[] = {6,3,2,1,2,3,3,2,1};
		obj = new BubbleSort();
		obj.cara(array); 

System.out.println("Masukan jumlah array yang diinginkan ");
int x = obj.input();

for (int i; i < x; i++)
	System.out.println("Array ke - "+( i + 1 ));
	int x = obj.input(); 

*/