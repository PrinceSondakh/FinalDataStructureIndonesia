import java.util.Scanner;
public class Login{
	public static void main(String[] args){
		Login tamp2 = new Login();
		tamp2.login();
	}
	public void login(){
		boolean cek = false;
		do{
			String username = "", password = "";
			Login obj = new Login();
			System.out.print("Masukan Username: ");
			username = obj.inputint();
			System.out.print("Masukan Password: ");
			password = obj.inputint();
			cek = obj.ceklogin(username, password);
		}
		while(cek == false);
			System.out.print("ANDA MASUK!");		
	}
	public String inputint(){
		return new Scanner(System.in).nextLine();
	}
	public boolean ceklogin(String username, String password){
		boolean cek = false; 
		if (username.equals ("JAVA")&&password.equals("PROGRAMMING")){
			 cek = true;
		}
		return cek;
	}
}