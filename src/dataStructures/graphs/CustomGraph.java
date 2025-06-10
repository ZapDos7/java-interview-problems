package dataStructures.graphs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class CustomGraph {

    public static void main(String[] args) {
          CustomGraph customGraph = new CustomGraph();
          Map<Vertex, List<Vertex>> map = new HashMap<>();
          map.put(new Vertex("name"), List.of());
          map.put(new Vertex("name2"), List.of(new Vertex("name")));
          customGraph.setAdjVertices(map);
          System.out.println(customGraph);
    }

    //
    private Map<Vertex, List<Vertex>> adjVertices;

    public CustomGraph() {
    }

    public CustomGraph(Map<Vertex, List<Vertex>> adjVertices) {
        this.adjVertices = adjVertices;
    }

    public Map<Vertex, List<Vertex>> getAdjVertices() {
        return adjVertices;
    }

    public void setAdjVertices(Map<Vertex, List<Vertex>> adjVertices) {
        this.adjVertices = adjVertices;
    }

    @Override
    public String toString() {
        return "Graph {" +
                "vertices=" + adjVertices +
                '}';
    }

    public static class Vertex {
        String label;
        Vertex(String label) {
            this.label = label;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass())
                return false;
            Vertex vertex = (Vertex) o;
            return Objects.equals(label, vertex.label);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(label);
        }

        @Override
        public String toString() {
            return "Vertex {" +
                    "label='" + label + '\'' +
                    '}';
        }
    }
}
