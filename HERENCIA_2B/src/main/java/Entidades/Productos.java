package Entidades;

/**
 *
 * @author Dalton
 */
public class Productos {
    private String nombre;
    private double precio;
    private int cantidad_productos;
    
    public double Calcular(){
        
        return 0;
    }
    
    public String toStringProductos(){
        return "Nombre del producto: "+nombre+
               "\nCantidad de productos: "+cantidad_productos+
               "\nPrecio del producto: "+precio;
    }

    public Productos() {
    }

    public int getCantidad_productos() {
        return cantidad_productos;
    }

    public void setCantidad_productos(int cantidad_productos) {
        this.cantidad_productos = cantidad_productos;
    }

    public Productos(String nombre, double precio,int cantidad_productos) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad_productos=cantidad_productos;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
