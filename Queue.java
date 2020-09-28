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
        private Node previous;
        private Node next;

        public Node(String value) {
            this.value = value;
            cache = Node.this;
        }

        public Node(String value, Node previous) {
            this.value = value;
            this.previous = cache;
            previous.next = Node.this;
            cache = Node.this;
        }
    }

    static class Iterator {
        private Node cache;

        public Node select(Queue queue) {
            cache = queue.firstNode;
            return cache;
        }

        public Node next() {
            if (hasNext() == true) {
                cache = cache.next;
                return cache;
            } else return null;
        }

        public Node previous() {
            if (hasPrevious() == true) {
                cache = cache.previous;
                return cache;
            } else return null;
        }

        public boolean hasPrevious() {
            return cache.previous != null;
        }

        public boolean hasNext() {
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
        Iterator breadIterator = new Iterator();
        breadIterator.select(queueForBread);
        while (breadIterator.hasNext()) {
            System.out.println(breadIterator.cache.value);
            breadIterator.next();
        }
        System.out.println(breadIterator.cache.value);
        System.out.println();

        while (breadIterator.hasPrevious()) {
            System.out.println(breadIterator.cache.value);
            breadIterator.previous();
        }
        System.out.println(breadIterator.cache.value);
    }
}

