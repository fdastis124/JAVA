package es.ucm.fdi.Cruce;

import es.ucm.fdi.model.ObjetoSimulacion;

abstract public class Cruce extends ObjetoSimulacion {
	 protected int indiceSemaforoVerde; // lleva el �ndice de la carretera entrante
	 // con el sem�foro en verde
	 protected List<CarreteraEntrante> carreterasEntrantes;

	 // para optimizar las b�squedas de las carreterasEntrantes
	 // (IdCarretera, CarreteraEntrante)
	 protected Map<String,CarreteraEntrante> mapaCarreterasEntrantes;
	 protected Map<Cruce, Carretera> CarreterasSalientes;
	 
	 public Cruce(String id) {...}
	 public Carretera carreteraHaciaCruce(Cruce cruce) {
	  // devuelve la carretera que llega a ese cruce desde �this�
	 }
	 public void addCarreteraEntranteAlCruce(String idCarretera, Carretera carretera) {
	  // a�ade una carretera entrante al �mapaCarreterasEntrantes� y
	  // a las �carreterasEntrantes�
	 }
	 public void addCarreteraSalienteAlCruce(Cruce destino, Carretera road) {
	  // a�ade una carretera saliente
	 }
	 public void entraVehiculoAlCruce(String idCarretera, Vehiculo vehiculo){
	  // a�ade el �vehiculo� a la carretera entrante �idCarretera�
	 }
	 protected void actualizaSemaforos(){
	  // pone el sem�foro de la carretera actual a �rojo�, y busca la siguiente
	  // carretera entrante para ponerlo a �verde�
	 } 
	 public void avanza() {
		// Si �carreterasEntrantes� es vac�o, no hace nada.
		 // en otro caso �avanzaPrimerVehiculo� de la carretera con el sem�foro verde.
		 // Posteriormente actualiza los sem�foros.
		}
		@Override
		protected String getNombreSeccion() {...}
		@Override
		protected void completaDetallesSeccion(IniSection is) {
		 // genera la secci�n queues = (r2,green,[]),...
		}

}