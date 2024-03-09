import java.util.*;

interface StudentIterator {
    public boolean has_next();
    public Student get_next();
}

class Student {
    private int rollno;
    private int totalmarks;

    public Student(int rollno, int totalmarks) {
        this.rollno = rollno;
        this.totalmarks = totalmarks;
    }

    public int get_totalmarks() {
        return totalmarks;
    }

    public void print() {
        System.out.print(rollno + " : " + totalmarks);
    }
}

class UGStudent extends Student {
    private String department;
    // Define the constructor
    public UGStudent(int rollno, int totalmarks, String department) {
        super(rollno, totalmarks);
        this.department = department;
    }

    public void print() {
        super.print();
        System.out.print(" : " + department);
    }
}

class StudentList<T extends Student> {
    private T s_arr[];

    public StudentList(T[] s_arr) {
        this.s_arr = s_arr;
    }

    public StudentIterator getIterator() {
        return new Iter();
    }

    private class Iter implements StudentIterator {
        private int i = -1;

        public boolean has_next() {
            // Complete the definition of this method
            return i < s_arr.length - 1;
        }

        public Student get_next() {
            i++;
            return s_arr[i];
        }
    }
}

class Sol4 {
    // Define function printTopper

    public static void printTopper(StudentIterator iterator) {
        Student maxStudent = iterator.get_next();

        while (iterator.has_next()) {
            Student currentStudent = iterator.get_next();
            if (currentStudent.get_totalmarks() > maxStudent.get_totalmarks()) {
                maxStudent = currentStudent;
            }
        }

        maxStudent.print();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] s1 = new Student[3];
        UGStudent[] s2 = new UGStudent[3];

        for (int i = 0; i < 3; i++) {
            int r = sc.nextInt();
            int t = sc.nextInt();
            s1[i] = new Student(r, t);
        }

        for (int i = 0; i < 3; i++) {
            int r = sc.nextInt();
            int t = sc.nextInt();
            String d = sc.nextLine().trim(); // read department
            s2[i] = new UGStudent(r, t, d);
        }

        StudentList<Student> sList = new StudentList<>(s1);
        printTopper(sList.getIterator());
        System.out.println();

        StudentList<UGStudent> uList = new StudentList<>(s2);
        printTopper(uList.getIterator());
    }
}
