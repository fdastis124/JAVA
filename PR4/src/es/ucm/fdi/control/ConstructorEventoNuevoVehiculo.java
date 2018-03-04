package es.ucm.fdi.control;

import es.ucm.fdi.ini.IniSection;

public class ConstructorEventoNuevoVehiculo extends ConstructorEventos {


	@SuppressWarnings("unused")
	private String[] valoresPorDefecto; // TENGO QUE DECLARAR EL CAMPO valoresPorDefecto? PORQUE COMO EXTIENDE DE CONSTRUCTOR
										// EVENTOS NO DEBERIA ESTAR ESTE CAMPO AHI?
	
	public ConstructorEventoNuevoVehiculo(){
		this._etiqueta = "new_vehicle";
		this._keys = new String[]{"time", "id"};
		 this.valoresPorDefecto = new String[] { "", "", };
	}
	
	public Evento parser(IniSection section){
		if(!section.getTag().equals(this._etiqueta) ||
				section.getValue("type")!= null) return null;
		else
			return new EventoNuevoCruce(
			//extrae el valor del campo "tiem en la sección
			//0 es el valor por defecto en caso de no especificar el tiempo
			ConstructorEventos.parseaIntNoNegativo(section, "time", 0),
			//extrae el valor del campo "id" de la sección 
			ConstructorEventos.identificadorValido(section,"id"));
		
		
	}
	public String toString(){return "New Vehicle";}

	

}
