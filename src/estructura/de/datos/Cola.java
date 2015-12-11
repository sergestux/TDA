package estructura.de.datos;


public class Cola
{
     protected Nodo Frente;
    protected Nodo Fondo;

    private static int NumElementos;
    // constructor: crea cola vacía
    public Cola()
    {
        Frente = Fondo = null;
        NumElementos=0;
    }

    // insertar: pone elemento por el final
    public void insertar(Object elemento)
    {
        Nodo a;
        a = new Nodo(elemento);
        if (colaVacia())
        {
            Frente = a;
        }
        else
        {
            Fondo.siguiente = a;
        }
        Fondo = a;
        NumElementos++;     //Aumentamos el numero de elementos
    }

    // quitar: sale el elemento frente
    public Object extraer() throws Exception
    {
        Object aux;
        if (!colaVacia())
        {
            aux = Frente.elemento;
            Frente = Frente.siguiente;
        }
        else
            throw new Exception("No hay nada que eliminar. Cola vacía");
        NumElementos--;     //Disminuimos el numero de elementos
        return aux;         //Regresamos el objeto extraido
    }

    // verificación del estado de la cola
    public boolean colaVacia()
    {
        return (Frente == null);
    }

     //metodo que imprime los elementos de cola
    public void imprimir()  throws Exception
    {
         if (colaVacia())
        {
            throw new Exception("Error: cola vacía");
        }
        Nodo Aux=Frente;
        System.out.println("Listado de todos los elementos de la cola.");
        while (Aux!=null) {
            System.out.print(Aux.elemento + "\t-\t"); //imprimiendo los elementos de cola
            Aux=Aux.siguiente;
        }
        System.out.println();
    }

    // acceso al primero de la cola
    public Object FrenteCola() throws Exception
    {
        if (colaVacia())
        {
            throw new Exception("Error: cola vacía");
        }
        return (Frente.elemento);
    }

    public Object FondoCola() throws Exception
    {
        if (colaVacia())
            throw new Exception ("Cola vacía, no hay nada que imprimir.");
        return Fondo.elemento;
    }

    public static int getNumElementos() {
        return NumElementos;
    }

}
