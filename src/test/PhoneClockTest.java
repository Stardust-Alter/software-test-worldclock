package test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.pgnb.worldclock.BeijingClock;
import com.pgnb.worldclock.Clock;
import com.pgnb.worldclock.LondonClock;
import com.pgnb.worldclock.MoscowClock;
import com.pgnb.worldclock.NewYorkClock;
import com.pgnb.worldclock.PhoneClock;
import com.pgnb.worldclock.SydneyClock;

class PhoneClockTest {

	@Test
	void testSetPhoneTime() {
		PhoneClock phoneclock =new PhoneClock();
		List<Clock> clocks=new ArrayList<Clock>();
		BeijingClock Beijingclock=new BeijingClock();
		LondonClock Londonclock=new LondonClock();
		NewYorkClock NewYorkclock=new NewYorkClock();
		SydneyClock Sydneyclock=new SydneyClock();
		MoscowClock Moscowclock=new MoscowClock();
		clocks.add(Beijingclock);
		clocks.add(Londonclock);
		clocks.add(NewYorkclock);
		clocks.add(Sydneyclock);
		clocks.add(Moscowclock);
		
		
		
		SimpleDateFormat df3 = new SimpleDateFormat("HH:mm:ss");
		try {
			phoneclock.SetPhoneTime(df3.parse("12:43:37"),clocks);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String testdate=df3.format(phoneclock.GetTime());
		assertNotNull(testdate);
		assertEquals("12:43:37",df3.format(Beijingclock.GetTime()));
		assertEquals("04:43:37",df3.format(Londonclock.GetTime()));
		assertEquals("23:43:37",df3.format(NewYorkclock.GetTime()));
		assertEquals("14:43:37",df3.format(Sydneyclock.GetTime()));
		assertEquals("08:43:37",df3.format(Moscowclock.GetTime()));
	}

	@Test
	void testGetTime() 
	{
		PhoneClock phoneclock =new PhoneClock();
		List<Clock> clocks=new ArrayList<Clock>();
		BeijingClock Beijingclock=new BeijingClock();
		LondonClock Londonclock=new LondonClock();
		NewYorkClock NewYorkclock=new NewYorkClock();
		SydneyClock Sydneyclock=new SydneyClock();
		MoscowClock Moscowclock=new MoscowClock();
		clocks.add(Beijingclock);
		clocks.add(Londonclock);
		clocks.add(NewYorkclock);
		clocks.add(Sydneyclock);
		clocks.add(Moscowclock);
		
		
		
		SimpleDateFormat df3 = new SimpleDateFormat("HH:mm:ss");
		try {
			phoneclock.SetPhoneTime(df3.parse("12:43:37"),clocks);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String testdate=df3.format(phoneclock.GetTime());
		assertNotNull(testdate);
		assertEquals("12:43:37",testdate);
	}

}
