package copart;

import java.util.Scanner;
import java.util.regex.*;

public class format {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Scanner in = new Scanner(System.in);
		String s=in.next();
		int k=in.nextInt();
		//int f=0;
		Pattern pt = Pattern.compile("[^a-zA-Z0-9]");  
        Matcher match= pt.matcher(s);
        while(match.find())
        {
            String s1= match.group();
        s=s.replaceAll("\\"+s1, "");
        }
        //System.out.println(s);
		
        StringBuilder str = new StringBuilder(s);
        int idx = str.length() - k;

        while (idx > 0)
        {
            str.insert(idx, "-");
            idx = idx - k;
        }
        String str1=str.toString().toUpperCase();
        System.out.println(str1);
	}
}