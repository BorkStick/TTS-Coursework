import './App.css';
import Collection from './components/Collection';
import Movie from './components/Movie';

function App() {
  return ( <
    div className = "App" >

    <
    Collection title = "Movie About Space" >
    <
    Movie title = "2001 A Space Odesy"
    img = "https://images-na.ssl-images-amazon.com/images/I/815ex8QSniL._RI_.jpg"
    description = "After discovering a mysterious artifact buried beneath the Lunar surface, mankind sets off on a quest to find its origins with help from intelligent supercomputer H.A.L. 9000."
    year = "1968"
    genre = "Sci-Fi" /
    >
    <
    Movie title = "Interstellar"
    img = "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRZ6zThgOVkj9RFuoFIKyyyZl4E1zpxJrl-UjqRrOEV0DoRcDKY"
    description = "A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival."
    year = "2014"
    genre = "Sci-Fi" /
    >
    <
    Movie title = "Galaxy Quest"
    img = "https://www.themoviedb.org/t/p/w500/fZXSwgZknp81vmciTb86rw0MejV.jpg"
    description = "The alumni cast of a space opera television series have to play their roles as the real thing when an alien race needs their help. However, they also have to defend both Earth and the alien race from a reptilian warlord."
    year = "1999"
    genre = "Sci-Fi" /
    >
    <
    /Collection> <
    Collection title = "Movie About Computers" >
    <
    Movie title = "Hackers"
    img = "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcS2VTL3EQNQZpqxrE97WXeyTWckd0TfRJXL7XD4GXXBJmDzdf8O"
    description = "Hackers are blamed for making a virus that will capsize five oil tankers."
    year = "1995"
    genre = "Crime" /
    >
    <
    Movie title = "AntiTrust"
    img = "https://static.rogerebert.com/uploads/movie/movie_poster/antitrust-2001/large_1uYxy1buEOhr0hybdqLYDJh9zy9.jpg"
    description = "A computer programmer's dream job at a hot Portland-based firm turns nightmarish when he discovers his boss has a secret and ruthless means of dispatching anti-trust problems."
    year = "2001"
    genre = "Action" /
    >
    <
    Movie title = "Swordfish"
    img = "https://www.tvguide.com/a/img/catalog/provider/1/2/1-6949783834.jpg"
    description = "A covert counter-terrorist unit called Black Cell led by Gabriel Shear wants the money to help finance their war against international terrorism, but it's all locked away. Gabriel brings in convicted hacker Stanley Jobson to help him."
    year = "2001"
    genre = "Action" /
    >
    <
    /Collection>

    <
    /div>
  );
}

export default App;