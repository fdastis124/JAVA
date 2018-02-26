package es.ucm.fdi.Vehiculo;

public class Vehiculo {

	public class Vehiculo extends ObjetoSimulacion {

		 protected Carretera carretera; // carretera en la que está el vehículo
		 protected int velocidadMaxima; // velocidad máxima
		 protected int velocidadActual; // velocidad actual
		 protected int kilometraje; // distancia recorrida
		 protected int localizacion; // localización en la carretera
		 protected int tiempoAveria; // tiempo que estará averiado
		 protected List<Cruce> itinerario; // itinerario a recorrer (mínimo 2)
		 ...
		 public Vehiculo(String id, int velocidadMaxima, List<CruceGenerico<?>> iti) {
		super(id);
		 // comprobar que la velocidadMaxima es mayor o igual que 0, y
		 // que el itinerario tiene al menos dos cruces.
		 // En caso de no cumplirse lo anterior, lanzar una excepción.
		 // inicializar los atributos teniendo en cuenta los parámetros.
		 // al crear un vehículo su “carretera” será inicalmene “null”.
		}
		 public int getLocalizacion() {...}
		 public int getTiempoDeInfraccion() {...}
		 public void setVelocidadActual(int velocidad) {
		  // Si “velocidad” es negativa, entonces la “velocidadActual” es 0.
		  // Si “velocidad” excede a “velocidadMaxima”, entonces la
		  // “velocidadActual” es “velocidadMaxima”
		  // En otro caso, “velocidadActual” es “velocidad”
		 }
		 public void setTiempoAveria(Integer duracionAveria) {
			 // Comprobar que “carretera” no es null.
			 // Se fija el tiempo de avería de acuerdo con el enunciado.
			 // Si el tiempo de avería es finalmente positivo, entonces
			 // la “velocidadActual” se pone a 0
			}
		 protected void completaDetallesSeccion(IniSection is) {
			 ...
			 is.setValue("location", this.haLlegado ? "arrived" :
			 this.carretera + ":" + this.getLocalizacion());
			}
		 public void avanza() {
			 // si el coche está averiado, decrementar tiempoAveria
			 // si el coche está esperando en un cruce, no se hace nada.
			 // en otro caso:
			// 1. Actualizar su “localizacion”
			 //2. Actualizar su “kilometraje”
			 //3. Si el coche ha llegado a un cruce (localizacion >= carretera.getLength())
			 //3.1. Poner la localización igual a la longitud de la carretera.
			 //3.2. Corregir el kilometraje.
			 //3.3. Indicar a la carretera que el vehículo entra al cruce.
			 //3.4. Marcar que éste vehículo está en un cruce (this.estEnCruce = true)
			}
		 public void moverASiguienteCarretera() {
			 // Si la carretera no es null, sacar el vehículo de la carretera.
			 // Si hemos llegado al último cruce del itinerario, entonces:
			// 1. Se marca que el vehículo ha llegado (this.haLlegado = true).
			 //2. Se pone su carretera a null.
			 //3. Se pone su “velocidadActual” y “localizacion” a 0.
			 // y se marca que el vehículo está en un cruce (this.estaEnCruce = true).
			 // En otro caso:
			 //1. Se calcula la siguiente carretera a la que tiene que ir.
			 //2. Si dicha carretera no existe, se lanza excepción.
			 //3. En otro caso, se introduce el vehículo en la carretera.
			 //4. Se inicializa su localización.
			}
			@Override
			protected String getNombreSeccion() {
			return "vehicle_report";
			}
	/*public int _velMaxima;
	public int _velActual;
	public String _road;
	public int _location;
	public String _way;
	
	public float _tiempoAveria;
	
	public Vehiculo (int maxspeed, String road,int location, String way, float tAveria ){
		_velMaxima = maxspeed;
		_road = road;
		_location = location;
		_way = way;
		_tiempoAveria = tAveria;
	}
	
	public void avanza(){
		int newloc = 0;
		/*Contiene la nueva localizacion
		
		if(this._tiempoAveria > 0)
			this._tiempoAveria--;
		else /*_tiempoAveria = 0
		{
			newloc = this._location + this._velMaxima;
			//if(LA NUEVA LOCALIZACION MAYOR O IGUAL QUE LA LONGITUD DE LA CARRETERA)
				COLA DE CRUCES HASTA QUE EL CRUCE HAGA PASAR NUEVO VEHICULO
		}
	}
	*/
}
