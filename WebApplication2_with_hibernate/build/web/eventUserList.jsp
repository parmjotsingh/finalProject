<%-- 
    Document   : eventUserList
    Created on : 22 Nov, 2018, 1:34:04 PM
    Author     : Parmjot Singh chahal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
              <a href="search.html" class="navbar-item">
                Search
              </a>
              <a href="create.html" class="navbar-item">
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
            <a href="sign up.html" class="button is-primary">Sign Up</a>
            <a href="login.html" class="button is-light">Login</a>
          </div>
        </div>
        <!-- Navigation bar Right side End=================================================================================================================-->
      </div>
    </nav>
    <!-- Navigation bar End=================================================================================================================-->

    <!-- Section one Start=================================================================================================================-->
      <section class="hero is-fullheight is-warning">
        <div class="hero-body">
          <div class="container">
            <div class="level">
              <title class="title is-1 level-item">Registered Users</title>
            </div>
            <div class="level-item">
              <table class="table is-striped is-hoverable is-fullwidth is-bordered">
                <thead>
                  <tr>
                    <th><abbr title="Number">No.</abbr></th>
                    <th>Name</th>
                    <th>Email</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <th>1</th>
                    <td>Basketball tournament</td>
                    <td>chitkara university,baddi</td>
                  </tr>
                </tbody>
                <tfoot>
                  <tr>
                    <th><abbr title="Number">No.</abbr></th>
                    <th>Name</th>
                    <th>Email</th>
                  </tr>
                </tfoot>
              </table>
            </div>
          </div>
        </div>
      </section>
    <!--section one end-->
  </body>
</html>
