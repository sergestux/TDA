package estructura.de.datos;

public class Nodo
{
    Object elemento; //es el elemento que guarda en la cola
    Nodo siguiente; //contiene la direccion del siguiente nodo en la cola

    public Nodo(Object dato)
    {
        elemento = dato;
        siguiente = null;
    }    
}
