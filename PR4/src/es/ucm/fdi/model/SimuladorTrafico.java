package es.ucm.fdi.model;

import java.io.OutputStream;
import java.util.Comparator;
import java.util.List;

import es.ucm.fdi.control.Evento;

public class SimuladorTrafico {
	private MapaCarreteras mapa;
	private List<Evento> eventos;
	private int contadorTiempo;
	
	public SimuladorTrafico() {
	 this.mapa = new MapaCarreteras();
	 this.contadorTiempo = 0;
	 Comparator<Evento> cmp = new Comparator<Evento>() { // AL SORTED ARRAY LIST LE PASAMOS EL COMPARADOR HECHO

		public int compare(Evento e1, Evento e2) {
		 //METODO A UTILIZAR CON COMPARATOR
			if (e1.getTiempo() == e2.getTiempo()) return 0;
			else if (e1.getTiempo() < e2.getTiempo()) return -1;
			else return 1;
			}
		//ESTO ORDENA EN ORDEN ASCENDENTE 
	 };
	 this.eventos = new SortedArrayList<>(cmp);
	}
	
	public void ejecuta(int pasosSimulacion, OutputStream ficheroSalida) {
		 int limiteTiempo = this.contadorTiempo + pasosSimulacion - 1;
		 while (this.contadorTiempo <= limiteTiempo) {
		// ejecutar todos los eventos correspondienes a “this.contadorTiempo”
		 // actualizar “mapa”
		 // escribir el informe en “ficheroSalida”, controlando que no sea null.
		 }
	}
	public void insertaEvento(Evento e) {
		 // inserta un evento en “eventos”, controlando que el tiempo de
		 // ejecución del evento sea menor que “contadorTiempo”
		}
		 
}
