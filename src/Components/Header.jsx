import react from "react";
import styled from "styled-components";
import ButtonDonate from './ButtonDonate';

const Header = () => {
    return (
        <nav class="navbar navbar-expand-lg navbar-light fixed-top py-3" id="mainNav">
            <div class="container px-4 px-lg-5">

                <button class="navbar-toggler navbar-toggler-right" type="button" data-bs-toggle="collapse"
                    data-bs-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false"
                    aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav ms-auto my-2 my-lg-0">
                        <li class="nav-item"><a class="nav-link" href="/">Acasa</a></li>
                        <li class="nav-item"><a class="nav-link" href="/about">Despre</a></li>
                        <li class="nav-item"><a class="nav-link" href="/addanunt">Adauga Anunt</a></li>
                        <li class="nav-item"><a class="nav-link" href="/evenimente">Evenimente</a></li>
                        <li class="nav-item"><a class="nav-link" href="/contact">Contact</a></li>
                        <li class="nav-item"><a class="nav-link" href="/login">Login</a></li>

                    </ul>
                </div>
            </div>
        </nav>
    )
}

export default Header;

const header = styled.div`
     background: #fff;
     text-align: center;
 `;

const NavBar = styled.div`
    background: #FFC233;
    height: 60px;

`;
