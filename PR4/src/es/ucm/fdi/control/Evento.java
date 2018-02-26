package es.ucm.fdi.control;

import es.ucm.fdi.model.MapaCarreteras;

public abstract class Evento {
	 protected Integer tiempo;
	 public Evento(int tiempo) { ... }
	 public int getTiempo() { ... }
	
	 // cada clase que hereda implementa su m�todo ejecuta, que crear�
	 // el correspondiente objeto de la simulaci�n.

	 public abstract void ejecuta(MapaCarreteras mapa);
	}
