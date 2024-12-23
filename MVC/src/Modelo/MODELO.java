package Modelo;

/**
 *
 * @author Dalton
 */
public class MODELO {
    private int numero1;
    private int numero2;
    private int resultado;

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public int getResultado() {
        return resultado;
    }
    
    public int multiplicar() {
        this.resultado= this.numero1 * this.numero2;
    return this.resultado;
    }
   
}

