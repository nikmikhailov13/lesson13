import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    List<String> stringList = new ArrayList<>();
    stringList.add("two");
    stringList.add("one");
    stringList.add("three");
    stringList.add("three");
    stringList.add("three1");


    System.out.println(stringList);

    var strUtils=new StringUtils();
    List<String> duplicates = strUtils.getDuplicates(stringList);

    duplicates.forEach(element-> System.out.println(element));
    System.out.println(strUtils.getLongestWord(stringList));

    List.of("one", "two");

    Set.of("one");

    Map<Integer, String> map = new HashMap<>();

    map.forEach((k, v) -> System.out.println(k + v));

    Set<String> uniqueWords = strUtils.getUniqueWords(stringList);
    System.out.println(uniqueWords);
    uniqueWords.forEach(System.out::println);

    System.out.println("Sorted");
    Collections.sort(stringList);


  }

}
