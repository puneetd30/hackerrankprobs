import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AgitatedChandan {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		for (int i = 0; i < N; i++) {

			int n = Integer.parseInt(br.readLine());
			List<Node> nodes = new ArrayList<>();
			List<Edge> edges = new ArrayList<>();

			for (int j = 1; j <= n; j++) {
				Node n1 = new Node();
				n1.n = j;
				n1.nodeEdges = new ArrayList<>();
				n1.adjacentNodes = new ArrayList<>();
				nodes.add(n1);
			}

			line = br.readLine();

			while (line != null) {
				String[] edgeArr = line.split(" ");

				Edge e1 = new Edge();

				Node n1 = nodes.get(Integer.parseInt(edgeArr[0]) - 1);
				Node n2 = nodes.get(Integer.parseInt(edgeArr[1]) - 1);

				e1.n1 = n1;
				e1.n2 = n2;
				e1.weight = Integer.parseInt(edgeArr[2]);
				edges.add(e1);

				n1.adjacentNodes.add(n2);
				n2.adjacentNodes.add(n1);
				n1.nodeEdges.add(e1);
				n2.nodeEdges.add(e1);
				line = br.readLine();
			}
			Graph g = new Graph();
			g.allNodes = nodes;
			g.allEdges = edges;
			System.out.println(bfs(g));
		}

		
	}

	private static int bfs(Graph g) {
		List<Node> nodes = g.allNodes;
		int[] dist = new int[nodes.size()];
		for (int i = 0; i < dist.length; i++) {
			dist[i] = Integer.MAX_VALUE;
		}

		int max = 0;
		Node n = nodes.get(0);
		n.isVisited = true;
		dist[n.n] = 0;
		Queue<Node> q = new LinkedList<>();
		q.offer(n);

		while (!q.isEmpty()) {
			n = q.poll();
			for (Node n1 : n.adjacentNodes) {
				if (!n1.isVisited) {
					Edge e1 = null;
					for (Edge e : n1.nodeEdges) {
						if (e.n1 == n) {
							e1 = e;
							break;
						}
					}

					n1.isVisited = true;
					dist[n1.n] = dist[n.n] + e1.weight;
					if (dist[n1.n] > max) {
						max = dist[n1.n];
					}
					q.offer(n1);
				}
			}
		}
		return max;
	}

	static class Node {
		int n;
		List<Edge> nodeEdges;
		List<Node> adjacentNodes;
		boolean isVisited;
	}

	static class Edge {
		Node n1;
		Node n2;
		int weight;
	}

	static class Graph {
		List<Node> allNodes;
		List<Edge> allEdges;

	}

}
