import React, { Component } from 'react';
import ListCoursesComponent from './ListCoursesComponent';
import LoginComponent from '../LoginComponent';

class InstructorApp extends Component {
    render() {
        return (
            <div>
                <h1>Instructor Application</h1>
                <ListCoursesComponent />
                <LoginComponent/>
            </div>
        )
    }
}

export default InstructorApp;
