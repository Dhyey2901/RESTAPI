import './App.css';
import Header from './Components/Header';
import { Button, Col, Container, Row } from 'reactstrap';
import {ToastContainer,toast} from 'react-toastify';
import Home from './Components/Home.js';
// import Course from './Components/Course';
import AllCourses from './Components/AllCourses';
import AddCourse from './Components/AddCourse';
import Menu from './Components/Menu';
import {BrowserRouter as Router,Route, Routes} from 'react-router-dom';

function App() {
  
  return (
    <div>
    <Router>
      <ToastContainer/>
      <Container>
        <Header />
        <Row>
          <Col md={4}>
            <Menu/>
          </Col>
          <Col md={8}>
            <Routes>
            <Route path="/" element={<Home/>} exact/>
            <Route path="/add-course" element={<AddCourse/>} exact/>
            <Route path="/view-course" element={<AllCourses/>} exact/>
            {/* <Route path='/' component={}/> */}
            </Routes>
          </Col>
        </Row>
      </Container>
    </Router>
    </div>
  );
}

export default App;
