package Entidades;


public class Asambleista extends LEGISLADOR {
    private double Presentado;
    private double Aprobado;
    private double Mensualidad;

    public Asambleista() {
    }

    public Asambleista(String IdCodigo, String Cedula, String Nombre, String Apellido, int Edad, String Tipo, String ProvinciaRepresenta, String PartidoPolitico, String NumOficina, double Presentado, double Aprobado, double Mensualidad) {
        super(IdCodigo, Cedula, Nombre, Apellido, Edad, Tipo, ProvinciaRepresenta, PartidoPolitico, NumOficina);
        this.Presentado = Presentado;
        this.Aprobado = Aprobado;
        this.Mensualidad = Mensualidad;
    }

    public double getPresentado() {
        return Presentado;
    }

    public double getAprobado() {
        return Aprobado;
    }

    public double getMensualidad() {
        return Mensualidad;
    }

    public void setPresentado(double Presentado) {
        this.Presentado = Presentado;
    }

    public void setAprobado(double Aprobado) {
        this.Aprobado = Aprobado;
    }

    public void setMensualidad(double Mensualidad) {
        this.Mensualidad = Mensualidad;
    }

    
    
    
    
    @Override
    public double ProyectoPresentado(){
        if(Presentado >0){
            Aprobado= +1;
        }
        return Aprobado;
    }
    
    @Override
    public double Sueldo(){
        double pago= 0;
        if(getEdad() >= 60){
        if(Aprobado > 0){
         pago= (((Mensualidad)*0.9068)+(Aprobado*1000))+450;   
        }else{
         pago= (((Mensualidad)*0.9068))+450;   
        }
        }else{
           if(Aprobado > 0){
         pago= ((Mensualidad)*0.9068)+(Aprobado*1000);   
        }else{
         pago= ((Mensualidad)*0.9068);   
        } 
        }
        return pago;
    }
}
