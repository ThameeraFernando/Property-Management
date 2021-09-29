<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

	
	<% 
	String pid= request.getParameter("id");
	String pname= request.getParameter("name");
	String plocation= request.getParameter("location");
	String pprice= request.getParameter("price");
	String ptype= request.getParameter("type");
	String pfeatures= request.getParameter("features");
	
	
	%>
	<div class="center">
     <h1>Update Property Details</h1>
	
	<form action="update" method="post"> 
	
	ID <input type="text" name="id" value="<%= pid%>" readonly> <br>
	NAME <input type="text" name="name" value="<%= pname%>"> <br>
	LOCATION <input type="text" name="location" value="<%= plocation%>"> <br>
	PRICE <input type="number" name="price" value="<%= pprice%>"> <br>
	TYPE <input type="text" name="type" value="<%= ptype%>"> <br>
	FEATURES <input type="text" name="features" value="<%= pfeatures%>"> <br>
	
	<input type="submit" name="submit" value="updateproperty">
	</form>
	
	</div>
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