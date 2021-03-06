// Computer assisted translation from c# by CS2J (http://www.cs2j.com)
// Original sources are published under Microsoft Public License (Ms-PL) at csharpdesignpatterns.codeplex.com
// (c) 2013 Jason Oliveira, George Mamaladze

public class Program {

	public static void main(String[] args) throws Exception {
	       TimePulseObservable pulseObservable = new TimePulseObservable(5);
	        System.out.println("ииииииииииииииииииииииии Initialize time pulse with 5 seconds");
	        TimePulseWriter pulseWriter = new TimePulseWriter();
	        pulseObservable.subscribe(pulseWriter);
	        System.out.println("ииииииииииииииииииииииии Subscribed pulse writer");
	        TimePulseBeeper pulseBeeper = new TimePulseBeeper();
	        pulseObservable.subscribe(pulseBeeper);
	        System.out.println("ииииииииииииииииииииииии Subscribed pulse beeper");
	        System.out.println("ииииииииииииииииииииииии Unmute speakers and wait 5 seconds ...");
	}
}
