import React from 'react'
import { Card, CardBody } from 'reactstrap'

export default function Header({ name, title }) {
  return (
    <div>
      <Card>
        <CardBody className='my-2 bg-warning'>
          <h1 className='text-center my-2'>
            Welcome to courses application.
          </h1>
        </CardBody>
      </Card>
    </div>
  )
}
