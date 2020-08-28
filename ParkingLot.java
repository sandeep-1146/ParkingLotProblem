import java.util.*;
class ParkingLot
{
 public static void main(String args[])
 {
	 int a=0, n;
	 String b=null; 
	 HashMap<Integer, String> map =new  HashMap<Integer, String>();
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter Number of slots");
	 n= sc.nextInt();
	 
	 for( int i=1;i<=n; i++)
		{
			a= sc.nextInt();
			b= sc.nextLine();
			map.put(a,b);
		}
	System.out.println(map);
 }
}