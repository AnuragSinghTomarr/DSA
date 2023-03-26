import java.util.*;
public class ArrayListExample {
  public static void use1DArrayList() {
    ArrayList<Integer> list = new ArrayList<>();

    // add a element
    list.add(1);
    list.add(2);
    list.add(3);

    System.out.println(list);

    list.remove(1);

    System.out.println(list);

    System.out.println(list.contains(3));
  }

  public static void arrayList1DInput() {
    ArrayList<Integer> list = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    for (int i = 0; i < 5; i++) {
      System.out.print("Enter " + (int)(i+1) + " element: ");
      list.add(in.nextInt());
      System.out.println();
    }

    System.out.println("Size " + list.size());

    // traverse arraylist element
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + " ");
    }

    System.out.println();

    for (Integer ele : list) {
      System.out.print(ele + " ");
    }
  }

  public static void arrayList2DInput() {
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    // initialisation
    for (int i = 0; i < 3; i++) {
      list.add(new ArrayList<>());
    }

    // add items to list
    for (int i = 0; i < list.size(); i++) {
      for (int j = 0; j < 2; j++) {
        list.get(i).add(1);
      }
    }

    System.out.println(list);
  }
  public static void main(String[] args) {
//    use1DArrayList();
//    arrayList1DInput();
    arrayList2DInput();
  }
}
