package com.pgnb.worldclock;

import java.util.Date;

public class NewYorkClock extends Clock{

	 public void SetTimeByBeijing(Date time)
     {
     	this.SetTime(new Date(time.getTime()-13*60*60*1000));
     }
}
