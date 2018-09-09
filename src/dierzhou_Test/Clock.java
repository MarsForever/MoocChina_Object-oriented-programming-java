package dierzhou_Test;

import dierzhou_Test.Display;

public class Clock {
	private Display Dhour  = new Display(24);
	private Display Dminute = new Display(60);
	private Display Dsecond = new Display(60);

	public Clock(int hour, int minute, int second) {
		Dhour.setValue(hour);
		Dminute.setValue(minute);
		Dsecond.setValue(second);
	}
	public void tick() {
			Dsecond.increase();
			if(Dsecond.getValue() == 0) {
				Dminute.increase();
				if(Dminute.getValue()==0) {
					Dhour.increase();
				}
			}
	}

	public String toString() {
		String time=String.format("%02d:%02d:%02d",Dhour.getValue(),Dminute.getValue(),Dsecond.getValue());
        return time;
	}

}
