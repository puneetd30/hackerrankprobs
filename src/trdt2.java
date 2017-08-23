import java.io.ByteArrayInputStream;


public class trdt2 {
  public static void main(String[] args ){
	  
	  
  }
  
  
}


class static_out {
    static int x;
	static int y;
    void add(int a, int b){
        x = a + b;
        y = x + b;
    }
}    
class static_use {
    public static void main(String args[])
    {
//        static_out obj1 = new static_out();
//        static_out obj2 = new static_out();   
//        int a = 2;
//        obj1.add(a, a + 1);
//        obj2.add(5, a);
//        System.out.println(obj1.x + " " + obj2.y);  
//        String obj = "I LIKE JAVA";   
//        System.out.println(obj.charAt(3));
//        
//        
//        String c = "Hello i love java";
//        System.out.println(c.length());
//        int start = 2;
//        int end = 9;
//        char s[]=new char[end-start];
//        c.getChars(start,end,s,0);
//        System.out.println(s);
        
        String a = "hello i love java";
        System.out.println(a.indexOf('i')+" "+a.indexOf('o') +" "+a.lastIndexOf('i')+" "+a.lastIndexOf('o'));
        
        
        String obj  = "abc";
        byte b[] = obj.getBytes();
        ByteArrayInputStream obj1 = new ByteArrayInputStream(b);
        for (int i = 0; i < 2; ++ i) {
            int c;
            while ((c = obj1.read()) != -1) {
         	   if (i == 0) {
                    System.out.print(Character.toUpperCase((char)c));
//                    obj1.write(1); 
         	   }
            }
            System.out.print(obj);
        }

    }
}