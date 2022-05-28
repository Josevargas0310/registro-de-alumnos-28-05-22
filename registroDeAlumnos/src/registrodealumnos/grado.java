
package registrodealumnos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class grado {
static Scanner scanner = new Scanner (System.in);
//atributos
 private String codigoGrado;
 private String descripcion;
 
 
 public void codigoG(){
    System.out.println("Ingrese el codigo del grado del alumno");
    this.codigoGrado = scanner.next();
    System.out.println("Codigo del grado =="+codigoGrado);
     
}
    public void descripcion(){
        System.out.println("Ingrese descripcion del grado");
        this.descripcion = scanner.next();
       System.out.println("Descripcion =="+descripcion);
}
  public void mostrarRegistro(){
      List<grado>listGrado = new ArrayList<>();
      grado datos = new grado();
      
      datos.codigoG();
      datos.descripcion();
      listGrado.add(datos);

  }
}
 