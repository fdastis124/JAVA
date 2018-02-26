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
	 // si iti es null o tiene menos de dos cruces lanzar excepción
	 // en otro caso crear el vehículo y añadirlo al mapa.
	 }
	 @Override
	 public String toString() {...}
}
