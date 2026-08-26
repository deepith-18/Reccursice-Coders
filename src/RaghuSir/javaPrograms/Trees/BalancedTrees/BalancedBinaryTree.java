package RaghuSir.javaPrograms.Trees.BalancedTrees;

public class BalancedBinaryTree {

    class Node{
            Integer data;
            Node left;
            Node right;

            Node(Integer data){
                this.data = data;
            }

    }
    Node root;
//    public void insert(Integer data){
//
//        Node n = new Node(data);
//
//        if(root== null){
//            root=n;
//            return;
//        }
//        Node temp = root;
//
//        while(temp!=null){
//            if(data.compareTo(temp.data)<0){
//                if(temp.left==null){
//                    temp.left=n;
//                    return;
//                }
//                temp = temp.left;
//            }else{
//                if(temp.right==null){
//                    temp.right=n;
//                    return;
//                }
//                temp = temp.right;
//            }
//
//        }
//
//    }

    public void inorder(){
        inorder(root);
    }

    private void inorder(Node start){
        if(start==null){
            return;
        }
        inorder(start.left);
        System.out.print(start.data+" ");
        inorder(start.right);
    }

    public void preorder(){
        preorder(root);
    }

    private void preorder(Node start){
        if(start==null){
            return;
        }
        System.out.print(start.data+" ");
        preorder(start.left);
        preorder(start.right);
    }




    public void postorder(){
        postorder(root);
    }
    private void postorder(Node start){
        if(start==null){
            return;
        }
        postorder(start.left);
        postorder(start.right);
        System.out.print(start.data+" ");
    }


    void insert (Integer data){
        root = insert(root,data);
    }

    private Node insert(Node root,Integer data){
        if(root==null){
            return new Node(data);
        }
        if(data.compareTo(root.data)<0){
            root.left = insert(root.left,data);
        }else{
            root.right = insert(root.right,data);
        }
        return root;
    }




}
