import './App.css'
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Home from './Pages/Home';
import About2 from './Components/About2';
import Header from './Components/Header';
import Footer from './Components/Footer';
import Sect2 from './Components/Sect2';
import Navigation from './Components/Navigation';
import Portofolio from './Components/Portofolio';
import Chestionar from './Components/Chestionar';
import Login from './Components/Login/Login';
import Search from './Components/Search';
import Cautare2 from './Components/Cautare2';
import Body from './Components/Body';
import Evenimente from './Components/Evenimente';
import SignUp from './Components/Login/SignUp';
import Cautare from './Components/Cautare';
import AddAnunt from './Components/AddAnunt';
import Eveniment from './Components/Eveniment';

function App() {


  return (
    <div>
      <Header />
      <Router>
        <Routes>
          <Route path="/" element={<Body />} />
          <Route path="/about" element={<About2 />} />
          <Route path="/login" element={<Login />} />
          <Route path="/signup" element={<SignUp />} />
          <Route path="/contact" element={<Chestionar />} />
          <Route path="/evenimente" element={<Evenimente />} />
          <Route path="/eveniment" element={<Eveniment />} />
          <Route path="/cautare" element={<Cautare />} />
          <Route path="/cautare2" element={<Cautare2 />} />
          <Route path="/addanunt" element={<AddAnunt />} />
        </Routes>
      </Router>
      <Footer />


    </div>
  )
}

export default App
