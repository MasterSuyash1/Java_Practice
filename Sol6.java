import java.util.*;

class Person implements Comparable<Person>{
    private String name;
    private int age;
    private boolean comorbidity;
    
    public Person(String n, int a, boolean b){
        this.name = n; 
        this.age = a;
        this.comorbidity = b;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age; 
    }
    
    public boolean getComorbidity(){
        return comorbidity;
    }
    // Define compareTo() here
    @Override
    public int compareTo(Person o) {
        // People with comorbidity are given preference
        if (this.comorbidity && !o.comorbidity) {
            return -1;
        } else if (!this.comorbidity && o.comorbidity) {
            return 1;
        } else {
            // If both have comorbidity or none, the younger person gets preference
            return Integer.compare(this.age, o.age);
        }
    }
    // Override equals() here
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }
}

public class Sol6 {
    public static void displayPerson(ArrayList<Person> l){
        String name = "";
        int max = 0;
        for(Person p1 : l){
            int count = 0;
            for(Person p2 : l){
                if(!p1.equals(p2)){
                    count += p1.compareTo(p2);
                }
            }
            if(count > max){
                max = count;
                name = p1.getName();
            }
        }
        System.out.println(name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p1 = new Person(sc.next(), sc.nextInt(), sc.nextBoolean());
        Person p2 = new Person(sc.next(), sc.nextInt(), sc.nextBoolean());
        Person p3 = new Person(sc.next(), sc.nextInt(), sc.nextBoolean()); 
        
        ArrayList<Person> l1 = new ArrayList<Person>();
        l1.add(p1);
        l1.add(p2);
        l1.add(p3);
        
        displayPerson(l1);
    }
}
