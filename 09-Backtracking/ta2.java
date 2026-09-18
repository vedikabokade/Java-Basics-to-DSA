// find all possible hamiltonian paths of a graph
// import java.util.Scanner;
// public class ta2 {

//     static final int MAX_V = 20;
//     static int[][] graph = new int[MAX_V][MAX_V];
//     static int[] path = new int[MAX_V + 1];
//     static boolean[] visited = new boolean[MAX_V];
//     static int V;

//     static boolean isFeasible(int v, int pos) {
//         if (graph[path[pos - 1]][v] == 0)
//             return false;
//         if (visited[v])
//             return false;
//         return true;
//     }

//     static void printCycle() {
//         for (int i = 0; i < V; i++) {
//             System.out.print((path[i] + 1) + " -> ");
//         }
//         System.out.println(path[0] + 1);
//     }

//     static void hamiltonianCycleUtil(int pos) {
//         if (pos == V) {
//             if (graph[path[pos - 1]][path[0]] == 1) {
//                 path[pos] = path[0];
//                 printCycle();
//             }
//             return;
//         }

//         for (int v = 1; v < V; v++) {
//             if (isFeasible(v, pos)) {
//                 path[pos] = v;
//                 visited[v] = true;

//                 hamiltonianCycleUtil(pos + 1);

//                 visited[v] = false;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter number of vertices (max " + MAX_V + "): ");
//         V = scanner.nextInt();

//         if (V > MAX_V || V <= 0) {
//             System.out.println("Invalid number of vertices.");
//             scanner.close();
//             return;
//         }

//         System.out.println("Enter the adjacency matrix (" + V + " x " + V + "):");
//         for (int i = 0; i < V; i++) {
//             for (int j = 0; j < V; j++) {
//                 graph[i][j] = scanner.nextInt();
//             }
//         }

//         for (int i = 0; i < V; i++) {
//             visited[i] = false;
//         }

//         path[0] = 0;
//         visited[0] = true;

//         System.out.println("\nHamiltonian Cycles starting from vertex 1:");
//         hamiltonianCycleUtil(1);
//         scanner.close();
//     }
// }


// tsp using backtracing
import java.util.Scanner;
public class ta2 {

    static int[][] graph;
    static int V;
    static boolean[] visited;
    static int[] path;
    static int[] bestPath;
    static int minCost = Integer.MAX_VALUE;

    static boolean isFeasible(int v, int pos) {
        
        return !visited[v] && graph[path[pos - 1]][v] != 0;
    }

    static void tspUtil(int pos, int cost) {
        if (pos == V) {
            if (graph[path[pos - 1]][path[0]] != 0) {
                int totalCost = cost + graph[path[pos - 1]][path[0]];
                if (totalCost < minCost) {
                    minCost = totalCost;
                    System.arraycopy(path, 0, bestPath, 0, V);
                    bestPath[V] = path[0]; // to close the cycle
                }
            }
            return;
        }

        for (int v = 0; v < V; v++) {
            if (isFeasible(v, pos)) {
                path[pos] = v;
                visited[v] = true;
                tspUtil(pos + 1, cost + graph[path[pos - 1]][v]);
                visited[v] = false; // backtrack
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of cities: ");
        V = scanner.nextInt();

        graph = new int[V][V];
        visited = new boolean[V];
        path = new int[V + 1];
        bestPath = new int[V + 1];

        System.out.println("Enter cost matrix (0 if no direct path):");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }

        visited[0] = true; // Start from city 0
        path[0] = 0;

        tspUtil(1, 0);

        if (minCost != Integer.MAX_VALUE) {
            System.out.println("\nMinimum cost path:");
            for (int i = 0; i <= V; i++) {
                System.out.print((bestPath[i] + 1) + (i < V ? " -> " : ""));
            }
            System.out.println("\nTotal Cost: " + minCost);
        } else {
            System.out.println("No path exists that visits all cities.");
        }

        scanner.close();
    }
}


//find the complement of a given graph
// import java.util.Scanner;
// public class ta2 {
//     // Method to find the complement of a graph represented by an adjacency matrix
//     public static int[][] findComplement(int[][] graph, int V) {
//         int[][] complement = new int[V][V];
        
//         // Loop through the adjacency matrix and build the complement
//         for (int i = 0; i < V; i++) {
//             for (int j = 0; j < V; j++) {
//                 // If there is no edge and i != j, set complement[i][j] to 1
//                 if (graph[i][j] == 0 && i != j) {
//                     complement[i][j] = 1;
//                 } else {
//                     complement[i][j] = 0;
//                 }
//             }
//         }
//         return complement;
//     }
//     // Method to print the adjacency matrix of a graph
//     public static void printGraph(int[][] graph, int V) {
//         for (int i = 0; i < V; i++) {
//             for (int j = 0; j < V; j++) {
//                 System.out.print(graph[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         // Input number of vertices in the graph
//         System.out.print("Enter number of vertices: ");
//         int V = scanner.nextInt();
        
//         int[][] graph = new int[V][V];
        
//         // Input the adjacency matrix for the graph
//         System.out.println("Enter the adjacency matrix:");
//         for (int i = 0; i < V; i++) {
//             for (int j = 0; j < V; j++) {
//                 graph[i][j] = scanner.nextInt();
//             }
//         }

//         // Compute the complement of the graph
//         int[][] complementGraph = findComplement(graph, V);
        
//         // Print the original graph
//         System.out.println("Original Graph:");
//         printGraph(graph, V);
        
//         // Print the complement graph
//         System.out.println("Complement Graph:");
//         printGraph(complementGraph, V);
        
//         scanner.close();
//     }
// }
