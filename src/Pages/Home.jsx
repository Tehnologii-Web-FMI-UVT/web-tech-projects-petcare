import BeforeAdopting from './BeforeAdopting';
import NGOs from './NGOs';
import React from 'react';
import HowItWorks from './HowItWorks';

const Home = () => {
    return(
        <div>
            <h1>Home</h1>
            <HowItWorks />
            <NGOs />
            <BeforeAdopting />        
        </div>
    )
}

export default Home;