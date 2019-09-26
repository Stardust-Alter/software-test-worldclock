package test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;


import com.pgnb.worldclock.NewYorkClock;

class NewYorkClockTest {

	@Test
	void testSetTimeByBeijing() {
		NewYorkClock NewYorkclock =new NewYorkClock();
		SimpleDateFormat df3 = new SimpleDateFormat("HH:mm:ss");
		try {
			NewYorkclock.SetTimeByBeijing(df3.parse("12:43:37"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String testdate=df3.format(NewYorkclock.GetTime());
		assertNotNull(testdate);
		assertEquals("23:43:37",testdate);
	}

}
