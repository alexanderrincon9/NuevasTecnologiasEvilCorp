/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evilcorp;

import empleado.Empleado;
import java.util.Scanner;


/**
 *
 * @author 505
 */
public class EvilCorp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        int contador=0;
        Empleado []empleados = new Empleado[10];
        do{
        System.out.println("Bienvenido");
        System.out.println("***********************************");
        System.out.println("1. Agregar Empleado");
        System.out.println("2. Buscar Empleado");
        System.out.println("3. Mostrar Empleado");
        System.out.println("4. Calcular Salario");
        System.out.println("5. Salir");
        System.out.println("Digite una opcion: ");
        opcion=entrada.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("***********************************");
                System.out.println("Registro de Empleados: ");
                empleados[contador]= new Empleado ();
                empleados[contador].setId(contador);
                System.out.println("Digite el nombre: ");
                empleados[contador].setNombre(entrada.next ());
                System.out.println("Digite el cargo: ");
                empleados[contador].setCargo(entrada.next ());
                System.out.println("Digite horas semanales: ");
                empleados[contador].setHoraSemanales(entrada.nextDouble());
                empleados[contador].setSalario(0);
                contador = contador +1;
                
                System.out.println("***********************************");
               
                break;
            case 2:
                System.out.println("entro a opcion 2");
                break;    
            case 3:
                System.out.println("Base de datos empleados");
                
                for(int i=0; i<contador; i++){
                System.out.println(empleados[i].getNombre());
                System.out.println(empleados[i].getCargo());
                System.out.println(empleados[i].getHoraSemanales());
                System.out.println(empleados[i].getSalario());
                }
                break;                
            case 4:
                System.out.println("entro a opcion 4");
                break;              
            case 5:
                System.exit(0);
                break;
            default : 
                break;    
                    
                
        }
        }while(opcion!=5);
 
    }
    
}
