//Find Minimum cost Spanning tree of a given connected undirected graph using Kruskals Algorithm.
// Use Union-Find algorithm. 

import java.util.Scanner;

public class Kruskals {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of nodes: ");
        int n = sc.nextInt();
        int c[][] = new int[n][n], i, j;
        System.out.println("Enter the cost matrix: ");
        for (i = 0; i < n; i++) 
            for (j = 0; j < n; j++) 
                c[i][j] = sc.nextInt();
        int min = kruskals(n, c);
        System.out.println("Minimum cost: " + min);
        sc.close();
    }
    public static int kruskals(int n, int c[][]) {
        int a = 0, b = 0, u = 0, v = 0, mincost = 0;
        int parent[] = new int[n];
        for(int i = 0; i < n; i++) 
            parent[i] = 0;
        for(int ne = 1; ne < n;) {
            int min = 999;
            for(int i = 0; i < n; i++) 
                for(int j = 0; j < n; j++) 
                    if(c[i][j] < min && c[i][j] != 0) {
                        min = c[i][j];
                        a = u = i;
                        b = v = j;
                    }
            while(parent[u] > 0)
                u = parent[u];
            while(parent[v] > 0)
                v = parent[v];
            if(u != v) {
                mincost += min;
                System.out.println((ne++) + " min edge: (" + (a + 1) + " -> " + (b + 1) + ") and its cost: " + min);
                parent[v] = u;
            }
            c[a][b] = c[b][a] = 0;
        }
        return mincost;
    }
}

/*
OUTPUT:

Enter no of nodes: 5
Enter the cost matrix: 
999 7 999 6 10
7 999 2 8 999
999 2 999 5 999
6 8 5 999 5
10 999 999 5 999
1 min edge: (2 -> 3) and its cost: 2
2 min edge: (3 -> 4) and its cost: 5
3 min edge: (4 -> 5) and its cost: 5
4 min edge: (1 -> 4) and its cost: 6
Minimum cost: 18

 */