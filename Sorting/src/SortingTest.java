import static org.junit.Assert.*;
import org.junit.Test;

public class SortingTest {
	
	private Sorting sor = new Sorting();
	private int []a = {7,5,6,2,4,5,3,4,8,5,6,5,2};
	private Object []b = {'a','b','c'};
	private Object []c = {'b','a','c'};
	
	@Test
	public void testInsertionSort() {
		sor.insertionSort(a);
		assertEquals(true, sor.isSorted(a));
	}

	@Test
	public void testQuicksort() {
		sor.quicksort(a);
		assertEquals(true, sor.isSorted(a));
	}
	
	@Test
	public void testswapReferences(){
		sor.swapReferences(b, 0, 1);
		assertArrayEquals(c, b);
	}
}