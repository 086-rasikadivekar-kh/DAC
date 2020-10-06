package q1;

class student {
    public int rno;
    public String name;

    static public int count = 0;

    student() {
        count++;

    }

    void setData(int rollno, String sname) {
        rno = rollno;
        name = sname;
    }

    void showData() {
        System.out.println("Rollno: " + rno + " Name: " + name);

    }

    static void Count() {
        System.out.println("Object no: " + count);

    }
}

public class q32 {

    public static void main(String[] args) {
        student s = new student();
        student e2 = new student();
        student e3 = new student();
        s.setData(118, "Shweta");
       
        s.showData();
        
        student.Count();

    }
}