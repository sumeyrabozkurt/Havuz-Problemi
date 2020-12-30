package havuzproblemi;

import java.awt.Point;


public class Node {
    
    private  Point nodePoint;
    private  String nodeName;

    public Node() {
    }

    public Point getNodePoint() {
        return nodePoint;
    }

    public void setNodePoint(Point nodePoint) {
        this.nodePoint = nodePoint;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }
    
    
}
