package edu.pd.ds;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Graph {

	Map<Integer,List<Integer>> adjList;
	
	public Graph(int noOfVertices){
		if(noOfVertices>0){
			adjList=new HashMap<>();
			for (int i=1;i<=noOfVertices;i++){
				adjList.put(i, new LinkedList<Integer>());
			}
		}
	}
	
	public void setEdge(int source , int dest){
		if(source <=adjList.size() && dest<=adjList.size()){
			adjList.get(source).add(dest);
			adjList.get(dest).add(source);
		}
	}
	
	public List<Integer> getEdge(int source){
		if(source > adjList.size()){
			return null;
		}
		return adjList.get(source);
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		Graph g=new Graph(N);
		for(int i=0;i<N-1;i++){
			String line=br.readLine();
			String[] edgeData=line.split(" ");
			int n1=Integer.parseInt(edgeData[0]);
			int n2=Integer.parseInt(edgeData[1]);
			g.setEdge(n1,n2);
		}
		
		for(int j=1;j<=N;j++){
			List<Integer> adjEdges=g.getEdge(j);
			System.out.print(j+"->");
			for(int k=0;k<adjEdges.size();k++){
				System.out.print(adjEdges.get(k)+"->");
			}
			System.out.println();
		}
		
		
//		
//		5
//		1 2 
//		3 2 
//		2 5 
//		4 1 	
		}
	}
	

