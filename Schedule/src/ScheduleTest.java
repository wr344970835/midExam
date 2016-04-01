import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class ScheduleTest {
	
	 Schedule sch = new Schedule();
	 Work wor = new Work("a", 0, 2);
	 Work wor2 = new Work("b", 1, 1);
	 Work wor3 = new Work("c", 2, 1); 
	 Work wor4 = new Work("a", 0, 2); 
	 Work wor5 = new Work("b", 1, 2); 
	 Work wor6 = new Work("c", 2, 1); 
	
	@Test
	public void testFCFS() {
		List d1 = new ArrayList();
		d1.add(2);
		d1.add(1.667);
		ArrayList<Work> xx = new ArrayList<Work>();
		xx.add(wor);
		xx.add(wor2);
		xx.add(wor3);
		assertEquals(d1, sch.FCFS(xx));
	}

	@Test
	public void testSJF() {
		List d2 = new ArrayList();
		d2.add(2.333);
		d2.add(1.333);	
		ArrayList<Work> xx2 = new ArrayList<Work>();
		xx2.add(wor4);
		xx2.add(wor5);
		xx2.add(wor6);
		assertEquals(d2, sch.SJF(xx2));
	}

}