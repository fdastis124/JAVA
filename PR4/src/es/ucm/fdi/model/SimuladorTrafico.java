package es.ucm.fdi.model;

import java.io.OutputStream;
import java.util.Comparator;

public class SimuladorTrafico {
	private MapaCarreteras mapa;
	private List<Evento> eventos;
	private int contadorTiempo;
	
	public SimuladorTrafico() {
	 this.mapa = new MapaCarreteras();
	 this.contadorTiempo = 0;
	 Comparator<Evento> cmp = new Comparator<Evento>() {//COMPARACIÓN POR TIEMPO};
	 this.eventos = new SortedArrayList<>(); // estructura ordenada por “tiempo”
	}
	
	public void ejecuta(int pasosSimulacion, OutputStream ficheroSalida) {
		 int limiteTiempo = this.contadorTiempo + pasosSimulacion – 1;
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
