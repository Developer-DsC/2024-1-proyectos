package Entidades;

import Entidades.Persona;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */

public abstract class Legislador extends Persona {

    private String provinciaRepresenta;
    private String partidoPolitico;
    private int num_oficina;

    public Legislador() {
        super();
    }

    public Legislador(String provinciaRepresenta, String partidoPolitico, int num_oficina, int idCodigo, String cedula, String Nombre, String Apellido, Date FechaNacimiento, String Estado) {
        super(idCodigo, cedula, Nombre, Apellido, FechaNacimiento, Estado);
        this.provinciaRepresenta = provinciaRepresenta;
        this.partidoPolitico = partidoPolitico;
        this.num_oficina = num_oficina;
    }

    public String getProvinciaRepresenta() {
        return provinciaRepresenta;
    }

    public void setProvinciaRepresenta(String provinciaRepresenta) {
        this.provinciaRepresenta = provinciaRepresenta;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public int getNum_oficina() {
        return num_oficina;
    }

    public void setNum_oficina(int num_oficina) {
        this.num_oficina = num_oficina;
    }

    public abstract double ProyectoPresentado();

    public abstract double CalcularSueldo();

    public void imprimir() {
        imprimirPersona();
    }

}
