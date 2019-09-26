package test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;

import com.pgnb.worldclock.MoscowClock;

class MoscowClockTest {

	@Test
	void testSetTimeByBeijing() {
		MoscowClock Moscowclock =new MoscowClock();
		SimpleDateFormat df3 = new SimpleDateFormat("HH:mm:ss");
		try {
			Moscowclock.SetTimeByBeijing(df3.parse("12:43:37"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String testdate=df3.format(Moscowclock.GetTime());
		assertNotNull(testdate);
		assertEquals("08:43:37",testdate);
	}

}
