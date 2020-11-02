package nuevaFuncionalidad;

public class NuevoMotor { //creamos un conectado para cuando se conecte con el adapter y el main se hagan todos estos metodos

	private boolean conectado = false;

	public NuevoMotor() {

		System.out.println("Creado un Nuevo Motor");
		this.conectado = false;

	}

	public void conectar() {

		System.out.println("Se ha conectado un Nuevo Motor");
		this.conectado = true;

	}

	public void conectado() {

		System.out.println("Se ha conectado un Nuevo Motor");
		this.conectado = true;

	}

	public void activar() { // si no se conecta saldra este mensaje por pantalla y lo mismo con los demas.

		if (!this.conectado) {

			System.out.println("No se puede activar, ya que no esta conectado");

		} else {

			System.out.println("Activado Motor Nuevo");

		}

	}

	public void moverRapido() {

		if (!this.conectado) {

			System.out.println("No se puede mover más rápido, ya que no esta conectado");

		} else {

			System.out.println("Moviendo mas rapido");

		}

	}
	
	public void detener() {

		if (!this.conectado) {

			System.out.println("No se puede detener, ya que no esta conectado");

		} else {

			System.out.println("Deteniendo...");

		}

	}
	
	public void desconectarMotor() { //Cuando conectado sea false se desconectara el nuevo motor

			System.out.println("Desconectando motor...");
			this.conectado = false;


	}

}
