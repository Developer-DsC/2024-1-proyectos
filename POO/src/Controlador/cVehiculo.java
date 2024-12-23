package Controlador;
/**
 * @author Dalton
 */
import Modelo.Vehiculo;
import java.util.ArrayList;
public class cVehiculo {
    ArrayList<Vehiculo> Lista = new ArrayList<>();
    
public int conteo() {
    return Lista.size();
}

public void limpiar() {
Lista.clear();
}

public void ingresar(Vehiculo e){
int pos = localizar (e.modelo);
}

public int localizar(String modelo){
int pos = -1;
for (int i=0; i<conteo(); i++){
    Vehiculo e = getVehiculo (i);
    return 0;
}

}
}
