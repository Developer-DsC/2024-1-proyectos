package Entidades;

import java.util.Date;

/**
 *
 * @author Dalton
 */

public abstract class Trabajadores_T1H2 extends Persona_T1H2{
    private int tipo;

    public Trabajadores_T1H2() {
        super();
    }

    public Trabajadores_T1H2(int tipo, String idCodigo, String Nombres, String Apellidos, String Sexo, Date Fech_Nacimiento, String Estado) {
        super(idCodigo, Nombres, Apellidos, Sexo, Fech_Nacimiento, Estado);
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    public abstract double Calcular_Sueldo();
    
    public abstract void imprimir();
    
    
    
}
