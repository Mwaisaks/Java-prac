import org.example.Movies;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class MoviesSpec {

    @Test
    public void moviesEmptyOrNot(){
        //Arrange; setup the data
        Movies movies = new Movies();

        //Act; call the methods
        List<String> list = movies.getMovies();

        //Assert; evaluation of conditions
        assertTrue(list.isEmpty());
    }
}
