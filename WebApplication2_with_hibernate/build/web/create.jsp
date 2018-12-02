<%--
    Document   : create
    Created on : 21 Nov, 2018, 8:55:02 PM
    Author     : Parmjot Singh chahal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
            if((String)session.getAttribute("Email")==null){ 
                response.sendRedirect("LoginJsp.jsp");  
            }
            
%>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Create Event!</title>
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

      function myFunction() {
          var x = document.getElementById("myDate").value;
          //document.getElementById("demo").innerHTML = x;
      }
    </script>
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

    <!--Section one start ==================================================================================================================-->
    <section class="hero is-light" >
     <div class="hero-body">
       <div class="container">
         <div class="container">
           <center><p class="title" style="margin-top: 70px;">Enter details to create Event</p></center>
         </div>
         <form class="container"  style="margin-top:40px;" action="CreateEvent" method="post">
           <div class="field">
             <label class="label subtitle" ><strong>Name of event</strong></label>
             <div class="control">
               <input class="input is-link" type="text" placeholder="Name" name="event name">
             </div>
           </div>
           <div class="field">
             <label class="label subtitle" ><strong>Description of event</strong></label>
             <div class="control">
               <textarea class="textarea is-link" type="textarea" placeholder="More than 50 words" name="description"></textarea>
             </div>
           </div>
           <div class="field">
             <label class="label subtitle" ><strong>Event place</strong></label>
             <div class="control">
               <input class="input is-link" type="text" placeholder="Room no. , Hall , Auditorium etc and town or city name and Additional information" name="place">
             </div>
           </div>

           <div class="field">
             <label class="label subtitle" ><strong>District</strong></label>
             <div class="control">
               <input class="input is-link" type="text" placeholder="District" name="district">
             </div>
           </div>

           <div class="field">
            <label class="label subtitle"><strong>State</strong></label>
            <div class="control">
              <div class="select">
                <select name="state">
                  <option>Chandigarh</option>
                  <option>Andhra Pradesh</option>
                  <option>Arunachal Pradesh</option>
                  <option>Assam</option>
                  <option>Bihar</option>
                  <option>Chhattisgarh</option>
                  <option>Goa</option>
                  <option>Gujarat</option>
                  <option>Haryana</option>
                  <option>Himachal Pradesh</option>
                  <option>Jammu and Kashmir</option>
                  <option>Jharkhand</option>
                  <option>Karnataka</option>
                  <option>Kerala</option>
                  <option>Madhya Pradesh</option>
                  <option>Maharashtra</option>
                  <option>Manipur</option>
                  <option>Meghalaya</option>
                  <option>Mizoram</option>
                  <option>Nagaland</option>
                  <option>Odisha</option>
                  <option>Punjab</option>
                  <option>Rajasthan</option>
                  <option>Sikkim</option>
                  <option>Tamil Nadu</option>
                  <option>Telangana</option>
                  <option>Tripura</option>
                  <option>Uttar Pradesh</option>
                  <option>Uttarakhand</option>
                  <option>West Bengal</option>
                  <option>Andaman and Nicobar Islands	</option>
                  <option>Dadar and Nagar Haveli</option>
                  <option>Daman and Diu</option>
                  <option>Delhi</option>
                  <option>Lakshadweep</option>
                  <option>Puducherry (Pondicherry)</option>
                </select>
              </div>
            </div>
          </div>

          <div class="field ">

                <label class="label subtitle" ><strong>Start Date of event</strong></label>

              <div class="field">

                  <div class="control">
                      <input type="date" class="date is-link" id="myDate" value="2019-01-01" name="start date">
                  </div>

              </div>

              <label class="label subtitle" ><strong>End Date of event</strong></label>
              <div class="field">

                  <div class="control">
                      <input type="date" class="date is-link" id="myDate" value="2019-01-01" name="end date">
                  </div>

              </div>
          </div>

          <div class="container">
            <div class="field is-horizontal">
              <div class="field-label">
                <!-- Left empty for spacing -->
              </div>
              <div class="field-body">
                <div class="field">
                  <div class="control">
                    <button onclick="myFunction()" class="button is-medium is-primary" type="submit">
                      Create
                    </button>
                  </div>
                </div>
              </div>
            </div>
          </div>
       </form>


     </div>
     </div>
    </section>
    <!--Section one end ==================================================================================================================-->
  </body>
</html>
