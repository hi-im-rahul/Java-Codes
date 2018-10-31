package assignment7;

public class parantheses {

	public static void main(String[] args) {

//		System.out.println(inbracket("abcd(efghi)", 0));
		System.out.println(checkbracket("{[()]}", 0,'a'));
	}

	public static String inbracket(String s, int k) {
		if (s.length() == 0)
			return "";
		char ch = s.charAt(0);
		String ros = s.substring(1);
		StringBuilder sb = new StringBuilder();
		if (ch == ')')
			k = 0;
		if (k == 1)
			sb.append(ch);

		if (ch == '(')
			k = 1;
		sb.append(inbracket(ros, k));
		return sb.toString();
	}

	public static boolean checkbracket(String s, int k,char p) {
		if (s.length() == 0) {
			if (k != 0)
				return false;
			else
				return true;
		}
		char ch = s.charAt(0);
		String ros = s.substring(1);
		if ((ch == ')'&&p=='(')||(ch == ']'&&p=='[')||(ch == '}'&&p=='{'))
			k--;
		else if(ch==')'||ch==']'||ch==')')
		{
			return false;
		}
		if (ch == '('||ch == '['||ch == '{')
			{k++;
			p=ch;
			}
		boolean b = checkbracket(ros, k,p);
		return b;
	}
}
