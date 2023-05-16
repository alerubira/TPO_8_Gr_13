
package Principal;

import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.sql.Date;

/**
 *
 * @author Gabriel
 */
public class Principal {

       public static void main(String[] args) {
        Alumno a=new Alumno(12,"ale","Rubira",268334658,new Date(1979/01/18),true);
        Materia m=new Materia(1,"Matematicas",true,1);
        Inscripcion i= new Inscripcion(2,a.getId_Alumno(),m.getId_Materia(),10);
           System.out.println(i);
           System.out.println(a);
           System.out.println(m);
    }
    
}
