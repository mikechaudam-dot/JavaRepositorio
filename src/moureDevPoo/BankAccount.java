package moureDevPoo;
//6 Crea una clase BankAccount con atributo balance y un metodo deposito que sume el ingreso al balance
public class BankAccount {
	double balance;
	
	public BankAccount(double balance){
		this.balance = balance;
	}
	
	public void deposit (double ingreso){
		System.out.println("Su balance actual es: $" + balance);
		balance = ingreso + balance;
		System.out.println("Su balance despues de la consignacion de $" + ingreso + " es: $" + balance);
	}
}
