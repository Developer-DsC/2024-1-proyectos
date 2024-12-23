package Entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class Articulos {
    private int codigo;
    private int cantidad;

    public Articulos() {
    }

    public Articulos(int cod, int cant) {
        this.codigo = cod;
        this.cantidad = cant;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void  Calcular(int cod, int cant){
        
        if(codigo==1){
            System.out.println("If funcó");
        int entero = (int) cant / 12;
        int residuo = (int) cant % 12;
        double preciouni= residuo*10;
        double preciocajas= entero*100;
        double precio = preciocajas+preciouni;
        
            JOptionPane.showMessageDialog(null,"Número de cajas: "+entero+
                                                            "\nTotal de unidades: "+ residuo+
                                                            "\nPrecio unidades: "+ preciouni+
                                                            "\nPrecio cajas: "+ preciocajas+
                                                            "\nPrecio: "+ precio);
        }
        
        if(codigo==2){
            System.out.println("If funcó");
        int entero = (int) cant / 12;
        int residuo = (int) cant % 12;
        double preciouni= residuo*2;
        double preciocajas= entero*50;
        double precio = preciocajas+preciouni;
        
            JOptionPane.showMessageDialog(null,"Número de cajas: "+entero+
                                                            "\nTotal de unidades: "+ residuo+
                                                            "\nPrecio unidades: "+ preciouni+
                                                            "\nPrecio cajas: "+ preciocajas+
                                                            "\nPrecio: "+ precio);
        }
        
         if(codigo==3){
            System.out.println("If funcó");
        int entero = (int) cant / 12;
        int residuo = (int) cant % 12;
        double preciouni= residuo*10;
        double preciocajas= entero*100;
        double precio = (entero*50) +(residuo*2);
        
            JOptionPane.showMessageDialog(null,"Número de cajas: "+entero+
                                                            "\nTotal de unidades: "+ residuo+
                                                            "\nPrecio unidades: "+ preciouni+
                                                            "\nPrecio cajas: "+ preciocajas+
                                                            "\nPrecio: "+ precio);   
        }
         
          if(codigo==4){
            System.out.println("If funcó");
        int entero = (int) cant / 12;
        int residuo = (int) cant % 12;
        double preciouni= residuo*10;
        double preciocajas= entero*100;
        double precio = (entero*50) +(residuo*2);
        
            JOptionPane.showMessageDialog(null,"Número de cajas: "+entero+
                                                            "\nTotal de unidades: "+ residuo+
                                                            "\nPrecio unidades: "+ preciouni+
                                                            "\nPrecio cajas: "+ preciocajas+
                                                            "\nPrecio: "+ precio);
        }
    }
    
    
    }
