package org.apache.jsp.dashboards;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Dashboard_view_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <title>VW - MENU</title>\n");
      out.write("        <meta charset=\"UTF-8\">        \n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/style.css\" type=\"text/css\"/>\n");
      out.write("        <script type='text/javascript' src='./dashboards/Dashboard.controller.js'></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"./services/service.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <form class=\"container\" action=\"/Eleicao/redirect\" method=\"POST\">\n");
      out.write("            <h1>Menu do usuário</h1>     \n");
      out.write("                     \n");
      out.write("            <button class=\"btn btn-primary\" onclick=\"redirect('votacao')\">Votar</button>\n");
      out.write("            \n");
      out.write("            <button style=\"display: none;\" id=\"aut\" class=\"btn btn-primary\" onclick=\"redirect('autorizar')\">Autenticar</button>\n");
      out.write("            <button class=\"btn btn-primary\" id=\"computarVotos\" onclick=\"redirect('computarVotos')\">Resultado</button>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("\n");
      out.write("            <input type=\"hidden\" name=\"titulo\" id=\"titulo\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.titulo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("            <input type=\"hidden\" name=\"nivel\" id=\"nivel\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.nivel}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("            <input type=\"hidden\" name=\"pagina\" id=\"pagina\"/>\n");
      out.write("          </form>\n");
      out.write("    </body>\n");
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
