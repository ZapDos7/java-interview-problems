package alabamaDistances;

import utils.InputReader;
import utils.Pair;

import java.util.*;
import java.util.stream.Collectors;

public class AlabamaDistanceCalculator {

    private static final Map<AlabamaCity, List<Pair<AlabamaCity, Integer>>> graph = buildGraph();

    public static void main(String[] args) {
        System.out.println(Arrays.toString(AlabamaCity.values()));
        System.out.println("Enter city name: ");
        AlabamaCity city1 = AlabamaCity.valueOf(InputReader.read());
        System.out.println("Enter city name: ");
        AlabamaCity city2 = AlabamaCity.valueOf(InputReader.read());
        calculate(city1, city2);
    }

    private static Map<AlabamaCity, List<Pair<AlabamaCity, Integer>>> buildGraph() {
        // Distance map for pairs (undirected)
        Map<Set<AlabamaCity>, Integer> distances = Map.ofEntries(
                Map.entry(Set.of(AlabamaCity.Alabaster, AlabamaCity.Birmingham), 24),
                Map.entry(Set.of(AlabamaCity.Alabaster, AlabamaCity.Montgomery), 71),
                Map.entry(Set.of(AlabamaCity.Birmingham, AlabamaCity.Huntsville), 103),
                Map.entry(Set.of(AlabamaCity.Birmingham, AlabamaCity.Tuscaloosa), 59),
                Map.entry(Set.of(AlabamaCity.Demopolis, AlabamaCity.Mobile), 141),
                Map.entry(Set.of(AlabamaCity.Demopolis, AlabamaCity.Montgomery), 101),
                Map.entry(Set.of(AlabamaCity.Demopolis, AlabamaCity.Tuscaloosa), 65),
                Map.entry(Set.of(AlabamaCity.Mobile, AlabamaCity.Montgomery), 169),
                Map.entry(Set.of(AlabamaCity.Montgomery, AlabamaCity.Tuscaloosa), 134)
        );

        Map<AlabamaCity, List<Pair<AlabamaCity, Integer>>> graph = new HashMap<>();

        for (var entry : distances.entrySet()) {
            Iterator<AlabamaCity> it = entry.getKey().iterator();
            AlabamaCity c1 = it.next();
            AlabamaCity c2 = it.next();
            int dist = entry.getValue();

            graph.computeIfAbsent(c1, k -> new ArrayList<>()).add(new Pair<>(c2, dist));
            graph.computeIfAbsent(c2, k -> new ArrayList<>()).add(new Pair<>(c1, dist));
        }

        return graph;
    }

    private static void calculate(AlabamaCity start, AlabamaCity end) {
        Map<AlabamaCity, Integer> dist = new HashMap<>();
        Map<AlabamaCity, AlabamaCity> prev = new HashMap<>();

        for (AlabamaCity city : AlabamaCity.values()) {
            dist.put(city, Integer.MAX_VALUE);
            prev.put(city, null);
        }
        dist.put(start, 0);

        PriorityQueue<Pair<AlabamaCity, Integer>> pq = new PriorityQueue<>(Comparator.comparingInt(Pair::getValue));
        pq.offer(new Pair<>(start, 0));

        while (!pq.isEmpty()) {
            Pair<AlabamaCity, Integer> current = pq.poll();
            AlabamaCity u = current.getKey();
            int d = current.getValue();

            if (d > dist.get(u)) continue;
            if (u == end) break;

            for (Pair<AlabamaCity, Integer> neighbor : graph.getOrDefault(u, Collections.emptyList())) {
                AlabamaCity v = neighbor.getKey();
                int weight = neighbor.getValue();
                int newDist = dist.get(u) + weight;

                if (newDist < dist.get(v)) {
                    dist.put(v, newDist);
                    prev.put(v, u);
                    pq.offer(new Pair<>(v, newDist));
                }
            }
        }

        if (dist.get(end) == Integer.MAX_VALUE) {
            System.out.println("No path from " + start + " to " + end);
            return;
        }

        List<AlabamaCity> path = new ArrayList<>();
        for (AlabamaCity at = end; at != null; at = prev.get(at)) {
            path.add(at);
        }
        Collections.reverse(path);

        System.out.println("Shortest distance from " + start + " to " + end + ": " + dist.get(end));
        System.out.println("Path: " + path.stream().map(Enum::name).collect(Collectors.joining(" -> ")));
    }
}
