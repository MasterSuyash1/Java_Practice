import java.util.*;

class Employee implements Comparable<Employee> {
    int ID;
    int experience;
    int nleaves;

    public Employee(int i, int e, int l) {
        ID = i;
        experience = e;
        nleaves = l;
    }

    // Override equals(Object o) here
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return ID == employee.ID;
    }

    // Override compareTo(Object o) here
    @Override
    public int compareTo(Employee emp) {
        if (this.experience != emp.experience)
            return emp.experience - this.experience;
        else
            return this.nleaves - emp.nleaves;
    }
}

public class Sol2 {
    public static int displayID(Employee[] emp) {
        int max = 0;
        int n = 0;
        for (int i = 0; i < 4; i++) {
            int count = 0;
            for (int j = 0; j < 4; j++) {
                if (!emp[i].equals(emp[j])) {
                    count = count + emp[i].compareTo(emp[j]);
                }
            }
            if (count > max) {
                max = count;
                n = emp[i].ID;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] e = new Employee[4];
        e[0] = new Employee(sc.nextInt(), sc.nextInt(), sc.nextInt());
        e[1] = new Employee(sc.nextInt(), sc.nextInt(), sc.nextInt());
        e[2] = new Employee(sc.nextInt(), sc.nextInt(), sc.nextInt());
        e[3] = new Employee(sc.nextInt(), sc.nextInt(), sc.nextInt());
        int id = displayID(e);
        System.out.println(id);
    }
}
