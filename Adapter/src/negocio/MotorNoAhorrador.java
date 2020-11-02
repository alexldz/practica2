package negocio;

// Esta clase representa la estructura de un motor solicitado por negocio inicialmente

public class MotorNoAhorrador extends Motor { //Le ponemos unos cuantos comentarios a los metodos para que se muestren por pantalla

	public MotorNoAhorrador() {
		
		super();
		System.out.println("Se crea un Motor no Ahorrador");
		
	}
	
	@Override
	public void encender() {
		
		System.out.println("Se enciende un Motor no Ahorrador");

	}

	@Override
	public void acelerar() {
		
		System.out.println("Se acelera un Motor no Ahorrador");

	}

	@Override
	public void apagar() {

		System.out.println("Se apaga un Motor no Ahorrador");

	}

}
