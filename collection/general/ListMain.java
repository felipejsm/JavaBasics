import java.nio.file.*;
import java.util.*;
import java.util.stream.Stream;



public class ListMain {
    public static void main(String[] args)  throws Exception {
        List<String> minhaListaString = new ArrayList<>();
        minhaListaString.addAll(new ListMain().leArquivoDeBandas());
        System.out.println(minhaListaString.size());
        System.out.println("******Original******");
        for(int index = 0, len = 10;index < len;index++) {
            System.out.println(minhaListaString.get(index));
        }
        System.out.println("******Sorting******");
        Collections.sort(minhaListaString);
        for(int index = 0, len = 10;index < len;index++) {
            System.out.println(minhaListaString.get(index));
        }
        System.out.println("******Sorting******");
        Collections.sort(minhaListaString);
        for(int index = 0, len = 10;index < len;index++) {
            System.out.println(minhaListaString.get(index));
        }
        
    }
    private List<String> leArquivoDeBandas() throws Exception{
        List<String> minhaListaString = new ArrayList<>();
        Path path = Paths.get(getClass().getClassLoader().getResource("indie_bands").toURI());
        StringBuilder sb = new StringBuilder();
        Stream<String> lines = Files.lines(path);
        lines.forEach(line -> minhaListaString.add(line));
        lines.close();
        return minhaListaString;
    }
}