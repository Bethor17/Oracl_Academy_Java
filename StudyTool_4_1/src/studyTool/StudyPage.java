package studyTool;
import javax.swing.*;

public class GalonesAlitros {

	public static void main(String[] args) {
		
		double gal= Double.parseDouble(JOptionPane.showInputDialog(null, "Cuantos galones desea convertir a litros?"));
		
		double litros = gal * 3.7854;
		
		JOptionPane.showMessageDialog(null, "La conversión de "+gal+" a litros es de: "+litros+ "litros");

	}

}
