
package registrodealumnos;
import java.util.Scanner;
import static registrodealumnos.cursos.scanner;

public class alumnos extends cursos {
    static Scanner scanner = new Scanner (System.in);
     //atributos 
    
        private String[] vectorRecolector;
        private int vectorUtilizable;
        
 //contructor 
   public alumnos(){
   vectorRecolector = new String[10000000];
   this.vectorUtilizable=0;
}
   
   //metodos 
   public void codigoAlumno(){
    System.out.println("Ingrese el codigo que corresponde al alumno");
    String codigoAlu=scanner.next();
    this.registrosDelVector("Codigo de Alumno", codigoAlu);
   }
   public void nombreAlumno(){
    System.out.println("Ingrese el nombre del alumno");
    String nombreAlu=scanner.next();
    this.registrosDelVector("Nombre", nombreAlu);
   }
   
   public void areasAlumno(){
    System.out.println("Ingrese el area del alumno");
    String areasAlu=scanner.next();
    this.registrosDelVector("area ", areasAlu);
   }
   public void correoAlumno(){
    System.out.println("Ingrese el correo del alumno");
    String correoAlu=scanner.next();
    this.registrosDelVector("Correo  ", correoAlu);
   }
   public void telefonoAlumno(){
    System.out.println("Ingrese el numero de telefono del alumno");
    String telefonoAlu=scanner.next();
    this.registrosDelVector("Telefono", telefonoAlu);
   }
   
   
   
       public void registrosDelVector(String detalles, String codigo){
        vectorUtilizable=vectorUtilizable+1;
        vectorRecolector[vectorUtilizable]= "   "+detalles+"   =====   "+codigo;  
    }
    
    public void mostrarDatos (){
            try{       
            for (int i=1; i<vectorRecolector.length;i++){
                if(vectorRecolector[i] != null){
                    System.out.println(vectorRecolector[i]);
                }
            }
            System.out.println("");
            for(String datos : vectorRecolector){
                if(datos != null){
                   
                }   
            } 
        }catch(Exception e){
            System.out.println(e.getMessage());       
        }
        
    }
        
        
}
