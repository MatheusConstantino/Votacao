package org.apache.jsp.autorizar;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class autorizar_view_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<link rel=\"stylesheet\" href=\"./css/style.css\" type=\"text/css\"/>  \n");
      out.write("<link rel=\"stylesheet\" href=\"./css/bootstrap.min.css\" type=\"text/css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"./css/bootstrap-responsive.min.css\" type=\"text/css\"/>\n");
      out.write("<script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"./autorizar/autorizar.controller.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"./services/service.js\"></script>\n");
      out.write("<title>VW - AUTENTICAR</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <form class=\"container\" action=\"/Eleicao/autorizar\" id=\"form\" method=\"POST\">\n");
      out.write("        <div class=\"aut\">\n");
      out.write("          <p>Titulo do Eleitor</p>\n");
      out.write("            <input type=\"text\" name=\"usuario\" id=\"usuario\" placeholder=\"titulo do eleitor\" class=\"input\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.usuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("        </div>            \n");
      out.write("        <div class=\"aut\">\n");
      out.write("          <p>Nome</p>      \n");
      out.write("          <input type=\"text\" id=\"nome\" name=\"nome\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"input\" class=\"input\" readonly/>\n");
      out.write("          <p>Autorizado a votar?</p>\n");
      out.write("          <input type=\"text\" id=\"liberado\" name=\"liberado\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.liberado}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"input\" readonly/>\n");
      out.write("          <p>Ja votou?</p>\n");
      out.write("          <input type=\"text\" id=\"javotou\" name=\"javotou\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.javotou}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"input\" readonly/>\n");
      out.write("          <input type=\"hidden\" id=\"func\" name=\"func\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.titulo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"input\" readonly/>  \n");
      out.write("          <input type=\"hidden\" id=\"nivel\" name=\"nivel\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.nivel}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"input\" readonly/>\n");
      out.write("        </div>\n");
      out.write("        <button class=\"btn btn-sucess\" onclick=\"validar()\">Validar</button>\n");
      out.write("        <button class=\"btn btn-sucess\" onclick=\"autorizar()\">Autorizar</button>        \n");
      out.write("        <button class=\"btn btn-primary\" onclick=\"backPage('func')\">Voltar</button>\n");
      out.write("    </form>\n");
      out.write("</body>\n");
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
