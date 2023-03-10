import React, { useState,useEffect } from 'react';
import { Button } from 'reactstrap';
import Course from './Course';

export default function AllCourses() {

    useEffect(() => {
            alert("Testing....")
    }, []);

    const [courses, setCourses] = useState(
        [
            { title: "Java courses", description: "This is java course" },
            { title: "PHP courses", description: "This is php course" },
            { title: "Python courses", description: "This is python course" },
            { title: "Reactjs courses", description: "This is reactjs course" },
        ]
    );

    return (

        <div>

            <Button onClick={() =>{
                console.log("Test");
                setCourses([...courses,
                    {title: "Hello World",
                    description: "This is demo course",
            },])
            }}>
                Test
            </Button>
            <h1>AllCourses</h1>
            <p>List of all the courses</p>
            {
                courses.length > 0 ? courses.map((item) => <Course course={item}></Course>)
                    : "No Courses"
            }
        </div>
    )
}
