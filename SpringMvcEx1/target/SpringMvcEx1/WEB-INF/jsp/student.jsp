<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>

<html>
	<head>
		<title>Spring MVC Form Handling</title>
	</head>
	
	<body>
		<h2>Student Name</h2>
		<form:form method = "POST" action = "/HelloWeb/addStudent">
         <table>
            <tr>
               <td><form:label path = "name">Name</form:label></td>
               <td><form:input path = "name" /></td>
            </tr>
         </table>  
      </form:form>
	</body>
</html>