package Controladores;
/**
 * Clase Comun contiene los metodos globales a todos los controladores
 * @author Gabriel
 * @date 2023/02/16
 * @version 1.0
 */
import java.io.File;

public class Global {

	//obtiene ruta del c�digo fuente del Proyecto
    public static String getPath(){
        
        //extraer ruta del proyecto de forma din�mica
        File currDir = new File(".");
        String path = currDir.getAbsolutePath();
        
        //eliminar los dos caracteres del final del path
        path=path.substring(0,path.length()-2);
        path+="\\src\\main\\java\\";
        System.out.println("Path del Proyecto " + path);
        return path;
    }



}
