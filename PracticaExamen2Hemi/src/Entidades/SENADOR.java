package Entidades;

public class SENADOR extends LEGISLADOR{
    private double Mensualidad;
    private double Comisiones;
    private double Presentado;
    private double Aprobado;

    public SENADOR() {
    }

    public SENADOR(String IdCodigo, String Cedula, String Nombre, String Apellido, int Edad, String Tipo, String ProvinciaRepresenta, String PartidoPolitico, String NumOficina, double Mensualidad, double Comisiones, double Presentado, double Aprobado) {
        super(IdCodigo, Cedula, Nombre, Apellido, Edad, Tipo, ProvinciaRepresenta, PartidoPolitico, NumOficina);
        this.Mensualidad = Mensualidad;
        this.Comisiones = Comisiones;
        this.Presentado = Presentado;
        this.Aprobado = Aprobado;
    }

    public double getMensualidad() {
        return Mensualidad;
    }

    public double getComisiones() {
        return Comisiones;
    }

    public double getPresentado() {
        return Presentado;
    }

    public double getAprobado() {
        return Aprobado;
    }

    public void setMensualidad(double Mensualidad) {
        this.Mensualidad = Mensualidad;
    }

    public void setComisiones(double Comisiones) {
        this.Comisiones = Comisiones;
    }

    public void setPresentado(double Presentado) {
        this.Presentado = Presentado;
    }

    public void setAprobado(double Aprobado) {
        this.Aprobado = Aprobado;
    }
    
    
    @Override
    public double ProyectoPresentado(){
        if(Presentado >0){
            Aprobado= +1;
        }
        return Aprobado;
    }
    
    public double Sueldo(){
        double pago= 0;
        if(getEdad() >= 60){
            pago= ((Mensualidad+Comisiones)*0.9068)+450;
        }else{
            pago= (Mensualidad+Comisiones)*0.9068;
        } 
        return pago;
    }
}
