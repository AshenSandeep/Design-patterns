public class Main {
    public static void main(String[] args){
        var imageStorage = new ImageStorage(new JpegCompressor(), new BWFilter() );
        imageStorage.store("Ashen");
    }
}
