import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Vector;
import java.util.concurrent.RecursiveTask;
    class serialization {
    	public static void main(String[] args) {
            try {
	        FileOutputStream fos = new FileOutputStream("serial");
	        ObjectOutputStream oos = new ObjectOutputStream(fos);
	        oos.writeFloat(3.5f);
	        oos.flush();
	        oos.close();
	    }
	    catch(Exception e) {
	        System.out.println("Serialization" + e);
                System.exit(0);
            }
	    try {
	        FileInputStream fis = new FileInputStream("serial");
	        ObjectInputStream ois = new ObjectInputStream(fis);
	        ois.close();
	        System.out.println(ois.available());		    	
	    }
	    catch (Exception e) {
                System.out.print("deserialization");
	        System.exit(0);
	    }
	    
//	    int array[] = new int [5];
//        for (int i = 5; i > 0; i--)
//            array[5 - i] = i;
//       // Arrays.fill(array);
//        for (int i = 0; i < 5; ++i)
//        	System.out.print(array[i]);;
//        }
	    
        int array[] = new int [5];
        for (int i = 5; i > 0; i--)
            array[5 - i] = i;
        Arrays.sort(array);
        System.out.print(Arrays.binarySearch(array, 4));
        
        Vector obj = new Vector(4,2);
        obj.addElement(new Integer(3));
        obj.addElement(new Integer(2));
        obj.addElement(new Integer(5));
        obj.insertElementAt(new Integer(8), 2);
        System.out.println(obj);
        
        BitSet obj2 = new BitSet(5);
        for (int i = 0; i < 5; ++i)
            obj2.set(i);
        obj2.clear(2);
        System.out.print("hello"+obj2.length()+" "+obj2.size());

    }
    class Myclass implements Serializable {
	String s;
	int i;
	double d;
        Myclass (String s, int i, double d){
	    this.d = d;
	    this.i = i;
	    this.s = s;
	}
    } }
    
    class newthread extends Thread {
    	Thread t;
    	String name;
    	newthread(String threadname) {
    	    name = threadname;
    	    t = new Thread(this,name);
    	    t.start();
    	}
    	public void run() {
            }
     
        }
        class multithreaded_programing {
//            public static void main(String args[]) {
//    	    newthread obj1 = 	 new newthread("one");
//    	    newthread obj2 =	 new newthread("two");
//                try {
//                    obj1.t.wait();	
//                    System.out.print(obj1.t.isAlive());
//                }
//                catch(Exception e) {
//    	    System.out.print("Main thread interrupted");
//                }
//                
//                String str = "true false true";
//                boolean x = Boolean.valueOf(str);
//                System.out.print(x);
//                
//                Locale obj = new Locale("US") ;
//                System.out.print(obj.getCountry());
//            }
        	 public static void main(String[] args) {
        		 multithreaded_programing q = new multithreaded_programing();
        	        List<Integer> l = new ArrayList<>();
        	        l.add(20);
        	        l.add(30);
        	        q.m1(l);
        	        
        	        Path fileURI = Paths.get(URI.create("file:///file.txt"));
        	        System.out.println(fileURI.toAbsolutePath());
        	        
        	        Path path1 = Paths.get("/projects/work/../fun");
        	        Path path2 = Paths.get("games");
        	       // System.out.println(path1.subpath(0, 0));
        	        
        	        Path path = Paths.get("c:\\Users\\mark");
        	        Path path3 =
        	        		  Paths.get("//.//temp//data//..//.//dir//..//file.txt");
        	        		try {
        	        		   path3
        	        		   = path3.toRealPath();
        	        		} catch (IOException e) { }
        	        		System.out.println(path3.subpath(0,2));
//        	        		Files.setCreateTime(path,
//        	        				   FileTime.from(Instance.now());
        	        		Locale spain = new Locale("es", "ES");
//        	                Locale spanish = new Locale("es");
//        	        		ResourceBundle rb = new ResourceBundle("MyBundle",spain);
//
//
//        	        		 Locale locale = new Locale("en", "CA");
//        	        	        System.out.println(rb.getString(locale));

        	       // System.out.println(path.subpath(0, 0));
        	    }
        	    private void m1(List<?> l) {
        	        m2(l); // 1
        	    }
        	    private <T> void m2(List<T> l) {
        	        l.set(1, l.get(0)); // 2
        	        System.out.println(l);
        	    }
        }
    
//    class newthread extends Thread {
//    	newthread() {
//    	    super("My Thread");
//    	    start();
//    	}
//    	public void run() {
//    	    System.out.println(this);
//    	}
//        }
//        class multithreaded_programing {
//            public static void main(String args[]) {
//                new newthread();        
//            }
//        }
        
        
         class Question_28_4 extends RecursiveTask<Integer> {
        	   private int n;

        	   Question_28_4(int n) {
        	      this.n = n;
        	   }

        	   public Integer compute() {
        	      if (n <= 1) {
        	         return n;
        	      }
        	      Question_28_4 t1 = new Question_28_4(n - 1);
        	      Question_28_4 t2 = new Question_28_4(n - 2);
        	      t1.fork();
        	      return t2.compute() + t1.join();
        	   }
        	}
         
         
         
          class Question_19_1 {
        	    protected static int m1() {
        	    	
        	    	 
        	        try {
        	            // Do nothing
        	        } finally {
        	            // Do nothing
        	        }
        	        try {
        	            throw new RuntimeException();
        	        } catch(RuntimeException e) {
        	             return 1;
        	        } finally {
        	             return 2;
        	        }
        	       
        	    }
        	    public static void main(String[] args) {
        	        System.out.println(m1());
        	    }
        	}
          
          
          class Connection implements java.io.Closeable {
        	    public void close() throws IOException {
        	        throw new IOException("Close Exception");
        	    }
        	}

 class Question_19_4 {
        	    public static void main(String[] args) {
        	        try (Connection c = new Connection()) {
        	            throw new RuntimeException("RuntimeException");
        	        } catch (IOException e) {
        	            System.out.println(e.getMessage());
        	        }
        	    }
        	}