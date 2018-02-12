package es.ucm.fdi.Vehiculo;

public class Vehiculo {

	public int _velMaxima;
	/*public int _velActual;*/
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
		/*Contiene la nueva localizacion*/ 
		
		if(this._tiempoAveria > 0)
			this._tiempoAveria--;
		else /*_tiempoAveria = 0*/ 
		{
			newloc = this._location + this._velMaxima;
			//if(/*LA NUEVA LOCALIZACION MAYOR O IGUAL QUE LA LONGITUD DE LA CARRETERA*/)
				/*COLA DE CRUCES HASTA QUE EL CRUCE HAGA PASAR NUEVO VEHICULO*/
		}
	}
		
}
