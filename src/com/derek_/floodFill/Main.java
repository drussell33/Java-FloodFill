package com.derek_.floodFill;

public class Main {
    //class Example {
        public static int M = 8;
        public static int N = 8;
        static void floodFill(int[][] myScreen, int x, int y, int currColor, int
                newColor) {
            // Base cases
            if (x < 0 || x >= Main.M || y < 0 || y >= Main.N)
                return;
            if (myScreen[x][y] != currColor)
                return;
            // Replace the color at cell (x, y)
            myScreen[x][y] = newColor;
            // Recursively call for north, east, south and west
            floodFill(myScreen, x + 1, y, currColor, newColor);
            floodFill(myScreen, x - 1, y, currColor, newColor);
            floodFill(myScreen, x, y + 1, currColor, newColor);
            floodFill(myScreen, x, y - 1, currColor, newColor);
        }
        static void findColor(int[][] myScreen, int x, int y, int newColor) {
            int currColor = myScreen[x][y];
            floodFill(myScreen, x, y, currColor, newColor);
        }
        public static void main(String args[]) {
            int [][] myScreen= new int [][]
                    {
                            {3, 2, 1, 1, 1, 1, 1, 1},
                            {1, 1, 1, 1, 1, 1, 0, 0},
                            {1, 0, 0, 1, 1, 0, 1, 1},
                            {1, 2, 2, 2, 2, 0, 1, 0},
                            {1, 1, 1, 2, 2, 0, 1, 0},
                            {1, 1, 1, 2, 2, 2, 2, 0},
                            {1, 1, 1, 1, 1, 2, 1, 1},
                            {1, 1, 1, 1, 1, 2, 2, 1},
                    };
            //printing initial screen
            System.out.println("Initial myScreen : ");
            for (int i = 0; i < Main.M; i++) {
                for (int j = 0; j < Main.N; j++) {
                    System.out.print(myScreen[i][j] + " ");
                }
                System.out.print("\n");
            }
            int x = 4, y = 4, newColor = 3;
            findColor(myScreen, x, y, newColor);
            System.out.print("\n");
            System.out.println("Updated myScreen : ");
            //printing updatedscreen
            for (int i = 0; i < Main.M; i++) {
                for (int j = 0; j < Main.N; j++) {
                    System.out.print(myScreen[i][j] + " ");
                }

                System.out.print("\n");
            }
        }
    }



