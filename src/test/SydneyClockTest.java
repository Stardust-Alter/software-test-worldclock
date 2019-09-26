package test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;

import com.pgnb.worldclock.SydneyClock;

class SydneyClockTest {

	@Test
	void testSetTimeByBeijing() {
		SydneyClock Sydneyclock =new SydneyClock();
		SimpleDateFormat df3 = new SimpleDateFormat("HH:mm:ss");
		try {
			Sydneyclock.SetTimeByBeijing(df3.parse("12:43:37"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String testdate=df3.format(Sydneyclock.GetTime());
		assertNotNull(testdate);
		assertEquals("14:43:37",testdate);
	}

}
