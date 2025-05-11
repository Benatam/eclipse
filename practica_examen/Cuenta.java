package practica_examen;

public class Cuenta {

	private int numeroCuenta;
	private int Saldo;
	private Cliente Cliente;
	
	public Cuenta(int numeroCuenta, int saldo, practica_examen.Cliente cliente) {
		this.numeroCuenta = numeroCuenta;
		Saldo = saldo;
		Cliente = cliente;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public int getSaldo() {
		return Saldo;
	}

	public void setSaldo(int saldo) {
		Saldo = saldo;
	}

	public Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}
	
	
	
}
