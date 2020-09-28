public class Queue {
    private Node firstNode;

    public Queue(String value) {
        firstNode = new Node(value);
    }

    public Node add(String value) {
        return new Node(value, Node.cache);
    }

    public void remove() {
        firstNode = firstNode.next;
    }

    static class Node {
        private static Node cache;
        private String value;
//        private Node previous;
        private Node next;

        public Node(String value) {
            this.value = value;
            cache = Node.this;
        }

        public Node(String value, Node previous) {
            this.value = value;
//            this.previous = cache;
            previous.next = Node.this;
            cache = Node.this;
        }
    }

    static class Iterator {
        private Node cache;

        public Node next(Queue queue) {
            if (cache == null) {
                cache = queue.firstNode;
            } else {
                cache = cache.next;
            }
            return cache;
        }

        public boolean hasNext(Queue queue) {
            if (cache == null) {
                return queue.firstNode != null;
            }
            return cache.next != null;
        }
    }

    public static void main(String[] args) {
        Queue queueForBread = new Queue("Kostya");
        queueForBread.add("Ilya");
        queueForBread.add("Victor");
        queueForBread.add("Elena");
        queueForBread.add("Inna");
        queueForBread.add("Liza");
        queueForBread.remove();
        queueForBread.remove();
        Iterator breadIterator = new Iterator();
        while (breadIterator.hasNext(queueForBread)) {
            breadIterator.next(queueForBread);
            System.out.println(breadIterator.cache.value);
        }
    }
}

