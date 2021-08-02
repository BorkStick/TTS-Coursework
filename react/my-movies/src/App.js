import './App.css';
import Collection from './components/Collection';
import Movie from './components/Movie';

function App() {
  return (
    <div className="App">
      
      <Collection title="movie about a thing"> 
      <Movie
        title="hackers"
        description="Hackers are blamed for making a virus that will capsize five oil tankers."
        year="1995"
        genre="Crime"
      />
      <Movie
        title="AntiTrust"
        description="A computer programmer's dream job at a hot Portland-based firm turns nightmarish when he discovers his boss has a secret and ruthless means of dispatching anti-trust problems."
        year="2001"
        genre="Action"
      />
      <Movie
        title="Swordfish"
        description="A covert counter-terrorist unit called Black Cell led by Gabriel Shear wants the money to help finance their war against international terrorism, but it's all locked away. Gabriel brings in convicted hacker Stanley Jobson to help him."
        year="2001"
        genre="Action"
      />
      </Collection>
     
    </div>
  );
}

export default App;
