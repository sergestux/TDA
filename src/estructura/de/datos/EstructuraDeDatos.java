package estructura.de.datos;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author sergio
 */
public class EstructuraDeDatos {
    static int Opcion, SubOpcion;

    static Nodo NodoAux; //se encargar de guardar la direccion de memoria
    static int Opcion1;
    private static int OpcionListas;
    private static Scanner lis;
    private static int SubOpcionListas;
    private static Scanner lis1;


    public static void main(String[] args) throws Exception
    {
        Scanner ler;
        Object Dato;
        Cola Cola= new Cola();
        //pila
        Scanner dat;
        String Dato1 = null;
        Pila PilaEnlazada;
        PilaEnlazada=new Pila();
        BufferedReader entrada = new BufferedReader(
        new InputStreamReader(System.in));
        //listas

        String dato;
        ListaSimple Lista= new ListaSimple();
        Scanner lor;
        Scanner dat1;

        do
        {
            Opcion=Menu();      //Presenta el menu principal
            switch (Opcion)
            {
                case 1: //Pila
                do
                {
                    Opcion1=VerMenu();
                    switch(Opcion1)
                    {
                        case 1:
                                //crear nodo pila(insertar)
                                dat=new Scanner(System.in);
                                System.out.println("Ingrese una letra: ");
                                Dato=dat.nextLine();
                                PilaEnlazada.insertar(Dato1);
                        break;

                        case 2:       //extraer nodo pila
                            try
                            {
                                System.out.println("Extrayendo la letra: " + PilaEnlazada.extraer());
                            }
                            catch (Exception er)
                            {
                                System.err.println(er);
                            }
                        break;

                        case 3:       //imprimir nodo pila
                            try
                            {
                                PilaEnlazada.imprimir();
                            }
                            catch (Exception er)
                            {
                                System.err.println(er);
                            }
                        break;

                        case 4:     //fondo y tope nodo pila
                           try
                            {
                                NodoAux=PilaEnlazada.getCima();    //Obtengo el fondo de la Lista
                                System.out.println("La Cima de la pila es: " + NodoAux.elemento);
                                NodoAux=PilaEnlazada.getFondo();    //Obtengo el fondo de la Lista
                                System.out.println("El fondo de la pila es: " + NodoAux.elemento);
                            }
                            catch (Exception er)
                            {
                                System.err.println(er);
                            }
                        break;
                        case 5:
                            //numero de elementos nodo pila
                            System.out.println("Numero de elementos en la pila: " + PilaEnlazada.getNumElementos());
                        break;
                  }

                }
                while (Opcion1 != 6);

                break;

                case 2: //Cola

                    do
                    {

                        SubOpcion=SubMenuCola();
                        switch (SubOpcion)
                        {
                            case 1:
                                    //insertar
                                    ler=new Scanner(System.in);
                                    System.out.println("Ingresar una letra: ");
                                    Dato=ler.nextLine();
                                    Cola.insertar(Dato);
                            break;
                            case 2:
                                    //extraer
                                    try
                                    {
                                        System.out.println("Extrayendo la letra de la cola: " + Cola.extraer());
                                    }
                                    catch (Exception er)
                                    {
                                        System.err.println(er);
                                    }
                            break;
                            case 3:
                                    //imprimir
                                     try
                                    {
                                        Cola.imprimir();
                                    }
                                    catch (Exception er)
                                    {
                                        System.err.println(er);
                                    }
                            break;
                            case 4:
                                    //frente y fondo
                                    try
                                    {
                                        Dato=Cola.FrenteCola();    //Obtengo el fondo de la Lista
                                        System.out.println("La frente de la cola es: " + Dato);
                                        Dato=Cola.FondoCola();    //Obtengo el fondo de la Lista
                                        System.out.println("El fondo de la cola es: " + Dato);
                                    }
                                    catch (Exception er)
                                    {
                                        System.err.println(er);
                                    }
                            break;

                            case 5:
                                    //numero de elementos
                                    System.out.println("Numero de elementos en la cola: " + Cola.getNumElementos());
                            break;
                        }//Fin del switch del SubMenu de cola
                    }
                    while(SubOpcion != 6);

                break;

                case 3: //Listas
                    do
                    {
                        OpcionListas=MenuListas();
                        switch (OpcionListas)
                        {
                            case 1:     //LIStas SImples
                                do
                                 {
                                     SubOpcionListas=SubMenuListas();
                                     switch (SubOpcionListas)
                                     {
                                        case 1:
                                                //insertar
                                                lis=new Scanner(System.in);
                                                System.out.println("Ingresar una letra: ");
                                                Dato=lis.nextLine();
                                                Lista.Insertar(Dato);
                                        break;
                                        case 2:
                                                //extraer
                                                lis1=new Scanner(System.in);
                                                System.out.println("Ingresar una letra: ");
                                                Dato=lis1.nextLine();
                                                try
                                                {
                                                    System.out.println("Extrayendo la letra de la lista: " + Lista.eliminar(Dato));
                                                }
                                                catch (Exception er)
                                                {
                                                    System.err.println(er);
                                                }
                                        break;
                                        case 3:
                                                //imprimir
                                                 try
                                                {
                                                    Lista.imprimir();
                                                }
                                                catch (Exception er)
                                                {
                                                    System.err.println(er);
                                                }
                                        break;
                                     } //Fin del Switch
                                } while (SubOpcionListas != 4);
                                break;

                            case 2: //listacircular
                            break;

                            case 3: //listadoble
                            break;

                            case 4: //listadoblecircular
                            break;


                        }//Fin del switch del menulistas
                             
                           
                    }
                    while(OpcionListas != 5);
                break;

                case 4: //Arboles
                break;

                case 6: //Salir del programa
                break;
            }//Fin del switch del menu principa
        } //fin del do
        while(Opcion != 6);

    }
    

