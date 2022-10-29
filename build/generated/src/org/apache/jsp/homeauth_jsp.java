package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Registration.DAO;

public final class homeauth_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/home.css\" />\n");
      out.write("    <link\n");
      out.write("      rel=\"icon\"\n");
      out.write("      type=\"image/x-icon\"\n");
      out.write("      href=\"https://cdn.iconscout.com/icon/premium/png-256-thumb/piano-3122691-2621605.png\"\n");
      out.write("    />\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\"\n");
      out.write("    />\n");
      out.write("\n");
      out.write("    <title>TTK * Piano music center</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("      \n");
      out.write("    <div class=\"topnav\" id=\"myTopnav\">\n");
      out.write("        <a href=\"cart.jsp\">Cart</a>\n");
      out.write("            <a href=\"MainController?btAction=Logout\">Logout</a>\n");
      out.write("    </div>\n");
      out.write("      ");

            DAO dao = new DAO();
            Cookie[] cookies = request.getCookies();
            String name = "";
            if(cookies != null){
            for(Cookie cookie : cookies){
                String temp = cookie.getName();
                if(!temp.equals("JSESSIONID")){
                    name = temp;
                }
            }
            }
      
      out.write("\n");
      out.write("    <div class=\"body_content\">\n");
      out.write("      <h1 style=\"text-align: center; color: white\">Welcome ");
      out.print( dao.searchLastname(name));
      out.write("</h1>\n");
      out.write("      <br/>\n");
      out.write("      <h1 style=\"text-align: center; color: white\">All Courses</h1>\n");
      out.write("      <br/>\n");
      out.write("      <div class=\"search-container\">\n");
      out.write("        <form action=\"MainController\">\n");
      out.write("          <input type=\"text\" placeholder=\"Search..\" name=\"txtSearch\" />\n");
      out.write("          <div class=\"btn_search\">\n");
      out.write("              <button type=\"submit\" name=\"btAction\" value=\"Search By Name\">Search by Name</button>\n");
      out.write("              <button type=\"submit\" name=\"btAction\" value=\"Search By Category\">Search by Category</button>\n");
      out.write("          </div>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("      <br />\n");
      out.write("      <div class=\"content_container\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("          <img\n");
      out.write("            src=\"https://cdn.pixabay.com/photo/2022/10/23/12/23/piano-7541170_960_720.jpg\"\n");
      out.write("            alt=\"\"\n");
      out.write("          />\n");
      out.write("          <h2>Title</h2>\n");
      out.write("          <p>Description</p>\n");
      out.write("          <br />\n");
      out.write("          <div class=\"btn_group\">\n");
      out.write("            <button type=\"submit\" name=\"btAction\" value=\"Add To Your Cart\">Add to cart</button>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("  </body>\n");
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
