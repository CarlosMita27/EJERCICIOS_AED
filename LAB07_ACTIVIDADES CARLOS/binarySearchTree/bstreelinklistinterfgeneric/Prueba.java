package bstreelinklistinterfgeneric;

import Exceptions.ExceptionIsEmpty;
import Exceptions.ItemDuplicated;
import Exceptions.ItemNoFound;

public class Prueba {
    public static void main(String[] args) throws ItemDuplicated, ItemNoFound, ExceptionIsEmpty {
        LinkedBST<Integer> bst = new LinkedBST<>();
        bst.insert(400);
        bst.insert(100);
        bst.insert(700);
        bst.insert(50);
        bst.insert(200);
        bst.insert(75);

        //System.out.println("Recorrido InOrder:");
        //bst.inOrder();
        //System.out.println("Recorrido PreOrder:");
        //bst.preOrder();
        //System.out.println("Recorrido PostOrder:");
        //bst.postOrder();
        System.out.println("Mínimo: " + bst.findMinNode());
        System.out.println("Máximo: " + bst.findMaxNode());
    }
}