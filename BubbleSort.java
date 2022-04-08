import java.util.Scanner;
public class BubbleSort{
	public int cara(int array[]){
		for(int i = 0; i < array.length; i++){
			System.out.println("Pengulangan ke -"+(i + 1));
			for (int j = 0; j< array.length - 1; j++){
				if (array[j] > array [j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}			
			}
			for (int j = 0; j < array.length; j++){
				System.out.print(array[j] + " ");
			}
			System.out.println("");
		}
	return array.length;
	}	
}



/*
for(int i = 0; int < 7; i++){
}


public int input(){
	return new Scanner(System.in).nextInt();
}


int array[] = obj.input();

*/
