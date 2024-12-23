package Entidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Dalton
 */
public class Fechas {

    /**
     * @param args the command line arguments
     */
    
    public int Dias(Date fi,Date ff)
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
     //   Date fechaInicial=dateFormat.parse("2016-02-14");
	//Date fechaFinal=dateFormat.parse("2016-03-22");
        int dias=(int) ((fi.getTime()-ff.getTime())/86400000);
 	return dias;
       
    }
}

