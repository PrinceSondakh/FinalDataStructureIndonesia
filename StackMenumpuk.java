import java.util.*;

public class StackMenumpuk {
	public static void main(String[] args) {
		StackMenumpuk tamp12 = new StackMenumpuk();
		tamp12.tampilStack();
	}
	public void tampilStack(){
	        StackMenumpuk obj = new StackMenumpuk();
	        obj.stack();
    	}

    	int top = -1;
	int stackStack[] = new int[5];
    	Scanner stackScan = new Scanner(System.in);


    	public void stack() {
        	int pilihan = 0;
        	while (pilihan != 5) {
            		System.out.println("1. Push");
            		System.out.println("2. Pop");
            		System.out.println("3. Peek");
            		System.out.println("4. Tampilkan");
            		System.out.println("5. Keluar");
            		System.out.print("Pilihan : ");
            		pilihan = stackScan.nextInt();
			if (pilihan == 1){
				push();
			}
			else if(pilihan == 2){
				pop();	
			}
			else if(pilihan == 3){
				peek();
			}	
			else if(pilihan == 4){
				display();	
			}
			else if(pilihan == 5){
				System.out.println("Anda keluar!");	
			}

			else {
				System.out.println("Pilihan tidak ada!");	
			}
        	}
    	}

    	public boolean checkEmpty() {
        	boolean chek = false;
        	if (top == -1) {
            		chek = true;
        	}
        	return chek;
    	}

    	public boolean checkFull() {
        	boolean chek1 = false;
        	if (top == (stackStack.length - 1)) {
            		chek1 = true;
        	}
        	return chek1;
    	}

    	public void push() {
        	if (checkFull() == true) {
            		System.out.println("Stack Penuh!");
        	} else {
            	top++;
            	System.out.print("Masukan Nilai pada top "+(top)+": ");
            	stackStack[top] = stackScan.nextInt();
            	display();
        	}
    	}

    	public void pop() {
        	if (checkEmpty() == true) {
            		System.out.println("Stack tidak ada");
        	} else {
            		System.out.println("Nilai pada top = "+stackStack[top]+" telah dihapus ");
            		top--;
            		display();
        	}
    	}

    	public void peek(){
        	if (checkEmpty() == true) {
            		System.out.println("Stack tidak ada.");
        	} else {
			System.out.println(""+stackStack[top]);
        	}
    	}
    	public void display() {
        	if (checkEmpty() == true) {
            		System.out.println("Stack tidak ada.");
        	} else {
            		for (int stackI = top; stackI >= 0; stackI--) {
                		System.out.println(stackI + " = " + stackStack[stackI]);
            		}
        	}
    	}
}