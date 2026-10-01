class LRUCache {
    int capacity;
    Map<Integer, Node> map;
    Node head;
    Node tail;

    class Node{
        int val;
        int key;
        Node next;
        Node prev;
        public Node (int key, int val){
            this.val = val;
            this.key = key;
            prev = null;
            next = null;
        }
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
        map = new HashMap<>();
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            update(map.get(key));
            return map.get(key).val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.val = value;
            update(node);
        }
        else{
            Node node = new Node(key, value);

            if(map.size() == capacity){
                Node last = tail.prev;
                delete(last);
                map.remove(last.key);
            }

            add(node);
            map.put(key, node);
        }
    }

    public void add(Node node){
        Node cur = head.next;
        cur.prev = node;
        node.next = cur;
        head.next = node;
        node.prev = head;
    }

    public void delete(Node node){
        Node next = node.next;
        Node prev = node.prev;
        next.prev = prev;
        prev.next = next;
    }

    public void update(Node node){
        delete(node);
        add(node);
    }

}

