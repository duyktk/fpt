<%-- 
    Document   : cart
    Created on : Oct 27, 2022, 12:05:47 PM
    Author     : ASUS
--%>

<%@page import="Registration.CartObj"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="css/cart.css" />
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css"
      integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A=="
      crossorigin="anonymous"
      referrerpolicy="no-referrer"
    />
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
      rel="stylesheet"
    />
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
    <link
      rel="icon"
      type="image/x-icon"
      href="https://cdn.iconscout.com/icon/premium/png-256-thumb/piano-3122691-2621605.png"
    />
    <title>Cart</title>
  </head>
  <body>
    <div class="card">
        <%
              if(session!=null){
                  CartObj cart = (CartObj) request.getAttribute("CART");
                  
                  if(cart==null){
//                      if(cart.getItems()!=null){
          %>
      <div class="row">
        <div class="col-md-8 cart">
          <div class="title">
            <div class="row">
              <div class="col">
                <h4><b>Shopping Cart</b></h4>
              </div>
              
            </div>
          </div>
          <div class="row border-top border-bottom">
            <div class="row main align-items-center">
              <div class="col-2">
                <img class="img-fluid" src="https://i.imgur.com/1GrakTl.jpg" />
              </div>
              <div class="col">
                <div class="row text-muted">Shirt</div>
                <div class="row">Cotton T-shirt</div>
              </div>
              <div class="col">
                <a href="#">-</a><a href="#" class="border">1</a
                ><a href="#">+</a>
              </div>
              <div class="col">
                &euro; 44.00 <span class="close">&#10005;</span>
              </div>
            </div>
          </div>
          <div class="row">
            <div class="row main align-items-center">
              <div class="col-2">
                <img class="img-fluid" src="https://i.imgur.com/ba3tvGm.jpg" />
              </div>
              <div class="col">
                <div class="row text-muted">Shirt</div>
                <div class="row">Cotton T-shirt</div>
              </div>
              <div class="col">
                <a href="#">-</a><a href="#" class="border">1</a
                ><a href="#">+</a>
              </div>
              <div class="col">
                &euro; 44.00 <span class="close">&#10005;</span>
              </div>
            </div>
          </div>
          <div class="row border-top border-bottom">
            <div class="row main align-items-center">
              <div class="col-2">
                <img class="img-fluid" src="https://i.imgur.com/pHQ3xT3.jpg" />
              </div>
              <div class="col">
                <div class="row text-muted">Shirt</div>
                <div class="row">Cotton T-shirt</div>
              </div>
              <div class="col">
                <a href="#">-</a><a href="#" class="border">1</a
                ><a href="#">+</a>
              </div>
              <div class="col">
                &euro; 44.00 <span class="close">&#10005;</span>
              </div>
            </div>
          </div>
        </div>
        <div class="col-md-4 summary">
          <div>
            <h5><b>Summary</b></h5>
          </div>
          <hr />
          <div class="row">
            <div class="col">ITEMS 3</div>
            <div class="col text-right">&euro; 132.00</div>
          </div>

          <div
            class="row"
            style="border-top: 1px solid rgba(0, 0, 0, 0.1); padding: 2vh 0"
          >
            <div class="col">TOTAL PRICE</div>
            <div class="col text-right">&euro; 137.00</div>
          </div>
          <button class="btn btn_checkout" style="background-color:darkgray;" onclick="checkout()">CHECKOUT</button>
        </div>
      </div>
      <%
//                      }
                }else {
            %>
    <h1>There nothing in cart.</h1>
            <%
                }
              }
            %>
            <div class="back-to-shop">
            <h5><a href="MainController?btAction=Null">&leftarrow;<span class="text-muted">Back to shop</span></a></h5>
          </div>
    </div>
  </body>
</html>