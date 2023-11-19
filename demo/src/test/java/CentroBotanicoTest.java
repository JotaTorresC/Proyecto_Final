import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;
import com.example.Plantas;
import com.example.Botanico;
import com.example.CentroBotanico;

public class CentroBotanicoTest {
    //test de agregar plantas
    @Test
    public void testAgregarPlanta() {
        
        CentroBotanico Centro = new CentroBotanico();
        Plantas planta1 = new Plantas("Rosa", "Flor");
        Plantas planta2 = new Plantas("Pino", "arbol");
        
        Centro.agregarPlanta(planta1);
        Centro.agregarPlanta(planta2);
        List<Plantas> inventario = Centro.getInventarioPlantas();
        assertTrue(inventario.contains(planta1));
        assertTrue(inventario.contains(planta2));
        
    }
    //test de agregar botanico
    @Test
    public void testAgregarBotanico(){
        CentroBotanico Centro = new CentroBotanico();
        Botanico botanico1 = new Botanico(1, "Juan",  "juan@example.com", 12345678);
        Botanico botanico2 = new Botanico(2, "María", "maria@example.com", 987654321);
        Centro.agregarBotanico(botanico1);
        Centro.agregarBotanico(botanico2);
        List<Botanico> inventario = Centro.getBotanico();
        assertTrue(inventario.contains(botanico1));
        assertTrue(inventario.contains(botanico2));
    }
    
}
