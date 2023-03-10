import React from 'react'
import { Link } from 'react-router-dom'
import { ListGroup, ListGroupItem } from 'reactstrap'

export default function Menu() {
  return (
    <div>
      <ListGroup>
        <Link tag="a" to="/" action >Home</Link>
        <Link tag="a" to="/add-course" action >Add Course</Link>
        <Link tag="a" to="/view-course" action>View Courses</Link>
        <Link tag="a" to='/about' >About</Link>
        <Link tag="a" to='/contact' >Contact</Link>
    </ListGroup>
    </div>
  )
}
