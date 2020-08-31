package PackageMain;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import PackageMain.CacularVariables;
import PackageMain.Empleado;

public class Supermercado {

	public static void main(String[] args) throws IOException {
            SupermercadoSantaFe();
	}
	
	public static void SupermercadoSantaFe() throws IOException {
        
        System.out.println("Seleccione una opción para iniciar\n 1: Agregar empleado. \n 2: Ver datos empleado.");
        System.out.println(" 3: Suma de salarios por departamento. \n 4: Empleados por posicion.");
        
        BufferedReader reader =   new BufferedReader(new InputStreamReader(System.in));
        String opcion = reader.readLine();
        CacularVariables calCacularVariables = new CacularVariables();
        int cedula;    
        String departamento;
        String posicion;
        switch (opcion) {
		case "1":
			System.out.println("Ingrese la cédula: ");
			cedula = Integer.parseInt(reader.readLine());
                        System.out.println("Ingrese el nombre: ");
			String nombre = reader.readLine();
                        System.out.println("Ingrese el departamento: ");
			departamento = reader.readLine();
                        System.out.println("Ingrese el posición: ");
			posicion = reader.readLine();
                        System.out.println("Ingrese el salario: ");
			Double salario = Double.parseDouble(reader.readLine());
                        Empleado emp = new Empleado(cedula, nombre, departamento, posicion, salario);
                        calCacularVariables.SetEmpleados(emp);
			System.out.println("\n");
			System.out.println("Volver al menu");
			reader.readLine();
			for (int i = 0; i < 15; i++) {
				System.out.println("\n");
			}
			SupermercadoSantaFe();
			break;
        
		case "2":
                        System.out.println("Ingrese la cedula: ");
			cedula = Integer.parseInt(reader.readLine());
                        System.out.println("Datos de empleado: ");
                        calCacularVariables.GetEmpleados(cedula);
			System.out.println("\n");
			System.out.println("Volver al menu");
			reader.readLine();
			for (int i = 0; i < 15; i++) {
				System.out.println("\n");
			}
			SupermercadoSantaFe();
			break;
			
		case "3":
			 System.out.println("Ingrese el departamento: ");
			departamento = reader.readLine();
                        calCacularVariables.GetSalarioDpto(departamento);
			System.out.println("\n");
			System.out.println("Volver al menu");
			reader.readLine();
			for (int i = 0; i < 15; i++) {
				System.out.println("\n");
			}
			SupermercadoSantaFe();
			break;
			
		case "4":
                        System.out.println("Ingrese la posicion: ");
			posicion = reader.readLine();
                        calCacularVariables.GetEmpleadosByPosicion(posicion);
			System.out.println("\n");
			System.out.println("Volver al menu");
			reader.readLine();
			for (int i = 0; i < 15; i++) {
				System.out.println("\n");
			}
			SupermercadoSantaFe();
			break;
			
		default:
			break;
		}
	}
}