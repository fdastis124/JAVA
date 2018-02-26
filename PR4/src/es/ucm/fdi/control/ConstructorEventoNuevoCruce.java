package es.ucm.fdi.control;

public class ConstructorEventoNuevoCruce extends ConstructorEventos {


	public ConstructorEventoNuevoCruce(){
		this.etiqueta = "new_junction";
		this.claves = new String[]{"time", "id"};
		this.valoresPorDefecto = new String[]{"",""};
	}
	
	public Evento parser(IniSecton section){
		if(!section.getTag().equals(this.etiqueta) ||
				section.getValue("type")!= null) return null;
		else
			return new EventoNuevoCruce{
			//extrae el valor del campo "tiem en la secci�n
			//0 es el valor por defecto en caso de no especificar el tiempo
			ConstructorEventos.parseaIntNoNegativo(section, "time", 0),
			//extrae el valor del campo "id" de la secci�n 
			ConstructorEventos.identificadorValido(section,"id"));
		}
		
		
	}
	public String toString(){return "New Junction";}
	
}
