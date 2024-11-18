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
        Iterator <String> iter = this.iterator();
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
        Iterator <String> iter = this.iterator();
        //for(int i = ){

        //}//end for loop
        return null;
    }//end method

    public LinkedList<String> concatenateStrings() {
        Iterator <String> iter = this.iterator();
        LinkedList <String> conCat = new LinkedList <String>();
        while(iter.hasNext()){
            conCat.add(iter.next());
            conCat.add(iter.previous() + iter.next())
        }//end while
        return null;
    }//end method

    public LinkedList<String> mix(LinkedList<String> list2) {
        LinkedList<String> listMix = new LinkedList<String>();
        Iterator <String> iter = this.iterator();
        Iterator <String> iter2 = list2.iterator();
        while(iter.hasNext() && iter2.hasNext()){
             listMix.add(iter.next());
             listMix.add(iter2.next());
        }//end while loop
        //use 2 iterators
        return null;
    }//end method

    public String toString() { //Doens't work or just return the list
        Iterator <String> iter = this.iterator();
        String finalStr = "";
        while(iter.hasNext()){
            finalStr += (iter.next() + ", ");
        }
        return finalStr;
    }//end method
} // end SuperLinkedList