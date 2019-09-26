package test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;

import com.pgnb.worldclock.LondonClock;


class LondonClockTest {

	@Test
	void testSetTimeByBeijing() {
		LondonClock londonclock =new LondonClock();
		SimpleDateFormat df3 = new SimpleDateFormat("HH:mm:ss");
		try {
			londonclock.SetTimeByBeijing(df3.parse("12:43:37"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String testdate=df3.format(londonclock.GetTime());
		assertNotNull(testdate);
		assertEquals("04:43:37",testdate);
	}

}
