class Counter {
    private int count = 0;

    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
    }
}

class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.increment();
        System.out.println(counter.getCount()); 
    }
}
