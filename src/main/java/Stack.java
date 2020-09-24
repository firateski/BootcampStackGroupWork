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
}
