import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=s.length();
		ArrayList<Integer>al=new ArrayList<Integer>(); 
		int k=0;
		for(int i=0;i<n-1;i++)
		{
		    for(int j=i+1;j<n;j++)
		    {
		        String s1="";
		        if(s.charAt(i)==s.charAt(j))
		        {
		        s1=s.substring(i,j);
		        al.add(s1.length());
		        break;
		        }
		    }
		}
		Collections.sort(al);
		System.out.println(al.get(0));
	}
}
