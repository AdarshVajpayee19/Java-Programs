/*
Find Minimum Cost Spanning tree of a given connected undirected graph using 
Prim's Algorithm.

*/

import java.util.Scanner;

class Prims {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of nodes: ");
        int n = sc.nextInt();
        int c[][] = new int[n][n];
        System.out.println("Enter cost matrix:");
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < n; j++) 
                c[i][j] = sc.nextInt();
        prims(n, c);
        sc.close();
    }
    public static void prims(int n, int c[][]) {
        int i, j, k = 0, u, sum = 0, min = 999, sv = 0;
        int p[] = new int[n], d[] = new int[n], t[][] = new int[n - 1][2];
        boolean s[] = new boolean[n];
        for(i = 0; i < n; i++)
            for(j = 0; j < n; j++)
                if(c[i][j] <= min && c[i][j] != 0) {
                    min = c[i][j];
                    sv = i;
                }
        for(i = 0; i < n; i++) {
            d[i] = c[sv][i];
            p[i] = sv;
            s[i] = false;
        }
        d[sv] = 0;
        s[sv] = true;
        for(i = 1; i < n; i++) {
            min = 999; u = -1;
            for(j = 0; j < n; j++)
                if(!s[j] && d[j] <= min && d[j] != 0) {
                    min = d[j];
                    u = j;
                }
            if(u == -1) {
                System.out.println("Disconnected graph");
                return;
            }
            t[k][0] = u;
            t[k++][1] = p[u];
            sum += c[u][p[u]];
            s[u] = true;
            for(j = 0; j < n; j++)
                if(!s[j] && c[u][j] <= d[j] && c[u][j] != 0) {
                    d[j] = c[u][j];
                    p[j] = u;
                }
        }
        if(sum > 999) {
            System.out.println("No MST");
            return;
        }
        System.out.println("MST:");
        for(i = 0; i < n - 1; i++)
            System.out.println((t[i][0] + 1) + " -> " + (t[i][1] + 1) + " & cost: " + c[t[i][0]][t[i][1]]);
        System.out.println("Cost: " + sum);
    }
}