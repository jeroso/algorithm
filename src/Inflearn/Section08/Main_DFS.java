package Inflearn.Section08;

class Node {
    int data;
    Node lt, rt;

    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}
public class Main_DFS {
    Node root;
    public void DFS(Node root){

    }

    public static void main(String[] args) {
        Main_DFS tree = new Main_DFS();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.DFS(tree.root);
    }
}
