import React from 'react';
import '../styles/Collection.css'

const Collection = ({children, title}) => {
    return (
        <div>
        
            <h2 className="primary-subheadline">{title}</h2>
            {children}
         
        </div>
    )
}

export default Collection;