package es.ucm.fdi.Carretera;

import es.ucm.fdi.Vehiculo.Vehiculo;
import es.ucm.fdi.model.ObjetoSimulacion;

	
public class Carretera extends ObjetoSimulacion {
		 protected int longitud; // longitud de la carretera
		 protected int velocidadMaxima; // velocidad m�xima
		 protected Cruce cruceOrigen; // cruce del que parte la carretera
		 protected Cruce cruceDestino; // cruce al que llega la carretera
		 protected List<Vehiculo> vehiculos; // lista ordenada de veh�culos en la
		// carretera (ordenada por localizaci�n)
		 protected Comparator<Vehiculo> comparadorVehiculo; // orden entre veh�culos
		 public Carretera(String id, int length, int maxSpeed, Cruce src, Cruce dest) {
		// se inicializan los atributos de acuerdo con los par�metros.
		 // se fija el orden entre los veh�culos: (inicia comparadorVehiculo) - la localizaci�n 0 es la menor
		 }
		 public void avanza() {
			 // calcular velocidad base de la carretera
			 // inicializar obst�culos a 0
			 // Para cada veh�culo de la lista �vehiculos�:
			// 1. Si el veh�culo est� averiado se incrementa el n�mero de obstaculos.
			 //2. Se fija la velocidad actual del veh�culo
			 //3. Se pide al veh�culo que avance.
			 // ordenar la lista de veh�culos
		 }
		 
		 public void entraVehiculo(Vehiculo vehiculo) {
		 // Si el veh�culo no existe en la carretera, se a�ade a la lista de veh�culos y
		  // se ordena la lista.
		  // Si existe no se hace nada.
		 }
		 public void saleVehiculo(Vehiculo vehiculo) {
		 // elimina el veh�culo de la lista de veh�culos
		 }
		 public void entraVehiculoAlCruce(Vehiculo v) {
		  // a�ade el veh�culo al �cruceDestino� de la carretera�
		 }
		 protected int calculaVelocidadBase() {...}
		 protected int calculaFactorReduccion(int obstaculos) {...}
		 @Override
		 protected String getNombreSeccion() {...}
		 @Override
		 protected void completaDetallesSeccion(IniSection is) {
		  // crea �vehicles = (v1,10),(v2,10) �
		 }
		 
		 
	/*public int _longitud;
	public int _maxVel;
	public Vehiculo[] _road;
	
	public Carretera ( int longitud, int maxVel){
		
		this._road = new Vehiculo[longitud];
		_maxVel = maxVel;
		
	}
	 Devuelve false si no se ha a�adido
	public boolean entraVehiculo(Vehiculo entra, Vehiculo[] road){
		COMPRUEBO SI LA CASILLA 0 + velVehiculo ESTA LLENA (ES A LA QUE VA A ENTRAR)
			
			
		
	}
	*/
}
