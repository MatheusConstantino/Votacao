package org.apache.jsp.logs;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.LogDao;
import model.LogInfo;
import java.util.List;

public final class logs_view_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<link rel=\"stylesheet\" href=\"./css/style.css\" type=\"text/css\"/>\n");
      out.write("<script type=\"text/javascript\" src=\"./services/service.js\"></script>\n");
      out.write("<title>Registros da Cessão</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
 List<LogInfo> logs = new LogDao().findAll(); 
      out.write("\n");
      out.write("\t<table>\n");
      out.write("\t    <!-- percorre contatos montando as linhas da tabela -->\n");
      out.write("\t    ");
 for(LogInfo log : logs) { 
      out.write("\n");
      out.write("\t        <tr>\n");
      out.write("\t           \t<td><b>LogId: </b>\t\t");
      out.print(log.getLogId() );
      out.write("</td>\n");
      out.write("\t\t\t\t<td><b>Titulo: \t </b>\t");
      out.print(log.getUserId() );
      out.write("</td>\n");
      out.write("\t\t\t\t<td><b>Hora: \t</b>\t");
      out.print(log.getActionTime() );
      out.write("</td>\n");
      out.write("\t\t\t\t<td><b>Descrição:</b> \t");
      out.print(log.getDescription() );
      out.write("</td>\n");
      out.write("\t        </tr>\n");
      out.write("\t\t");
} 
      out.write("\n");
      out.write("\t\t<button class=\"btn btn-primary\" onclick=\"goTo()\">VOLTAR</button>\n");
      out.write("\t</table>\n");
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
