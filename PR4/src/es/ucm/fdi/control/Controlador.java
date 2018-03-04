package es.ucm.fdi.control;

import java.io.*;
import es.ucm.fdi.ini.*;
import es.ucm.fdi.model.SimuladorTrafico;
import es.ucm.fdi.control.Evento;
//HAY QUE CREAR EXCEPTION
import es.ucm.fdi.control.ErrorDeSimulacion;

public class Controlador {
	/*
	 * Recives the road sim, the time limit & the I/O files
	 * Loads the event, init the sim and throws the sim exec
	 * */
	
	private SimuladorTrafico _sim;
	private OutputStream _out;
	private InputStream _in;
	private int _pasosSim;
	
	public Controlador (SimuladorTrafico sim, int pasos, InputStream in, OutputStream out) {
		this._sim = sim;
		this._out = out;
		this._in = in;
		this._pasosSim = pasos;
	}
	
	public void ejecuta () throws ErrorDeSimulacion{
		this.cargaEventos(this._in);
		this._sim.ejecuta(this._pasosSim, this._out);
	}
	
	private void cargaEventos(InputStream in) throws ErrorDeSimulacion {
		Ini ini;
		
		try{
			// lee el fichero y carga IniSections
			ini = new Ini(in);
		}
		catch(IOException e){
			throw new ErrorDeSimulacion("Error en la lectura de eventos: " + e);
		}
		// recorremos todos los eventos para generar el correspondiente
		for(IniSection sec : ini.getSections()){
			// parseamos la seccion para ver el correspondiente
			Evento e = ParserEventos.parseaEvento(sec);
			
			if (e != null) this._sim.insertaEvento(e);
			else
				throw new ErrorDeSimulacion("Evento desconocido: " + sec.getTag());
		}
		
		
	}
	
}
