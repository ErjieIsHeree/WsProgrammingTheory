import java.util.Random;
import java.util.Scanner;


public class EleccionDelegado {
	public static void main(String[] args) {
		System.out.println("Bienvenidos a la app de eleccion de delegad@");
		System.out.println("--------------------------------------------");
		System.out.println("Autor: Félix de Pablo Lobo");
		System.out.println("Que Dios reparta suerte :)");
		
		System.out.println("Introduzca el número de alunnos que se presentan para delegad@");
		Scanner sc = new Scanner(System.in);
		int numeroAlumnos = sc.nextInt();
		
		Random rd = new Random();
		numeroAlumnos++;
		int numeroAleatorio = rd.nextInt(1,numeroAlumnos);
		
		System.out.println("Y el alumno elegido es...... :D");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("El numero de alumno premidado con delegad@/subdelegad@ es: " 
				+ numeroAleatorio);
	}
}
