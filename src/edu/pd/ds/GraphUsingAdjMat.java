package edu.pd.ds;

import java.util.Scanner;

public class GraphUsingAdjMat {
	int[][] graph;
	
	public GraphUsingAdjMat(int size){
		graph=new int[size][size];
	}
	
	public void setGraph(int r, int c){
		graph[r][c]=1;
	}
}


 class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int N = sc.nextInt();
        int M=sc.nextInt();
        GraphUsingAdjMat graph=new GraphUsingAdjMat(N);
       for(int i=0;i<M;i++){
        int c=sc.nextInt();
        int r=sc.nextInt();   
        graph.setBody(r-1,c-1);
    }
        System.out.println(processGraph(graph));
}
    
    private static int processGraph(GraphUsingAdjMat graph){
        boolean[] visited=new boolean[graph.getBody().length];
        return  removeEdgesUsingDfs(graph.getBody(),0,visited); 

    }
    
    private static int removeEdgesUsingDfs(int[][] graph,int count,boolean[] visited){
        for(int i=0;i<graph.length;i++){
//        	if(visited[]){
//        		
//        	}
        }
        return 0;
        
    }
    public static class GraphUsingAdjMat {
	  int[][] graph;
	
	public GraphUsingAdjMat(int size){
		graph=new int[size][size];
	}
	
	public void setBody(int r, int c){
		graph[r][c]=1;
	}
    
    public int[][] getBody(){
		return graph;
	}
        
    public void toStrings(){
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[0].length;j++){
                System.out.print(graph[i][j]+" ");
            }
          System.out.println();
        }
        
    }    
  
}

}
