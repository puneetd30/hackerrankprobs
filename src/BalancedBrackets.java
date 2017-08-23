import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BalancedBrackets {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
       
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String[] strArr=s.split("");
            Stack<String> st=new Stack<>();
            String out1="YES";
            for(int i=1;i<strArr.length;i++){
                if("{".equals(strArr[i]) || "[".equals(strArr[i]) || "(".equals(strArr[i])){
                    st.push(strArr[i]);
                    continue;
                }
                
                
                if(strArr[i].equals("}")){
                    if(!st.isEmpty() && st.pop().equals("{")){
                       continue; 
                    }else{
                        out1="NO";
                        break;
                    }
                }
                
                if(strArr[i].equals("]")){
                    if(!st.isEmpty() && st.pop().equals("[")){
                       continue; 
                    }else{
                        out1="NO";
                        break;
                    }
                }
                if(strArr[i].equals(")")){
                    if(!st.isEmpty() &&  st.pop().equals("(")){
                       continue; 
                    }else{
                        out1="NO";
                        break;
                    }
                }
            }
            if(st.isEmpty()){
              System.out.println(out1);
            }else{
            	System.out.println("NO");
            }
        }
      
    }
}

