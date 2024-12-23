package Entidades;

/**
 *
 * @author Dalton
 */
import Entidades.ejercicio_9_Personas;
import Entidades.ejercicio_9_Cuenta;

public class ejercicio_9_Principal {
  public void imprimir(String numero_cuenta){
      
      
   ejercicio_9_Cuenta Cliente_1 = new ejercicio_9_Cuenta("001",300, "Dalton", "Cornejo", "098366043");
   ejercicio_9_Cuenta Cliente_2 = new ejercicio_9_Cuenta("002",500, "Leonel", "Messi", "0994921210");
   
   Cliente_1.Transaccion(30, "Deposito");
   Cliente_1.Transaccion(10,"Retiro");
   
   Cliente_2.Transaccion(30, "Deposito");
   Cliente_2.Transaccion(20,"Retiro");
  
   Cliente_1.imprimir();
   Cliente_2.imprimir();
    }

}
