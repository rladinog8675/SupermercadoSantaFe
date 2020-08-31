package PackageMain;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class CacularVariables {
	
BufferedReader reader =   new BufferedReader(new InputStreamReader(System.in));
    
public List<Empleado> ViewEmpleados() {
            List<Empleado> listEmpleados = new ArrayList<>();
            try {
               FileInputStream fis = new FileInputStream("t.txt");
                ObjectInputStream ois = new ObjectInputStream(fis);
                 listEmpleados = (List<Empleado>) ois.readObject();
                ois.close();
               
            } catch (Exception e) {
                e.getMessage();
            }
		
         return listEmpleados;
	
}

public void SetEmpleados(Empleado empleado) {
            try {
                List<Empleado> empl = ViewEmpleados();
                empl.add(empleado);
                 FileOutputStream fos = new FileOutputStream("t.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(empl);
                oos.close();
               
            } catch (Exception e) {
                e.getMessage();
            }      
	}
        
public void GetEmpleados(int cedula){
        List<Empleado> empls = ViewEmpleados();
            for (Empleado empl : empls) {
                if (empl.getCedula() == cedula ) {
                    System.out.println("Cédula : " + empl.getCedula() + "\n" +
                            "Nombre: " + empl.getNombre() + "\n" + 
                            "Salario: " + empl.getSalario() + "\n" + 
                            "Departamento: " + empl.getDepartamento() + "\n" + 
                            "Posicion: " + empl.getPosicion() + "\n" + 
                            "Salario: " + empl.getSalario()
                    );
                }                
            }
        }
        
public void GetSalarioDpto(String departamento){
        List<Empleado> empls = ViewEmpleados();
        double sumaSalario = 0.0;
            for (Empleado empl : empls) {
                if (empl.getDepartamento().equals(departamento) ) {
                    sumaSalario = sumaSalario + empl.getSalario();
                }                
            }
            System.out.println("La suma de salarios del departamento: " + departamento + " es: " + sumaSalario);

        }
        
public void GetEmpleadosByPosicion(String posicion){
        List<Empleado> empls = ViewEmpleados();
        int countEmpleados = 0;
            for (Empleado empl : empls) {
                if (empl.getPosicion().equals(posicion) ) {
                    countEmpleados = countEmpleados + 1;
                }                
            }
            System.out.println("El total de empleados en la posicion: " + posicion + " es: " + countEmpleados);
        } 
}