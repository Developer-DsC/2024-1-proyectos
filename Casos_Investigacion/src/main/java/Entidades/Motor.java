package Entidades;

/**
 *
 * @author Dalton
 */

// Clase Motor
public class Motor {
    private int numeroCilindros;
    private String tipoCombustible;

    // Constructor
    public Motor(int numeroCilindros, String tipoCombustible) {
        this.numeroCilindros = numeroCilindros;
        this.tipoCombustible = tipoCombustible;
    }

    public int getNumeroCilindros() {
        return numeroCilindros;
    }

    public void setNumeroCilindros(int numeroCilindros) {
        this.numeroCilindros = numeroCilindros;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

}



