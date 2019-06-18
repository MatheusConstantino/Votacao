package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"UTF-8\">\t\t\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">         \n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge, chrome=1\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/style.css\" type=\"text/css\"/>  \n");
      out.write("        <script type=\"text/javascript\" src=\"./services/jquery.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"./services/service.js\"></script>\n");
      out.write("\t\t<title>VW - Votação Web</title>\n");
      out.write("\t\t</head>\n");
      out.write("\t<body>\n");
      out.write("    <form class=\"container\" action=\"/Eleicao/autenticar\" method=\"POST\">\n");
      out.write("      <h1>Votação Online</h1>\n");
      out.write("      <div class=\"login\">\n");
      out.write("        <p>Titulo de Eleitor<p>\n");
      out.write("          <input type=\"text\" name=\"titulo\" id=\"titulo\" class=\"input\" required/>\n");
      out.write("      </div>            \n");
      out.write("      <div class=\"login\">\n");
      out.write("        <p>Senha</p>\n");
      out.write("        <input type=\"password\" name=\"senha\" id=\"senha\" class=\"input\" required/>\n");
      out.write("      </div>\n");
      out.write("      <button class=\"btn btn-primary\" type=\"submit\">Entrar</button>\n");
      out.write("    </form>\n");
      out.write("\t</body>\n");
      out.write("</html>");
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
