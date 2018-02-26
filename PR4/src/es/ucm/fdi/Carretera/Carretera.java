package es.ucm.fdi.Carretera;

import es.ucm.fdi.Vehiculo.Vehiculo;
import es.ucm.fdi.model.ObjetoSimulacion;

	
public class Carretera extends ObjetoSimulacion {
		 protected int longitud; // longitud de la carretera
		 protected int velocidadMaxima; // velocidad máxima
		 protected Cruce cruceOrigen; // cruce del que parte la carretera
		 protected Cruce cruceDestino; // cruce al que llega la carretera
		 protected List<Vehiculo> vehiculos; // lista ordenada de vehículos en la
		// carretera (ordenada por localización)
		 protected Comparator<Vehiculo> comparadorVehiculo; // orden entre vehículos
		 public Carretera(String id, int length, int maxSpeed, Cruce src, Cruce dest) {
		// se inicializan los atributos de acuerdo con los parámetros.
		 // se fija el orden entre los vehículos: (inicia comparadorVehiculo) - la localización 0 es la menor
		 }
		 public void avanza() {
			 // calcular velocidad base de la carretera
			 // inicializar obstáculos a 0
			 // Para cada vehículo de la lista “vehiculos”:
			// 1. Si el vehículo está averiado se incrementa el número de obstaculos.
			 //2. Se fija la velocidad actual del vehículo
			 //3. Se pide al vehículo que avance.
			 // ordenar la lista de vehículos
		 }
		 
		 public void entraVehiculo(Vehiculo vehiculo) {
		 // Si el vehículo no existe en la carretera, se añade a la lista de vehículos y
		  // se ordena la lista.
		  // Si existe no se hace nada.
		 }
		 public void saleVehiculo(Vehiculo vehiculo) {
		 // elimina el vehículo de la lista de vehículos
		 }
		 public void entraVehiculoAlCruce(Vehiculo v) {
		  // añade el vehículo al “cruceDestino” de la carretera”
		 }
		 protected int calculaVelocidadBase() {...}
		 protected int calculaFactorReduccion(int obstaculos) {...}
		 @Override
		 protected String getNombreSeccion() {...}
		 @Override
		 protected void completaDetallesSeccion(IniSection is) {
		  // crea “vehicles = (v1,10),(v2,10) ”
		 }
		 
		 
	/*public int _longitud;
	public int _maxVel;
	public Vehiculo[] _road;
	
	public Carretera ( int longitud, int maxVel){
		
		this._road = new Vehiculo[longitud];
		_maxVel = maxVel;
		
	}
	 Devuelve false si no se ha añadido
	public boolean entraVehiculo(Vehiculo entra, Vehiculo[] road){
		COMPRUEBO SI LA CASILLA 0 + velVehiculo ESTA LLENA (ES A LA QUE VA A ENTRAR)
			
			
		
	}
	*/
}
