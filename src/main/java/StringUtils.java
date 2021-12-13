import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SplittableRandom;

public class StringUtils {

  public List<String> getDuplicates(List<String> list) {
    List<String> result = new ArrayList<>();

    for (int i = 0; i < list.size(); i++) {

      int counter = 0;

      for (int j = 0; j < list.size(); j++) {

        if (list.get(i).equals(list.get(j))) {
          counter++;
        }
      }
      if (counter > 1) {
        result.add(list.get(i));
      }
    }

    return result;
  }

  public Set<String> getUniqueWords(List<String> words){
    Set<String> result = new HashSet<>();
    words.forEach(word ->result.add(word));
    return result;
  }




  public String getLongestWord(List<String> list) {
    var longestWord = list.get(0);
    for (int i = 0; i < list.size(); i++) {
      if (longestWord.length() < list.get(i).length()) {
        longestWord = list.get(i);
      }
    }
    return longestWord;
  }
}
