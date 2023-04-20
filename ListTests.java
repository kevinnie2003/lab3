import java.util.ArrayList;
import java.util.List;

import javax.print.DocFlavor.STRING;

import static org.junit.Assert.*;
import org.junit.*;

public class ListTests {
  @Test
  public void testFilter1() {
    List<String> list1 = new ArrayList<>();
    list1.add("a");
    list1.add("b");
    list1.add("c");

    List<String> list2 = new ArrayList<>();
    list1.add("a");
    list1.add("b");
    list1.add("c");
    
    
    StringChecker sc = new StringChecker() {
        return true;
    };
    assertEquals(list2, ListExamples.filter(list1, sc ));
  
}
}
