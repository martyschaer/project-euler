import java.util.ArrayList;
import java.util.List;

/**
 * Project Euler, Problem 018
 *
 * Calculate the Maximum path through the triangle below.
 */
public class P_018 {
    static int[][] input = new int[][]{
            {75},
            {95,64},
            {17,47,82},
            {18,35,87,10},
            {20,4,82,47,65},
            {19,1,23,75,3,34},
            {88,2,77,73,7,63,67},
            {99,65,4,28,6,16,70,92},
            {41,41,26,56,83,40,80,70,33},
            {41,48,72,33,47,32,37,16,94,29},
            {53,71,44,65,25,43,91,52,97,51,14},
            {70,11,33,28,77,73,17,78,39,68,17,57},
            {91,71,52,38,17,14,91,43,58,50,27,29,48},
            {63,66,4,68,89,53,67,30,73,16,69,87,40,31},
            {4,62,98,27,23,9,70,98,73,93,38,53,60,4,23}

    };

    static List<Integer> lengths = new ArrayList<>();

    public static void main(String[] args) {
        Node graph = new Node(input[0][0], 0, 0);
        graph = buildGraph(graph);
        calcValue(graph, 0);
        System.out.println(lengths.stream().mapToInt(Integer::intValue).max().orElse(-1));
    }

    static void calcValue(Node node, int len){
        len += node.val;
        if(node.A == null || node.B == null){
            lengths.add(len);
            return;
        }
        calcValue(node.A, len);
        calcValue(node.B, len);
    }

    static Node buildGraph(Node node){
        int nextRow = node.row + 1;
        if(nextRow < input.length){
            if(node.index < input[nextRow].length){
                node.A = new Node(input[nextRow][node.index], node.index, nextRow);
                buildGraph(node.A);
            }
            if(node.index+1 < input[node.row+1].length){
                node.B = new Node(input[nextRow][node.index+1], node.index+1, nextRow);
                buildGraph(node.B);
            }
        }
        return node;
    }

    static class Node{
        public Node A;
        public Node B;
        public int val;
        public int index;
        public int row;

        public Node(int val, int index, int row) {
            this.val = val;
            this.index = index;
            this.row = row;
        }
    }
}
