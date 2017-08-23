import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;


public class test implements A,B{
	
	     static void main(String[ ] args) {
	        String letters = "ABC";
	        Object numbers = new char[ ] { '1', '2', '3' };
	        System.out.print(letters + " easy as ");
	        System.out.println(numbers); // Invokes println(Object)
	        A a=new test();
	        B b=new test();
	        System.out.println(a.getName());
	        System.out.println(b.getName());
	        int arr[] = new int [5];
	        System.out.println(arr);
	        Integer ten=new Integer(10);
//	        Long nine=new Long (9); System.out.println(ten + nine); int i=1;
//	        System.out.println(i + ten);
//	        
	        	/* This is the start of a comment
	        	if (true) {
	        	Test5 = new test5();
	        	System.out.println("Done the test");
	        	}
	        	/* This is another comment */
	        	System.out.println ("The end");
	        	
	        	int total = 0;
	        	for (int i = 0, j = 10; total > 30; ++i, --j) {
	        	System.out.println(" i = " + i + " : j = " + j);
	        	total += (i + j);
	        	}
	        	System.out.println("Total " + total);
	        	Integer[] intarr={1,2,3};
	        	
	        	Map<Integer,String> hashMap=new Hashtable<>();
	        	hashMap.put(11, "a");
	        	
//	        	hashMap.put(null, "b");
//	        	hashMap.put(null, null);
	        	System.out.println(hashMap);
	        	
	        	List<Integer>list=new ArrayList<>();
	        	list.add(1);
	        	list.add(2);
	        	System.out.println(list);
	        	
	        	int a1 = 1;
	             int b1 = 2;
	             int c = 3;
	             a1 |= 4;
	             b1 >>= 1;
	             c <<= 1;
	             a1 ^= c;
	             System.out.println(a1 + " " + b1 + " " + c);
	             
	             
	             boolean a2 = true;
	             boolean b2 = false;
	             boolean c2 = a2 ^ b2;
	             System.out.println(!c2);
	             
	             int sum = 0;
	             for (int i = 0, j = 0; i < 5 & j < 5; ++i, j = i + 1)
	                 sum += i;
	 	     System.out.println(sum);
	    }

		@Override
		public String getName() {
			// TODO Auto-generated method stub
			return "true";
		}
}

interface A{
	
	String getName();
}


interface B{
	
	String getName();
}
