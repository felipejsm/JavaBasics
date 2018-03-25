import java.nio.file.*;
import java.util.*;
import java.util.stream.Stream;



public class ListMain {
    public static void main(String[] args)  throws Exception {
        List<String> minhaListaString = new ArrayList<>();
        minhaListaString.addAll(new ListMain().leArquivoDeBandas());
        System.out.println(minhaListaString.size());
        System.out.println("******Original******");
        new ListMain().mostra(minhaListaString);
        System.out.println("******Sorting******");
        Collections.sort(minhaListaString);
        new ListMain().mostra(minhaListaString);

        System.out.println("******CompareTo prior java 8******");
        
        Collections.sort(minhaListaString, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            } 
        });
        
        new ListMain().mostra(minhaListaString);
    }
    private void mostra(List<String> lista ) {
        for(int index = 0, len = 10;index < len;index++) {
            System.out.println(lista.get(index));
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