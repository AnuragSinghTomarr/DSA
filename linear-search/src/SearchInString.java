public class SearchInString {
  public static void main(String[] args) {
    String str = "Anurag";
    char target = 'z';

    System.out.println("Character " + target + " found: " + search2(str, target));
  }

  static boolean search(String str, char target) {
    if (str.length() == 0) {
      return false;
    }

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == target) {
        return true;
      }
    }
    return false;
  }

  static boolean search2(String str, char target) {
    for (char character : str.toCharArray()) {
      if (character == target) {
        return true;
      }
    }
    return false;
  }
}
