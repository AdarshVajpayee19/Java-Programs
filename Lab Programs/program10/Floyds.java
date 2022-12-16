//program 10(A.) Implement All-pairs Shortest paths problems using Floyds Algorithm.

import java.util.Scanner;

class Floyds {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of nodes: ");
        int n = sc.nextInt();
        int c[][] = new int[n][n], i, j;
        System.out.println("Enter adjacency matrix:");
        for (i = 0; i < n; i++) 
            for (j = 0; j < n; j++) 
                c[i][j] = sc.nextInt();
        System.out.println("Entered matrix:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) 
                System.out.print(c[i][j] + "\t");
            System.out.println();
        }
        floyds(c, n);
        System.out.println("All pairs shortest paths:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++)
                System.out.print(c[i][j] + "\t");
            System.out.println();
        }
        sc.close();
    }
    public static void floyds(int c[][], int n) {
        for(int k = 0; k < n; k++) {
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++)
                    c[i][j] = min(c[i][j], c[i][k] + c[k][j]);
            }
        }
    }
    private static int min(int a, int b) {
        return (a < b) ? a : b;
    }
}

/*
OUTPUT:

Enter no of nodes: 5
Enter adjacency matrix:
0 6 999 999 999
999 0 4 999 999
999 999 0 10 999
999 7 999 0 3
5 999 999 999 0
Entered matrix:
0       6       999     999     999
999     0       4       999     999
999     999     0       10      999
999     7       999     0       3
5       999     999     999     0
All pairs shortest paths:
0       6       10      20      23
22      0       4       14      17
18      17      0       10      13
8       7       11      0       3
5       11      15      25      0

 */