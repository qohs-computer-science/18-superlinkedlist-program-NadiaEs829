import java.util.LinkedList;
import java.util.Iterator;

public class SuperLinkedList extends LinkedList<String> {
    // this.
    public boolean removeVowels() {
        Iterator <String> iter = this.listIterator();
        boolean isVowel = false;
        String vowels = "a,e,i,o,u,A,E,I,O,U";
        while(iter.hasNext()){
            if(iter.next().equals(vowels)){ 
                iter.remove();
                isVowel = true;
            }//end if
        }//end while
        return isVowel;
        //return false;
    }

    public boolean removeConsonants() {
        boolean isVowel = false;
        while(iter.hasNext()){
            if(iter.next.equals())

        }
        return false;
    }

    public LinkedList<String> removeDuplicates() {

        return null;
    }

    public LinkedList<String> concatenateStrings() {

        return null;
    }

    public LinkedList<String> mix(LinkedList<String> list2) {
        //use 2 iterators
        return null;
    }

    public String toString() {

        return "";
    }
} // end SuperLinkedList