package javaprogram;

public class StringReverse {

	public static void main(String[] args) {
		
		String s= "automation";
		String k = " ";
		int len= s.length();
		
		for(int i=len-1;i>=0;i--)
		{
			k= k+s.charAt(i);
			
		}
		System.out.println(k);
	}

}
