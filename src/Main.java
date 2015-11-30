public class Main {

    public static void main(String[] args)
    {

        System.out.println("Traditional Binary Search Tree- No Dups");
        BinarySearchTree<String> nonDupTree = new BinarySearchTree<String>();
        nonDupTree.add("E");
        nonDupTree.add("B");
        nonDupTree.add("C");
        nonDupTree.add("A");
        nonDupTree.add("H");
        nonDupTree.add("D");
        nonDupTree.add("F");
        nonDupTree.add("G");
        System.out.println("Inorder should print \nABCDEFGH");
        nonDupTree.inorderTraverse();
        System.out.println("\nPreorder should print \nEBACDHFG");
        nonDupTree.preorderTraverse();
        nonDupTree.add("B");
        nonDupTree.add("F");
        nonDupTree.add("E");
        System.out.println("\nInorder should print \nABCDEFGH");
        nonDupTree.inorderTraverse();


        System.out.println("\n\nBinary Search Tree With Dups");
        BinarySearchTreeWithDups<String> dupTree = new BinarySearchTreeWithDups<String>();
        dupTree.add("E");
        dupTree.add("B");
        dupTree.add("C");
        dupTree.add("A");
        dupTree.add("H");
        dupTree.add("D");
        dupTree.add("F");
        dupTree.add("G");
        System.out.println("Inorder should print \nABCDEFGH");
        dupTree.inorderTraverse();
        System.out.println("\nPreorder should print \nEBACDHFG");
        dupTree.preorderTraverse();
        dupTree.add("G");
        dupTree.add("B");
        dupTree.add("B");
        dupTree.add("D");
        dupTree.add("E");
        dupTree.add("F");
        System.out.println("\nInorder should print \nABBBCDDEEFFGGH");
        dupTree.inorderTraverse();
        System.out.println("\nPreorder should print \nEBACBBDDHFEGFG");
        dupTree.preorderTraverse();
        System.out.println();



    }



}
