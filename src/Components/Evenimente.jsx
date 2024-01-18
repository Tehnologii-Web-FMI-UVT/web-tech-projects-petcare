import React, { Component } from 'react'
import TopEvenimente from './TopEvenimente'
import TabEvenimente from './TabEvenimente'
import BeginEvenimente from './BeginEvenimente'
import Portofolio from './Portofolio'
import LastEvenimente from './LastEvenimente'
import axios from 'axios';

class Evenimente extends Component {
    constructor(props) {
        super(props)
        this.state = {
            posts: []
        }
    }
    componentDidMount() {
        axios.get('http://localhost:8080/eveniment')
            .then(response => {
                console.log(response)
            })
    }

    render() {
        return (
            <div style={{
                background: "white"
            }}>

                <BeginEvenimente />
                <br /><br />
                <TabEvenimente />
                <LastEvenimente />

            </div >
        )
    }
}

export default Evenimente