//Program 10(B.)Implement Travelling Sales Person Problem using Dynamic Programming. 

import java.util.Scanner;

public class TravellingSalesman {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of cities: ");
        int n = sc.nextInt();
        int c[][] = new int[n][n], tour[] = new int[n];
        int i, j, cost;
        if (n <= 1) {
            System.out.println("Path is not possible");
            sc.close();
            return;
        }
        System.out.println("Enter the cost matrix");
        for (i = 0; i < n; i++)
            for (j = 0; j < n; j++)
                c[i][j] = sc.nextInt();
        for (i = 0; i < n; i++)
            tour[i] = i;
        cost = tspdp(c, tour, 0, n);
        System.out.println("The accurate path is:");
        for (i = 0; i < n; i++)
            System.out.print((tour[i] + 1) + " -> ");
        System.out.println("1");
        System.out.println("The accurate min cost is " + cost);
        sc.close();
    }
    static int tspdp(int c[][], int tour[], int sv, int n) {
        int min[] = new int[n], temp[] = new int[n], mincost = 999, cost, i, j, k;
        if(sv == n - 2)
            return (c[tour[n - 2]][tour[n - 1]] + c[tour[n - 1]][0]);
        for (i = sv + 1; i < n; i++) {
            for (j = 0; j < n; j++)
                temp[j] = tour[j];
            temp[sv + 1] = tour[i];
            temp[i] = tour[sv + 1];
            if (c[tour[sv]][tour[i]] + (cost = tspdp(c, temp, sv + 1, n)) < mincost) {
                mincost = c[tour[sv]][tour[i]] + cost;
                for (k = 0; k < n; k++)
                    min[k] = temp[k];
            }
        }
        for (i = 0; i < n; i++)
            tour[i] = min[i];
        return mincost;
    }
}