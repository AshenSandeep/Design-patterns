package Iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private List<String> urls = new ArrayList<>();

    public void push(String url){
        urls.add(url);
    }
    public String pop(){
        var lastindex = urls.size()-1;
        var lastUrl = urls.get(lastindex);
        urls.remove(lastindex);
        return lastUrl;
    }

    public List<String> getUrls() {
        return urls;
    }
    public Iterator createIterator(){
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator{    //nested class

        private BrowseHistory history;
        private int index;

        public ListIterator(BrowseHistory history){
            this.history = history;

        }
        @Override
        public String Currunt() {
            return history.urls.get(index);
        }

        @Override
        public boolean hasnext() {
            return (index<urls.size());
        }

        @Override
        public void next() {
           index++;
            
        }
        
    }
}
