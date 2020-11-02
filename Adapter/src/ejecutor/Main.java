package ejecutor;

import negocio.Motor;
import negocio.MotorAhorrador;
import negocio.MotorNoAhorrador;
import nuevaFuncionalidad.NuevoMotorAdapter;

//Hasta aqui tenemos dos motores que son compatibles uno con el otro
//Ahora voy a implementar otro motor que sea incompatible


public class Main {

	public static void main(String[] args) {
		
		Motor motor;
			
		motor = new MotorNoAhorrador(); //Se invoca la clase MotorNoAhorrador para que haga los metodos puestos.
		
		motor.encender();
		motor.acelerar();
		motor.apagar();
		
		System.out.println("-----------------------------------------------");
		
		motor = new MotorAhorrador(); //Se invoca la clase MotorAhorrador para que haga los metodos puestos.
		
		motor.encender();
		motor.acelerar();
		motor.apagar();
		
		System.out.println("-----------------------------------------------");
		
		motor = new NuevoMotorAdapter(); //Se invoca la clase NuevoMotorAdapter para que haga los metodos puestos a NuevoMotor.
		
		motor.encender();
		motor.acelerar();
		motor.apagar();
		
		System.out.println("-----------------------------------------------");

	}

}

//Como puedes ver implementando el patron adapter se puede reutilizar una clse existente y
//convertimos una interfaz en otra, creando compatibilidad para esta.