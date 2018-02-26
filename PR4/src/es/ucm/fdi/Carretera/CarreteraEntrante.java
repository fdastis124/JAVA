package es.ucm.fdi.Carretera;

public class CarreteraEntrante {
	 protected Carretera carretera;
	 protected List<Vehiculo> colaVehiculos;
	 protected boolean semaforo; // true=verde, false=rojo
	 public CarreteraEntrante(Carretera carretera) {
	 // inicia los atributos.
	 // el semáforo a rojo
	 }
	 void ponSemaforo(boolean color) {...}

	 public void avanzaPrimerVehiculo() {
	 // coge el primer vehiculo de la cola, lo elimina,
	 // y le manda que se mueva a su siguiente carretera.
	 }
	 @Override
	 public String toString() {...}
	}
	 
