import React from 'react';

const Movie = ({title, description, year, genre}) => {
    return (
        <div className="card px-5">
            <h4>{title}</h4>
            <p>{description}</p>
            <p>{year}</p>
            <p>{genre}</p>
            
        </div>
    )
}

export default Movie;