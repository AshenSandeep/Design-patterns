package ChainOfResponsibility;

public class Main {
    public static void main(String [] args){
        //authentication --> logger -->Compressor
        var Compressor = new Compressor(null);
        var logger = new Logger(Compressor);
        var authenticator = new Authenticator(logger);

        var sever = new Websever(authenticator);
        sever.handle(new HttpRequest("admin", "1234"));
        //logger
        //compressor
    }
}
