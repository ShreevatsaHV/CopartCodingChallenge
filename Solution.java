
public class Solution {

    public static void main(String[] args) {
        String val = "-12349";
        int factor=1, num=0;
        int size = val.length();
        char c='\0';
        for(int i=size-1;i>=0;i--){
        	if(val.charAt(i-1)=='-'){
        		StringBuilder b = new StringBuilder(c).append(val.charAt(i)).append(val.charAt(i-1));
        	}else {
        		c = val.charAt(i);
        	}
        	num = num+(val.charAt(i)-'0')*factor;
        	System.out.println(num);
        	factor = factor*10;
        }
         System.out.println(num);
         int numericVal = Character.getNumericValue(val.charAt(0));
         System.out.println(numericVal);
    }
}