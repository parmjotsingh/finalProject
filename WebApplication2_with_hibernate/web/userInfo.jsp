<%-- 
    Document   : userInfo
    Created on : 20 Nov, 2018, 4:08:08 AM
    Author     : Parmjot Singh chahal
--%>

<%@page import="java.util.List"%>
<%@page import="modal.UserInfo"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>User details!</title>
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
  				.center{

  					margin: auto;
  				}

  	</style>
  </head>
  <body>
      <!--Section one starts==================================================================================================================-->
        <section class="hero is-small is-dark" >
          <div class="hero-head">
            <!-- Navigation start bar ====================================================================================================================-->
            <nav class="navbar is-dark is-inverted" role="navigation" aria-label="main navigation"  style="padding-top:10px;padding-bottom:10px;">
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
                  <a href="Home.jsp" class="navbar-item">
                    Home
                  </a>
                  <a class="navbar-item">
                    About us
                  </a>
                  <div class="navbar-item has-dropdown is-hoverable">
                    <a class="navbar-link">
                      Event
                    </a>
                    <div class="navbar-dropdown is-boxed" style="background-color:#363636;">
                      <a href="search.jsp"  class="navbar-item">
                        Search
                      </a>
                      <a href="create.jsp"class="navbar-item">
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
          </div>
          <div class="hero-body">
            <div class="container" style="margin-top :30px;">
              <div class="level-item">
                <h1 class="title">USER DETAILS</h1>
              </div>
              <div class="level-item" style="margin-top : 40px;">
                <figure class="image is-256x256">
                  <!--
                  <span class="icon  is-large">
                    <i class="fas fa-user fa-3x"></i
                  </span>
                -->
                  <img src="https://bulma.io/images/placeholders/128x128.png" alt="" class="is-rounded">
                </figure>
              </div>
              <div class="level-item" style="margin-top : 100px;margin-bottom : 105px;">
                <table class="table is-hoverable is-bordered">
                  <tbody>
                      <%!String s;
                        List l=new ArrayList();
                        RequestDispatcher rd; 
                        UserInfo obj=new UserInfo();
                      %>
                      <% 
                          l=obj.info((String)session.getAttribute("Email"));
                       %>
                    <tr>
                      <th>Name</th>
                      
                      <th><%=(String)l.get(0)%></th>
                    </tr>
                    <tr>
                      
                      <th>Email</th>
                      <th><%=(String)l.get(1)%></th>
                    </tr>
                    <tr>
                      
                      <th>Contact</th>
                      <th><%=(String)l.get(2)%></th>
                    </tr>
                    <% //} %>
                  </tbody>
                </table>
              </div>
            </div>
          </div>

          <div class="hero-foot">
            <nav class="tabs is-boxed is-fullwidth">
      <div class="container">
        <ul>
          <li>
            <a>Home</a>
          </li>
          <li>
            <a>Contact us</a>
          </li>
          <li>
            <a>About us</a>
          </li>
        </ul>
      </div>
    </nav>
          </div>

        </section>
      <!--Section one ends====================================================================================================================-->

  </body>
</html>
