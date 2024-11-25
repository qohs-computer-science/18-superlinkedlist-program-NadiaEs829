import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class SuperLinkedList extends LinkedList<String> {
    //Iterator <String> iter2 = this.iterator();

    public boolean removeVowels(){
        Iterator <String> iter = this.iterator();
        boolean isVowel = false;
        //String vowels = "a,e,i,o,u,A,E,I,O,U";
        while(iter.hasNext()){
            if(iter.equals(vowels)){ 
                iter.remove();
                isVowel = true;
            }//end if
        }//end while
        return isVowel;
    }//end method


    public boolean removeConsonants() {
        Iterator <String> iter = this.iterator();
        String vowels = "a,e,i,o,u,A,E,I,O,U";
        boolean isConson = false;
        while(iter.hasNext()){
            if((iter.next() != vowels)){ 
                iter.remove();
                isConson = true;
            }//end if
        }//end while

        return isConson;
        //return false;
    }//end method

    public LinkedList<String> removeDuplicates() {

        Iterator <String> iter = this.iterator();
        
        for(int i = 0; i <= this.size(); i++){
            String firstVal = iter.get(i);
            while(iter.hasNext()){
                if(firstVal.equals(firstVal.get(i++)))
                    iter.remove();
            }//end while
        }//end for loop
        return iter;
    }//end method

    public LinkedList<String> concatenateStrings() {
        LinkedList <String> conCat = new LinkedList <String>();
        Iterator <String> iter = this.iterator();
        String val = iter.next();
        if(iter.hasNext() == false){
            conCat.add(iter.next());
            return conCat;
        }//end if 
        while(iter.hasNext()){
            conCat.add(val);
            conCat.add(val + iter.next());
            val = iter.next().iter.next();
        }//end while
        return conCat;
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
        return listMix;
    }//end method

    public String toString(){
        Iterator <String> iter = this.iterator();
        String finalStr = "";
        while(iter.hasNext()){
            finalStr += (iter.next() + ", ");
        }
        return finalStr;
    }//end method
} // end SuperLinkedList