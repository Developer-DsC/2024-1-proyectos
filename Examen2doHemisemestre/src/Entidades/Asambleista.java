package Entidades;

import Entidades.Persona;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author
 */
public class Asambleista extends Legislador {

    private double Sueldo;
    private int proyecto;
    double valorPP = 0;
    double DescuentoIESS = 0.932;
    double p_aprob = 0, p_desaprob = 0;

    public Asambleista() {
        super();
    }

    public Asambleista(double Sueldo, int proyecto, String provinciaRepresenta, String partidoPolitico, int num_oficina, int idCodigo, String cedula, String Nombre, String Apellido, Date FechaNacimiento, String Estado) {
        super(provinciaRepresenta, partidoPolitico, num_oficina, idCodigo, cedula, Nombre, Apellido, FechaNacimiento, Estado);
        this.Sueldo = Sueldo;
        this.proyecto = proyecto;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public double getProyecto() {
        return proyecto;
    }

    public void setProyecto(int proyecto) {
        this.proyecto = proyecto;
    }

    @Override
    public double ProyectoPresentado() {
        int aprobado = 0;
        int desaprobado = 0;

        for (int i = 1; i <= proyecto; i++) {
            int cantidad = JOptionPane.showConfirmDialog(null, "¿Aprobar el proyecto #" + i + "?");
            if (cantidad == 0) {
                aprobado++;
                valorPP = aprobado;
            } else {
                desaprobado++;
            }

            p_aprob = (aprobado * 100) / (aprobado + desaprobado);
            p_desaprob = (desaprobado * 100) / (aprobado + desaprobado);
        }
        return aprobado;
    }

    @Override
    public double CalcularSueldo() {

        double sueldototal = (Sueldo - (Sueldo * 0.0932)) + (valorPP * 400);
        return sueldototal;

    }

    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null, imprimirPersona() + "\nTipo: Asambleista"
                + "\nDescontado por el IESS: 9.32%"
                + "\nSueldo: " + Sueldo
                + "\nBonificación de proyectos aprobados: " + (valorPP * 1000)
                + "\nTotal: " + CalcularSueldo()
                + "\nPromedio de proyectos aprobados= " + p_aprob
                + "\nPromedio de proyectos desaprobados= " + p_desaprob);
    }

}
