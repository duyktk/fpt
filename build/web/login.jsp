<%-- 
    Document   : login
    Created on : Oct 27, 2022, 12:23:10 PM
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
    <link rel="stylesheet" href="css/login.css" />
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css"
      integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A=="
      crossorigin="anonymous"
      referrerpolicy="no-referrer"
    />
    <link
      rel="icon"
      type="image/x-icon"
      href="https://cdn.iconscout.com/icon/premium/png-256-thumb/piano-3122691-2621605.png"
    />

    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
      rel="stylesheet"
    />
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
    <title>Login</title>
  </head>
  <body>
    <div>
      <section class="vh-100">
        <div class="container py-5 h-100">
          <div
            class="row d-flex align-items-center justify-content-center h-100"
          >
            <div class="col-md-8 col-lg-7 col-xl-6">
              <img
                src="https://cdn.pixabay.com/photo/2016/03/31/23/10/instrument-1297443_960_720.png"
                class="img-fluid img-responsive"
                alt="Phone image"
              />
            </div>
            <div class="col-md-7 col-lg-5 col-xl-5 offset-xl-1">
              <h1 class="text-center">LOGIN</h1>
              <br />
              <form action="MainController" method="POST">
                <!-- Email input -->
                <div class="form-outline mb-4">
                  <input
                    type="text"
                    id="form1Example13"
                    class="form-control form-control-lg"
                    name="txtUsername"
                    value="<%if(request.getParameter("txtUsername")!=null)%><%=request.getParameter("txtUsername")%>"
                  />
                  <label class="form-label" for="form1Example13"
                    >Username</label
                  >
                </div>

                <!-- Password input -->
                <div class="form-outline mb-4">
                  <input
                    type="password"
                    id="form1Example23"
                    class="form-control form-control-lg"
                    name = "txtPassword"
                    value=""
                  />
                  <label class="form-label" for="form1Example23"
                    >Password</label
                  >
                </div>

                <div
                  class="d-flex justify-content-evenly align-items-center mb-4"
                >
                  <a href="signup.jsp">Create new account!</a>
                  <button
                    class="btn"
                    style="
                      background-color: whitesmoke;
                    "
                    href=""
                    name="btAction"
                    value="Login"
                  >
                    Log In
                  </button>
                </div>

                <!-- Submit button -->
                <%
                    InsertError error = (InsertError) request.getAttribute("ERROR");
                    if(error!=null){
                        if(error.getWrongUsernamePassword()!=null){%>
                        <font color="red">
                            <%=error.getWrongUsernamePassword()%>
                        </font>    
                        <%}
                    }
                %>
              </form>
            </div>
          </div>
        </div>
      </section>
    </div>
  </body>
</html>
