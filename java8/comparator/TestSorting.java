import java.util.*;
import java.util.stream.Stream;
import java.math.*;
/**
 * TestSorting
 */
public class TestSorting {

    public static void main(String[] args) {
        List<Developer> listDevs = getDevelopers();
        System.out.println("BEFORE");
        listDevs.forEach((dev) -> System.out.println(dev.toString()));
        System.out.println("AFTER");
        listDevs.sort((Developer devA, Developer devB) -> devA.getAge() - devB.getAge() );
        
        listDevs.forEach((dev) -> System.out.println(dev.toString()));
    }    
    private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
		result.add(new Developer("alvin", new BigDecimal("80000"), 20));
		result.add(new Developer("jason", new BigDecimal("100000"), 10));
		result.add(new Developer("iris", new BigDecimal("170000"), 55));
		
		return result;

	}
}

class Developer {
    private String name;
    private BigDecimal salary;
    private int age;
    public Developer(String name, BigDecimal salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Name "+this.name+"| Salary "+this.salary+"| Age "+this.age;
    }
    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @param salary the salary to set
     */
    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @return the salary
     */
    public BigDecimal getSalary() {
        return salary;
    }
}