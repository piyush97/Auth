import React, { Component } from 'react';
import ListCoursesComponent from './ListCoursesComponent';
import LoginComponent from './LoginComponent';
import { Router, Switch, Route } from 'react-router-dom';

class InstructorApp extends Component {
    render() {
        return (
            <>
            <Router>
                <>
                    <Switch>
                        <Route path="/" exact component={LoginComponent} />
                        <Route path="/login" exact component={LoginComponent} />
                        {/* <AuthenticatedRoute path="/courses" exact component={ListCoursesComponent} /> */}
                    </Switch>
                </>
            </Router>
        </>
        )
    }
}

export default InstructorApp;
