import java.util.LinkedList;
class SLLTester {
  
  public static void main(String[] args) {
    SuperLinkedList();
    //create linkedlist 
    LinkedList<String> list1 = SuperLinkedList<String>();
    SuperLinkedList list2 = new SuperLinkedList();
    SuperLinkedList list3 = new SuperLinkedList();

    list1.add("h");
    list1.add("a");
    list1.add("p");
    list1.add("p");
    list1.add("y");

    list2.add("A");
    list2.add("A");
    list2.add("A");
    list2.add("A");
    list2.add("A");

    list3.add("u");
    list3.add("n");
    list3.add("s");
    list3.add("o");
    list3.add("l");
    list3.add("v");
    list3.add("e");
    list3.add("d");

    System.out.println("This is list1: ");
    System.out.println(list1.toString());
    System.out.println("This is list2: ");
    System.out.println(list2.toString());
    System.out.println("This is list3: ");
    System.out.println(list3.toString());
   
    System.out.println("Removed vowels" + list1.removeVowels());
    //list1.mix(list2);
    
  } // end main
} // end class