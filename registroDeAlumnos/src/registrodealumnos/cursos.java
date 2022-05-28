
package registrodealumnos;
import java.util.Scanner;

public class cursos {
    static Scanner scanner = new Scanner (System.in);
    
    //atributos 
        private String[] vectorRecolector;
        private int vectorUtilizable;
        
    //contructor 
        public cursos(){
        vectorRecolector = new String[10000000];
        this.vectorUtilizable=0;
}
        
    //metodos 
    public void codigoCurso(){
    System.out.println("Ingrese el codigo del curso del alumno");
    String codigoC = scanner.next();
    this.registrosDelVector("Codigo del Curso", codigoC);
    
}
    public void nombreCurso(){
        System.out.println("Ingrese el nombre del curso del alumno");
        String nombreC = scanner.next();
        this.registrosDelVector("nombre del curso", nombreC);
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
    
    
    
    
    

