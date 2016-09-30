/**
 * 
 */
package tests;

import static org.junit.Assert.*;

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
public class Case_SanityTests {
	
	static int key;
	static Grid g;
	static Case c;
	static Position p;

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
	 * Test method for {@link grid.model.Case#getTop(grid.model.Grid)}.
	 */
	@Test
	public final void testGetTop() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link grid.model.Case#getTopRight(grid.model.Grid)}.
	 */
	@Test
	public final void testGetTopRight() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link grid.model.Case#getRight(grid.model.Grid)}.
	 */
	@Test
	public final void testGetRight() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link grid.model.Case#getBottomRight(grid.model.Grid)}.
	 */
	@Test
	public final void testGetBottomRight() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link grid.model.Case#getBottom(grid.model.Grid)}.
	 */
	@Test
	public final void testGetBottom() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link grid.model.Case#getBottomLeft(grid.model.Grid)}.
	 */
	@Test
	public final void testGetBottomLeft() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link grid.model.Case#getLeft(grid.model.Grid)}.
	 */
	@Test
	public final void testGetLeft() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link grid.model.Case#getTopLeft(grid.model.Grid)}.
	 */
	@Test
	public final void testGetTopLeft() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link grid.model.Case#isInGrid()}.
	 */
	@Test
	public final void testIsInGrid() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link grid.model.Case#isMovable(grid.model.Grid)}.
	 */
	@Test
	public final void testIsMovable() {
		fail("Not yet implemented"); // TODO
	}

	
}
