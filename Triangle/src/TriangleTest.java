import static org.junit.Assert.*;
import org.junit.Test;

public class TriangleTest {
	private Triangle tri = new Triangle(3, 3, 3);
	private Triangle tri2 = new Triangle(3, 3, 5);
	private Triangle tri3 = new Triangle(3, 4, 5);
	private Triangle tri4 = new Triangle(3, 3, 10);
	private Triangle tri5 = new Triangle(-1, 3, 3);
	private long[]a = {3,3,3};
	@Test
	public void testGetType() {
		assertEquals("Illegal", tri4.getType(tri4));
		assertEquals("Illegal", tri5.getType(tri5));
		assertEquals("Regular", tri.getType(tri));
		assertEquals("Scalene", tri3.getType(tri3));
		assertEquals("Isosceles", tri2.getType(tri2));
	}

	@Test
	public void testGetBorders() {
		assertArrayEquals(a, tri.getBorders());
	}

}