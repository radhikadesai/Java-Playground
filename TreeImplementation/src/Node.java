/**
 * Created by radhikadesai on 2/14/16.
 */
public class Node {
    String data;
    Node right;
    Node left;

    public Node(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getRight() {
        return right;
    }
    public Node getLeft() {
        return left;
    }

}
