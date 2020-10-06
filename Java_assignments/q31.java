package q1;

class Student {
    public int rno;
    public String name;

    void setData( int roln,  String sname) {
        rno = roln;
        name = sname;
    }

    void showData() {
        System.out.println(rno + " " + name + " ");
    }
}

public class q31 {
    public static void main(String[] args) {
        Student e = new Student();
        e.setData(118, "shweta");
        e.showData();
    }
}