
public class Main  {

	    public static void main(String[] args) {
		Lamp lamp = new Lamp();
		ICommand LampOff = new LampOff(lamp);
	        ICommand LampOn = new LampOn(lamp);

	        AirCond air = new AirCond();
	        ICommand airCondRun = new Condrun(air);
	        ICommand airCondStop = new Condstop(air);
	        ICommand airCondSet = new Condset(air);

	        LampOn.execute();
	        LampOff.execute();

	        System.out.println();

	        airCondRun.execute();
	        airCondSet.execute();
	        airCondStop.execute();


	    }
	}

