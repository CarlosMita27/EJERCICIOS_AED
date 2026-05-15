package bstreelinklistinterfgeneric;

import Exceptions.ExceptionIsEmpty;
import Exceptions.ItemDuplicated;
import Exceptions.ItemNoFound;
import bstreeInterface.BinarySearchTree;

public class LinkedBST<E extends Comparable<E>> implements BinarySearchTree<E> {

    class Node {
        public E data;
        public Node left;
        public Node right;

        public Node(E data) {
            this(data, null, null);
        }

        public Node(E data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    private Node root;

    public LinkedBST() {
        this.root = null;
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public void insert(E data) throws ItemDuplicated {
        root = insertRec(root, data);
    }

    private Node insertRec(Node node, E data) throws ItemDuplicated {
        if (node == null) {
            return new Node(data);
        }
        int cmp = data.compareTo(node.data);
        if (cmp == 0) {
            throw new ItemDuplicated("Elemento duplicado: " + data);
        } else if (cmp < 0) {
            node.left = insertRec(node.left, data);
        } else {
            node.right = insertRec(node.right, data);
        }
        return node;
    }

    @Override
    public E search(E data) throws ItemNoFound {
        Node result = searchRec(root, data);
        if (result == null) {
            throw new ItemNoFound("Elemento no encontrado: " + data);
        }
        return result.data;
    }

    private Node searchRec(Node node, E data) {
        if (node == null) return null;
        int cmp = data.compareTo(node.data);
        if (cmp == 0) return node;
        else if (cmp < 0) return searchRec(node.left, data);
        else return searchRec(node.right, data);
    }

    @Override
    public void delete(E data) throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("El árbol está vacío");
        }
        root = deleteRec(root, data);
    }

    private Node deleteRec(Node node, E data) {
        if (node == null) return null;
        int cmp = data.compareTo(node.data);
        if (cmp < 0) {
            node.left = deleteRec(node.left, data);
        } else if (cmp > 0) {
            node.right = deleteRec(node.right, data);
        } else {
            // Caso 1: nodo hoja
            if (node.left == null && node.right == null) {
                return null;
            }
            // Caso 2: un solo hijo
            else if (node.left == null) return node.right;
            else if (node.right == null) return node.left;
            // Caso 3: dos hijos - sucesor inorden (mínimo del subárbol derecho)
            else {
                Node successor = findMin(node.right);
                node.data = successor.data;
                node.right = deleteRec(node.right, successor.data);
            }
        }
        return node;
    }

    private Node findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        toStringRec(root, sb);
        return sb.toString();
    }

    private void toStringRec(Node node, StringBuilder sb) {
        if (node != null) {
            toStringRec(node.left, sb);
            sb.append(node.data).append(" ");
            toStringRec(node.right, sb);
        }
    }
    public void inOrder() {
        inOrderRec(root);
        System.out.println();
    }

    private void inOrderRec(Node node) {
        if (node != null) {
            inOrderRec(node.left);
            System.out.print(node.data + " ");
            inOrderRec(node.right);
        }
    }
    public void preOrder() {
        preOrderRec(root);
        System.out.println();
    }

    private void preOrderRec(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderRec(node.left);
            preOrderRec(node.right);
        }
    }
    public void postOrder() {
        postOrderRec(root);
        System.out.println();
    }

    private void postOrderRec(Node node) {
        if (node != null) {
            postOrderRec(node.left);
            postOrderRec(node.right);
            System.out.print(node.data + " ");
        }
    }
    public E findMinNode() throws ItemNoFound {
        if (isEmpty()) throw new ItemNoFound("El árbol está vacío");
        Node min = findMin(root);
        return search(min.data);
    }

    public E findMaxNode() throws ItemNoFound {
        if (isEmpty()) throw new ItemNoFound("El árbol está vacío");
        Node max = findMax(root);
        return search(max.data);
    }

    private Node findMax(Node node) {
        while (node.right != null) node = node.right;
        return node;
    }
}