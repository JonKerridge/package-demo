package jonkerridge.librarytest

import org.junit.Test
import jonkerridge.library.StringMethods

class Test1 {
  @Test
  public void test(){
    def sm = new StringMethods()
    String s1 = "Hello"
    String s2 = "Jon"
    String hj = sm.addWithSpace(s1, s2)
    println "The result is $hj"
    assert (hj == "Hello Jon") : "Failed: got $hj expected :Hello Jon:"
  }

}
