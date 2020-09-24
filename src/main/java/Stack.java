import model.Node;

import java.util.Objects;

public class Stack {

    private Node rootNode = null;

    public int getSize() {
        if(rootNode == null){
            return 0;
        }

        int size = 1;

        Node currentNode = rootNode;

        while (!Objects.isNull(currentNode.getNext())){
            size++;
            currentNode = currentNode.getNext();
        }

        return size;
    }

    public int pop() {
        if(getSize() == 0){
            throw new IllegalArgumentException("Stack is Empty!");
        }

        if(getSize() == 1){
            Node removed = rootNode;
            rootNode = null;
            return removed.getValue();
        }

        Node lastNode = getLastNode();

        while (!Objects.isNull(lastNode.getNext())){
            lastNode = lastNode.getNext();
        }

        int removed = lastNode.getValue();
        lastNode.getPrevious().setNext(null);

        return removed;
    }

    public int push(int item) {
        Node lastNode = getLastNode();

        if(Objects.isNull(lastNode)){
            Node newNode = new Node();
            newNode.setValue(item);
            rootNode = newNode;
            return newNode.getValue();
        }

        Node newNode = new Node();
        newNode.setValue(item);
        newNode.setPrevious(lastNode);
        newNode.setNext(null);

        lastNode.setNext(newNode);
        return newNode.getValue();
    }

    public int peek() {
        Node lastNode = getLastNode();

        if(lastNode == null){
            throw new IllegalArgumentException("Stack is empty!");
        }

        return lastNode.getValue();
    }

    private Node getLastNode(){
        if(rootNode == null) return null;

        Node currentNode = rootNode;

        while (!Objects.isNull(currentNode.getNext())){
            currentNode = currentNode.getNext();
        }

        return  currentNode;
    }
}
