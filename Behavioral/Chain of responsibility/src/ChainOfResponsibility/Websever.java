package ChainOfResponsibility;

public class Websever {
    private Handler handler;
    
    public Websever(Handler handler) {
        this.handler = handler;
    }

    public void handle(HttpRequest request){
       handler.handle(request);
}
}