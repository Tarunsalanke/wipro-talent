class Super {
    public void display() {
        System.out.println("Super class display method");
    }
}

class Sub extends Super {
    @Override
    public void display() {
        super.display();
        System.out.println("Sub class display method");
    }
}

class DemoSuper {
    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.display();
    }
}
