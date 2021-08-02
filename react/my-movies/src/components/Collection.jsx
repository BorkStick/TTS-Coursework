import React from 'react';
import Movie from './Movie'

const Collection = ({children, title}) => {
    return (
        <div>
            <h1>Collection</h1>
            <h2>{title}</h2>
            {children}
         
        </div>
    )
}

export default Collection;