import java.util.LinkedList;

class SLLTester {
  public static void main(String[] args) {
    //create linkedlist 
    LinkedList<String> list1 = new LinkedList <String>();
    LinkedList<String> list2 = new LinkedList <String>();
    LinkedList<String> list3 = new LinkedList <String>();

    list1.add("H");
    list1.add("a");
    list1.add("p");
    list1.add("p");
    list1.add("y");

    list2.add("A");
    list2.add("A");
    list2.add("A");
    list2.add("A");
    list2.add("A");

    list3.add("U");
    list3.add("n");
    list3.add("s");
    list3.add("o");
    list3.add("L");
    list3.add("v");
    list3.add("E");
    list3.add("D");
    
    System.out.println("This is list1: " + list1.removeVowels());
    System.out.println("This is list2: " + list2);
    System.out.println("This is list3: " + list3);
   //list1.removeVowels();
    
  } // end main
} // end class