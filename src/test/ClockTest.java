package test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;

import com.pgnb.worldclock.Clock;


class ClockTest {

	@Test
	void testSetTime() {
		Clock clock =new Clock();
		SimpleDateFormat df3 = new SimpleDateFormat("HH:mm:ss");
		try {
			clock.SetTime(df3.parse("12:43:37"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String testdate=df3.format(clock.GetTime());
		assertNotNull(testdate);
		assertEquals("12:43:37",testdate);
	}

	@Test
	void testGetTime() {
		Clock clock =new Clock();
		SimpleDateFormat df3 = new SimpleDateFormat("HH:mm:ss");
		try {
			clock.SetTime(df3.parse("12:43:37"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String testdate=df3.format(clock.GetTime());
		assertNotNull(testdate);
		assertEquals("12:43:37",testdate);
	}


}
