package com.company;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.sql.Time;
import java.sql.Timestamp;

public class Main {

    public static boolean do_print = true;
    public static Timestamp start_time = new Timestamp(0);
    public static Timestamp end_time = new Timestamp(0);

    public static void printMatrix(int[][] mat){
        int n = mat.length;

        if(do_print){
            //Top Border
            System.out.print("/-");
            for(int i = 0; i < n; i++)
                System.out.print("--");
            System.out.print("\\");
            System.out.println();

            //Matrix
            for(int i = 0; i < n; i++){

                //Left Border
                System.out.print("| ");

                for(int j = 0; j < n; j++){
                    System.out.print(mat[i][j]==1?"♥":" ");
                    System.out.print(" ");
                }

                //Right Border
                System.out.print("|");

                System.out.println();
            }
            //Bottom Border
            System.out.print("\\-");
            for(int i = 0; i < n; i++)
                System.out.print("--");
            System.out.print("/");
            System.out.println();
        }

        System.out.println();
    }

    public static void drawCompleteGraph(int n){
        int[][] mat = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i != j)
                    mat[i][j] = mat[j][i] = 1;
            }
        }
        printMatrix(mat);
        printOtherChecks(mat);
    }

    public static void drawCyclicGraph(int n){
        int[][] mat = new int[n][n];
        for(int i = 0; i < n-1; i++){
            mat[i][i+1] = mat[i+1][i] = 1;
        }
        mat[n-1][0] = mat[0][n-1] = 1;
        printMatrix(mat);
        printOtherChecks(mat);
    }

    public static void drawRandomGraph(int n){
        int[][] mat = new int[n][n];
        for(int sgaga = 0; sgaga < n; sgaga++){
            int i = (int)(Math.random() * n);
            int j = (int)(Math.random() * n);
            while(i == j)
                j = (int)(Math.random() * n);
            mat[i][j] = mat[j][i] = 1;
        }
        printMatrix(mat);
        printOtherChecks(mat);
    }

    public static void drawTreeGraph(int n){
        int[][] mat = new int[n][n];
        mat[0][1] = mat[1][0] = 1;
        for(int i = 1; i < n; i++){
            int parent = (int)Math.round(Math.random() * (i-1));
            mat[i][parent] = mat[parent][i] = 1;
        }
        printMatrix(mat);
        printOtherChecks(mat);
    }

    public static void DFS_Search(int[][] mat, int start_node, int[] visited){
        for(int i = 0; i < mat.length; i++){
            if(mat[start_node][i] == 1 && visited[i] == 0){
                visited[i] = 1;
                DFS_Search(mat, i, visited);
            }
        }
    }

    public static int getNrOfCycles(int[][] mat){
        int n = mat.length;
        int cycles = 0;
        int[] visited = new int[n];
        for(int start_node = 0; start_node < n; start_node++){
            if(visited[start_node] == 0){
                visited[start_node] = 1;
                cycles++;
                DFS_Search(mat, start_node, visited);
            }
        }
        return cycles;
    }

    public static void printOtherChecks(int[][] mat){
        int n = mat.length;
        int edges = 0, sum_degree = 0, min_degree = n, max_degree = 0;

        for(int i = 0; i < n; i++){
            int degree = 0;
            for(int j = 0; j < n; j++){
                if(mat[i][j] == 1){
                    degree++;
                    if(j > i){
                        edges++;
                    }
                }
            }
            min_degree = Integer.min(min_degree, degree);
            max_degree = Integer.max(max_degree, degree);
            sum_degree += degree;
        }
        System.out.println("Δ(G)=" + min_degree);
        System.out.println("δ(G)=" + max_degree);
        if(min_degree == max_degree)
            System.out.println("The graph is regular");
        else
            System.out.println("The graph isn't regular");
        if(sum_degree == 2 * edges)
            System.out.println("Degree sum is equal to 2 * Nr Of Edges");
        else
            System.out.println("Degree sum is not equal to 2 * Nr Of Edges");
        System.out.println("Number of connected components: " + getNrOfCycles(mat));
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        int n = 0;
        String graph_type = "";
        if(args.length >= 1){
            try{
                n = Integer.parseInt(args[0]);
                if(n%2==1){
                    if(n>60)
                        do_print = false;
                    if(args.length == 2){
                        graph_type = args[1];
                    }
                    start_time = new Timestamp(System.currentTimeMillis());
                    if(graph_type.equals("complete"))
                        drawCompleteGraph(n);
                    else if(graph_type.equals("cyclic"))
                        drawCyclicGraph(n);
                    else if(graph_type.equals("random"))
                        drawRandomGraph(n);
                    else if(graph_type.equals("tree")) {
                        drawTreeGraph(n);
                    }
                    else{
                        drawCompleteGraph(n);
                        drawCyclicGraph(n);
                        drawRandomGraph(n);
                        drawTreeGraph(n);
                    }
                    end_time = new Timestamp(System.currentTimeMillis());
                }
                else
                    System.out.println("Matrix size n is not odd.");
            }
            catch (NumberFormatException e){
                System.out.println("Invalid number from cmdline.");
            }
        }
        else{
            System.out.println("No number present in cmdline.");
        }
        if(!do_print)
            System.out.println("Total Run Time: " + (end_time.getTime() - start_time.getTime()) + "ms");
    }
}
