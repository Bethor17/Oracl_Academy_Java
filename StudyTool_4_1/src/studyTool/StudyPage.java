package studyTool;
import java.util.Scanner;

public class StudyPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner numgalon = new Scanner(System.in);
		int Galon;
		System.out.println("Ingresa el número de galones");
		Galon = numgalon.nextLine();
		int numgallons = Galon;
		
		
		double convertir = Galon * 3.79;
		
		System.out.println("La cantidad de litros equivalente es: "+ convertir);
		
		
		/* Scanner scanterm = new Scanner(System.in);//define un metodo de entrada tipo scanner
		String termvar;//defina una variable tipo dato
		System.out.println("Enter a study term");//imprime datos
		termvar = scanterm.nextLine();//asigna el valor que ingreso usuario
		
		Scanner scandef = new Scanner(System.in);//Define otro metodo de entrada de usuario
		String termdef;//define la variable de tipo dato
		System.out.println("Enter a definition");//imprime texto
		termdef = scandef.nextLine();//escanea el tipeo del usuario
		
		System.out.println(termvar + ": " + termdef);//imprime el resultado del tipeo del usuario
		*/
	}

}
