class TreeBoundaryTraversal {
    ArrayList<Integer> boundaryTraversal(Node node) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(node == null) return res;
        res.add(node.data);
        
        addLBound(node.left, res);
        if(!isLeaf(node)) addLeafNodes(node, res);
        addRBound(node.right, res);
        
        return res;
    }
    
    void addLBound(Node node, ArrayList<Integer> res) {
        while(node != null) {
            if(!isLeaf(node)) res.add(node.data);
            node = (node.left != null) ? node.left : node.right;
        }
    }
    
    void addLeafNodes(Node node, ArrayList<Integer> res) {
        if(node == null) return;
        if(isLeaf(node)) {
            res.add(node.data);
            return;
        }
        
        addLeafNodes(node.left, res);
        addLeafNodes(node.right, res);
    }
    
    void addRBound(Node node, ArrayList<Integer> res) {
        Stack<Integer> stack = new Stack<>();
        
        while(node != null) {
            if(!isLeaf(node)) stack.push(node.data);
            node = (node.right != null) ? node.right : node.left;
        }
        while(!stack.isEmpty()) {
            res.add(stack.pop());
        }
    }
    
    boolean isLeaf(Node node) {
        return (node.left == null && node.right == null);
    }
}
