package jp.co.wap.exam.lib;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] noOfNodesAndQueries = line.split(" ");

		int n = Integer.parseInt(noOfNodesAndQueries[0]);
		int m = Integer.parseInt(noOfNodesAndQueries[1]);

		int[] festiveCities = new int[n + 1];
		// remember it starts from 1;
		int dist[] = new int[n + 1];// dist starts from node 1 to n skip 0;
		festiveCities[1] = 1;

		Graph g = new Graph(n);
		for (int i = 1; i <= n - 1; i++) {
			line = br.readLine();
			String[] edgeData = line.split(" ");
			int n1 = Integer.parseInt(edgeData[0]);
			int n2 = Integer.parseInt(edgeData[1]);
			g.setEdge(n1, n2);
		}
		dist = bfs(g, dist,1,new boolean[n+1]);

		for (int j = 1; j <= m; j++) {
			line = br.readLine();
			String[] queryTypeAndNode = line.split(" ");
			int queryType = Integer.parseInt(queryTypeAndNode[0]);
			int node = Integer.parseInt(queryTypeAndNode[1]);
			if (queryType == 1) {
				festiveCities[node] = 1;
				dist[node]=0;
				bfs(g,dist,node,new boolean[n+1]);
				continue;
			} else {
				if (festiveCities[node] == 1) {
					System.out.println(0);
				} else {
					System.out.println(dist[node]);
				}

			}
		}
	}

	private static int[] bfs(Graph g, int[] dist,int s,boolean[] marked) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(s);
		marked[s] = true;
		
		while (!q.isEmpty()) {
			int v = q.poll();
			for (int i : g.getEdge(v)) {
				if (!marked[i]) {
					q.offer(i);
					marked[i] = true;
					dist[i] = dist[v] + 1; // check distance from top node till
											// parent of current node + distance
											// till current from parent
				}
			}
		}

		return dist;
	}

	static class Graph {

		Map<Integer, List<Integer>> adjList;

		public Graph(int noOfVertices) {
			if (noOfVertices > 0) {
				adjList = new HashMap<>();
				for (int i = 1; i <= noOfVertices; i++) {
					adjList.put(i, new LinkedList<Integer>());
				}
			}
		}

		public void setEdge(int source, int dest) {
			if (source <= adjList.size() && dest <= adjList.size()) {
				adjList.get(source).add(dest);
				adjList.get(dest).add(source);
			}
		}

		public List<Integer> getEdge(int source) {
			if (source > adjList.size()) {
				return null;
			}
			return adjList.get(source);
		}
	}

}
