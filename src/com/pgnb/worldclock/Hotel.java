package com.pgnb.worldclock;
import java.util.Date;
import java.util.*;
import java.text.DateFormat;

public class Hotel 
{

	Date BeijingTime;
	
	Clock Beijingclock;
	Clock Londonclock;
	Clock NewYorkclock;
	Clock Sydneyclock;
	Clock Moscowclock;
	
	List<Clock> clocks;
	
	PhoneClock phoneclock;
	
	Hotel()
	{
		clocks=new ArrayList<Clock>();
		
		BeijingTime= new Date(System.currentTimeMillis());
		
		Beijingclock=new BeijingClock();
		Londonclock=new LondonClock();
		NewYorkclock=new NewYorkClock();
		Sydneyclock=new SydneyClock();
		Moscowclock=new MoscowClock();
		
		phoneclock= new PhoneClock();
		
		clocks.add(Beijingclock);
		clocks.add(Londonclock);
		clocks.add(NewYorkclock);
		clocks.add(Sydneyclock);
		clocks.add(Moscowclock);
		
		
	}
	
	
	
	public static void main(String args[]) 
	{ 
        Hotel hotel=new Hotel();
        
        
        DateFormat df3 = DateFormat.getTimeInstance();
        
        System.out.println("手机时间为"+df3.format(hotel.phoneclock.GetTime()));
        System.out.println("北京时间为"+df3.format(hotel.Beijingclock.GetTime()));
        System.out.println("伦敦时间为"+df3.format(hotel.Londonclock.GetTime()));
        System.out.println("纽约时间为"+df3.format(hotel.NewYorkclock.GetTime()));
        System.out.println("莫斯科时间为"+df3.format(hotel.Moscowclock.GetTime()));
        System.out.println("悉尼时间为"+df3.format(hotel.Sydneyclock.GetTime()));
        
        
        
        
        System.out.println("是否需要调整时间? y/n");
        hotel.phoneclock.SetPhoneTime(hotel.BeijingTime, hotel.clocks);
        
        System.out.println("手机时间为"+df3.format(hotel.phoneclock.GetTime()));
        System.out.println("北京时间为"+df3.format(hotel.Beijingclock.GetTime()));
        System.out.println("伦敦时间为"+df3.format(hotel.Londonclock.GetTime()));
        System.out.println("纽约时间为"+df3.format(hotel.NewYorkclock.GetTime()));
        System.out.println("莫斯科时间为"+df3.format(hotel.Moscowclock.GetTime()));
        System.out.println("悉尼时间为"+df3.format(hotel.Sydneyclock.GetTime()));
        
    } 
	
	
	
	
	
	
	
	
	
	
	
	
}
