## Graphs

1. What is a Graph?
 > A graph is an ordered pair G = (V, E) comprising a set V of vertices or nodes and a collection of pairs of vertices from V, known as edges of a graph. For example, for the graph below.
 > V = { 1, 2, 3, 4, 5, 6 }E = { (1, 4), (1, 6), (2, 6), (4, 5), (5, 6) }
  
2. What Types of Graph are there?
 > 1. Undirected graph (edges have no orientation - edges are not ordered pairs. The maximum number of edges possible in an undirected graph without a loop is n×(n-1)/2.)
 > 2. Directed graph (edges have orientations, i.e., The edge (x, y) is not identical to edge (y, x).)
 > 3. Directed Acyclic Graph (DAG) (A Directed Acyclic Graph (DAG) is a directed graph that contains no cycles.)
 > 4. Multi graph (an undirected graph in which multiple edges (and sometimes loops) are allowed. Multiple edges are two or more edges that connect the same two vertices. A loop is an edge (directed or undirected) that connects a vertex to itself; it may be permitted or not.)
 > 5. Simple graph (an undirected graph in which both multiple edges and loops are disallowed as opposed to a multigraph. In a simple graph with n vertices, every vertex’s degree is at most n-1.)
 > 6. Weighted Graph (associates a value (weight) with every edge in the graph. We can also use words cost or length instead of weight.) - unweighted by default (aka weight = 1 everywhere)
 > 7. Complete graph (A complete graph is one in which every two vertices are adjacent: all edges that could exist are present.)
 > 8. Connected graph (has a path between every pair of vertices. In other words, there are no unreachable vertices. A disconnected graph is a graph that is not connected.)
  
[Further reading](https://www.techiedelight.com/terminology-and-representations-of-graphs/) 









