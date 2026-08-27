package RaghuSir.javaPrograms.Trees.BalancedTrees;

import javax.swing.tree.TreeNode;

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

    public void delete(Integer key){
        root = delete(root, key);
    }

    private Node delete(Node start, Integer key){
        if(start==null){
            return null;
        }

        if(key.compareTo(start.data)<0){
            start.left = delete(start.left,key);
        }else if(key.compareTo(start.data)>0){
            start.right = delete(start.right,key);
        }else{
            if(start.left==null && start.right==null){
                return null;
            }else if(start.left==null){
                return start.right;
            }else if(start.right==null){
                return start.left;
            }else{
                Node temp = start.right;
                while(temp.left!=null){
                    temp = temp.left;
                }
                start.data = temp.data;
                start.right = delete(temp.right,start.data);
            }
        }
        return start;

    }



    public int height(){
        return height(root);
    }
    private int height(Node root){
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);

        return  Math.max(left,right)+1;
    }


    public boolean isValidBST(){
        return  isValidBST(root);

    }
    private boolean isValidBST(Node start){
        if(start==null){
            return true;
        }
        if(start.left != null && start.left.data.compareTo(start.data)>0){
            return false;
        }
        if(start.right != null && start.right.data.compareTo(start.data)<0){
            return false;
        }

        return isValidBST(start.left) && isValidBST(start.right);
    }


    public boolean isBalanced(){
        return isBalanced(root);
    }
    private boolean isBalanced(Node start){
        if(start == null){
            return true;
        }
        int leftHieght=height(start.left);
        int rightHieght=height(start.right);

        if(Math.abs(leftHieght-rightHieght)>1){
            return false;
        }

        return isBalanced(start.left) &&  isBalanced(start.right);
    }

}
