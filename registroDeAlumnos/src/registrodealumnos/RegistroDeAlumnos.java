
package registrodealumnos;
import java.util.Scanner;

public class RegistroDeAlumnos {
static Scanner scanner = new Scanner (System.in);
   
    public static void main(String[] args) {
        int seguir;
        
        alumnos obj = new alumnos();
        grado ob = new grado();
        cursos obje = new cursos();
        
        do{
        System.out.println("/-----------------------------------------------------------------------------------------------------/\n"
                + "/                           BIENVENIDO AL SISTEMA DE REGISTRO DE ALUMANOS                             /\n"
                + "/-----------------------------------------------------------------------------------------------------/\n"
                + "/  A continuacion se le presenta distintas opciones escoja la opcion deseada                          /\n"
                + "/  1. Ingresar todos los datos de manera ordenada                2. Ingresar codigo de alumno         /\n"
                + "/  3. Ingresar nombre del alumno                                 4. Ingresar areas del alumno         /\n"
                + "/  5. Ingresar Correo del alumno                                 6. Ingresar Telefono del alumno      /\n"
                + "/  7. Ingrese Codigo del curso                                   8. Ingresar el nombre del curso      /\n"
                + "/  9. Ingrese Codigo del grado                                  10. Ingrese la descripcion del grado  /\n"
                + "/  11.Mostrar registros de todos los datos ordenados            12. Mostrar registros de alumno       /\n"
                + "/  13.Mostrar resgistros de los cursos                          14. Mostrar resgistros de los grados  /\n"
                + "/  15. salir del programa                                                                             /\n"
                + "/-----------------------------------------------------------------------------------------------------/\n");
        int opcion=scanner.nextInt();
        
        switch(opcion){
            case 1: 
            
                int continuar;
                do{
                    obj.codigoAlumno();
                    obj.nombreAlumno();
                    obj.areasAlumno();
                    obj.correoAlumno();
                    obj.telefonoAlumno();
                    obj.codigoCurso();
                    obj.nombreCurso();
                    ob.mostrarRegistro();
                    System.out.println("Si desea continuar registrando datos en orden ingrese 0, de lo contrario ingrese cualquier otro numero1");
                    continuar =scanner.nextInt();
                }while(continuar==0);
                break;

            case 2:
                int continuar1;
                do{
                obj.codigoAlumno();
                System.out.println("Si desea continuar registrando Codigos de alumnos ingrese 0, de lo contrario ingrese cualquier otro digito");
                continuar1 =scanner.nextInt();
                }while(continuar1==0);
                break;
            
            case 3: 
                int continuar2;
                do{
               obj.nombreAlumno();
               System.out.println("Si desea continuar registrando Nombres de alumnos ingrese 0, de lo contrario ingrese cualquier otro digito");
                continuar2 =scanner.nextInt();
                }while(continuar2==0);
                break; 
                
            case 4:
                int continuar3;
                do{
               obj.areasAlumno();
               System.out.println("Si desea continuar registrando Areas de alumnos ingrese 0, de lo contrario ingrese cualquier otro digito");
                continuar3 =scanner.nextInt();
                }while(continuar3==0);
                break; 
            case 5:
                int continuar4;
                do{
               obj.correoAlumno();
               System.out.println("Si desea continuar registrando Correos de alumnos ingrese 0, de lo contrario ingrese cualquier otro digito");
                continuar4 =scanner.nextInt();
                }while(continuar4==0);
                break; 
            case 6:
                int continuar5;
                do{
               obj.telefonoAlumno();
               System.out.println("Si desea continuar registrando Telefonos de alumnos ingrese 0, de lo contrario ingrese cualquier otro digito");
                continuar5 =scanner.nextInt();
                }while(continuar5==0);
                break; 
            case 7:
                int continuar6;
                do{
               obj.codigoCurso();
               System.out.println("Si desea continuar registrando Codigos de cursos ingrese 0, de lo contrario ingrese cualquier otro digito");
                continuar6 =scanner.nextInt();
                }while(continuar6==0);
                break;
            case 8:
                int continuar7;
                do{
               obj.nombreCurso();
               System.out.println("Si desea continuar registrando Nombres de curso ingrese 0, de lo contrario ingrese cualquier otro digito");
                continuar7 =scanner.nextInt();
                }while(continuar7==0);
                break; 
            case 9: 
                int continuar8;
                do{
               ob.codigoG();
               System.out.println("Si desea continuar registrando Codigos de grados ingrese 0, de lo contrario ingrese cualquier otro digito");
                continuar8 =scanner.nextInt();
                }while(continuar8==0);
                break; 
            case 10:
                int continuar9;
                do{
               ob.descripcion();
               System.out.println("Si desea continuar registrando descripciones de grados ingrese 0, de lo contrario ingrese cualquier otro digito");
                continuar9 =scanner.nextInt();
                }while(continuar9==0);
                break; 
            case 11:
                obj.mostrarDatos();
                ob.mostrarRegistro();
                break;
            case 12:
                obj.mostrarDatos();
                break;
            case 13:
                obje.mostrarDatos();
                break;
            case 14:
                ob.mostrarRegistro();
                break;
                
        }
        System.out.println("Si desea continuar usando el programa ingrese 0, de lo contrario ingrese 15");
        seguir =scanner.nextInt();
        }while(seguir==0);
        
        
    }
    
}
