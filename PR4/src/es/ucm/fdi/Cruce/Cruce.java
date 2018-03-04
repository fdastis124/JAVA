package es.ucm.fdi.cruce;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.ucm.fdi.carretera.*;
import es.ucm.fdi.ini.IniSection;
import es.ucm.fdi.simulador.ObjetoSimulacion;
import es.ucm.fdi.vehiculo.*;

abstract public class Cruce extends ObjetoSimulacion {
	// CRUCE ES UN ARRAY DE CARRETERAS¿?
	protected int _indiceSemaforoVerde;
	protected List<CarreteraEntrante> _carreterasEntrantes;
	
	protected Map<String, CarreteraEntrante> _mapaCarreterasEntrantes;
	protected Map<Cruce, Carretera> _mapaCarreterasSalientes;
	
	public Cruce(String id) {
		super(id);
		this._indiceSemaforoVerde = 0;
		this._carreterasEntrantes = new ArrayList<>();
		this._carreterasEntrantes = null;
		this._mapaCarreterasEntrantes = new HashMap<String, CarreteraEntrante>();
		this._mapaCarreterasEntrantes = null;
		this._mapaCarreterasSalientes = new HashMap<Cruce, Carretera>();
		this._mapaCarreterasSalientes = null;
	}
	
	public Carretera carreteraHaciaCruce (Cruce cruce) {
		// devuelve la carretera que llega desde cruce hasta this
		return null;
	}
	
	public void addCarreteraEntranteAlCruce (String idCarretera, Carretera carretera) {
		CarreteraEntrante road = new CarreteraEntrante(carretera);
		this._carreterasEntrantes.add(road);
		this._mapaCarreterasEntrantes.put(idCarretera, road);
	}
	
	public void addCarreteraSalienteAlCruce (Cruce destino, Carretera road) {
		this._mapaCarreterasSalientes.put(destino, road);
	}
	
	public void entraVehiculoAlCruce (String idCarretera, Vehiculo car) {
		// añade el vehiculo a carretera
	}
	
	protected void actualizaSemaforos() {
		// pone el semaforo de la carretera actual a rojo
		// busca la siguiente para ponerla en verde
	}
	
	public String generaInforme () {
		String ret = "";
		
		ret += "[junction_report]\n";
		
		ret += "id = " + this._id + "\n";
		
		ret += "time = " +  "\n";	// TIEMPO
		
		ret += "queues = ";
		
//		for(int i = 0; i < this._carreteras; ++i) {
//			ret += "(";
//			ret += this._totalWays[i].getId();
//			ret += ",";
//			if(this._trafficLight[i])
//				ret += "green,";
//			else
//				ret += "red,";
//			ret += "[";
//			
//			//REPRESENTAR LA COLA
//			
//			ret += "])";
//			
//			if(i < 3)
//				ret += ",";
//		}
		
		ret += "\n";
		
		return ret;
	}

	@Override
	public void avanza() {
		// TODO Auto-generated method stub
	}
	
	protected String getNombreSeccion () {
		return "junction_report";
	}
	
	protected void completaDetallesSeccion (IniSection is) {
		
	}
	
	
}
