package es.ucm.fdi.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SortedArrayList<E> extends ArrayList<E> {
	
		 private Comparator<E> cmp;
		 public SortedArrayList(Comparator<E> cmp) {
			 this.cmp = cmp;
		 };
		 @Override
		 public boolean add(E e) {		 
			 return this.add(e);  //TENGO UN PUTO CACAO MENTAL, SE LO METO A THIS PORQUE ES LA LISTA EN SI
			 //COSAS QUE NO SE SI HAY QUE PLANTEARSE:
			 	//-PUEDE HABER DOS EVENTOS COMPLETAMENTE IGUALES EN UN MISMO TIEMPO?
			 	//ADD ES SIMPLEMENTE METERLO EN LA LISTA PERO, COMO LO METO? A LA ULT POS? HAY QUE ESPECIFICARLO?
		}
		 public boolean addAll(Collection<? extends E> c) {
		 // programar inserción ordenada (invocando a add)
		 }
		 // sobreescribir los métodos que realizan operaciones de
		 // inserción basados en un índice para que lancen excepcion.
		 // Ten en cuenta que esta operación rompería la ordenación.
		 // estos métodos son add(int index, E element),
		 // addAll(int index, Colection<? Extends E>) y E set(int index, E element).
		
}
