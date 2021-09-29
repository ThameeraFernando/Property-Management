<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<link rel = "stylesheet"
   type = "text/css"
   href = "property.css" />
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<html>
<head>
	
	<link rel="stylesheet" href="styles/headerfooter.css"/>

</head>
<body>
	<div class="menubar">
			<button type="submit"class="btnlogin" ><a href="#">Login</a></button>
			<button type="submit"class="btnRegister"><a href="#">Register</a></button>

			<div class="leftmenu">
				<h1 class="text" >NIWAHANA APARTMENTS</h1>
			</div>
			<ul>
				<li style="font-size:20px"> <a href="Home.html"> Home </a> </li>
				<li style="font-size:20px"> <a href="viewapartments.html"> Apartments </a> </li>
				<li style="font-size:20px"> <a href="Aboutus.html">About Us </a> </li>
				<li style="font-size:20px"> <a href="Services.html">Services </a> </li>
				<li style="font-size:20px">  <a href="contact.html">Contact Us </a> </li>
			</ul>
		</div>
	<hr>
	
	


<table id="customers">
	<tr>
	<th>ID</th>
	<th>Name</th>
	<th>Location</th>
	<th>Price</th>
	<th>Type</th>
	<th>Features</th>
	<th>UpdateProperty</th>
	<th>DeleteProperty</th>
	</tr>
	
	<c:forEach var="pro" items="${prodetails}">
	
	<c:set var="id" value="${pro.id}"/>
	<c:set var="name" value="${pro.name}"/>
	<c:set var="location" value="${pro.location}"/>
	<c:set var="price" value="${pro.price}"/>
	<c:set var="type" value="${pro.type}"/>
	<c:set var="features" value="${pro.features}"/>
	
	
	
	<tr>
	<td>${pro.id}</td>
	<td>${pro.name}</td>
	<td>${pro.location}</td>
	<td>${pro.price}</td>
	<td>${pro.type}</td>
	<td>${pro.features}</td>
	<td> 
	<c:url value="updateproperty.jsp" var="proupdate">
	<c:param name="id" value="${id}"/>
	<c:param name="name" value="${name}"/>
	<c:param name="location" value="${location}"/>
	<c:param name="price" value="${price}"/>
	<c:param name="type" value="${type}"/>
	<c:param name="features" value="${features}"/>
	
	</c:url>
	
	<a href="${proupdate}">
	<input type="button" name="update" value="updateproperty">
	</a>
	
	 </td>
	 <td>
	<c:url value="deleteproperty.jsp" var="prodelete">
	<c:param name="id" value="${id}"/>
	<c:param name="name" value="${name}"/>
	<c:param name="location" value="${location}"/>
	<c:param name="price" value="${price}"/>
	<c:param name="type" value="${type}"/>
	<c:param name="features" value="${features}"/>
	
	</c:url>
	
	 <a href="${prodelete}">
	 <input type="button" name="delete" value="deleteproperty">
	 </a>
	
	 </td>
	
	</tr>
	
	</c:forEach>
	
	
</table>
<br><br><br><br><br>
<div>
			<footer class="footer">
				<div class="cont">
					<div class="col">
						<div class="card">
							<h2>About Us</h2>
								<p>We're excited to offer some quality apartments.
									The Niwahana Apartments(Pvt) Ltd is one of the leading companies in the real estate sector in Sri Lanka.
									We have over 20 years experience in real estate.</p>
						</div>
					</div>
		 
					<div class="col">
						<div class="card">
							<h2>Find Us </h2>
								<p> Facebook: Niwahana Apartments<br>
									Instagram : niwahanalive<br>
									Email: inquire@Napartments.com <br>
								</p>
						</div>
					</div>
		 
					<div class="col">
						<div class="card">
							<h2>Location</h2>
								<p> No 14/2,<br>Athurugiriya road,<br>Malabe.<br></p>
						</div>
					</div>
		 
					<div class="col">
						<div class="card">
							<h2>Hotline</h2>
								<p>+94 355 584 894<br>+94 445 236 777<br>+94 558 326 256<br></p>
						</div>
					</div>
				</div>
			</footer>
		</div>


</body>
</html>