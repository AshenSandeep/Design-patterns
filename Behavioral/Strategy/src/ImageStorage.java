public class ImageStorage{
    private Compressor compressor;
    private Filter filter;

    
    public ImageStorage(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }


    public void store(String fileNmae){
        compressor.compress(fileNmae);
        filter.fIlter(fileNmae);
        }

}