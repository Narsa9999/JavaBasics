class ThisKeyword {
    A4 obj;

    ThisKeyword(A4 obj) {
        this.obj = obj;
    }

    void display() {
        System.out.println(obj.data);//using data member of A4 class
    }
}

class A4 {
    int data = 10;

    A4() {
        ThisKeyword b = new ThisKeyword(this);
        b.display();
    }

    public static void main(String args[]) {
        A4 a = new A4();
    }
}

