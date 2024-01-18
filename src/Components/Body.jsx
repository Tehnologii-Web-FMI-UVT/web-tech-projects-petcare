import React, { Component } from 'react'

import About from './About';
import Header from './Header';
import Footer from './Footer';
import Sect2 from './Sect2';
import Navigation from './Navigation';
import Portofolio from './Portofolio';
import Chestionar from './Chestionar';
import Login from './Login/Login';
import Search from './Search';

function Body() {
    return (
        <div>

            <About />
            <Search />
            <Navigation />


            <Sect2 />

        </div>

    )
}

export default Body

