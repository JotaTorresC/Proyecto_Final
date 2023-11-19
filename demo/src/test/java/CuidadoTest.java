import static org.junit.Assert.*;
import org.junit.Test;


import com.example.Cuidado;

public class CuidadoTest {
    //test de cambiar estado
    @Test
    public void testEstados() {
        
        Cuidado cuidado = new Cuidado();
        cuidado.estadoPendiente();
        assertEquals("PENDIENTE", cuidado.getEstado());
        cuidado.estadoEnProceso();
        assertEquals("EN PROCESO", cuidado.getEstado());
        cuidado.estadoFinalizado();
        assertEquals("FINALIZADO", cuidado.getEstado());
        cuidado.estadoAplazado();
        assertEquals("APLAZADO", cuidado.getEstado());
    }
    
}
