import React, { Component } from "react"




class Carduri2 extends Component {
    constructor(props) {
        super(props)

        this.state = {}
    }

    render() {
        const names = [
            {
                nume: "Whiskers",
                localitatea: "Timisoara",
                desc: "Whiskers este un pisoi jucaus cu blana pufoasa, gasit in parcul din Bucuresti."
            },
            {
                nume: "Mittens",
                localitatea: "Timisoara",
                desc: "Mittens este o pisicuță adorabilă cu blăniță pufoasă, adoptată dintr-un adăpost din Brasov."
            },
            {
                nume: "Snowball",
                localitatea: "Timisoara",
                desc: "Snowball este un pisoias alb ca zăpada, crescut în grădina din Timisoara."
            },
            {
                nume: "Kiki",
                localitatea: "Timisoara",
                desc: "Pisica kiki"
            }

        ]
        return (
            <div >


                {
                    names.map(animal => <div class="card" >
                        <div class="thumb" id="three"></div>

                        <h3>{animal.nume}</h3>
                        <p class="price">{animal.localitatea}</p>
                        <hr />
                        <p class="desc">{animal.desc}</p>

                    </div>)

                }


            </div>
        )
    }
}
export default Carduri2