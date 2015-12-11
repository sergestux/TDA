package estructura.de.datos;


public class Pila
{
      private Nodo Cima;
    private Nodo Fondo;
    private Nodo Anterior;

    private static int NumElementos;

    public Pila()
    {
        Cima = null;
        Fondo=null;
        Anterior=null;
        NumElementos=0;
    }

    //
    public void insertar(Object elemento)
    {
        Nodo nuevo;

        nuevo = new Nodo(elemento);
        nuevo.siguiente = Cima;
        Cima = nuevo;

        NumElementos++;     //Incrementamos el numero de elementos de la pila
        if(NumElementos==1)
            Fondo=nuevo;

    }

    public Object extraer()throws Exception
    {
        if (pilaVacia())
            throw new Exception ("Pila vacía, no se puede extraer.");
        Object aux = Cima.elemento;
        Cima = Cima.siguiente;
        NumElementos--;     //Decrementamos el numero de elementos de la pila

        if(NumElementos==0)
        {
            Cima=null;
            Fondo=null;
        }
        return aux;
    }


    public Object cimaPila() throws Exception  //Obtención del elemento cabeza o cima de la pila, sin modificar la pila:
    {
        if (pilaVacia())
            throw new Exception ("Pila vacía, no se puede leer cima.");
        return Cima.elemento;
    }

    public boolean pilaVacia()
    {
        if(NumElementos>0)
            return false;   //Indicamos que la pila contiene elementos

        return true;
    }

    public void imprimir()throws Exception
    {
        Nodo Aux=Cima;

        if (pilaVacia())
            throw new Exception ("Pila vacía, no hay nada que imprimir.");

        while(Aux!=null)
        {
            System.out.println(Aux.elemento);   //Imprimimos el dato
            Aux=Aux.siguiente;
        }

     }

    public static int getNumElementos() {
        return NumElementos;
    }

    public Nodo getCima()throws Exception
    {
        if (pilaVacia())
            throw new Exception ("Pila vacía, no hay nada que imprimir.");
        return Cima;
    }

    public Nodo getFondo() throws Exception
    {
        if (pilaVacia())
            throw new Exception ("Pila vacía, no hay nada que imprimir.");
        return Fondo;
    }
}
