package com.pgnb.worldclock;

import java.util.Date;

public class LondonClock extends Clock{
	
	
	
	public void SetTimeByBeijing(Date time)
     {
     	this.SetTime(new Date(time.getTime()-8*60*60*1000));
     }
}
