package es.ucm.fdi.control;

import es.ucm.fdi.model.MapaCarreteras;

public abstract class Evento {
	 protected Integer tiempo;
	 public Evento(int tiempo) { ... }
	 public int getTiempo() { ... }
	
	 // cada clase que hereda implementa su método ejecuta, que creará
	 // el correspondiente objeto de la simulación.

	 public abstract void ejecuta(MapaCarreteras mapa);
	}
