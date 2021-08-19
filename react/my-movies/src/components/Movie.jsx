import React from 'react';
import '../styles/Movie.css'

const Movie = ({title, img, description, year, genre}) => {
    return (
        <div className="card px-5">
            <div className="row">

            
            <div className="col">
            <img src={img} alt="image here" />

            </div>
            <div className="col" id="text">
            <h4 className="section-headline">{title}</h4>
            <p>{description}</p>
            <div className="row">
            <div className="col">
            <p className="meta">{year}</p>
            </div>
            <div className="col">
            <span className="btn btn-dark btn-sm meta">{genre}</span>

            </div>

            </div>

            </div>
            </div>
            
        </div>
    )
}

export default Movie;