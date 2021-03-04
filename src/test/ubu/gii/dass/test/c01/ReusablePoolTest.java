/**
 * 
 */
package ubu.gii.dass.test.c01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ubu.gii.dass.c01.DuplicatedInstanceException;
import ubu.gii.dass.c01.NotFreeInstanceException;
import ubu.gii.dass.c01.Reusable;
import ubu.gii.dass.c01.ReusablePool;

/**
 * @author jmg0136
 *
 */
public class ReusablePoolTest {
	
	private ReusablePool pool;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		pool = ReusablePool.getInstance();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		pool = null;
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#getInstance()}.
	 */
	@Test
	public void testGetInstance() {
		ReusablePool pool = ReusablePool.getInstance();
		// Se comprueba que no es nulo
		assertNotNull(pool);
		// Se comprueba que el objeto devuelto es una instancia de ReusablePool
		assertTrue(pool instanceof ReusablePool);
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#acquireReusable()}.
	 */
	@Test
	public void testAcquireReusable() {
		Reusable o1 = null, o2 = null, o3 = null; // Creamos tres objetos vacíos
		
		try {
			o1 = pool.acquireReusable();		// Solicitamos el primero
			assertNotNull(o1);					// Comprobamos que ya no sea nulo
			assertTrue(o1 instanceof Reusable);	// Comprobamos el tipo
			
			o2 = pool.acquireReusable();					// Solicitamos el segundo
			assertNotNull(o2);								// Comprobamos que ya no sea nulo
			assertTrue(o2 instanceof Reusable);				// Comprobamos el tipo
			assertFalse(o1.hashCode() == o2.hashCode());	// Comprobamos que no sean el mismo objeto
			
			o3 = pool.acquireReusable(); // Solicitamos un tercero inexistente para forzar NotFreeInstanceException
		} catch (NotFreeInstanceException e) {
			assertNull(o3); // Comprobamos si el objeto existe, es decir, no es nulo
		}
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#releaseReusable(ubu.gii.dass.c01.Reusable)}.
	 * @throws NotFreeInstanceException 
	 */
	@Test
	public void testReleaseReusable() throws NotFreeInstanceException {
		Reusable o1 = null, o2 = null, o3 = null; // Creamos tres objetos vacíos
		int hashId = 0;
		
		try {
			o1 = pool.acquireReusable();	// Solicitamos el primero
			hashId = o1.hashCode();			// Guardamos su identificador
			pool.releaseReusable(o1);		// Liberamos el objeto
			
			o2 = pool.acquireReusable();			// Solicitamos el segundo
			assertTrue(hashId == o2.hashCode());	// Comprobamos que coinciden
			
			pool.releaseReusable(o2);	// Liberamos el objeto
			pool.releaseReusable(o2);	// Forzamos la excepción DuplicatedInstanceException
		
		} catch (DuplicatedInstanceException e){
			assertTrue(hashId == o2.hashCode()); // Comprobamos que efectivamente es la misma instancia
		}
	}

}
