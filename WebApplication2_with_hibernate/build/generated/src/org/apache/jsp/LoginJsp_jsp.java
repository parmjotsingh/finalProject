package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LoginJsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t<title class=\"title\">Event:Login page</title>\n");
      out.write("\t<link rel=\"icon\" href=\"C:/Users/Parmjot Singh chahal/Desktop/java project/New folder/a.png\" type=\"image/icon\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bulma/0.7.2/css/bulma.min.css\">\n");
      out.write("    <script defer src=\"https://use.fontawesome.com/releases/v5.3.1/js/all.js\"></script>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"styles/debug.css\">\n");
      out.write("\t<style>\n");
      out.write("\t\t\t\t.center{\n");
      out.write("\t\t\t\t\tmargin: auto;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t.for-box {\n");
      out.write("\t\t\t\t\t\t\tpadding : 10px 10px 20px 20px ;\n");
      out.write("\t\t\t\t\t\t\tborder-radius: 5px;\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t</style>\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\n");
      out.write("\t\t<section class=\"hero is-fullheight\">\n");
      out.write("\t\t\t<div class=\"hero-body has-background-grey \">\n");
      out.write("\t\t\t\t<form class=\" box has-background-light center \" action=\"Login\" method=\"Get\">\n");
      out.write("\t\t\t\t\t<!--Email-->\n");
      out.write("                                        <div class=\"field\" >\n");
      out.write("\t\t\t\t\t  <label class=\"label\">Email</label>\n");
      out.write("\t\t\t\t\t  \t<div class=\"control has-icons-left has-icons-right\">\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"input is-info\" name=\"email\" type=\"email\" placeholder=\"Email input\" value=\"hello@\">\n");
      out.write("\t\t\t\t\t\t    <span class=\"icon is-small is-left\">\n");
      out.write("\t\t\t\t\t\t      <i class=\"fas fa-envelope\"></i>\n");
      out.write("\t\t\t\t\t\t    </span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!--Password-->\n");
      out.write("                                        <div class=\"field\" >\n");
      out.write("\t\t\t\t\t  <label class=\"label\">Password</label>\n");
      out.write("\t\t\t\t\t  <div class=\"control has-icons-left has-icons-right\">\n");
      out.write("\t\t\t\t\t    <input class=\"input is-info\" name=\"pass\" type=\"password\" placeholder=\"Password\" value=\"\">\n");
      out.write("\t\t\t\t\t    <span class=\"icon is-small is-left\">\n");
      out.write("\t\t\t\t\t      <i class=\"fas fa-lock\"></i>\n");
      out.write("\t\t\t\t\t    </span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"level\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<!--dropdown-->\n");
      out.write("\t\t\t\t\t\t<div class=\"level-left\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"level-item\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"field\">\n");
      out.write("\t\t\t\t\t\t\t\t  <label class=\"label\">Type</label>\n");
      out.write("\t\t\t\t\t\t\t\t  <div class=\"control\">\n");
      out.write("\t\t\t\t\t\t\t\t    <div class=\"select\">\n");
      out.write("\t\t\t\t\t\t\t\t      <select>\n");
      out.write("\t\t\t\t\t\t\t\t        <option>Admin</option>\n");
      out.write("\t\t\t\t\t\t\t\t        <option>User</option>\n");
      out.write("\t\t\t\t\t\t\t\t      </select>\n");
      out.write("\t\t\t\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!--button-->\n");
      out.write("\t\t\t\t\t\t<div class=\"level-right\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"level-item\">\n");
      out.write("\n");
      out.write("                                                                <div class=\"field\" >\n");
      out.write("\t\t\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t\t  <p class=\"control center\">\n");
      out.write("\t\t\t\t\t\t\t\t    <button class=\"button is-success\" type=\"submit\">\n");
      out.write("\t\t\t\t\t\t\t\t      Login\n");
      out.write("\t\t\t\t\t\t\t\t    </button>\n");
      out.write("\t\t\t\t\t\t\t\t  </p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</section>\n");
      out.write("\t</body>\n");
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
