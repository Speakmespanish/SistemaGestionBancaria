import java.util.ArrayList;

public class Banco {

	String Nombre;
	long Num_cuenta;
	double Saldo;
	
	ArrayList<Banco> banco = new ArrayList<Banco>();
	
	public Banco (String Nombre, long Num_cuenta, double Saldo) {
		
		this.Nombre = Nombre;
		this.Num_cuenta = Num_cuenta;
		this.Saldo = Saldo;
	}
	
	public void setCuenta () {
		
	}
	
}
