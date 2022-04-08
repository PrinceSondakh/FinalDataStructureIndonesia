import java.util.*;
public class SelectionSort{
	public static void main(String[] args){
		SelectionSort tamp2 = new SelectionSort();
		tamp2.tampilSelect();
	}
	public void tampilSelect(){
		SelectionSort obj = new SelectionSort();
		obj.selectionSort();
	}
	public void selectionSort(){
		SelectionSort obj2 = new SelectionSort();
		System.out.println("Masukan banyaknya data: ");
		int x = new Scanner(System.in).nextInt();
		int[] array = new int[x];
		for(int m = 0; m < x; m++){
		System.out.println("Data ke-"+ (m+1));
		array[m] = new Scanner(System.in).nextInt();
		}
		obj2.tampilSelect(array);

	}
	public void tampilSelect(int array[]){
		int j;
		for(int i = 0; i < array.length - 1; i++){
			j = i;
			for(int in = i + 1; in < array.length; in++){
				if (array[in] < array[j]){
					j = in;
				}
			}
			if(j != i){
				int temp = array[j];
				array[j] = array[i];
				array[i] = temp;
			}	
			System.out.print(array[i] + " ");
		}
	}	
}
