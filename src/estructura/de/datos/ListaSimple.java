package estructura.de.datos;


public class ListaSimple
{          
     Nodo Inicio;
     Nodo Final;

    //Crea una lista simple asignando al nodo Inicio nulo
    public ListaSimple() {
        Inicio=null;
        Final=null;
    }
     

     //Inserta un nodo a la lista por el final
     public void Insertar(Object dato)
     {

        Nodo NodoNuevo= new Nodo(dato);
        if(Final != null)
            Final.siguiente=NodoNuevo;
        else
            Inicio=NodoNuevo;
        Final=NodoNuevo;
     }

     //Imprime desde el inicio de la lista hasta el final
    public void imprimir () throws Exception
    {
        Nodo actual =this.Inicio;
        if(actual==null)
            throw new Exception("La lista esta vacia");
        while(actual!=null)
        {
            System.out.println(actual.elemento);
            actual=actual.siguiente;
        }
    }


    //Funcion que elimina un nodo de la lista, recibe el dato a eliminar
    public Object eliminar(Object info) throws Exception
    {
        boolean encontrado;
        encontrado=false;

        //inicializa los apuntadores
        Nodo actual=this.Inicio;
        Nodo anterior=null;

         //busqueda del nodo y el anterior
        while(actual!=null && encontrado==false)
        {
            if(info.equals(actual.elemento))        //Si enocntramos el dato en la lista
            {
                encontrado=true;

                if(actual==this.Inicio)  //Si es el inicio de la lista el que se quiere eliminar
                   this.Inicio=actual.siguiente;        //Movemos el apuntador de inicio al siguiente nodo
                else
                   anterior.siguiente=actual.siguiente;     //Cambiamos el enlace del nodo anterior, por el siguiente del actual

                if(actual==this.Final)   //Si es el final de la lista el que se quiere eliminar
                    this.Final=anterior;
                actual=null;        //Eliminamos el nodo

            }
            else
            {
                anterior = actual;
                actual = actual.siguiente;
            }
        }

        if(encontrado==false)
        {
            throw new Exception("No se encontro el dato");
        }
        return info;
     }
     
}
