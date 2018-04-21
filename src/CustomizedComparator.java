import java.util.TreeSet;

public class CustomizedComparator {
    public static void main(String[] args) {
        TreeSet<Employee> employees = new TreeSet<>();
        employees.add(new Employee(1,"Jana"));
        employees.add(new Employee(10,"Rao"));
        employees.add(new Employee(23,"Ramesh"));
        employees.add(new Employee(3,"Raghu"));
        employees.add(new Employee(3,"Ram"));
        System.out.println(employees);
    }
}

class Employee implements Comparable {
    int emplid;
    String emplName;
    Employee(int emplid,String emplName){
            this.emplid = emplid;
            this.emplName = emplName;
    }

    @Override
    public String toString() {
        return "Empl Id:" + emplid + ",emplName" + emplName;
    }

    @Override
    public int compareTo(Object o) {
        System.out.println("Compare To:::::"+this.emplid +" ,o.emplid"+((Employee)o).emplid);
        if (this.emplid < ((Employee) o).emplid)
            return -1;
        else if (this.emplid > ((Employee) o).emplid)
            return 1;
        else
            return this.emplName.compareTo(((Employee) o).emplName);
    }
}
