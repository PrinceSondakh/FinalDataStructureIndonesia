import java.util.*;
public class InsertionSort {
	public static void main(String[] args){
		InsertionSort tamp3 = new InsertionSort();
		tamp3.tampilInsert();
	}
	public void tampilInsert(){
		InsertionSort obj = new InsertionSort();
		System.out.println("Masukan banyaknya data: ");
		int x = new Scanner(System.in).nextInt();
		int[] array = new int[x];
		for(int m = 0; m < x; m++){
			System.out.println("Data ke-"+ (m+1));
			array[m] = new Scanner(System.in).nextInt();
		}
		int[] hasilInsert;
		hasilInsert = obj.prosesInsertionSort(array);
		obj.tampilInsertionSort(hasilInsert);	 
	}
	public int[] prosesInsertionSort(int masukanData[]){
		int temp;
		for (int i = 1; i < masukanData.length; i++){
			for(int j = i; j > 0; j--){
				if (masukanData[j] < masukanData[j-1]){
				temp = masukanData[j];
				masukanData[j] = masukanData[j-1];
				masukanData[j-1] = temp;
				}
			}
		}
		return masukanData;
	}
	public void tampilInsertionSort(int[] tampilData){
		System.out.println("Hasil: ");
		for (int i = 0; i<tampilData.length; i++){
			System.out.print(tampilData[i]+ " ");
		}
	System.out.println("\n");
	}
}