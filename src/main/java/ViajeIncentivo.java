
import java.util.Date;

/**
 *
 * @author Daniel Cisneros
 */
public class ViajeIncentivo extends Viaje {
/**
* Empresa que patrocina el viaje al empleado
*/
private String empresa;

    ViajeIncentivo(String popayán, String medellin, int i, Date parse, Date parse0, String emtel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
//Constructor, getters and setters
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
@Override
public String descripcion() {
return "Viaje incentivo que te envia la empresa " + empresa;
}
public String cualquierMetodo2() {
return "Método implementado en la clase hija viaje de incentivo";
}
}
