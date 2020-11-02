package nuevaFuncionalidad;

import negocio.Motor;

//Clase Adapter para el motor incompatible.

public class NuevoMotorAdapter extends Motor { //Esta clase "traduce" el codigo para que sea compatible con 
											   //los otros dos motores		
	private NuevoMotor NM;
	
	public NuevoMotorAdapter() {
		
		super();
		System.out.println("Creando el adaptador para el nuevo motor");
		NM = new NuevoMotor();
		
	}
	@Override
	public void encender() {
		
		System.out.println("Encendiendo Adaptador");
		NM.conectar();
		NM.activar();

	}

	@Override
	public void acelerar() {
		
		System.out.println("Acelerando Adaptador");
		NM.moverRapido();

	}

	@Override
	public void apagar() {
		
		System.out.println("Apagar Adaptador");
		NM.detener();
		NM.desconectarMotor();
		
		
	}


}
