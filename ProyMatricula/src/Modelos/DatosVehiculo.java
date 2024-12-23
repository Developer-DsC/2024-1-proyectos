package Modelos;

/**
 *
 * @author Dalton
 */
public class DatosVehiculo {

    public static String Cedula;
    public static String placa;
    public static String cliente;
    public static int año;
    public static String marca;
    public static String modelo;
    public static String cilindraje;
    public static String año_modelo;
    public static String tipo;
    public static String clase;
    public static String toneladas;
    public static String pais_origen;
    public static String combustible;
    public static String color_1;
    public static String color_2;

    public DatosVehiculo() {

    }

    public DatosVehiculo(String Cedula, String placa, String cliente, int año, String marca, String modelo, String cilindraje, String año_modelo, String tipo, String clase, String toneladas, String pais_origen, String combustible, String color_1, String color_2) {
      
        this.Cedula=Cedula;
        this.placa = placa;
        this.cliente = cliente;
        this.año = año;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
        this.año_modelo = año_modelo;
        this.tipo = tipo;
        this.clase = clase;
        this.toneladas = toneladas;
        this.pais_origen = pais_origen;
        this.combustible = combustible;
        this.color_1 = color_1;
        this.color_2 = color_2;
    }

}
