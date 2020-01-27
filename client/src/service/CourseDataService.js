import axios from 'axios';

const INSTRUCTOR = 'piyush97';
const PASSWORD = 'passs'
const COURSE_API_URL = 'https://localhost:8080'
const INSTRUCTOR_API_URL = `${COURSE_API_URL}/instructors/${INSTRUCTOR}`

class CourseDataService {

    retrieveAllCourses(name) {
        //console.log('executed service')
        return axios.get(`${INSTRUCTOR_API_URL}/courses`,
            //{ headers: { authorization: 'Basic ' + window.btoa(INSTRUCTOR + ":" + PASSWORD) } }
        );
    }
}

export default new CourseDataService();
