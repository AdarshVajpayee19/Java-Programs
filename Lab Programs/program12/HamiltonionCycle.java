/*
Design and Implement in java to find all Hamiltonian Cycle's in a connected undirected
Graph G of n vertices using Backtracking Principle. 

*/
import java.io.*;
import java.util.*;

public class HamiltonionCycle
{
    private int V,pathcount;
    private int path[];
    private int graph[][];

    public void findhc(int g[][])
    {
        V=g.length;
        path=new int[V];
        Arrays.fill(path,-1);
        graph=g;
        try
        {
            path[0]=0;
            pathcount=1;
            solve(0);
            System.out.println("No Solution");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            display();
        }
    }

    public void solve(int vertex) throws Exception
    {
        if(graph[vertex][0]==1 && pathcount==V)
            throw new Exception("Solution Found");
        if(pathcount==V)
            return;
        for(int v=0;v<V;v++) 
        {
            if(graph[vertex][v]==1)
            {
                path[pathcount++]=v;
                graph[vertex][v]=graph[v][vertex]=0;
                if(!isPresent(v))
                    solve(v);
                graph[vertex][v]=graph[v][vertex]=1;
                path[--pathcount]=-1;
            }
        }
    }

    public Boolean isPresent(int v)
    {
        for(int i=0;i<pathcount-1;i++)
        {
            if(path[i]==v)
                return true;
            
        }
        return false;
    }

    public void display()
    {
        System.out.println("path");
        for(int i=0;i<=V;i++)
            System.out.print(path[i%V]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        HamiltonionCycle hc=new HamiltonionCycle();
        System.out.println("Enter number of vertices:");
        int V=sc.nextInt();
        System.out.println("Enter Adjancency");
        int graph[][]=new int[V][V];
        for(int i=0; i<V; i++)
        {
            for(int j=0; j<V; j++)
            {
                graph[i][j]=sc.nextInt();
            }
        }
        hc.findhc(graph);
    }
}