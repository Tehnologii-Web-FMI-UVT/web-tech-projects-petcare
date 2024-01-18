import React, { Component } from 'react'
import axios from 'axios'


class Login extends Component {
    constructor(props) {
        super(props)
        this.state = {
            email: '',
            password: ''
        }
    }
    handleEmailChange = (event) => {
        this.setState({
            email: event.target.value
        })
    }
    handlePasswordChange = (event) => {

        this.setState({ password: event.target.value })
    }

    componentDidMount() {
        axios.get('http://localhost:8080/eveniment')
            .then(response => {
                console.log(response)
            })
    }

    render() {
        return (<div>

            <div class="limiter">
                <div class="container-login100">
                    <div class="wrap-login100">
                        <div class="login100-pic js-tilt" data-tilt>
                            <img src="images/img-01.png" alt="IMG" />
                        </div>

                        <form class="login100-form validate-form" onSubmit={this.handleSubmit}>
                            <span class="login100-form-title">
                                Member Login
                            </span>

                            <div class="wrap-input100 validate-input" data-validate="Valid email is required: ex@abc.xyz">
                                <input class="input100" type="text" name="email" placeholder="Email" value={this.state.email} onChange={this.handleEmailChange} />
                                <span class="focus-input100"></span>
                                <span class="symbol-input100">
                                    <i class="fa fa-envelope" aria-hidden="true"></i>
                                </span>
                            </div>

                            <div class="wrap-input100 validate-input" data-validate="Password is required">
                                <input class="input100" type="password" name="pass" placeholder="Password" value={this.state.password} onChange={this.handlePasswordChange} />
                                <span class="focus-input100"></span>
                                <span class="symbol-input100">
                                    <i class="fa fa-lock" aria-hidden="true"></i>
                                </span>
                            </div>

                            <div class="container-login100-form-btn">
                                <a href="/">
                                    <button class="login100-form-btn" type="submit">
                                        Login
                                    </button>
                                </a>
                            </div>



                            <div class="text-center p-t-136">
                                <a class="txt2" href="/signup">
                                    Create your Account
                                    <i class="fa fa-long-arrow-right m-l-5" aria-hidden="true"></i>
                                </a>
                            </div>
                        </form>
                    </div>
                </div>
            </div>

            <script src="vendor/jquery/jquery-3.2.1.min.js"></script>

            <script src="vendor/bootstrap/js/popper.js"></script>
            <script src="vendor/bootstrap/js/bootstrap.min.js"></script>

            <script src="vendor/select2/select2.min.js"></script>

            <script src="vendor/tilt/tilt.jquery.min.js"></script>
            <script src="js/query.js"></script>

            <script src="js/main.js"></script>
        </div>
        )
    }
}

export default Login