import React, { Component } from "react"




class Carduri extends Component {
    constructor(props) {
        super(props)

        this.state = {}
    }

    render() {
        const names = [
            {
                nume: "Whiskers",
                localitatea: "Bucuresti",
                desc: "Whiskers este un pisoi jucaus cu blana pufoasa, gasit in parcul din Bucuresti."
            },
            {
                nume: "Coco",
                localitatea: "Cluj-Napoca",
                desc: "Coco este un catelus vesel cu ochi mari, adoptat dintr-un adapost din Cluj-Napoca."
            },
            {
                nume: "Buddy",
                localitatea: "Timisoara",
                desc: "Buddy este un iepuras simpatic gasit in gradina din Timisoara, cu o blanita pufoasa si urechi lungi."
            },
            {
                nume: "Fluffy",
                localitatea: "Iasi",
                desc: "Fluffy este un catelus jucăuș cu o blană moale, găsit într-un parc din Iasi."
            },
            {
                nume: "Mittens",
                localitatea: "Brasov",
                desc: "Mittens este o pisicuță adorabilă cu blăniță pufoasă, adoptată dintr-un adăpost din Brasov."
            },
            {
                nume: "Rocky",
                localitatea: "Constanta",
                desc: "Rocky este un hamster energic, găsit într-un magazin de animale din Constanta."
            },
            {
                nume: "Snowball",
                localitatea: "Timisoara",
                desc: "Snowball este un iepuraș alb ca zăpada, crescut în grădina din Timisoara."
            },
            {
                nume: "Oreo",
                localitatea: "Sibiu",
                desc: "Oreo este o pisică cu blăniță neagră și albă, găsită într-un cartier din Sibiu."
            },
            {
                nume: "Bubbles",
                localitatea: "Cluj-Napoca",
                desc: "Bubbles este un peștișor colorat, adăpostit într-un acvariu din Cluj-Napoca."
            },
            {
                nume: "Luna",
                localitatea: "Oradea",
                desc: "Luna este o broască țestoasă cu un design remarcabil, găsită lângă un lac din Oradea."
            },
            {
                nume: "Max",
                localitatea: "Ploiesti",
                desc: "Max este un câine cu blană scurtă și energie nelimitată, adoptat de la un adăpost din Ploiesti."
            },
            {
                nume: "Mocha",
                localitatea: "Galati",
                desc: "Mocha este un iepuraș cățărat, găsit într-un parc din Galati."
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
                    names.map(animal => <div class="card">
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
export default Carduri