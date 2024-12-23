package Modelos;

public class Curso {

    public String Codigo;
    public String Nivel;
    public int Orden; //numero de orden de los niveles
    public String Periodo;
    public String Paralelo;
    public String Aula; //numero de orden de los niveles
    public String Instructor;
    //constructores

    public Curso() {
    }

    public Curso(String codigo, String nivel, int orden, String periodo,
            String paralelo, String aula, String instructor) {
        super();
        Codigo = codigo;
        Nivel = nivel;
        Orden = orden;
        Periodo = periodo;
        Paralelo = paralelo;
        Aula = aula;
        Instructor = instructor;
    }
}
