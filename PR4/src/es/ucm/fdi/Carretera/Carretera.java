package es.ucm.fdi.carretera;

import es.ucm.fdi.vehiculo.*;

import java.util.ArrayList;
import java.util.List;

import es.ucm.fdi.cruce.*;
import es.ucm.fdi.ini.IniSection;
import es.ucm.fdi.simulador.ObjetoSimulacion;

public class Carretera extends ObjetoSimulacion {
	
	protected int _length;
	protected int _maxSpeed;
	protected Cruce _origin;
	protected Cruce _dest;	
	protected List<Vehiculo> _carList;
	protected List<Vehiculo> _comparator;	// order
	
	public Carretera (String id, int length, int maxSpeed, Cruce src, Cruce dst) {
		super(id);
		this._length = length;
		this._maxSpeed = maxSpeed;
		this._origin = src;
		this._dest = dst;
		this._carList = new ArrayList<Vehiculo>();
		this._comparator = new ArrayList<Vehiculo>();
	}
	
	public void entraVehiculo (Vehiculo car) {
		// SI NO ESTÁ, SE AÑADE Y ORDENA
		if(!this._carList.contains(car)) this._carList.add(car);		
	}
	
	public void saleVehiculo (Vehiculo car) {
		this._carList.remove(car);
	}
	
	public void entraVehiculoAlCruce (Vehiculo car) {
		// añade el vehiculo al CRUCEDESTINO de la carretera
	}
	
	protected int calculaVelocidadBase () {
		int baseSpeed = 0;		
		
		int max = Integer.max(this._carList.size(), 1);
		baseSpeed = Integer.min(this._maxSpeed, (this._maxSpeed/max));
		
		return baseSpeed;
	}
	
	protected int calculaFactorReduccion () {
		int factorReduccion = 1;
		
		
		return factorReduccion;
	}
	
	public void avanza() {		
		int factorReduccion = 1;
		
		for(int i = this._carList.size() - 1; i >= 0; ++i) {
			if(this._carList.get(i).isAveriated()) factorReduccion++;
			
			// ¿ELSE?
			this._carList.get(i).setVelocidadActual(calculaVelocidadBase()/factorReduccion);
			this._carList.get(i).avanza();
		}
	}
	
	protected String getNombreSeccion () {
		return "road_report";
	}
	
	protected void completaDetallesSeccion (IniSection is) {
		//is.setValue("vehicles", value);
		// crea los vehiculos
		for(int i = 0; i < this._carList.size(); ++i) {
			
		}
	}
	
	public String generaInforme() {
		String ret = "";
		
		ret += "[road_report]\n";
		
		ret += "id = " + this._id + "\n";
		
		ret += "time = " + "\n"; // TIEMPO
		
		ret += "state = ";
		
		
		ret += "\n";		
		
		return ret;
	}
	
	//geters & setters
	public int getLong() {
		return this._length;
	}

}
