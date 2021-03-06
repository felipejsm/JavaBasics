/**
 * Person
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age  = age;
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
    @Override
    public String toString() {
        return "Person [Name : "+this.name+", Age : "+this.age+" ]";
    }    
}