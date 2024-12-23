package Entidades;

/**
 *
 * @author Dalton
 */
public class Aviones {

    private int id;
    private String nombre_avion;
    private String destino;
    private int tercera_edad;
    private int adultos;
    private int niños;

    public Aviones() {
    }

    public Aviones(int id, String nombre_avion, String destino, int tercera_edad, int adultos, int niños) {
        this.id = id;
        this.nombre_avion = nombre_avion;
        this.destino = destino;
        this.tercera_edad = tercera_edad;
        this.adultos = adultos;
        this.niños = niños;
    }

   

   

    public String getNombre_avion() {
        return nombre_avion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre_avion(String nombre_avion) {
        this.nombre_avion = nombre_avion;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getTercera_edad() {
        return tercera_edad;
    }

    public void setTercera_edad(int tercera_edad) {
        this.tercera_edad = tercera_edad;
    }

    public int getAdultos() {
        return adultos;
    }

    public void setAdultos(int adultos) {
        this.adultos = adultos;
    }

    public int getNiños() {
        return niños;
    }

    public void setNiños(int niños) {
        this.niños = niños;
    }
    
}
