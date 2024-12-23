package ENTIDADES;

public abstract class LEGISLADOR extends PERSONA {
    private String ProvinciaRepresenta;
    private String PartidoPolitico;
    private String NumOficina;

    public LEGISLADOR() {
    }

    public LEGISLADOR(String IdCodigo, String Cedula, String Nombre, String Apellido, int Edad, String Tipo, String ProvinciaRepresenta, String PartidoPolitico, String NumOficina) {
        super(IdCodigo, Cedula, Nombre, Apellido, Edad, Tipo);
        this.ProvinciaRepresenta = ProvinciaRepresenta;
        this.PartidoPolitico = PartidoPolitico;
        this.NumOficina = NumOficina;
    }

    public String getProvinciaRepresenta() {
        return ProvinciaRepresenta;
    }

    public String getPartidoPolitico() {
        return PartidoPolitico;
    }

    public String getNumOficina() {
        return NumOficina;
    }

    public void setProvinciaRepresenta(String ProvinciaRepresenta) {
        this.ProvinciaRepresenta = ProvinciaRepresenta;
    }

    public void setPartidoPolitico(String PartidoPolitico) {
        this.PartidoPolitico = PartidoPolitico;
    }

    public void setNumOficina(String NumOficina) {
        this.NumOficina = NumOficina;
    }

    
    
    public abstract double ProyectoPresentado();
    public abstract double Sueldo();
    
    
}
