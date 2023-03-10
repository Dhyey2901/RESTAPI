import React, { Fragment, useEffect } from 'react'
import { Button, Form, FormGroup, Input, Label } from 'reactstrap';

export default function AddCourse() {
    useEffect(() => {
        document.title="Add Course";
});
    

    return (
        <Fragment>
            <h1>Add Course information</h1>
            <Form className='text-center'>
                <FormGroup>
                    <Label for="courseid">Course Id:</Label>
                    <Input type="text" name="courseid" id="courseid" placeholder="Enter here" />
                </FormGroup>
                <FormGroup>
                    <Label for="coursetitle">Course title</Label>
                    <Input type="text" name="coursetitle" id="coursetitle" placeholder="Enter here" />
                </FormGroup>
                <FormGroup>
                    <Label for="description">Course description</Label>
                    <Input type="textarea" name="coursedescription" id="coursedescription" placeholder="Enter here" style={{height:150}} />
                </FormGroup>
                <Button color='primary' outline size='lg'>Add</Button>
            </Form>
        </Fragment>

    )
}
