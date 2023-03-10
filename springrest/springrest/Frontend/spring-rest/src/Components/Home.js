import React,{useEffect} from 'react';
// import {Component } from 'react-bootstrap';
import { Button } from 'reactstrap';

export default function Home() {
    useEffect(() => {
        document.title="Home || Learn code with Dhyey";
});
    return (
        <div>
            <div class="container-fluid bg-dark text-light p-5">
                <div class="container bg-dark p-5 text-center">
                    <h1 class="display-5">Learn code with Dhyey</h1>
                    <br/>
                    <p>
                        This is the application for the courses listed in the springboot application.
                    </p>
                    <Button color='primary' outline>Start Using</Button>
                </div>
            </div>
        </div>
    )
}
