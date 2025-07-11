package streams;

    import java.util.ArrayList;
import java.util.List;

public class NameStartsWithsCount {
    public static void main(String[]args){
        List<String> names=new ArrayList<>();
        names.add("alice");
        names.add("abarna");
        names.add("hashini");
        names.add("sarvesh");
        names.add("sri");
        names.add("Sha");
        names.stream()
        .filter(name-> name.startsWith("S")||name.startsWith("s")).distinct().map(String::toUpperCase).forEach(System.out::println);
        

    }
    
}

    

