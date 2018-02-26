package es.ucm.fdi.control;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import es.ucm.fdi.ini.Ini;
import es.ucm.fdi.ini.IniSection;
import es.ucm.fdi.model.SimuladorTrafico;


public class Controlador {
	 private SimuladorTrafico simulador;
	 private OutputStream ficheroSalida;
	 private InputStream ficheroEntrada;
	 private int pasosSimulacion;


	 
	 public void ejecuta() {
	 this.cargaEventos(this.ficheroEntrada);
	 //FALTA EL EJECUTA
	 this.simulador.ejecuta(pasosSimulacion,this.ficheroSalida);
	 }
	 private void cargaEventos(InputStream inStream) {
		 Ini ini;
		 try {
		 // lee el fichero y carga su atributo iniSections
		 ini = new Ini(inStream);
		 }
		 catch (IOException e) {
			 //Falta excepcion 
		 throw new ErrorDeSimulacion("Error en la lectura de eventos: " + e);
		 }
		 // recorremos todas los elementos de iniSections para generar el evento
		 // correspondiente
		 for (IniSection sec : ini.getSections()) {
		 // parseamos la sección para ver a que evento corresponde
		 Evento e = ParserEventos.parseaEvento(sec);
		 if (e != null) this.simulador.insertaEvento(e);
		 else
		 throw new ErrorDeSimulacion("Evento desconocido: " + sec.getTag());
		 }
		}
	 
	 
	 
	}
