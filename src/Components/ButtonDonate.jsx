import React from 'react';
import styled from "styled-components";
import MenuMobile from './MenuMobile';

function ButtonDonate() {
  return (
    <Container>
      <Button>DOAR</Button>
      <MenuMobile />
    </Container>
  )
}

export default ButtonDonate




const Button = styled.button`
  background: #A100FF;
  color: #fff;
  width: 113px;
  height: 37px;
  border-radius: 30px;
  border: none;
  box-shadow: 1px 1px 3px #555;

`;

