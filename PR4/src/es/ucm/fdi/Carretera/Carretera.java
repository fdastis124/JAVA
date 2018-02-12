package es.ucm.fdi.Carretera;

import es.ucm.fdi.Vehiculo.Vehiculo;

public class Carretera {
	
	public int _longitud;
	public int _maxVel;
	public Vehiculo[] _road;
	
	public Carretera ( int longitud, int maxVel){
		
		this._road = new Vehiculo[longitud];
		_maxVel = maxVel;
		
	}
	/* Devuelve false si no se ha añadido*/
	public boolean entraVehiculo(Vehiculo entra, Vehiculo[] road){
		/*COMPRUEBO SI LA CASILLA 0 + velVehiculo ESTA LLENA (ES A LA QUE VA A ENTRAR)*/
			
			
		
	}
	
}
