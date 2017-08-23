import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
 
public class MemoryLeakDemo {
    public static void main(String[] args) throws InterruptedException {
        Map<Key, String> map = new HashMap<Key, String>(1000);
        //Compiles
        GenericMultipleTypesScenario<Integer> integerType = new GenericMultipleTypesScenario<Integer>();
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1); //autoboxes 1 to type Integer
        List<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(2);

        List<? extends Number> nums = ints;
        
        integerType.readOnly(numbers);
        integerType.writeOnly(numbers, 6);  //autoboxes 6 to type Integer
        integerType.writeAndRead(numbers, Integer.valueOf(9));
        
        //Double
        GenericMultipleTypesScenario<Double> doubleType = new GenericMultipleTypesScenario<Double>();
        List<Double> numbersDouble = new ArrayList<Double>();
        numbersDouble.add(1.5); //autoboxes 1.5 to type Double
        
        doubleType.readOnly(numbersDouble);
        doubleType.writeOnly(numbersDouble, 6.5);  //autoboxes 6.5 to type Double
        doubleType.writeAndRead(numbersDouble, Double.valueOf(9.5));
        
        List<Integer>ints2 = Arrays.asList(1,2,3);
        assert sum(ints) == 6.0;
        List<Double>doubles = Arrays.asList(2.78,3.14);
        assert sum(doubles) == 5.92;
        List<Number>nums2 = Arrays.<Number>asList(1,2,2.78,3.14);
        assert sum(nums) == 8.92;
        
        List<Integer>ints3 = new ArrayList<Integer>();
        count(ints, 5);
        assert ints.toString().equals("[0, 1, 2, 3, 4]");
        List<Number>nums4 = new ArrayList<Number>();
        count(nums4, 5); nums4.add(5.0);
        assert nums.toString().equals("[0, 1, 2, 3, 4, 5.0]");
        List<Object>objs = new ArrayList<Object>();
        count(objs, 5); objs.add("five");
        assert objs.toString().equals("[0, 1, 2, 3, 4, five]");
        
        int counter = 0;
        while (true) {
            // creates duplicate objects due to bad Key class
            map.put(new Key("dummyKey"), "value");
            counter++;
            if (counter % 1000 == 0) {
                System.out.println("map size: " + map.size());
                TimeUnit.SECONDS.sleep(2);
            }
        }
        
     
         
    }
    
    public static void count(Collection<? extends Integer> ints, int n) {
        for (int i = 0; i < n; i++) ints.addChild(i);
    }
    public static double sum(Collection<? extends Number> nums) {
    	   double s = 0.0;
    	   for (Number num : nums) 
    	      s += num.doubleValue();
    	   return s;
    	}
    // inner class key without hashcode() or equals() -- bad implementation
    static class Key {
        private String key;
 
        public Key(String key) {
            this.key = key;
        }
    }
    
    
}

 class GenericMultipleTypesScenario<Number> {
	 
	 public void readOnly(List<? extends Number> numbers) {
	   for (Number number : numbers) {
	   System.out.println("readOnly: " + number);
	  }
	 }
	 
	 public void writeOnly(List<? super Number> numbers, Number aNumber) {
	  numbers.add(aNumber);
	 }
	 
	 public void writeAndRead(List<Number> numbers, Number aNumber) {
	  numbers.add(aNumber);
	  for (Number number : numbers) {
	   System.out.println("readAndWrite: " + number);
	  }
	 
	 }
	}
 