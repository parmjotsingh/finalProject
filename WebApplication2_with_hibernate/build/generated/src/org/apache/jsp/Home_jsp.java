package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String name;
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Home!</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bulma/0.7.2/css/bulma.min.css\">\n");
      out.write("    <script defer src=\"https://use.fontawesome.com/releases/v5.3.1/js/all.js\"></script>\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("      $(document).ready(function() {\n");
      out.write("\n");
      out.write("        // Check for click events on the navbar burger icon\n");
      out.write("        $(\".navbar-burger\").click(function() {\n");
      out.write("\n");
      out.write("            // Toggle the \"is-active\" class on both the \"navbar-burger\" and the \"navbar-menu\"\n");
      out.write("            $(\".navbar-burger\").toggleClass(\"is-active\");\n");
      out.write("            $(\".navbar-menu\").toggleClass(\"is-active\");\n");
      out.write("\n");
      out.write("        });\n");
      out.write("      });\n");
      out.write("      \n");
      out.write("    </script>\n");
      out.write("    <style>\n");
      out.write("      .bg-img {\n");
      out.write("        background-image: url('bg_galaxy-s8_camera.jpg');\n");
      out.write("        background-attachment: fixed;\n");
      out.write("        margin-bottom: 0px;\n");
      out.write("        background-position: center;\n");
      out.write("        background-size: cover;\n");
      out.write("        background-repeat: no-repeat;\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("  <body class=\"\">\n");
      out.write("    <!-- Navigation start bar ====================================================================================================================-->\n");
      out.write("    <nav class=\"navbar is-dark is-fixed-top\" role=\"navigation\" aria-label=\"main navigation\"  style=\"padding-top:10px;padding-bottom:10px;\">\n");
      out.write("      <div class=\"navbar-brand\">\n");
      out.write("        <div class=\"navbar-item\" href=\"home.html\">\n");
      out.write("          <img src=\"a.png\" class=\"image is-32x32\" style=\"padding-right:10px;\">\n");
      out.write("          <h1 class=\"is-center\">Event Managers</h1>\n");
      out.write("        </div>\n");
      out.write("        <a role=\"button\" class=\"navbar-burger burger\" aria-label=\"menu\" aria-expanded=\"false\" data-target=\"navbarBasic\">\n");
      out.write("          <span aria-hidden=\"true\"></span>\n");
      out.write("          <span aria-hidden=\"true\"></span>\n");
      out.write("          <span aria-hidden=\"true\"></span>\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"navbarBasic\" class=\"navbar-menu\" style=\"padding-left:30px;padding-right:50px;\">\n");
      out.write("        <div class=\"navbar-start\">\n");
      out.write("          <a href=\"#\"class=\"navbar-item\">\n");
      out.write("            Home\n");
      out.write("          </a>\n");
      out.write("          <a class=\"navbar-item\">\n");
      out.write("            About us\n");
      out.write("          </a>\n");
      out.write("          <div class=\"navbar-item has-dropdown is-hoverable\">\n");
      out.write("            <a class=\"navbar-link\">\n");
      out.write("              Event\n");
      out.write("            </a>\n");
      out.write("            <div class=\"navbar-dropdown\">\n");
      out.write("              <a href=\"search.jsp\" class=\"navbar-item\">\n");
      out.write("                Search\n");
      out.write("              </a>\n");
      out.write("              <a href=\"create.jsp\" class=\"navbar-item\">\n");
      out.write("                Create\n");
      out.write("              </a>\n");
      out.write("              <hr class=\"navbar-divider\">\n");
      out.write("              <a class=\"navbar-item\">\n");
      out.write("                Report an issue\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Navigation bar Right side=================================================================================================================-->\n");
      out.write("        <div class=\"navbar-end\">\n");
      out.write("            ");
 if(session.getAttribute("Name")!=null){
                
      out.write("\n");
      out.write("                <div class=\"buttons\">\n");
      out.write("                    <a href=\"userInfo.jsp\" style=\"margin-right:10px;\">\n");
      out.write("                    <button class=\"button is-white is-rounded\">\n");
      out.write("                        <span class=\"icon\">\n");
      out.write("                            <i class=\"fas fa-user-ninja\"></i>\n");
      out.write("                        </span>\n");
      out.write("                        <span>\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    ");
 name=(String)session.getAttribute("Name"); 
      out.write("\n");
      out.write("                    ");
      out.print(name);
      out.write("\n");
      out.write("                        </span>\n");
      out.write("                    </button>\n");
      out.write("                    </a>\n");
      out.write("                <form action=\"Logout\" ><button class=\"button is-info is-outlined\">Logout</button></form>\n");
      out.write("                </div>\n");
      out.write("                ");

            } 
            else{   
                
      out.write("\n");
      out.write("          <div class=\"buttons\">\n");
      out.write("            <a href=\"SignUp.jsp\" class=\"button is-primary\">Sign Up</a>\n");
      out.write("            <a href=\"LoginJsp.jsp\" class=\"button is-light\">Login</a>\n");
      out.write("          </div>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- Navigation bar Right side End=================================================================================================================-->\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("    <!-- Navigation bar End=================================================================================================================-->\n");
      out.write("\n");
      out.write("    <!-- Section one Start=================================================================================================================-->\n");
      out.write("    <section class=\"hero is-medium is-warning\" style=\"margin-top:70px;\">\n");
      out.write("      <div class=\"hero-body is-center\">\n");
      out.write("\n");
      out.write("          <div class=\"container is-center\">\n");
      out.write("            <center>\n");
      out.write("              <h1 class=\"title\">Create Events with ease</h1>\n");
      out.write("              <br>\n");
      out.write("              <h1 class=\"subtitle\">Event managers is the best way to create your event for free.</h1>\n");
      out.write("              <a href=\"create.jsp\" class=\"button is-danger\">Create Events</a>\n");
      out.write("            <center>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("    <!-- Section one End===================================================================================================================-->\n");
      out.write("\n");
      out.write("    <!-- Section two Start=================================================================================================================-->\n");
      out.write("    <section class=\"hero is-success\">\n");
      out.write("        <div class=\"hero-body\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("            <h1 class=\"title level-item\" style=\"align:center;\">How it works</h1>\n");
      out.write("              <div class=\"columns\">\n");
      out.write("                <div class=\"column level\">\n");
      out.write("                  <div class=\"tile is-vertical\">\n");
      out.write("                    <center>\n");
      out.write("                    <p class=\"title\">1. Register in a second</p>\n");
      out.write("                    <div class=\"level-item\">\n");
      out.write("                      <div class=\"level-item\"style=\"height:96px;width:96px;background-color:white;border-radius:48px;\">\n");
      out.write("                        <figure class=\"image is-48x48\" >\n");
      out.write("                          <img src=\"c4cdd7ba-n1_016015016015000000.png\" >\n");
      out.write("                        </figure>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <p class=\"subtitle\">No credit card required just try it out now.</p>\n");
      out.write("                    </center>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"column level\">\n");
      out.write("                  <div class=\"tile is-vertical\">\n");
      out.write("                    <center>\n");
      out.write("                    <p class=\"title\">2. Build your event online</p>\n");
      out.write("                    <div class=\"level-item\">\n");
      out.write("                      <div class=\"level-item\"style=\"height:96px;width:96px;background-color:white;border-radius:48px;\">\n");
      out.write("                        <figure class=\"image is-48x48\" >\n");
      out.write("                          <img src=\"7d3081ae-n2_017018017018000000.png\" >\n");
      out.write("                        </figure>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <p class=\"subtitle\">Finally, an event platform that does it all and is user friendly.</p>\n");
      out.write("                    </center>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"column level\">\n");
      out.write("                  <div class=\"tile is-vertical \">\n");
      out.write("                    <center>\n");
      out.write("                    <p class=\"title\">3. Get the event started!</p>\n");
      out.write("                    <div class=\"level-item\">\n");
      out.write("                      <div class=\"level-item\"style=\"height:96px;width:96px;background-color:white;border-radius:48px;\">\n");
      out.write("                        <figure class=\"image is-48x48\" >\n");
      out.write("                          <img src=\"0270ca2c-n11_013013013013000000.png\" >\n");
      out.write("                        </figure>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <p class=\"subtitle\">Manage your event, including ticketing and check in.</p>\n");
      out.write("                    </center>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <!-- Section two End===================================================================================================================-->\n");
      out.write("    <section class=\"hero is-medium is-primary bg-img\"  >\n");
      out.write("      <div class=\"hero-body\" style=\"background-attachment:fixed;\">\n");
      out.write("        <h1 class=\"title level-item\">Search Events easily!</h1>\n");
      out.write("        <h1 class=\"subtitle level-item\">Search for on going Events easily!</h1>\n");
      out.write("        <div class=\"buttons  level-item\">\n");
      out.write("          <a href=\"search.jsp\" class=\"button is-danger\">\n");
      out.write("            <span class=\"icon\" style=\"padding-right:10px;\">\n");
      out.write("              <i class=\"fas fa-search\"> </i>\n");
      out.write("            </span>\n");
      out.write("            Search <!-- text inside button -->\n");
      out.write("           </a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <!--<footer> starts============================================================================================================================= -->\n");
      out.write("\n");
      out.write("    <footer class=\"footer\">\n");
      out.write("        <div class=\"content  is-light\">\n");
      out.write("          <div class=\"level \">\n");
      out.write("            <div class=\"level-item\">\n");
      out.write("              <div class=\"level-item  has-text-centered\">\n");
      out.write("                <div  class=\"\">\n");
      out.write("                        <a href=\"#\" class=\"\">\n");
      out.write("                          <span class=\"icon button is-info is-rounded is-centered\">\n");
      out.write("                            <i class=\"fas fa-home is-rounded\"></i>\n");
      out.write("                          </span>\n");
      out.write("                          <p class=\"is-3\" style=\"color:black;\">Home </p>\n");
      out.write("                        </a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"level-item\">\n");
      out.write("              <div class=\"level-item  has-text-centered\">\n");
      out.write("                <div  class=\"\">\n");
      out.write("                        <a href=\"#\" class=\"\">\n");
      out.write("                          <span class=\"icon button is-info is-rounded is-centered\">\n");
      out.write("                            <i class=\"fas fa-phone is-rounded\"></i>\n");
      out.write("                          </span>\n");
      out.write("                          <p class=\"is-3 bd-footer-link\" style=\"color:black;\">Contact Us</p>\n");
      out.write("                        </a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"level-item\">\n");
      out.write("              <div class=\"level-item  has-text-centered\">\n");
      out.write("                <div  class=\"\">\n");
      out.write("                        <a href=\"#\" class=\"\">\n");
      out.write("                          <span class=\"icon button is-info is-rounded is-centered\">\n");
      out.write("                            <i class=\"fas fa-smile is-rounded\"></i>\n");
      out.write("                          </span>\n");
      out.write("                          <p class=\"is-3 bd-footer-link\" style=\"color:black;\">About Us</p>\n");
      out.write("                        </a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!--<footer> end================================================================================================================================ -->\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
