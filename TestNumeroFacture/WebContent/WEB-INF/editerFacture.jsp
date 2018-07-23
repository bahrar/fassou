<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>
		<button  onclick="newClient()"> new client </button>
		<script type="text/javascript">
			function newClient(){
				alert("Insert a new client")
			}
		</script>
	</p>
		<select>
			<c:forEach items="${listOfClient}" var="code" >
				<option> <c:out value="${code}"></c:out></option>
			</c:forEach>
		</select>
		
		<form action="Controller1">
			<table>
				<tr> <td> <input type="text" placeholder="coo1"> </td> </tr>
				<tr> <td> <input type="text" placeholder="coo2"> </td> </tr>
				<tr> <td> <input type="text" placeholder="coo3"> </td> </tr>			
			</table>
		</form>
	
	
</body>
=======
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>
		<button  onclick="newClient()"> new client </button>
		<script type="text/javascript">
			function newClient(){
				alert("Insert a new client")
			}
		</script>
	</p>
		<select>
			<c:forEach items="${listOfClient}" var="code" >
				<option> <c:out value="${code}"></c:out></option>
			</c:forEach>
		</select>
		
		<form action="Controller1">
			<table>
				<tr> <td> <input type="text" placeholder="coo1"> </td> </tr>
				<tr> <td> <input type="text" placeholder="coo2"> </td> </tr>
				<tr> <td> <input type="text" placeholder="coo3"> </td> </tr>			
			</table>
		</form>
	
	
</body>
>>>>>>> f5e9f703ee5253c52c75137df411a54048cafa54
</html>