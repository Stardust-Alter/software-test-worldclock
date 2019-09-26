package com.pgnb.worldclock;
import java.util.*;



public class Clock {
        private Date Ctime;
        
        public Clock()
        {
        	Ctime=new Date(10000);
        }
        
        
        
        public void SetTime(Date NowTime)
        {
        	Ctime=NowTime;
        }
        
        public Date GetTime()
        {
        	return Ctime;
        }
        
        public void SetTimeByBeijing(Date time)
        {
        	
        }
}