    public static int SubMenuCola()
    {
        int opcion=0;
            System.out.println("***********SUBMENU**************");
            System.out.println("******1.-Insertar********");
            System.out.println("*****2.-Extraer***");
            System.out.println("*****3.-Imprimir*****");
            System.out.println("*****4.-Frente y fondo*************");
            System.out.println("*****5.-Numero de elementos*************");
            System.out.println("*****6.-Regresar al menu*************");
            System.out.println("****Ingrese una opcion*****");
            Scanner ler=new Scanner(System.in);
            opcion=ler.nextInt();
        return opcion;
    }


    public static int Menu()
    {
        int opcion=0;
            System.out.println("***********MENU**************");
            System.out.println("******1.-Pila********");
            System.out.println("*****2.-Cola***");
            System.out.println("*****3.-Listas*****");
            System.out.println("*****4.-Arboles*************");
            System.out.println("*****6.-Salir*************");
            System.out.println("****Ingrese una opcion*****");
            Scanner ler=new Scanner(System.in);
            opcion=ler.nextInt();
        return opcion;
    }
       public static int VerMenu()
    {
        int opcion=0;
            System.out.println("***********MENU**************");
            System.out.println("******1.-Insertar********");
            System.out.println("*****2.-Extraer***");
            System.out.println("*****3.-Imprimir*****");
            System.out.println("*****4.-Fondo y tope*************");
            System.out.println("*****5.-Numero de elementos*************");
            System.out.println("*****6.-Salir*************");
            System.out.println("****Ingrese una opcion*****");
            Scanner ler=new Scanner(System.in);
            opcion=ler.nextInt();
        return opcion;
    }
    public static int MenuListas()
    {
        int opcion=0;
            System.out.println("***********MENU LISTAS ENLAZADAS**************");
            System.out.println("******1.-Simples********");
            System.out.println("*****2.-Simples Circulares***");
            System.out.println("*****3.-Dobles*****");
            System.out.println("*****4.-Dobles circulares*************");
            System.out.println("*****5.-Regresar al menu*************");
            System.out.println("****Ingrese una opcion*****");
            Scanner ler=new Scanner(System.in);
            opcion=ler.nextInt();
        return opcion;
    }
      public static int SubMenuListas()
    {
        int opcion=0;
            System.out.println("***********MENU**************");
            System.out.println("******1.-Insertar********");
            System.out.println("*****2.-Imprimir***");
            System.out.println("*****3.-Eliminar*****");
            System.out.println("*****4.-salir*************");
            System.out.println("****Ingrese una opcion*****");
            Scanner ler=new Scanner(System.in);
            opcion=ler.nextInt();
        return opcion;
    }
}