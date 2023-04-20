package unit12.Actividad10;

import unit12.Actividad05.Actividad5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*
    Insertar en una lista 20 enteros aletorios entre 1 y 10. A partir de ella crear un conjunto con los elementos
    de la lista sin repetir, otro con los repetidos y otro con los elementos que aprecen una sola vez en la lista
    original.
 */
public class Actividad10 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = Actividad5.crearArrayListAleatorio(20,1,10);
        Collections.sort(lista);
        System.out.println("Lista Original: "+lista);
        Set<Integer> listaSinRepetidos = new HashSet<>(lista);
        System.out.println("Lista Sin Repetidos: "+ listaSinRepetidos);
        Set<Integer> listaConRepedidos = new HashSet<>();
        for (Integer n: listaSinRepetidos) {
            lista.remove(n);
        }
        listaConRepedidos.addAll(lista);
        System.out.println("Lista Repetidos: " + listaConRepedidos);
        Set<Integer> listaUnicos = new HashSet<>();
        listaUnicos.addAll(listaSinRepetidos);
        listaUnicos.removeAll(listaConRepedidos);
        System.out.println("Lista No repetidos: "+ listaUnicos);


    }
}
