package collection;

import java.util.LinkedList;

public class Employee{
    Integer empId;
    String name;
    String mobile;

    public Employee(Integer empId,String name,String mobile){
        this.empId = empId;
        this.name = name;
        this.mobile = mobile;
    }
}

class EmpImpl{
    public static void main(String[] args) {
        LinkedList<Employee> list = new LinkedList<Employee>();

        Employee emp1 = new Employee(1,"abc","236879");
        Employee emp2 = new Employee(2,"pqr","12345");
        Employee emp3 = new Employee(3,"xyz","09876");

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);



        list.forEach(s->{
            System.out.println("employee Id : "+s.empId+",  name : "+s.name+",  mobile number "+s.mobile);
        });
    }
}
