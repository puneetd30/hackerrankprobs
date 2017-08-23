
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] NandQ=line.split(" ");
        int N=Integer.parseInt(NandQ[0]);
        int Q=Integer.parseInt(NandQ[1]);
        int [] arr=new int[N];
        String[] inputs=br.readLine().split(" ");
        
        for (int i = 0; i < N; i++) {
          arr[i]=Integer.parseInt(inputs[i]);
        }
        
		for(int j=1;j<=Q;j++){
			String[] qSplit=br.readLine().split(" ");
			int qType=0,x=0,y=0,v=0;
			qType=Integer.parseInt(qSplit[0]);
			if(qType==1){
				v=Integer.parseInt(qSplit[1]);
				int l=0;
				for(int k=0;k<arr.length;k++)
				{
					if(arr[k]>=v){
						l=k+1;
						break;
					}
					
				}
				if(l==0){
					System.out.println(-1);				
				}else{
					System.out.println(l);
				}
			}
			else{
				x=Integer.parseInt(qSplit[1]);
				y=Integer.parseInt(qSplit[2]);
				arr[x-1]=y;
			}
		}           

        
    }
}