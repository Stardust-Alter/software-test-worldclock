package test;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.pgnb.worldclock.BeijingClock;

class BeijingClockTest {

	
	@Test
	void testSetTimeByBeijing() 
	{
		BeijingClock beijingclock =new BeijingClock();
		SimpleDateFormat df3 = new SimpleDateFormat("HH:mm:ss");
		try {
			beijingclock.SetTimeByBeijing(df3.parse("12:43:37"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String testdate=df3.format(beijingclock.GetTime());
		assertNotNull(testdate);
		assertEquals("12:43:37",testdate);
	}

}
