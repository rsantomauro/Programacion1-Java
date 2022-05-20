package tarea3;
import java.util.Scanner;

/**
 * @author Rodrigo Santomauro 199089
 */
public class Tarea3 {
    public static void main(String[] args) {
        int segundosIng;
        int hora = 0;
        int min = 0;
        int segun = 0;
        int dias = 0;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingresar cantidad de segundos:");
        segundosIng = in.nextInt();
        
        if (segundosIng < 1000000){
            hora = segundosIng/3600;
            min = (segundosIng - (3600*hora)) /60; //Saco las horas ya ingresadas y calculo los minutos restantes
            segun = segundosIng - ((hora*3600)+(min*60));
            if (hora > 23){
                dias = hora / 24;
                hora = hora % 24;
            }
            System.out.println(dias + " dias " + hora + " horas " + min + " minutos " + segun + " segundos");
        }
        else{
            System.out.println("Numero ingresado mayor a 1.000.000");
        }
    }
    
}
