package com.pgnb.worldclock;

import java.util.Date;

public class MoscowClock extends Clock{

	
	 public void SetTimeByBeijing(Date time)
     {
     	this.SetTime(new Date(time.getTime()-4*60*60*1000));
     }
}
