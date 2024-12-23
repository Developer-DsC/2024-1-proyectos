package Modelos;

public class DatosVehiculo {

   
    public String placa;
    public String marca;
    public String modelo;
    public String cilindraje;
    public String año_modelo;
    public String tipo;
    public String clase;
    public String toneladas;
    public String pais_de_origen;
    public String combustible;
    public String color_1;
    public String color_2;
    //metodos contructores

    //contructor vacio
    public DatosVehiculo() {
    }

    public DatosVehiculo(String placa, String marca, String modelo, String cilindraje, String año_modelo, String tipo, 
           String clase, String toneladas, String pais_de_origen, String combustible,String color_1, String color_2) {
        
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
        this.año_modelo = año_modelo;
        this.tipo = tipo;
        this.clase = clase;
        this.toneladas = toneladas;
        this.pais_de_origen = pais_de_origen;
        this.combustible = combustible;
        this.color_1 = color_1;
        this.color_2 = color_2;
    }
}