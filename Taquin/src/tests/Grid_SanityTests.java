/**
 * 
 */
package tests;

import static org.junit.Assert.fail;

import java.util.Random;

import org.junit.BeforeClass;
import org.junit.Test;

import grid.model.Case;
import grid.model.Grid;
import grid.model.Position;

/**
 * @author adrianpothuaud
 *
 */
public class Grid_SanityTests {
	
	static Grid g;
	static Case c;
	static Position p;
	static int key;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		key = new Random().nextInt() % 16;
		g = new Grid();
		c = g.getCaseByKey(key);
		p = c.getPos();
	}

	/**
	 * Test method for {@link grid.model.Grid#getCaseByKey(int)}.
	 */
	@Test
	public final void testGetCaseByKeyInt() {
		assert(g.getCaseByKey(key)==c);
	}

	/**
	 * Test method for {@link grid.model.Grid#getCaseByPos(grid.model.Position)}.
	 */
	@Test
	public final void testGetCaseByPosPosition() {
		assert(g.getCaseByPos(p)==c);
	}
	
	/**
	 * Test method for {@link grid.model.Grid#permute(grid.model.Case)}.
	 */
	@Test
	public final void testPermute() {
		fail("Not yet implemented"); // TODO
	}


}
