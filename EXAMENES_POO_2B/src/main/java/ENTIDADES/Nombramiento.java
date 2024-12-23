package ENTIDADES;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class Nombramiento extends Trabajadores{
    private double salario;
    private double anticipo;
    private double descuento;

    public Nombramiento() {
        super();
    }

    public Nombramiento(double salario, double anticipo, double descuento, int tipo, String idCodigo, String Nombres, String Apellidos, String Sexo, Date Fech_Nacimiento, String Estado) {
        super(tipo, idCodigo, Nombres, Apellidos, Sexo, Fech_Nacimiento, Estado);
        this.salario = salario;
        this.anticipo = anticipo;
        this.descuento = descuento;
    }

  

  

    public double getAnticipo() {
        return anticipo;
    }

    public void setAnticipo(double anticipo) {
        this.anticipo = anticipo;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    public void validar_anticipo(){
        if(anticipo>(salario/2)){
            JOptionPane.showMessageDialog(null, "El anticipo es mayor que el 50% del sueldo base");
        }
    }
    
    @Override
    
    public double Calcular_Sueldo(){
         if(anticipo>(salario/2)){
            anticipo=anticipo-(salario/2);
        }
        salario= salario-(salario*0.0932);
        System.out.println("descuento: "+descuento);
        double salariototal=salario-anticipo;
        
        return salariototal;
    }
    
    @Override
    public void imprimir(){
        if(anticipo>(salario/2)){
            anticipo=anticipo-(salario/2);
        }
         JOptionPane.showMessageDialog(null, 
                 imprimirPersona() 
                + "\nTipo: Nombramiento"
                + "\nDescontado por el IESS: 9.32%"
                +"\nDescontado: "+salario*0.0932        
                + "\nSueldo: " + salario
                + "\nAnticipo: " + anticipo
                + "\nTotal: " + Calcular_Sueldo());
    }
 
    
}
