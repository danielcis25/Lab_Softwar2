
import java.util.Date;


/**
 *
 * @author Daniel Cisneros
 */
public class ViajeFamiliar extends Viaje {
/**
* Cantidad de integrantes de la familia
*/
private int familia;

    ViajeFamiliar(String popayán, String bogotá, int i, Date parse, Date parse0, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
//Constructor getters and setters
    public int getFamilia() {
        return familia;
    }

    public void setFamilia(int familia) {
        this.familia = familia;
    }
@Override
public String descripcion() {
return "Viaje para disfrutar con toda tu familia";
}
@Override
public String cualquierMetodo2() {
return "Método implementado en la clase hija viaje familiar";
}
}
