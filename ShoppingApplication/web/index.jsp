<%-- 
    Document   : index
    Created on : Apr 5, 2018, 10:27:35 AM
    Author     : bimal.parajuli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping Application</title>
    </head>
    <body>
        <h1>CD Catalog</h1>
        <table border="1">
            <th>Product ID</th>
            <th>description</th>
            <th>Price</th>
                <c:forEach var="product" items="${pcatalog.productlist}">
            <tr><td>${product.itemcode}</td>
                <td>${product.name}</td>
                <td>${product.itemprice}</td>
                <td><form method='get' action='AddToCartServlet'>
                    <input type='hidden' name='productid' value='${product.itemcode}' />
                    <input type='submit' value='add to cart' /> </form>
                </td>
            </tr>
            </c:foreach>
        </table>
    </body>
</html>
