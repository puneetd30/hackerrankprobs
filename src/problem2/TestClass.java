package problem2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] keys = line.split(" ");
        int keyVal=Integer.parseInt(keys[0]);
        int lockVal=Integer.parseInt(keys[1]);
        String nStr=br.readLine();
        int N=Integer.parseInt(nStr);
        String[] otherKeys=br.readLine().split(" ");
         long[] vals=new long[100001];
         int[] otherKeysArr=new int[1001];
         for(int i=0;i<otherKeys.length;i++){
         	otherKeysArr[i+1]=Integer.parseInt(otherKeys[i]);
         }
        
        for(int i=1;i<=100000;i++){
        	vals[i]=-1;
        }
        Queue<Integer>q=new LinkedList<>();
        q.offer(keyVal);
		vals[keyVal]=0;
		long to=0;
		
		while(!q.isEmpty()){
			int element=q.poll();
			if(lockVal==element){
				break;
			}
			for(int i=0;i<N;i++){
				to=1l*otherKeysArr[i+1]*element;
				to=to%100000;
				if(vals[(int)to]==-1){
					q.offer((int)to);
					vals[(int)to]=vals[element]+1;
				}
			}
			
		}
        
        System.out.println(vals[lockVal]);
    }
}