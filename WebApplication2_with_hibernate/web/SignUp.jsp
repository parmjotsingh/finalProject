<%-- 
    Document   : SignUp
    Created on : 14 Nov, 2018, 3:04:47 PM
    Author     : Parmjot Singh chahal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Sign Up!</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.7.2/css/bulma.min.css">
    <script defer src="https://use.fontawesome.com/releases/v5.3.1/js/all.js"></script>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script>
      $(document).ready(function() {

        // Check for click events on the navbar burger icon
        $(".navbar-burger").click(function() {

            // Toggle the "is-active" class on both the "navbar-burger" and the "navbar-menu"
            $(".navbar-burger").toggleClass("is-active");
            $(".navbar-menu").toggleClass("is-active");

        });
      });
    </script>
    <script>
            function validateForm() {
                var x = document.forms["SignUp"]["name"].value;
                var y = document.forms["SignUp"]["conatct"].value;
                var z = document.forms["SignUp"]["email"].value;
                var a = document.forms["SignUp"]["password"].value;
               
                if (x == "") {
                    document.SignUp.name.focus();
                    document.getElementById('name').innerHTML="Name field is invalid Please fill it"
                    return false;
                }
                if (y.length == 10) {
                    document.SignUp.contact.focus();
                    document.getElementById('conatct').innerHTML="Enter correct Mobile number"
                    return false;
                }
                if (!ValidateEmail(z)) {
                    document.getElementById('email').innerHTML="Enter vali email"
                    return false;
                }
                
                if (a.length < 8) {
                    document.SignUp.password.focus();
                    document.getElementById('password').innerHTML="Enter password of 8 characters or more"
                    return false;
                }
            }
            function ValidateEmail(inputText)
            {
                var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
                    if(inputText.value.match(mailformat))
                        {
                            return true;
                        }
                    else
                        {
                            document.SignUp.email.focus();
                            return false;
                        }
            }
    </script>
    <style>
  				.center{

  					margin: auto;
  				}

  	</style>
  </head>
  <body>
      <!-- Navigation start bar ====================================================================================================================-->
      <nav class="navbar is-dark is-fixed-top" role="navigation" aria-label="main navigation"  style="padding-top:10px;padding-bottom:10px;">
            <div class="navbar-brand">
              <div class="navbar-item" href="home.html">
                <img src="a.png" class="image is-32x32" style="padding-right:10px;">
                <h1 class="is-center">Event Managers</h1>
              </div>
              <a role="button" class="navbar-burger burger" aria-label="menu" aria-expanded="false" data-target="navbarBasic">
                <span aria-hidden="true"></span>
                <span aria-hidden="true"></span>
                <span aria-hidden="true"></span>
              </a>
            </div>
            <div id="navbarBasic" class="navbar-menu" style="padding-left:30px;padding-right:50px;">
              <div class="navbar-start">
                <a href="Home.jsp"class="navbar-item">
                  Home
                </a>
                <a class="navbar-item">
                  About us
                </a>
                <div class="navbar-item has-dropdown is-hoverable">
                  <a class="navbar-link">
                    Event
                  </a>
                  <div class="navbar-dropdown">
                    <a href="search.jsp" class="navbar-item">
                      Search
                    </a>
                    <a href="create.jsp" class="navbar-item">
                      Create
                    </a>
                    <hr class="navbar-divider">
                    <a class="navbar-item">
                      Report an issue
                    </a>
                  </div>
                </div>
              </div>
          <!-- Navigation bar Right side=================================================================================================================-->
          <div class="navbar-end">
            <div class="buttons">
              <a href="SignUp.jsp" class="button is-primary">Sign Up</a>
              <a href="LoginJsp.jsp" class="button is-light">Login</a>
            </div>
          </div>
          <!-- Navigation bar Right side End=================================================================================================================-->
        </div>
      </nav>
      <!-- Navigation bar End=================================================================================================================-->

      <%
                if(session.getAttribute("SignUpResult")==null){
             %>
      <section class="hero is-medium is-light">
         <div class="hero-body" >
             <div class="container" style="width:70%; border-radius:5px;border-width: 1px;border-style: solid;box-shadow: 10px 10px 10px grey;opacity:1;" >
               <form class="notification" action="SignUp" onsubmit="return validateForm()">
               <div class="field" style="padding:3px 3px 0px 3px;">
                 <div class="" style="padding-top:20px;padding-bottom:20px;">
                   <label class="label" >Name</label>
                   <div class="control ">
                       <input class="input" type="text" placeholder="Text input" name="name" required="Name">
                   </div>
                 </div>
               </div>
               <div class="field" style="padding:0px 3px 0px 3px;">
                <label class="label">Contact</label>
                  <div class="control has-icons-left has-icons-right is-medium">
                      <input class="input is-success" type="tel" placeholder="Mobile Number" required="Contact" name="contact">
                    <span class="icon is-small is-left">
                      <i class="fas fa-user"></i>
                    </span>
                    <span class="icon is-small is-right">
                      <i class="fas fa-phone"></i>
                    </span>
                  </div>
                <p class="help is-danger" id="name" ></p>
              </div>
              <div class="field"  style="padding:0px 3px 0px 3px;">
                <label class="label">Email</label>
                  <div class="control has-icons-left has-icons-right">
                      <input class="input is-info" type="email" placeholder="Email input" value="hello@" name="email">
                    <span class="icon is-small is-left">
                      <i class="fas fa-envelope"></i>
                    </span>
                    <span class="icon is-small is-right">
                      <i class="fas fa-envelope"></i>
                    </span>
                  </div>
                  <p class="help is-danger" id="email"></p>
                </div>
                <div class="field" style="padding:0px 3px 0px 3px;">
                  <label class="label">Password</label>
                  <div class="control has-icons-left has-icons-right">
                      <input class="input is-info" type="password" placeholder="Password" name="password">
                    <span class="icon is-small is-left">
                      <i class="fas fa-lock"></i>
                    </span>
                    <span class="icon is-small is-right">
                      <i class="fas fa-lock"></i>
                    </span>
                  </div>
                  <p class="help is-danger" id="password"></p>
                </div>
                <div class="field is-grouped-centered" style="padding:0px 3px 3px 3px;">
                  <div class="level-item">
                    <div class="control " >
                        <input class="button is-link" type="submit" value="Sign Up"><!--Sign up</button>-->
                      <a class="button is-text" href="Test.jsp" >Cancel</a>
                    </div>
                  </div>
                </div>
             </form>
           </div>
         </div>
      </section>
      <%
               }
                else{
              %>
              <section class="hero is-white is-large">
                  <div class="hero-body">
                      <div class="container is-fullheight">
                        <div class="level">
                            <div class="tile level-item" style="padding:20px;">
                                <p class="title">Login success full</p>
                                <br>
                                <a href="Home.jsp" class="button is-info" style="margin-left: 10px;">
                                                Next>>
                                        </a>
                            </div>
                        </div>
                      </div>
                  </div>
              </section>
            <%
                }
            %>
  </body>
</html>

