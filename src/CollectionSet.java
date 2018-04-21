import java.util.*;

public class CollectionSet {
    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("D");
        lhs.add("Z");
        lhs.add("B");
        lhs.add("C");
        lhs.add(19);
        lhs.add(null);
        lhs.add(null);
        lhs.add(19);
        //Collections.binarySearch();
        System.out.println(lhs.add("B"));
        System.out.println(lhs);
        Set hs = new HashSet<String>();
        SortedSet ss = new TreeSet();
        ss.add(101);
        ss.add(102);
        ss.add(107);
        ss.add(103);
        ss.add(110);
        ss.add(104);
        String s;
        StringBuffer sb;
        // ss.add(null); null insertion not possible from SE 7.
        //ss.add(null);
        System.out.println(ss);
        System.out.println("Head of 103:"+ss.headSet(103) +"\nTail of 104:"+ss.tailSet(104)+"\nFirst:"+ss.first()+"\nLast"+ss.last()
        +"subset of 103,110"+ss.subSet(103,110));
        System.out.println("A".compareTo("Z"));
        Set<Student> students = new HashSet<>();
        students.add(new Student(12));
        students.add(new Student(12));
        System.out.println(students);
        TreeSet<Student> studentTreeSet = new TreeSet<>();
        studentTreeSet.add(new Student(12));
        studentTreeSet.add(new Student(12));
        System.out.println(studentTreeSet);
        Set<String> strings = new HashSet<>();
        strings.add("Jana");
        strings.add("Jana");
        strings.add("Jana");
        System.out.println(strings);

    }
}

class Student implements Comparable{
    int rollno;

    public Student(int rollno) {
        this.rollno = rollno;
    }

    public boolean equals(Object o) {
        return rollno == ((Student)o).rollno;
    }
    @Override
    public int compareTo(Object o) {
        Student student = ((Student)o);
        if(this.rollno > rollno){
            return 1;
        }
        else if(this.rollno < rollno)
            return -1;
        else
            return 0;
    }
}