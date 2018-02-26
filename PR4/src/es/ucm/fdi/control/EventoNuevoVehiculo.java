package es.ucm.fdi.control;

import java.util.List;

import es.ucm.fdi.model.MapaCarreteras;

public class EventoNuevoVehiculo extends Evento {
	 protected String id;
	 protected Integer velocidadMaxima;
	 protected String[] itinerario;
	 public EventoNuevoVehiculo(int tiempo, String id, int velocidadMaxima,
	 String[] itinerario) {
	 ...
	 }
	 @Override
	 public void ejecuta(MapaCarreteras mapa) {
	 List<Cruce> iti = ParserCarreteras.parseaListaCruces(this.itinerario,mapa);
	 // si iti es null o tiene menos de dos cruces lanzar excepci�n
	 // en otro caso crear el veh�culo y a�adirlo al mapa.
	 }
	 @Override
	 public String toString() {...}
}
