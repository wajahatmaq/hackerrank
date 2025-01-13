package com.problems.careem;

import java.util.*;

public class GraphPathCheck {

    // Function to check if there's a path connecting all nodes
    public static boolean isPathExists(int N, int[] A, int[] B) {
        // Step 1: Build adjacency list for the graph
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            graph.put(i, new ArrayList<>());
        }

        for (int i = 0; i < A.length; i++) {
            graph.get(A[i]).add(B[i]);
            graph.get(B[i]).add(A[i]); // Undirected graph
        }

        // Step 2: Perform DFS or BFS to check connectivity
        Set<Integer> visited = new HashSet<>();
        dfs(1, graph, visited);

        // Step 3: Check if all nodes were visited
        return visited.size() == N;
    }

    // DFS function
    private static void dfs(int node, Map<Integer, List<Integer>> graph, Set<Integer> visited) {
        if (visited.contains(node)) {
            return;
        }

        visited.add(node);
        for (int neighbor : graph.get(node)) {
            dfs(neighbor, graph, visited);
        }
    }

    public static void main(String[] args) {
        int N = 4;
        int[] A = {1, 2, 4, 4, 3};
        int[] B = {2, 3, 1, 3, 1};

        boolean result = isPathExists(N, A, B);
        System.out.println("Is there a path that connects all nodes? " + result);
    }
}