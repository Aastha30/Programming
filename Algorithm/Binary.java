
public class Binary {
	
	static int binTodec(int bin)
	{
		int dec=0,c=0;
		while(bin!=0)
		{
			int r=bin%10;
			dec=dec+r*(int)Math.pow(2,c++);
			bin=bin/10;
		}
		return dec;
	}

	public static void main(String[] args) {
		
		

	}

}
