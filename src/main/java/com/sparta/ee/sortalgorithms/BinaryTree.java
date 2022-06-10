package com.sparta.ee.sortalgorithms;

import com.sparta.ee.exceptions.ChildNotFoundException;
import com.sparta.ee.interfaces.BinaryTreeInterface;

public class BinaryTree implements BinaryTreeInterface {

    private final Node rootNode;

    private static int[] treeElements;
     static int countEachNodes = 1;

    public BinaryTree(final int element) {
        rootNode = new Node(element);
    }

    @Override
    public int getRootElement() {
        return rootNode.getNodeValue();
    }


    @Override
    public int getNumberOfElements() {
        return countEachNodes;
    }

    @Override
    public void addElement (final int element) {

        addNodeToTree(rootNode, element);
    }

    @Override
    public void addElements(int[] elements) {
        addNodesToTree(rootNode, elements);
    }


    @Override
    public boolean findElement(final int element) {
        Node node = findNode(element);
        if (node != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getLeftChild(int element){
        Node node = findNode(element);

        if (!node.isLeftChildEmpty()) {
            node.getLeftChild();
        }



        return element;
    }

    @Override
    public int getRightChild(int element) {
        Node node = findNode(element);
        if (!node.isRightChildEmpty()) {
            node.getRightChild();
        } else {
            return 0;
        }
        return element;
    }

    @Override
    public int[] getSortedTreeAsc() {
        return new int[0];
    }

    @Override
    public int[] getSortedTreeDesc() {
        return new int[0];
    }

    private void addNodeToTree(Node node, int element) {
        if (element < node.getNodeValue()) {
            if (node.isLeftChildEmpty()) {
                Node leftChild = new Node(element);
                node.setLeftChild(leftChild);
                countEachNodes++;

            } else {
                addNodeToTree(node.getLeftChild(), element);
            }
        } else if (element > node.getNodeValue()) {
            if (node.isRightChildEmpty()) {
                Node rightChild = new Node(element);
                node.setRightChild(rightChild);
                countEachNodes++;
            } else {
                addNodeToTree(node.getRightChild(), element);
            }

        }
    }

    private void addNodesToTree(Node node, int[] elements) {

        for (int i = 0; i < elements.length-1; i++) {
            addElement(node.getNodeValue());
        }
    }

    private Node findNode(final int element) {
        Node node = rootNode;
        while(node != null) {
            if (element == node.getNodeValue()) {
                return node;
            }
            if (element < node.getNodeValue()) {
                node = node.getLeftChild();
            } else {
                node = node.getRightChild();
            }
        }
        return null;
    }

}
