package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Registration.CartObj;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link rel=\"stylesheet\" href=\"css/cart.css\" />\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css\"\n");
      out.write("      integrity=\"sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("      referrerpolicy=\"no-referrer\"\n");
      out.write("    />\n");
      out.write("    <link\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css\"\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("    />\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    <link\n");
      out.write("      rel=\"icon\"\n");
      out.write("      type=\"image/x-icon\"\n");
      out.write("      href=\"https://cdn.iconscout.com/icon/premium/png-256-thumb/piano-3122691-2621605.png\"\n");
      out.write("    />\n");
      out.write("    <title>Cart</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"card\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("          ");

              if(session!=null){
                  CartObj cart = (CartObj) request.getAttribute("CART");
                  
                  if(cart!=null){
                      if(cart.getItems()!=null){
          
      out.write("\n");
      out.write("        <div class=\"col-md-8 cart\">\n");
      out.write("          <div class=\"title\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col\">\n");
      out.write("                <h4><b>Shopping Cart</b></h4>\n");
      out.write("              </div>\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"row border-top border-bottom\">\n");
      out.write("            <div class=\"row main align-items-center\">\n");
      out.write("              <div class=\"col-2\">\n");
      out.write("                <img class=\"img-fluid\" src=\"https://i.imgur.com/1GrakTl.jpg\" />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col\">\n");
      out.write("                <div class=\"row text-muted\">Shirt</div>\n");
      out.write("                <div class=\"row\">Cotton T-shirt</div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col\">\n");
      out.write("                <a href=\"#\">-</a><a href=\"#\" class=\"border\">1</a\n");
      out.write("                ><a href=\"#\">+</a>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col\">\n");
      out.write("                &euro; 44.00 <span class=\"close\">&#10005;</span>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"row main align-items-center\">\n");
      out.write("              <div class=\"col-2\">\n");
      out.write("                <img class=\"img-fluid\" src=\"https://i.imgur.com/ba3tvGm.jpg\" />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col\">\n");
      out.write("                <div class=\"row text-muted\">Shirt</div>\n");
      out.write("                <div class=\"row\">Cotton T-shirt</div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col\">\n");
      out.write("                <a href=\"#\">-</a><a href=\"#\" class=\"border\">1</a\n");
      out.write("                ><a href=\"#\">+</a>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col\">\n");
      out.write("                &euro; 44.00 <span class=\"close\">&#10005;</span>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"row border-top border-bottom\">\n");
      out.write("            <div class=\"row main align-items-center\">\n");
      out.write("              <div class=\"col-2\">\n");
      out.write("                <img class=\"img-fluid\" src=\"https://i.imgur.com/pHQ3xT3.jpg\" />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col\">\n");
      out.write("                <div class=\"row text-muted\">Shirt</div>\n");
      out.write("                <div class=\"row\">Cotton T-shirt</div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col\">\n");
      out.write("                <a href=\"#\">-</a><a href=\"#\" class=\"border\">1</a\n");
      out.write("                ><a href=\"#\">+</a>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col\">\n");
      out.write("                &euro; 44.00 <span class=\"close\">&#10005;</span>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("          ");

                      }
                }
              }else {
            
      out.write("\n");
      out.write("            There nothing in cart.\n");
      out.write("            ");

              }
            
      out.write("\n");
      out.write("            <div class=\"back-to-shop\">\n");
      out.write("            <a href=\"MainController?btAction=Null\">&leftarrow;<span class=\"text-muted\">Back to shop</span></a>\n");
      out.write("          </div>\n");
      out.write("        <div class=\"col-md-4 summary\">\n");
      out.write("          <div>\n");
      out.write("            <h5><b>Summary</b></h5>\n");
      out.write("          </div>\n");
      out.write("          <hr />\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col\">ITEMS 3</div>\n");
      out.write("            <div class=\"col text-right\">&euro; 132.00</div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div\n");
      out.write("            class=\"row\"\n");
      out.write("            style=\"border-top: 1px solid rgba(0, 0, 0, 0.1); padding: 2vh 0\"\n");
      out.write("          >\n");
      out.write("            <div class=\"col\">TOTAL PRICE</div>\n");
      out.write("            <div class=\"col text-right\">&euro; 137.00</div>\n");
      out.write("          </div>\n");
      out.write("          <button class=\"btn btn_checkout\" style=\"background-color:darkgray ;\">CHECKOUT</button>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
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
