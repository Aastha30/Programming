
public class PowerOf2 {

public static void main(String[] args) {
int n=Integer.parseInt(args[0]); 
if(n<0&&n>=31)
System.out.println("Overflow");
else
{
int pw=1;
for(int i=1;i<=n;i++)
{
pw=pw*2;	//pw=(int)Math.pow(2,i); //pw=pow(2,i);
System.out.println("2^"+i+" is="+pw);
}

}