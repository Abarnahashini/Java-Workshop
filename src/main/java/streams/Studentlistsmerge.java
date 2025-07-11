package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Studentlistsmerge {
    public static void main(String[]args){
        List<Integer> csrollno= Arrays.asList(1005,1008,1010,1011);
        List<Integer> csarollno= Arrays.asList(1006,1002,1020,1018);
        List<Integer> allrollno=Stream.concat(csrollno.stream(),csarollno.stream()).sorted().toList();
        System.out.println(allrollno);
    }
    
}
