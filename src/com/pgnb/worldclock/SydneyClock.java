package com.pgnb.worldclock;

import java.util.Date;

public class SydneyClock extends Clock{

	
	
	 public void SetTimeByBeijing(Date time)
     {
     	this.SetTime(new Date(time.getTime()+2*60*60*1000));
     }
}
