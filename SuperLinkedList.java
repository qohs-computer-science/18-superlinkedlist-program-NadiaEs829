import java.util.LinkedList;
import java.util.Iterator;

public class SuperLinkedList extends LinkedList<String> {
    // this.
    
    Iterator <String> iter2 = this.iterator();

    public boolean removeVowels(){
        Iterator <String> iter = this.iterator();
        boolean isVowel = false;
        String vowels = "a,e,i,o,u,A,E,I,O,U";
        while(iter.hasNext()){
            if((iter.next()).equals(vowels)){ 
                iter.remove();
                isVowel = true;
                iter = this.listIterator();
            }//end if
        }//end while
        return isVowel;
        //return false;
    }//end method

    public boolean removeConsonants() {
        String vowels = "a,e,i,o,u,A,E,I,O,U";
        boolean isConson = false;
        iter2 = this.iterator();
        while(iter.hasNext()){
            if(!(iter.next().equals(vowels))){ 
                iter.remove();
                isConson = true;
            }//end if
        }//end while
        return isConson;
        //return false;
    }//end method

    public LinkedList<String> removeDuplicates() {
        iter = this.listIterator();
        //for(int i = ){

        //}//end for looop
        return null;
    }//end method

    public LinkedList<String> concatenateStrings() {
        iter = this.listIterator();
        LinkedList <String> conCat = new LinkedList <String>();
        return null;
    }//end method

    public LinkedList<String> mix(LinkedList<String> list2) {
        //use 2 iterators
        return null;
    }//end method

    public String toString() { //Doens't work or just return the list
        iter = this.listIterator();
        String finalStr = "";
        while(iter.hasNext()){
            finalStr += iter.next() + ", ";
        }
        return finalStr;
    }//end method
    //return "";
} // end SuperLinkedList