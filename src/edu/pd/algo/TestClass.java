package edu.pd.algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        
        int N = Integer.parseInt(line);
        if(N==1){
        	return;
        }
        line=br.readLine();
        String str=line;
        int Q=Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= Q; i++) {
            line=br.readLine();
            String[] vals=line.split(" ");
            String val1=vals[0];
            String val2=vals[1];
            int[] val1Index=new int[N];int[] val2Index=new int[N];
            int v1Index=0,v2Index=0;
            for(int j=0;j<str.length();j++){
				if((str.charAt(j)+"").equals(val1)){
					val1Index[v1Index++]=j;
				}            	
				if((str.charAt(j)+"").equals(val2)){
					val2Index[v2Index++]=j;
				}            	
            }
            
			System.out.println(v1Index*v2Index);
            
        }

        
    }
}
