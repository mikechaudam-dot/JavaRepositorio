package moureDevPoo;

//6 Crea una clase BankAccount con atributo balance y un metodo deposito que sume el ingreso al balance
public class BankAccount {
	private double balance;

	// 3 ejercicio (encapsulaciones) Establece el atributo balance como privado y
	// establece deposit
	// y withDraw que validen las cantidades correctamente.

	public BankAccount(double balance) {
		setBalance(balance);
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if (balance > 0) {
			this.balance = balance;
		} else {
			System.out.println("Erro el balance no puede ser negativo");
		}
	}

	// Metodos
	public void deposit(double amount) {
		System.out.println("Su balance actual es: $" + balance);
		balance = amount + balance;
		System.out.println("Su balance despues de la consignacion de $" + amount + " es: $" + balance);
	}

	public void withDraw(double amount) {
		if(amount < balance) {
			balance -= amount;
			System.out.println("Su balance despues del retiro de $" + amount + " es: $" + balance);
		}else
			System.out.println("Saldo Insuficiente");
	}
}
