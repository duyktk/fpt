<%-- 
    Document   : signup
    Created on : Oct 27, 2022, 12:23:18 PM
    Author     : ASUS
--%>

<%@page import="Registration.InsertError"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
      rel="stylesheet"
    />
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet" href="css/signup.css" />
    <link
      rel="icon"
      type="image/x-icon"
      href="https://cdn.iconscout.com/icon/premium/png-256-thumb/piano-3122691-2621605.png"
    />

    <title>Sign Up</title>
  </head>
  <body>
      
      <%
          InsertError error = (InsertError) request.getAttribute("ERROR");
      %>
    <section class="vh-100" style="background-color: #eee">
      <div class="container h-100">
        <div class="row d-flex justify-content-center align-items-center h-100">
          <div class="col-lg-12 col-xl-11">
            <div class="card text-black" style="border-radius: 25px">
              <div class="card-body p-md-5">
                <div class="row justify-content-center">
                  <div class="col-md-10 col-lg-6 col-xl-5 order-2 order-lg-1">
                    <p class="text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4">
                      Sign up
                    </p>
                    <form action="MainController">
                      <div class="d-flex flex-row align-items-center mb-4">
                        <i class="fas fa-user fa-lg me-3 fa-fw"></i>
                        <div class="form-outline flex-fill mb-0">
                          <input
                            type="text"
                            id="form3Example1c"
                            class="form-control"
                            name="txtFullname"
                            value="<%if(request.getParameter("txtFullname")!=null)%><%=request.getParameter("txtFullname")%>"
                          />
                          <label class="form-label" for="form3Example1c"
                            >Your Name</label
                          >
                        </div>
                      </div>

                      <div class="d-flex flex-row align-items-center mb-4">
                        <i class="fas fa-envelope fa-lg me-3 fa-fw"></i>
                        <div class="form-outline flex-fill mb-0">
                          <input
                            type="text"
                            id="form3Example3c"
                            class="form-control"
                            name="txtUsername"
                            value="<%if(request.getParameter("txtUsername")!=null)%><%=request.getParameter("txtUsername")%>"
                          />
                          <label class="form-label" for="form3Example3c"
                            >Your Username</label
                          >
                        </div>
                      </div>

                      <div class="d-flex flex-row align-items-center mb-4">
                        <i class="fas fa-lock fa-lg me-3 fa-fw"></i>
                        <div class="form-outline flex-fill mb-0">
                          <input
                            type="password"
                            id="form3Example4c"
                            class="form-control"
                            name="txtPassword"
                          />
                          <label class="form-label" for="form3Example4c"
                            >Password</label
                          >
                        </div>
                      </div>

                      <div class="d-flex flex-row align-items-center mb-4">
                        <i class="fas fa-key fa-lg me-3 fa-fw"></i>
                        <div class="form-outline flex-fill mb-0">
                          <input
                            type="password"
                            id="form3Example4cd"
                            class="form-control"
                            name="txtConfirm"
                          />
                          <label class="form-label" for="form3Example4cd"
                            >Repeat your password</label
                          >
                          <%
                              if(error!=null){
                              if(error.getConfirmNotMatch()!=null){
                          %>
                          <font color="red">
                              </br>
                              <%=error.getConfirmNotMatch()%>
                          </font>
                          <%
                              }
                              }
                          %>
                        </div>
                      </div>

                      <div
                        class="d-flex justify-content-center mx-4 mb-3 mb-lg-4"
                      >
                          <button class="btn btn-primary btn-lg" name="btAction" value="Create New Account">
                          Register
                        </button>
                      </div>
                        <br>
                        <%
                            if(error!=null){
                                if(error.getUserNameExist()!=null){
                        %>
                        <br>
                        <font color="red">
                            <%=error.getUserNameExist()%>
                        </font>
                        <%
                                }
                            }
                        %>
                    </form>

                  </div>
                  <div
                    class="col-md-10 col-lg-6 col-xl-7 d-flex align-items-center order-1 order-lg-2"
                  >
                    <img
                      src="https://cdn.pixabay.com/photo/2022/02/16/11/05/tool-7016549_960_720.png"
                      class="img-fluid"
                      alt="Sample image"
                    />
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
  </body>
</html>
