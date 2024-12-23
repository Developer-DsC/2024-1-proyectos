package Entidades;

/**
 *
 * @author Dalton
 */
import Entidades.ejercicio_9_Personas;
import Entidades.ejercicio_9_Principal;

import javax.swing.JOptionPane;

public class ejercicio_9_Cuenta extends ejercicio_9_Personas {

    private String numeroCuenta;
    private double Saldo;
    private ejercicio_9_Personas Propietario = null;

    public ejercicio_9_Cuenta() {
    }

    public ejercicio_9_Cuenta(String numeroCuenta, double Saldo) {
        this.numeroCuenta = numeroCuenta;
        this.Saldo = Saldo;
    }

    public ejercicio_9_Cuenta(String numeroCuenta, double Saldo, String nombre, String apellido, String telefono) {
        super(nombre, apellido, telefono);
        this.numeroCuenta = numeroCuenta;
        this.Saldo = Saldo;
    }

   

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public ejercicio_9_Personas getPropietario() {
        return Propietario;
    }

    public void setPropietario(ejercicio_9_Personas Propietario) {
        this.Propietario = Propietario;
    }

    private double Validar_Saldo(double cantidad) {

        if (cantidad < 0) {
            System.out.println("La canidad es invalida");
        }
        return cantidad;
    }

    public void Transaccion(double cantidad, String tipo) {
        if (tipo.equals("Retiro")) {
            if (this.Saldo < cantidad) {
                JOptionPane.showMessageDialog(null, "Saldo insuficiente");
            } else {
                this.Saldo = this.Saldo - cantidad;
                JOptionPane.showMessageDialog(null, "Retiro realizado con exito" + " Saldo actual: " + this.Saldo);
            }
        } else if (tipo.equals("Deposito")) {
            this.Saldo = this.Saldo + cantidad;
            JOptionPane.showMessageDialog(null, "Deposito exitoso " + "Saldo actual:  " + this.Saldo);
        }
    }
    
    public void imprimir(){
      JOptionPane.showMessageDialog(null, toString());
    }
    @Override
    public String toString() {
        return "Cuenta:" + "\nSaldo= " + Saldo + "\nNúmero de cuenta= " + numeroCuenta + "\nPropietario=" + Propietario;
    }

}
