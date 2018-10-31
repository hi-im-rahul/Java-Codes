package assignment7;

import java.util.Scanner;

public class sumstring {

	public static void main(String[] args) {

		Scanner scn= new Scanner(System.in);
//		String s=scn.nextLine();
//		int n=convtoint(s);
//		System.out.println(n);
//		System.out.println(checkrev("abcd","dbca"));
//		System.out.println(strpalin("abba"));
//		System.out.println(remindupli("hello"));
		System.out.println(addx("abexexdexed"));
//		System.out.println(remhi("hibhiyhiehi"));
//		System.out.println(remhitobye("hibhiyhiehi"));
//		System.out.println(remhiskipt("hitbhiyhitehi"));
	}

	public static int sum(String s)
	{
		if(s.length()==0)
			return 0;
		char ch=s.charAt(0);
		String ros=s.substring(1);
		int k=0;
		k+=sum(ros);
		k+=ch-48;
		return k;
		
	}
	public static int convtoint(String s)
	{
		if(s.length()==0)
			return 0;
		char ch=s.charAt(s.length()-1);
		String ros=s.substring(0,s.length()-1);
		int k=0;
		k+=convtoint(ros)*10;
		k+=ch-48;
		return k;
	}
	public static boolean checkrev(String s1,String s2)
	{
		if(s1.length()==0||s2.length()==0)
			return true;
		char ch1=s1.charAt(s1.length()-1);
		String ros1=s1.substring(0,s1.length()-1);
		char ch2=s2.charAt(0);
		String ros2=s2.substring(1);
		boolean b=checkrev(ros1,ros2);
		if(b==true)
		{
			if(ch1==ch2)
				return true;
			else
				return false;
		}
		else
			return false;
	}
	public static boolean strpalin(String s1)
	{
		if(s1.length()/2==0)
			return true;
		char ch1=s1.charAt(s1.length()-1);
		char ch2=s1.charAt(0);
		String ros2=s1.substring(1,s1.length()-1);
		boolean b=strpalin(ros2);
		if(b==true)
		{
			if(ch1==ch2)
				return true;
			else
				return false;
		}
		else
			return false;
	} 
	public static String insindupli(String s)
	{
		if(s.length()==1)
		{
			StringBuilder sb=new StringBuilder();
			sb.append(s.charAt(0));
			return sb.toString();
		}
		char ch=s.charAt(0);
		String ros=s.substring(1);
		
		
		StringBuilder sb=new StringBuilder();
		
		sb.append(ch);
		String rr=insindupli(ros);
		if(s.charAt(0)==s.charAt(1))
		{
			sb.append("*");
		}
		sb.append(rr);
		return sb.toString();
	}
	public static String remindupli(String s)
	{
		if(s.length()==1)
		{
			StringBuilder sb=new StringBuilder();
			sb.append(s.charAt(0));
			return sb.toString();
		}
		char ch=s.charAt(0);
		String ros=s.substring(1);
		
		
		StringBuilder sb=new StringBuilder();
		
		sb.append(ch);
		String rr=remindupli(ros);
		if(s.charAt(0)==s.charAt(1))
		{
			sb.deleteCharAt(sb.length()-1);
		}
		
		sb.append(rr);
		return sb.toString();
	}
	public static String addx(String s)
	{
		if(s.length()==0)
		{
			StringBuilder sb=new StringBuilder(s);
			return sb.toString();
		}
		char ch=s.charAt(0);
		String ros=s.substring(1);
		StringBuilder sb=new StringBuilder();
		if(ch!='x')
			sb.append(ch);
		String rr=addx(ros);
		sb.append(rr);
		if(ch=='x')
			sb.append(ch);
		return sb.toString();
	}
	public static String remhi(String s)
	{
		if(s.length()==1)
		{
			StringBuilder sb=new StringBuilder();
			sb.append(s.charAt(0));
			return sb.toString();
		}
		char ch=s.charAt(0);
		String ros=s.substring(1);
		
		
		StringBuilder sb=new StringBuilder();
		
		sb.append(ch);
		String rr=remhi(ros);
		sb.append(rr);
		if(s.charAt(0)=='h'&&s.charAt(1)=='i')
		{
			sb.deleteCharAt(0);
			sb.deleteCharAt(0);
		}
		
		return sb.toString();
	}
	public static String remhitobye(String s)
	{
		if(s.length()==1)
		{
			StringBuilder sb=new StringBuilder();
			sb.append(s.charAt(0));
			return sb.toString();
		}
		char ch=s.charAt(0);
		String ros=s.substring(1);
		
		
		StringBuilder sb=new StringBuilder();
		
		sb.append(ch);
		String rr=remhitobye(ros);
		sb.append(rr);
		if(s.charAt(0)=='h'&&s.charAt(1)=='i')
		{
			sb.deleteCharAt(0);
			sb.deleteCharAt(0);
			sb.insert(0, "bye");
		}
		
		return sb.toString();
	}
	public static String remhiskipt(String s)
	{
		if(s.length()==2)
		{
			StringBuilder sb=new StringBuilder();
			sb.append(s.charAt(0));
			sb.append(s.charAt(1));
			return sb.toString();
		}
		char ch=s.charAt(0);
		String ros=s.substring(1);
		
		StringBuilder sb=new StringBuilder();
		
		sb.append(ch);
		String rr=remhiskipt(ros);
		sb.append(rr);
		if(s.charAt(0)=='h'&&s.charAt(1)=='i'&&s.charAt(2)!='t')
		{
			sb.deleteCharAt(0);
			sb.deleteCharAt(0);
		}
		else if(s.charAt(1)=='h'&&s.charAt(2)=='i')
		{
			sb.deleteCharAt(1);
			sb.deleteCharAt(1);
		}
		
		return sb.toString();
	}
}
