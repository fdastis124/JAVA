/*
 * 	PREGUNTAS:
 * 		1.- ¿Cómo creo un nuevo cruce en EventoNuevoCruce/ejecuta si cruce es abstract?? ¿No tiene constructora(cruce) entonces, verdad?
 * 		2.- El Evento/ejecuta() lleva throws de todas las excepciones de eventosnuevos, ¿verdad?
 *		3.- ¿Cuánto tiempo se avería el coche map.getCar(this._id) en EventoAveriaCoche?
 *		4.- ¿Cómo pones SOURCE y DESTINO en ConstructorEventoNuevaCarretera?
 *		
 * 
 * HACER:
 * 		1.- TRATAR LAS EXCEPCIONES AL CREAR NUEVO VEHICULO Y LAS DE LOS EVENTOSNUEVOVEHICULO Y TAL
 * 		2.- CRUCE GENÉRICO(NuevaClase) Y PARSER CARRETERAS(NuevaClase)
 * 		
 * */
package es.ucm.fdi.vehiculo;

import java.util.ArrayList;
import java.util.List;

import es.ucm.fdi.carretera.*;
import es.ucm.fdi.cruce.*;
import es.ucm.fdi.exception.NotValidItinerary;
import es.ucm.fdi.exception.NotValidSpeed;
import es.ucm.fdi.ini.IniSection;
import es.ucm.fdi.simulador.ObjetoSimulacion;

public class Vehiculo extends ObjetoSimulacion {

	protected Carretera _curRoad;
	protected int _maxSpeed;
	protected int _curSpeed;
	protected int _kilometraje;
	protected int _curLocationOnRoad;
	protected int _faultTime;
	protected List<Cruce> _way;
	protected boolean _estEnCruce;
	
	private boolean _isArrived;
	/*
	 * If _tiempoAveria > 0 the car keeps stopped, 
	 * else increments his _curLocationOnRoad accord 
	 * his _curSpeed
	 * */
	
	public Vehiculo(String id, int maxSpeed, List<CruceGenerico<?>> iti) {
		super(id);
		
		if(maxSpeed >= 0) {
			throw new NotValidSpeed();
		}
		else if(iti.size() < 2) {
			throw new NotValidItinerary();
		}
		else {
			this._curRoad = null;
			this._maxSpeed = maxSpeed;
			this._curSpeed = 0;
			this._kilometraje = 0;		 // ¿NO ES UN PROBLEMA? -> SE DEBERÍA ARRASTRAR KILOMETRAJE
			this._curLocationOnRoad = 0;
			this._faultTime = 0;
			this._way = new ArrayList<Cruce>();
			this._estEnCruce = false;
		}
	}
	
	public void completaDetallesSeccion(IniSection is) {
		// TERMINAR DE HACER (ES HACER EL INFORME	
		is.setValue("location", this._isArrived ? "arrived" : this._curRoad + ":" + this.getCurLocationOnRoad());
	}
	@Override
	public void avanza () {
		if(this.isAveriated()) {
			this.setTiempoAveria(this._faultTime - 1);
		}
		// SI EL COCHE ESTA ESPERANDO NO SE HACE NADA¿?¿?
		else{
			int newLocation = 0;
			newLocation = this._curLocationOnRoad + this._curSpeed;
			
			if(newLocation >= this._curRoad.getLong()){
				this._curLocationOnRoad = this._curRoad.getLong();
				this._kilometraje += (newLocation - this._curRoad.getLong());
				// INDICAR A LA CARRETERA QUE EL VEHICULO ENTRA EN EL CRUCE¿?¿?
				this._estEnCruce = true;
			}
			else{
				this._curLocationOnRoad = this._curSpeed;
				this._kilometraje += this._curSpeed;
			}
		}
	}
	
	public void moverASiguienteCarretera () {
		if(this._curRoad != null) {
			this._curRoad.saleVehiculo(this);
		}
		else {
			// si el coche NO TIENE MAS CARRETERAS
			this._isArrived = true;
			this._curRoad = null;
			this._curSpeed = 0;
			this._curLocationOnRoad = 0;
			// si TIENE MÁS CARRETERA = 0;
			
			// calcular la siguiente carretera (SI NO EXISTE EXCEPCION
			// llamada a carretera.entraVehiculo()
			// se inicia su localizacion
		}
	}

	
	public String generaInforme () {
		String ret = "\n";
		
		ret += "[vehicle_report]\n";
		
		ret += "id = " + this._id + "\n";
		
		ret += "time = " + "\n";	// TIEMPO
		
		ret += "speed = " + this._curSpeed + "\n";
		
		ret += "kilometrage = " + this._kilometraje + "\n";
		
		ret += "faulty = " + this._faultTime + "\n";
		
		ret += "location = {" + this._curRoad.getId() + "," + this._curLocationOnRoad + "}\n";
		
		ret += "\n";
		
		return ret;
	}
	
	// getters
	public boolean isAveriated() {
		return (this._faultTime > 0);
	}
	
	public int getCurLocationOnRoad () {
		return this._curLocationOnRoad;
	}
	// setters
	public void setTiempoAveria (int steps) {
		// ¿Comprobar que carretera no es null?
		this._faultTime = steps;
		if(this._faultTime > 0) this.setVelocidadActual(0);
	}
	
	public void setVelocidadActual (int speed) {
		if(speed < 0)
			this._curSpeed = 0;
		else
			this._curSpeed = Integer.min(speed,  this._maxSpeed);
	}

	@Override
	protected String getNombreSeccion() {
		// TODO Auto-generated method stub
		return "vehicle_report";
	}


	
}
