package StringPrograms;

public class Pallindrome2 {

	public static void main(String[] args) {
		String s="TOO HOT TO HOOT ";
		s=s.replace(" ", "");
		s=s.toLowerCase();
		char[] a=s.toCharArray();
		int size=a.length;
		char a1[] = new char[size];

		int i=0;
		while(i!=size)
		{
			a1[size-1-i]=a[i];
			++i;
		}
		i=0;
		while(i!=size)
		{
			if(a1[i]!=a[i])
			{
				System.out.println("Not Pallindrome");
				System.exit(0);
			}
			else
			{
				++i;
				continue;
			}
		}
		System.out.println("Pallindrome");
	}

}
