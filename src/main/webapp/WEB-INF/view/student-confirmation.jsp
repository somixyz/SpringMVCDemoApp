<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<title>Student Registration Form</title>
</head>

<body>

	The student is confirmed: ${student.firstName } ${student.lastName }
	<br>
	<br>

	<!-- Spring will call student.getCountry(); in next line -->
	Country: ${student.country }

	<br>
	<br> Favourite Language: ${student.favouriteLanguage }

	<br>
	<br> Operating Systems:

	<ul>
		<c:forEach var="temp" items="${student.operatingSystem }">
			<li>${temp}</li>
		</c:forEach>
	</ul>
	<br>
	<br>
</body>
</html>