
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class EmployeeRepository {

    Department department1=new Department(1,"Human Resourse",7882);
    Department department2=new Department(2,"IT",7883);
    Department department3=new Department(3,"Accounting and Finance",7884);
    Department department4=new Department(4,"Marketing",7885);
    Department department5=new Department(5,"Research and Development",7886);
    Department department6=new Department(6,"Purchasing",7887);

    Employee employee1=new Employee(1001,"sachin","Gande","8125369564", LocalDate.of(2020, 11, 9),"Trainee",25630d,1221,department1);
    Employee employee7=new Employee(1007,"anil","Akula","8673409876", LocalDate.of(2019, 12, 8),"Associate",20900d,1221,department1);

    Employee employee2=new Employee(1002,"sona","Vehu","8877703322", LocalDate.of(2015, 3, 7),"Developer",30955d,1223,department2);
    Employee employee8=new Employee(1008,"Rajesh","D.R","85459903322", LocalDate.of(2014, 3, 8),"Associate",20000d,1223,department2);
    Employee employee9=new Employee(1009,"Ramu","Kyatham","9087645231", LocalDate.of(2015, 5, 1),"Associate",31000d,1223,department2);

    Employee employee3=new Employee(1003,"Sai","Narendula","8919457027", LocalDate.of(2019, 3, 5),"SalesMangager",25000d,1222,department4);

    Employee employee4=new Employee(1004,"Komal","Ahera","8765432190", LocalDate.of(2010, 7, 2),"HR",35000d,1223,department5);

    Employee employee5=new Employee(1005,"Sohail","Saara","7684932011", LocalDate.of(2013, 1, 28),"Finance",23999d,1221,department3);
    Employee employee6=new Employee(1006,"Charan","Mogulla","9666798728", LocalDate.of(2019, 5, 15),"Developer",25600d,1221,department3);

    Employee employee10=new Employee(1100,"Pavan","Bodla","6789054321", LocalDate.of(2020, 12, 30),"Trainee",22999d,1221,null);
    Employee employee11=new Employee(1101,"Sam","Akkineni","9087654321", LocalDate.of(2000, 2, 17),"Trainee",23994d,1221,null);

    List<Employee> employees= Arrays.asList(employee1,employee2,employee3,employee4,employee5,employee6,employee7,employee8,employee9,employee10,employee11);

    public List<Employee> getEmployees() {
        return employees;
    }
}
