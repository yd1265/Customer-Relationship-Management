<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>


<head> 
 <title>List Customers</title>
 </head>
 
 <body>

 <div id="wrapper">
<div id="header"><h2> CRM- Customer Relationship Manager</h2></div>
</div>
 
 
 <div id="container">
 
 <div id="content">
 
 <table>
 <tr>
 <th>First Name </th>
  <th>Last Name </th>
  <th>Email Adress</th>
  </tr>
  

  <c:forEach var="temp" items=${customers}>
  
  <tr>
  <td> ${temp.firstName} </td>
  <td> ${temp.lastName} </td>
  <td> ${temp.email} </td>
  
  </tr>
  
  </c:forEach>
 
 </table>
 
 </div>
 
 </div>
 
 </body>





</html>