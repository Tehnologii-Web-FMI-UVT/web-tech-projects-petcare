import React from 'react'
import BeginEvenimente from './BeginEvenimente'
import Carduri from './Carduri'
import Search2 from './Search2'
function Cautare() {
    return (
        <div>
            <Search2 />
            <br /><br /><br /><br /><br /><br />
            <div id="wrap">
                <Carduri />
            </div>
        </div>
    )
}

export default Cautare