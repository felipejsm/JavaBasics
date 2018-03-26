
import java.util.stream;
import java.util.stream.Stream;
/**
 * PersonMain
 */
public class PersonMain {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
            new Person("Rogerinho do Ingá", 27),
            new Person("Renan da Van", 30),
            new Person("Pedro", 40)
        );
        if(false) {
            Person result = getStudentByName(persons, "Pedro");
            System.out.println(result.toString());
        } else {
            java8Way(persons);
        }
    }
    private static Person getStudentByName(List<Person> persons, String name) {
        Person result = null;
        for(Person p : persons) {
            if(name.equalsIgnoreCase(p.getName()) ) {
                result = p;
            }
        }
        return result;
    }
    private static void java8Way(List<Person> persons) {
        Person result1 = persons.stream()
                        .filter(p -> "Pedro".equals(p.getName()))
                        .findAny()
                        .orElse(null);
        System.out.println(result1.toString());

        Person result2 = persons.stream()
                         .filter(p -> "xuxa".equals(p.getName()))
                         .findAny()
                         .orElse(null);
        System.out.println(result2);
    }
}