package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class create_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");

            if((String)session.getAttribute("Email")==null){ 
                response.sendRedirect("LoginJsp.jsp");  
            }
            

      out.write("\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Create Event!</title>\n");
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
      out.write("\n");
      out.write("      function myFunction() {\n");
      out.write("          var x = document.getElementById(\"myDate\").value;\n");
      out.write("          //document.getElementById(\"demo\").innerHTML = x;\n");
      out.write("      }\n");
      out.write("    </script>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
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
      out.write("    <!--Section one start ==================================================================================================================-->\n");
      out.write("    <section class=\"hero is-light\" >\n");
      out.write("     <div class=\"hero-body\">\n");
      out.write("       <div class=\"container\">\n");
      out.write("         <div class=\"container\">\n");
      out.write("           <center><p class=\"title\" style=\"margin-top: 70px;\">Enter details to create Event</p></center>\n");
      out.write("         </div>\n");
      out.write("         <form class=\"container\"  style=\"margin-top:40px;\" action=\"CreateEvent\" method=\"post\">\n");
      out.write("           <div class=\"field\">\n");
      out.write("             <label class=\"label subtitle\" ><strong>Name of event</strong></label>\n");
      out.write("             <div class=\"control\">\n");
      out.write("               <input class=\"input is-link\" type=\"text\" placeholder=\"Name\" name=\"event name\">\n");
      out.write("             </div>\n");
      out.write("           </div>\n");
      out.write("           <div class=\"field\">\n");
      out.write("             <label class=\"label subtitle\" ><strong>Description of event</strong></label>\n");
      out.write("             <div class=\"control\">\n");
      out.write("               <textarea class=\"textarea is-link\" type=\"textarea\" placeholder=\"More than 50 words\" name=\"description\"></textarea>\n");
      out.write("             </div>\n");
      out.write("           </div>\n");
      out.write("           <div class=\"field\">\n");
      out.write("             <label class=\"label subtitle\" ><strong>Event place</strong></label>\n");
      out.write("             <div class=\"control\">\n");
      out.write("               <input class=\"input is-link\" type=\"text\" placeholder=\"Room no. , Hall , Auditorium etc and town or city name and Additional information\" name=\"place\">\n");
      out.write("             </div>\n");
      out.write("           </div>\n");
      out.write("\n");
      out.write("           <div class=\"field\">\n");
      out.write("             <label class=\"label subtitle\" ><strong>District</strong></label>\n");
      out.write("             <div class=\"control\">\n");
      out.write("               <input class=\"input is-link\" type=\"text\" placeholder=\"District\" name=\"district\">\n");
      out.write("             </div>\n");
      out.write("           </div>\n");
      out.write("\n");
      out.write("           <div class=\"field\">\n");
      out.write("            <label class=\"label subtitle\"><strong>State</strong></label>\n");
      out.write("            <div class=\"control\">\n");
      out.write("              <div class=\"select\">\n");
      out.write("                <select name=\"state\">\n");
      out.write("                  <option>Chandigarh</option>\n");
      out.write("                  <option>Andhra Pradesh</option>\n");
      out.write("                  <option>Arunachal Pradesh</option>\n");
      out.write("                  <option>Assam</option>\n");
      out.write("                  <option>Bihar</option>\n");
      out.write("                  <option>Chhattisgarh</option>\n");
      out.write("                  <option>Goa</option>\n");
      out.write("                  <option>Gujarat</option>\n");
      out.write("                  <option>Haryana</option>\n");
      out.write("                  <option>Himachal Pradesh</option>\n");
      out.write("                  <option>Jammu and Kashmir</option>\n");
      out.write("                  <option>Jharkhand</option>\n");
      out.write("                  <option>Karnataka</option>\n");
      out.write("                  <option>Kerala</option>\n");
      out.write("                  <option>Madhya Pradesh</option>\n");
      out.write("                  <option>Maharashtra</option>\n");
      out.write("                  <option>Manipur</option>\n");
      out.write("                  <option>Meghalaya</option>\n");
      out.write("                  <option>Mizoram</option>\n");
      out.write("                  <option>Nagaland</option>\n");
      out.write("                  <option>Odisha</option>\n");
      out.write("                  <option>Punjab</option>\n");
      out.write("                  <option>Rajasthan</option>\n");
      out.write("                  <option>Sikkim</option>\n");
      out.write("                  <option>Tamil Nadu</option>\n");
      out.write("                  <option>Telangana</option>\n");
      out.write("                  <option>Tripura</option>\n");
      out.write("                  <option>Uttar Pradesh</option>\n");
      out.write("                  <option>Uttarakhand</option>\n");
      out.write("                  <option>West Bengal</option>\n");
      out.write("                  <option>Andaman and Nicobar Islands\t</option>\n");
      out.write("                  <option>Dadar and Nagar Haveli</option>\n");
      out.write("                  <option>Daman and Diu</option>\n");
      out.write("                  <option>Delhi</option>\n");
      out.write("                  <option>Lakshadweep</option>\n");
      out.write("                  <option>Puducherry (Pondicherry)</option>\n");
      out.write("                </select>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"field \">\n");
      out.write("\n");
      out.write("                <label class=\"label subtitle\" ><strong>Start Date of event</strong></label>\n");
      out.write("\n");
      out.write("              <div class=\"field\">\n");
      out.write("\n");
      out.write("                  <div class=\"control\">\n");
      out.write("                      <input type=\"date\" class=\"date is-link\" id=\"myDate\" value=\"2019-01-01\" name=\"start date\">\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <label class=\"label subtitle\" ><strong>End Date of event</strong></label>\n");
      out.write("              <div class=\"field\">\n");
      out.write("\n");
      out.write("                  <div class=\"control\">\n");
      out.write("                      <input type=\"date\" class=\"date is-link\" id=\"myDate\" value=\"2019-01-01\" name=\"end date\">\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"container\">\n");
      out.write("            <div class=\"field is-horizontal\">\n");
      out.write("              <div class=\"field-label\">\n");
      out.write("                <!-- Left empty for spacing -->\n");
      out.write("              </div>\n");
      out.write("              <div class=\"field-body\">\n");
      out.write("                <div class=\"field\">\n");
      out.write("                  <div class=\"control\">\n");
      out.write("                    <button onclick=\"myFunction()\" class=\"button is-medium is-primary\" type=\"submit\">\n");
      out.write("                      Create\n");
      out.write("                    </button>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("       </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("     </div>\n");
      out.write("     </div>\n");
      out.write("    </section>\n");
      out.write("    <!--Section one end ==================================================================================================================-->\n");
      out.write("  </body>\n");
      out.write("</html>\n");
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
