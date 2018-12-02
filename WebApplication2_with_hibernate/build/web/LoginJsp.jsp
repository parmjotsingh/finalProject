<%-- 
    Document   : LoginJsp
    Created on : 14 Nov, 2018, 12:01:03 PM
    Author     : Parmjot Singh chahal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
	<head>
	<title class="title">Event:Login page</title>
	<link rel="icon" href="C:/Users/Parmjot Singh chahal/Desktop/java project/New folder/a.png" type="image/icon">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.7.2/css/bulma.min.css">
    <script defer src="https://use.fontawesome.com/releases/v5.3.1/js/all.js"></script>
	<link rel="stylesheet" href="styles/debug.css">
	<style>
				.center{
					margin: auto;
				}
				.for-box {
							padding : 10px 10px 20px 20px ;
							border-radius: 5px;
					}
	</style>
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

		<section class="hero is-fullheight">
			<div class="hero-body has-background-grey ">
				<form class=" box has-background-light center " action="Login" method="Get">
					<!--Email-->
                                        <div class="field" >
					  <label class="label">Email</label>
					  	<div class="control has-icons-left has-icons-right">
								<input class="input is-info" name="email" type="email" placeholder="Email input" value="hello@">
						    <span class="icon is-small is-left">
						      <i class="fas fa-envelope"></i>
						    </span>
						</div>
					</div>

					<!--Password-->
                                        <div class="field" >
					  <label class="label">Password</label>
					  <div class="control has-icons-left has-icons-right">
					    <input class="input is-info" name="pass" type="password" placeholder="Password" value="">
					    <span class="icon is-small is-left">
					      <i class="fas fa-lock"></i>
					    </span>
						</div>
					</div>

					<div class="level">

						<!--dropdown-->
						<div class="level-left">
							<div class="level-item">

									<div class="field">
								  <label class="label">Type</label>
								  <div class="control">
								    <div class="select">
								      <select>
								        <option>Admin</option>
								        <option>User</option>
								      </select>
								    </div>
								  </div>
								</div>

							</div>
						</div>
						<!--button-->
						<div class="level-right">
							<div class="level-item">

                                                                <div class="field" >
									<br>
								  <p class="control center">
								    <button class="button is-success" type="submit">
								      Login
								    </button>
								  </p>
								</div>

							</div>
						</div>

					</div>

				</form>
			</div>
		</section>
	</body>
</html>

