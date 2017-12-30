import static org.junit.Assert.*;
import org.junit.Test;

public class HistogramaTest {
	Histograma histograma = new Histograma();
	
	@Test
	public void cantMateriasSolicitantes1() {
		histograma.agregarSolicitud("a", "lunes", 8, 10);
		histograma.agregarSolicitud("b", "lunes", 9, 11);
		histograma.agregarSolicitud("c", "lunes", 8, 12);		
	
		// Horarios normales.
		assertEquals(0,histograma.cantMateriasSolicitantes("lunes", 7));
		assertEquals(2,histograma.cantMateriasSolicitantes("lunes", 8));
		assertEquals(3,histograma.cantMateriasSolicitantes("lunes", 9));
		assertEquals(2,histograma.cantMateriasSolicitantes("lunes", 10));
		assertEquals(1,histograma.cantMateriasSolicitantes("lunes", 11));
		assertEquals(0,histograma.cantMateriasSolicitantes("lunes", 12));
		assertEquals(2,histograma.cantMateriasSolicitantes("lunes", 8));
		assertEquals(3,histograma.cantMateriasSolicitantes("lunes", 9));	
	}
	
	public void cantMateriasSolicitantes2() {
		assertNotEquals(3,histograma.cantMateriasSolicitantes("martes", 9));
		assertNotEquals(3,histograma.cantMateriasSolicitantes("martes", 10));
	}
}