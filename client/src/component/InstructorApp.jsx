import React, { Component } from 'react';
import ListCoursesComponent from './ListCoursesComponent';

class InstructorApp extends Component {
    render() {
        return (
            <div>
                <h1>Instructor Application</h1>
                <ListCoursesComponent />
            </div>
        )
    }
}

export default InstructorApp;
