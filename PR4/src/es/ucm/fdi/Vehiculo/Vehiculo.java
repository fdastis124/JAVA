package es.ucm.fdi.Vehiculo;

public class Vehiculo {

	public class Vehiculo extends ObjetoSimulacion {

		 protected Carretera carretera; // carretera en la que est� el veh�culo
		 protected int velocidadMaxima; // velocidad m�xima
		 protected int velocidadActual; // velocidad actual
		 protected int kilometraje; // distancia recorrida
		 protected int localizacion; // localizaci�n en la carretera
		 protected int tiempoAveria; // tiempo que estar� averiado
		 protected List<Cruce> itinerario; // itinerario a recorrer (m�nimo 2)
		 ...
		 public Vehiculo(String id, int velocidadMaxima, List<CruceGenerico<?>> iti) {
		super(id);
		 // comprobar que la velocidadMaxima es mayor o igual que 0, y
		 // que el itinerario tiene al menos dos cruces.
		 // En caso de no cumplirse lo anterior, lanzar una excepci�n.
		 // inicializar los atributos teniendo en cuenta los par�metros.
		 // al crear un veh�culo su �carretera� ser� inicalmene �null�.
		}
		 public int getLocalizacion() {...}
		 public int getTiempoDeInfraccion() {...}
		 public void setVelocidadActual(int velocidad) {
		  // Si �velocidad� es negativa, entonces la �velocidadActual� es 0.
		  // Si �velocidad� excede a �velocidadMaxima�, entonces la
		  // �velocidadActual� es �velocidadMaxima�
		  // En otro caso, �velocidadActual� es �velocidad�
		 }
		 public void setTiempoAveria(Integer duracionAveria) {
			 // Comprobar que �carretera� no es null.
			 // Se fija el tiempo de aver�a de acuerdo con el enunciado.
			 // Si el tiempo de aver�a es finalmente positivo, entonces
			 // la �velocidadActual� se pone a 0
			}
		 protected void completaDetallesSeccion(IniSection is) {
			 ...
			 is.setValue("location", this.haLlegado ? "arrived" :
			 this.carretera + ":" + this.getLocalizacion());
			}
		 public void avanza() {
			 // si el coche est� averiado, decrementar tiempoAveria
			 // si el coche est� esperando en un cruce, no se hace nada.
			 // en otro caso:
			// 1. Actualizar su �localizacion�
			 //2. Actualizar su �kilometraje�
			 //3. Si el coche ha llegado a un cruce (localizacion >= carretera.getLength())
			 //3.1. Poner la localizaci�n igual a la longitud de la carretera.
			 //3.2. Corregir el kilometraje.
			 //3.3. Indicar a la carretera que el veh�culo entra al cruce.
			 //3.4. Marcar que �ste veh�culo est� en un cruce (this.estEnCruce = true)
			}
		 public void moverASiguienteCarretera() {
			 // Si la carretera no es null, sacar el veh�culo de la carretera.
			 // Si hemos llegado al �ltimo cruce del itinerario, entonces:
			// 1. Se marca que el veh�culo ha llegado (this.haLlegado = true).
			 //2. Se pone su carretera a null.
			 //3. Se pone su �velocidadActual� y �localizacion� a 0.
			 // y se marca que el veh�culo est� en un cruce (this.estaEnCruce = true).
			 // En otro caso:
			 //1. Se calcula la siguiente carretera a la que tiene que ir.
			 //2. Si dicha carretera no existe, se lanza excepci�n.
			 //3. En otro caso, se introduce el veh�culo en la carretera.
			 //4. Se inicializa su localizaci�n.
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
