package Builder;

public class MovieBuilder implements PresentationBuilder{
    Movie movie = new Movie();

    @Override
    public void addSlide(Slide slide) {
        movie.addFrame(slide.getText(), 5);
        
    }

    public Movie getMovie() {
        return movie;
    }
    
}
