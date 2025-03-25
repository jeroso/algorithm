package practice.interview;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class DFS {
    private Map<Integer, ArrayList<Integer>> graph;

    public void addEdge(int v, int w) {
        graph.computeIfAbsent(v, m -> new ArrayList<>()).add(w);
        graph.computeIfAbsent(v, m -> new ArrayList<>()).add(v);
    }

    public void dfs(int start, Set<Integer> visited) {
        if(visited.contains(start)) {
            return;
        }
        System.out.println(start + " ");
        visited.add(start);
        for(int i : graph.getOrDefault(start, new ArrayList<>())) {
            dfs(i, visited);
        }

    }
}
