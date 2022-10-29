/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ASUS
 */
public class MainController extends HttpServlet {
    private final String home = "home.jsp";
    private final String nullController = "NullController";
    private final String loginController = "LoginController";
    private final String logoutController = "LogoutController";
    private final String addItemController = "AddItemController";
    private final String createNewAccountController = "CreateNewAccountController";
    private final String searchCategoryController = "SearchCategoryController";
    private final String searchNameController = "SearchNameController";
    private final String updateController = "UpdateController";
    private final String deleteItemController = "DeleteItemController";
    private final String cart = "cart.jsp";
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String button = request.getParameter("btAction");
        String url = nullController;
        try {
            if(button==null){
                url = nullController;
            }else if (button.equals("Login")) {
                url = loginController;
            }else if (button.equals("Logout")) {
                url = logoutController;
            }else if (button.equals("Search By Category")) {
                url = searchCategoryController;
            }else if (button.equals("Search By Name")) {
                url = searchNameController;
            }else if (button.equals("Update")) {
                url = updateController;
            }else if (button.equals("Add Book To Your Cart")) {
                url = addItemController;
            }else if (button.equals("Remove Selected Items")) {
                url = deleteItemController;
            }else if (button.equals("View Your Cart")) {
                url = cart;
            }else if (button.equals("Create New Account")) {
                url = createNewAccountController;
            }
        } finally {
            RequestDispatcher rd = request.getRequestDispatcher(url);
            rd.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
