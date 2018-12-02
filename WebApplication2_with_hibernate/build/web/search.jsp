<%-- 
    Document   : search.jsp
    Created on : 22 Nov, 2018, 11:13:18 AM
    Author     : Parmjot Singh chahal
--%>


<%@page import="modal.EventUserExist"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="modal.EventListDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Search!</title>
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
  </head>
  <body style="background-color: black;">
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
    <section class="hero is-fullheight is-warning" ">
      <div class="hero-body">
        <div class="container" style="">
          <div class="level-item" >
            <form action="search.jsp" class="field has-addons">
              <div class="control has-icons-right">
                <input class="input" type="text" name="search" placeholder="Search">
                <span class="icon is-medium is-right">
                  <i class="fas fa-search"></i>
                </span>
              </div>
              <div class="control">
                <button type="submit" class="button is-info">Search</button>
              </div>
            </form>
          </div>
          <!--box starts ===================================================================================================-->
          <%
                        EventListDAO obj=new EventListDAO();
                        ResultSet rs=obj.list();
                    %>
          <div class="level-item" style="margin-top:20px;">
            <table class="table is-striped is-hoverable is-bordered">
              <thead>
                <tr>
                  <th><abbr title="Number">No.</abbr></th>
                  <th>Event Name</th>
                  <th>Place</th>
                  <th>Start Date</th>
                  <th>End Date</th>
                  <th>Register</th>
                </tr>
              </thead>
              <tbody>
                    <%! String em;
                        String search;
                    %>
                    <%
                        search=request.getParameter("search");
                        if(search == null){search="";}
                        
                        em=(String)session.getAttribute("Email");
                        if(em == null){
                            em="";
                        }
                        int count=0;
                        while(rs.next()){
                            
                            String eventName=rs.getString(3);
                            if((eventName.toLowerCase()).contains(search.toLowerCase()) == true){
                            String discrp=rs.getString(4);
                            String place=rs.getString(5);
                            String date=rs.getString(8);
                            String endDate=rs.getString(9);
                            
                               
                    %>
                <tr>
                  <th><%=++count%></th>
                  <td><abbr title="<%=discrp%>"><%=eventName%></abbr></td>
                  <td><%=place%></td>
                  <td><%=date%></td>
                  <td><%=endDate%></td>
                  <%  EventUserExist ob=new EventUserExist();
                      if( !em.equals(rs.getString(2)) && !em.equals("") && !ob.save(em, rs.getString(10))){%>
                  <td><form action="RegisterInEvent"><input name="databaseTableName" value="<%=rs.getString(10)%>" hidden="true"><button  type="submit" class="button is-success is-outlined">Register</button></form></td>
                  <% } 
                        else{
                  %>
                  <td><button class="button is-danger is-outlined " disabled >Register</button></td>
                         <% } %>
                </tr>
                    <%}
                    }%>
              </tbody>
              <tfoot>
                <tr>
                  <th><abbr title="Number">No.</abbr></th>
                  <th>Event Name</th>
                  <th>Place</th>
                  <th>Start Date</th>
                  <th>End Date</th>
                  <th>Register</th>
                </tr>
              </tfoot>
            </table>
          </div>
          <!--box ends ===================================================================================================-->
        </div>
      </div>
              <!--<footer> starts============================================================================================================================= -->

    <footer class="hero-foot">
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
    </section>
    
  </body>
</html>

