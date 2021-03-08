package jonkerridge.library

/**
 * A collection of String processing methods
 */
class StringMethods {
  /**
   *
   * @param s1 a String
   * @param s2 a second String
   * @return String containing s1 + s2 with ONE intervening space
   */
  static String addWithSpace (String s1, String s2){
    String result = s1 + " " + s2
    return result
  }
  /**
   * no length checks are done
   *
   * @param s the string to be reversed
   * @return the string with the characters in reverse order
   */
  static String reverseString (String s ) {
    int length = s.length()
    String result = ""
    for (int i in 0 ..< length) {
      int c = (length-1) - i
      result = result + s[c]
    }
    return result
  }

}
