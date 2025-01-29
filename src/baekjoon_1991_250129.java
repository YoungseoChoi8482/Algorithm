import java.util.*;
import java.io.*;


class TreeNode{
    char val;
    TreeNode left, right;
    public TreeNode(char val)
    {
        this.val = val;
        this.left = null;
        this.right = null;
    }

}

public class baekjoon_1991_250129 {

    static Map<Character,TreeNode> nodeMap = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        TreeNode root = null;

        for(int i = 0; i < N; i++)
        {
            st = new StringTokenizer(br.readLine());
            char parent = st.nextToken().charAt(0);
            char leftChild = st.nextToken().charAt(0);
            char rightChild = st.nextToken().charAt(0);

            nodeMap.putIfAbsent(parent,new TreeNode(parent));
            TreeNode parentNode = nodeMap.get(parent);

            if(i == 0)
                root = parentNode;

            if(leftChild != '.' )
            {
                nodeMap.putIfAbsent(leftChild, new TreeNode(leftChild));
                parentNode.left = nodeMap.get(leftChild);
            }

            if(rightChild != '.')
            {
                nodeMap.putIfAbsent(rightChild, new TreeNode(rightChild));
                parentNode.right = nodeMap.get(rightChild);
            }

        }

        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);


    }


    public static void preorder(TreeNode node)
    {
        if(node==null) return;
        System.out.print(node.val );
        preorder(node.left);
        preorder(node.right);
    }

    public static void inorder(TreeNode node)
    {
        if(node == null) return;
        inorder(node.left);
        System.out.print(node.val);
        inorder(node.right);
    }

    public static void postorder(TreeNode node)
    {
        if(node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.val);
    }

}
