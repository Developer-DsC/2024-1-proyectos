package ENTIDADES;

import java.util.Date;

/**
 *
 * @author Dalton
 */
public class Trabajadores extends Persona{
    private int tipo;

    public Trabajadores() {
        super();
    }

    public Trabajadores(int tipo, String idCodigo, String Nombres, String Apellidos, String Sexo, Date Fech_Nacimiento, String Estado) {
        super(idCodigo, Nombres, Apellidos, Sexo, Fech_Nacimiento, Estado);
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    public double Calcular_Sueldo(){
        return 0;
    }
    
    public void imprimir(){
        imprimirPersona();
    }
    
    
    
}
