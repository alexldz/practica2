package negocio;

//Esta clase representa la estructura de un motor solicitado por negocio inicialmente

public class MotorAhorrador extends Motor { //Le ponemos unos cuantos comentarios a los metodos para que se muestren por pantalla
	
	public MotorAhorrador() {
		
		super();
		System.out.println("Se crea un Motor Ahorrador");
		
	}

	@Override
	public void encender() {
		
		System.out.println("Se enciende un Motor Ahorrador");

	}

	@Override
	public void acelerar() {
		
		System.out.println("Se acelera un Motor Ahorrador");

	}

	@Override
	public void apagar() {
		
		System.out.println("Se apaga un Motor Ahorrador");

	}

}
