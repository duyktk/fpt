<%-- 
    Document   : admin
    Created on : Oct 27, 2022, 12:06:31 PM
    Author     : ASUS
--%>

<%@page import="java.util.List"%>
<%@page import="Registration.CourseRegistration"%>
<%@page import="Registration.CourseRegistration"%>
<%@page import="Registration.DAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="css/home.css" />
    <link
      rel="icon"
      type="image/x-icon"
      href="https://cdn.iconscout.com/icon/premium/png-256-thumb/piano-3122691-2621605.png"
    />
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"
    />

    <title>TTK * Piano music center</title>
  </head>
  <body>
      
    <div class="topnav" id="myTopnav">
        <a href="cart.jsp">Cart</a>
            <a href="MainController?btAction=Logout">Logout</a>
    </div>
      <%
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
      %>
    <div class="body_content">
      <h1 style="text-align: center; color: white">Welcome <%= dao.searchLastname(name)%></h1>
      <br/>
      <h1 style="text-align: center; color: white">All Courses</h1>
      <br/>
      <div class="search-container">
        <form action="MainController">
          <input type="text" placeholder="Search.." name="txtSearch" value="<%if(request.getParameter("txtSearch")!=null)%><%=request.getParameter("txtSearch")%>"/>
          <div class="btn_search">
              <button type="submit" name="btAction" value="Search By Name">Search by Name</button>
              <button type="submit" name="btAction" value="Search By Category">Search by Category</button>
          </div>
        </form>
      </div>
      <br />
      <%
            String searchValue = request.getParameter("txtSearch");
            if(searchValue!=null) {
                List<CourseRegistration> result = 
                        (List<CourseRegistration>)request.getAttribute("SEARCHRESULT");
                if(result!=null){%>
                    <form action="MainController">
                    <div class="content_container">
                    <%for(CourseRegistration course : result){
                    %>
                    
                        <div class="card">
                            <img
                                src="<%=course.getImage()%>"
                                alt=""
                            />
                            <h2><%=course.getCourseName()%></h2>
                            <p><%=course.getDescription()%></p>
                            <br />
                            <div class="btn_group">
                                <button type="submit" name="btAction" value="Add To Your Cart">Add to cart</button>
                            </div>
                        </div>
                    
                    <%
                    }
                    %>
                    </div>
                    </form>
                    <%
                }
            }else{
                    %>
                    <form action="MainController">
                    <div class="content_container">
                    <%
                        dao.getTop20();
                        List<CourseRegistration> list = dao.getCourseList();
                        for(CourseRegistration course : list){
                    %>
                    
                        <div class="card">
                            <%
                                if(course.getLastUpdateDate()!=null&&course.getLastUpdateUser()!=null){
                                    %>
                                    <p>Last Updated at <%=course.getLastUpdateDate()%></p>&nbsp;<p>Updated by <%=course.getLastUpdateUser()%></p>
                            <%
                                }
                            %>
                    <img
                        src="<%=course.getImage()%>"
                        alt=""
                    />
                        <h2 name="cboCourse"><%=course.getCourseName()%></h2>
                         <p><%=course.getDescription()%></p>
                        <br />
                        <div class="btn_group">
                                <button type="submit" name="btAction" value="Add To Your Cart">Add to cart</button>
                            </div>
                        </div>
                    
                    <%
                        }
                    %>
                    </div>
                    </form>
                    <%
            }
                    %>
  </body>
</html>