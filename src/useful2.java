import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Locale;

 class useful {
protected static int count=0;
public useful(){
	count++;
}
	int x=5;
	
	
	protected int getNumber(){
		return 2; 
	}
	
	protected void setNumber(Integer N){
		
	}
}

 public class useful2 extends useful{
	public useful2(int b){
		count++;
	}
	
	public static void main(String[] args){
//	{  System.out.println(count);
//		useful2 u=new useful2();
//		System.out.println(count);
//		Class g=useful2.class;
//		try{
//			System.out.println(g.getMethod("getNumber",null).toString());
//			System.out.println(g.getDeclaredMethod("setNumber",null).toString());
//		}catch(Exception e){
//			
//		}
//		
//		String str=
//				"my use";
//		String str2=new String("my use");
//		System.out.println(str.matches(str2));
//		System.out.println(str.hashCode()==str2.hashCode());
//	
//		Calendar cal=Calendar.getInstance();
//		cal.set( 2004,1,1);
//		int days=cal.getActualMaximum(Calendar.DAY_OF_MONTH);
//		System.out.println(days==29);
	
	StringBuilder str=new StringBuilder();
	String[] v={"test","1","2","null"};
	for(String str2:v){
		if(str.indexOf(str2)<1){
			str.append(str2+" ");
		}
	}
	System.out.println(str);
		
		Integer a=new Integer(1);
		Integer b=a;
		a+=b;
		System.out.println(a);
		System.out.println(b);
		
		File f=new File("test.txt");
		File ba=new File("test.txt.bak");
		ba.delete();
		f.renameTo(ba);
		Locale lb=new Locale("USA");
		System.out.println(lb.getCountry());
		Long l=123l;
				Long l1=l;
				l++;
				if(l==l1){
					System.out.println("equal");
				}else{
					System.out.println("not equal");
				}
				
				int z[]={2,4};
				int j=0;
				do for(int i :z)
					System.out.print(i+"");
				while(j++<1);
				
				StringBuilder sb=new StringBuilder("buffering");
				sb.replace(2,7,"BUFFER");
				sb.delete(2, 4);
				String su=sb.substring(1, 5);
				System.out.println(su);
				
				int i=1;
				int answer=i=5;
				System.out.println(answer);
				
				int m=2;
				int c=3;
				String k="";
				int ans=Integer.parseInt(k+m+c);
				System.out.println("Ans"+ans);
				
				int x=0,y=4,p=5;
				if(x>0)
					if(y<3)
						System.out.println("oe");
				else
			    System.out.println("two");
				
				
				
	}
	
	
}
class D{
D(){
	System.out.println("a");
}	
	class B{
		B(){
			System.out.println("B");
		}
		public void bdc() throws IOException{
			
		}
	}
}

interface def{
	void dc() throws SQLException;
}

class c extends D.B{
	c(D car,float f){
	car.super();
	System.out.println("C");
	}
	public void bdc() {
		
	}
	public static void main(String[] args){
		new c(new D(),5.0f);
	}
}