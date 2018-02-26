package es.ucm.fdi.model;

public abstract class ObjetoSimulacion {
	 protected String id;
	 public ObjetoSimulacion(String id) {...}
	 public String getId() {...}

	 @Override
	 public String toString() {...}

	 public String generaInforme(int tiempo) {
		 IniSection is = new IniSection(this.getNombreSeccion());
		 is.setValue("id", this.id);
		 is.setValue("time", tiempo);
		 this.completaDetallesSeccion(is);
		 return is.toString();
		}
		// los m�todos getNombreSeccion y completaDetallesSeccion
		// tendr�n que implementarlos cada subclase de ObjetoSimulacion
	 public abstract void avanza();
	 ...
	}
