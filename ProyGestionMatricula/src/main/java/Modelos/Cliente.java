package Modelos;

/**
 * Modelo de Cliente *
 * @author Dalton Cornejo
 * @date 2023/02/16
 * @version 1.0
 */
public class Cliente {
    //Cedula,Nombre, Apellido, Telefono, Email, Nacionalidad,Año
    //datos globales
    public String Cedula;
    public String Nombre;
    public String Apellido;
    public String Telefono;
    public String Email;
    public String Nacionalidad;                 
    public String Año;
            
    //metodos contructores
    
    //contructor vacio
    public Cliente() {
    }
    //contructor con parametros

    public Cliente(String Cedula, String Nombre, String Apellido, String Telefono, String Email, String Nacionalidad, String Año) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
        this.Email = Email;
        this.Nacionalidad = Nacionalidad;
        this.Año = Año;
    }
    
            
}
