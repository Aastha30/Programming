import java.util.Scanner;
public class StopWatch {
	long start;
	long stop;
	 void start()
	{
		 this.start=System.currentTimeMillis();
		System.out.println("Start Time: "+start+" Millisec");
	}
	 void stop()
	{
		 this.stop=System.currentTimeMillis();
		System.out.println("Stop Time: "+stop+" Millisec");
	}
	 double elapsedTime()
	{
		double et=(stop-start)/1000.0;
		return et;
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 to start");
		int s=sc.nextInt();
		StopWatch sw=new StopWatch();
		sw.start();
		System.out.println("Enter 0 to start");
		int e=sc.nextInt();
		sw.stop();
		System.out.println("Elapsed Time: "+sw.elapsedTime()+" sec");
		
		

	}

}
