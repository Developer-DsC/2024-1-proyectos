/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Gabriel
 */
public class Vehiculo {

    private int idVehiculo;
    private String Placa;
    private int idClase;
    private int idTipo;
    private String Color1;
    private String Color2;
    private int idCombustible;
    private String NumMotor;
    private String Marca;
    private String Modelo;
    private int Año;
    private String Cilindraje;
    private int Peso;
    private int idPersona;

    public Vehiculo() {
    }

    public Vehiculo(int idVehiculo, String Placa, int idClase, int idTipo, String Color1, String Color2, int idCombustible, String NumeroMotor, String Marca, String Modelo, int Año, String Cilindraje, int Peso, int idPersona) {
        this.idVehiculo = idVehiculo;
        this.Placa = Placa;
        this.idClase = idClase;
        this.idTipo = idTipo;
        this.Color1 = Color1;
        this.Color2 = Color2;
        this.idCombustible = idCombustible;
        this.NumMotor = NumeroMotor;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Año = Año;
        this.Cilindraje = Cilindraje;
        this.Peso = Peso;
        this.idPersona = idPersona;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getColor1() {
        return Color1;
    }

    public void setColor1(String Color1) {
        this.Color1 = Color1;
    }

    public String getColor2() {
        return Color2;
    }

    public void setColor2(String Color2) {
        this.Color2 = Color2;
    }

    public int getIdCombustible() {
        return idCombustible;
    }

    public void setIdCombustible(int idCombustible) {
        this.idCombustible = idCombustible;
    }

    public String getNumMotor() {
        return NumMotor;
    }

    public void setNumMotor(String NumMotor) {
        this.NumMotor = NumMotor;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public String getCilindraje() {
        return Cilindraje;
    }

    public void setCilindraje(String Cilindraje) {
        this.Cilindraje = Cilindraje;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

}
