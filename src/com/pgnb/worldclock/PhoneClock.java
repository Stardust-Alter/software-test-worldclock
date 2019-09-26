package com.pgnb.worldclock;

import java.util.Date;
import java.util.*;

public class PhoneClock 
{
    private Date phoneTime;
    
    public PhoneClock()
    {
    	phoneTime=new Date(100000000);
    }
    
    
    
    
    
    public void SetPhoneTime(Date phoneTime_Set,List<Clock> clocks)
    {
    	phoneTime=phoneTime_Set;
    	for(Clock clock:clocks)
    	{
    		clock.SetTimeByBeijing(phoneTime_Set);
    	}
    }
    
    public Date GetTime()
    {
    	return phoneTime;
    }
}