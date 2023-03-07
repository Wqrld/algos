public class Main {
    public static void main(String[] args) {
        Tree t = new Tree();
        t.addNode(2);
        t.addNode(4);
        t.addNode(3);

        System.out.println(t.getNode(2));
        System.out.println(t.getNode(3));
        System.out.println(t.getNode(4));
        System.out.println(t.getNode(1));
        System.out.println(t.getNode(5));

    }

    public static class Tree {
        private Node root;
        public Tree () {
            this.root = new Node(0);
        }
        public Node getRoot() {
            return root;
        }

        public boolean getNode(Integer number) {
            Node n = this.getRoot();
            while (true) {
                if (number > n.num) {
                    if (n.right != null) {
                        n = n.right;
                    } else {
                        return false;
                    }
                } else if (number < n.num) {
                    if (n.left != null) {
                        n = n.left;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            }
        }

        public void addNode(Integer number) {
            Node n = this.getRoot();
            while (true) {
                if (number > n.num) {
                    if (n.right != null) {
                        n = n.right;
                    } else {
                        n.right = new Node(number);
                        break;
                    }
                } else if (number < n.num) {
                    if (n.left != null) {
                        n = n.left;
                    } else {
                        n.left = new Node(number);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    public static class Node {
        public Integer num;
        public Node left;
        public Node right;

        public Node(Integer num) {
            this.num = num;

        }
    }


}



