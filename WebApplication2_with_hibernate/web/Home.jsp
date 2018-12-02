<%-- 
    Document   : Home
    Created on : 15 Nov, 2018, 5:08:37 AM
    Author     : Parmjot Singh chahal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Home!</title>
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
    <style>
      .bg-img {
        background-image: url('bg_galaxy-s8_camera.jpg');
        background-attachment: fixed;
        margin-bottom: 0px;
        background-position: center;
        background-size: cover;
        background-repeat: no-repeat;
      }
    </style>
  </head>
  <body class="">
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
          <a href="#"class="navbar-item">
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
            <% if(session.getAttribute("Name")!=null){
                %>
                <div class="buttons">
                    <a href="userInfo.jsp" style="margin-right:10px;">
                    <button class="button is-white is-rounded">
                        <span class="icon">
                            <i class="fas fa-user-ninja"></i>
                        </span>
                        <span>
                    <%! String name;%>
                    <% name=(String)session.getAttribute("Name"); %>
                    <%=name%>
                        </span>
                    </button>
                    </a>
                <form action="Logout" ><button class="button is-info is-outlined">Logout</button></form>
                </div>
                <%
            } 
            else{   
                %>
          <div class="buttons">
            <a href="SignUp.jsp" class="button is-primary">Sign Up</a>
            <a href="LoginJsp.jsp" class="button is-light">Login</a>
          </div>
            <% } %>
        </div>
        <!-- Navigation bar Right side End=================================================================================================================-->
      </div>
    </nav>
    <!-- Navigation bar End=================================================================================================================-->

    <!-- Section one Start=================================================================================================================-->
    <section class="hero is-medium is-warning" style="margin-top:70px;">
      <div class="hero-body is-center">

          <div class="container is-center">
            <center>
              <h1 class="title">Create Events with ease</h1>
              <br>
              <h1 class="subtitle">Event managers is the best way to create your event for free.</h1>
              <a href="create.jsp" class="button is-danger">Create Events</a>
            <center>
          </div>

      </div>
    </section>
    <!-- Section one End===================================================================================================================-->

    <!-- Section two Start=================================================================================================================-->
    <section class="hero is-success">
        <div class="hero-body">
          <div class="container">
            <h1 class="title level-item" style="align:center;">How it works</h1>
              <div class="columns">
                <div class="column level">
                  <div class="tile is-vertical">
                    <center>
                    <p class="title">1. Register in a second</p>
                    <div class="level-item">
                      <div class="level-item"style="height:96px;width:96px;background-color:white;border-radius:48px;">
                        <figure class="image is-48x48" >
                          <img src="c4cdd7ba-n1_016015016015000000.png" >
                        </figure>
                      </div>
                    </div>
                    <br>
                    <p class="subtitle">No credit card required just try it out now.</p>
                    </center>
                  </div>
                </div>

                <div class="column level">
                  <div class="tile is-vertical">
                    <center>
                    <p class="title">2. Build your event online</p>
                    <div class="level-item">
                      <div class="level-item"style="height:96px;width:96px;background-color:white;border-radius:48px;">
                        <figure class="image is-48x48" >
                          <img src="7d3081ae-n2_017018017018000000.png" >
                        </figure>
                      </div>
                    </div>
                    <br>
                    <p class="subtitle">Finally, an event platform that does it all and is user friendly.</p>
                    </center>
                  </div>
                </div>

                <div class="column level">
                  <div class="tile is-vertical ">
                    <center>
                    <p class="title">3. Get the event started!</p>
                    <div class="level-item">
                      <div class="level-item"style="height:96px;width:96px;background-color:white;border-radius:48px;">
                        <figure class="image is-48x48" >
                          <img src="0270ca2c-n11_013013013013000000.png" >
                        </figure>
                      </div>
                    </div>
                    <br>
                    <p class="subtitle">Manage your event, including ticketing and check in.</p>
                    </center>
                  </div>
                </div>

              </div>
          </div>
        </div>
    </section>
    <!-- Section two End===================================================================================================================-->
    <section class="hero is-medium is-primary bg-img"  >
      <div class="hero-body" style="background-attachment:fixed;">
        <h1 class="title level-item">Search Events easily!</h1>
        <h1 class="subtitle level-item">Search for on going Events easily!</h1>
        <div class="buttons  level-item">
          <a href="search.jsp" class="button is-danger">
            <span class="icon" style="padding-right:10px;">
              <i class="fas fa-search"> </i>
            </span>
            Search <!-- text inside button -->
           </a>
        </div>
      </div>
    </section>

    <!--<footer> starts============================================================================================================================= -->

    <footer class="footer">
        <div class="content  is-light">
          <div class="level ">
            <div class="level-item">
              <div class="level-item  has-text-centered">
                <div  class="">
                        <a href="#" class="">
                          <span class="icon button is-info is-rounded is-centered">
                            <i class="fas fa-home is-rounded"></i>
                          </span>
                          <p class="is-3" style="color:black;">Home </p>
                        </a>
                </div>
              </div>
            </div>
            <div class="level-item">
              <div class="level-item  has-text-centered">
                <div  class="">
                        <a href="#" class="">
                          <span class="icon button is-info is-rounded is-centered">
                            <i class="fas fa-phone is-rounded"></i>
                          </span>
                          <p class="is-3 bd-footer-link" style="color:black;">Contact Us</p>
                        </a>
                </div>
              </div>
            </div>
            <div class="level-item">
              <div class="level-item  has-text-centered">
                <div  class="">
                        <a href="#" class="">
                          <span class="icon button is-info is-rounded is-centered">
                            <i class="fas fa-smile is-rounded"></i>
                          </span>
                          <p class="is-3 bd-footer-link" style="color:black;">About Us</p>
                        </a>
                </div>
              </div>
            </div>
          </div>
        </div>
    </footer>


    <!--<footer> end================================================================================================================================ -->

  </body>
</html>

