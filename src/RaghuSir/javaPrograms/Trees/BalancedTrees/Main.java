package RaghuSir.javaPrograms.Trees.BalancedTrees;

public class Main {
    public static void main(String[] args) {

        BalancedBinaryTree tree = new BalancedBinaryTree();
        tree.insert(25);
        tree.insert(15);
        tree.insert(35);
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);

//        tree.inorder();
//        System.out.println();
//        tree.preorder();
//        System.out.println();
//        tree.postorder();

        tree.inorder();
        System.out.println();
        System.out.println(tree.height());
        System.out.println(tree.isValidBST());
        System.out.println(tree.isBalanced());
    }
}
