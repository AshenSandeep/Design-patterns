package Iterator;

public class Main {
    public static void main(String [] args){
        var history = new BrowseHistory();
        history.push("a");
        history.push("b");
        history.push("c");
        history.push("5");
        history.push("0");
        history.push("9");

        Iterator iterator = history.createIterator();
        while(iterator.hasnext()){
            var url = iterator.Currunt();
            System.out.println(url);
            iterator.next();

        }
        
    }
}
