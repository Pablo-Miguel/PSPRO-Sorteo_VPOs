package exceptions;

public class NotNullDNI extends Exception {
	
	public NotNullDNI() {
		super("El DNI no puede ser null");
	}
	
}
