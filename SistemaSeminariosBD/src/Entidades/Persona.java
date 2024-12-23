
package Entidades;
public class Persona {
   private int IdPersona;
   private String Cedula;
   private String Nombres;
   private String Apellidos;
   private int Edad;
   private String Mail;
   private int IdSexo;
   private int IdEstado;
   public Persona() {
    }
    public Persona(int IdPersona, String Cedula, String Nombres, String Apellidos, int Edad, String Mail, int IdSexo, int IdEstado) {
        this.IdPersona = IdPersona;
        this.Cedula = Cedula;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Edad = Edad;
        this.Mail = Mail;
        this.IdSexo = IdSexo;
        this.IdEstado = IdEstado;
    }

    public int getIdPersona() {
        return IdPersona;
    }

    public void setIdPersona(int IdPersona) {
        this.IdPersona = IdPersona;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public int getIdSexo() {
        return IdSexo;
    }

    public void setIdSexo(int IdSexo) {
        this.IdSexo = IdSexo;
    }

    public int getIdEstado() {
        return IdEstado;
    }

    public void setIdEstado(int IdEstado) {
        this.IdEstado = IdEstado;
    }
   
           
}
