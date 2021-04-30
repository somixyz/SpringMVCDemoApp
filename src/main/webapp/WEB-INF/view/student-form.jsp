<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>

<head>
</head>

<body>
	<form:form action="processForm" modelAttribute="student">
	
	First Name: <form:input path="firstName" />

		<br>
		<br>
	
	Last Name: <form:input path="lastName" />

		<br>
		<br>
	Country:
		<form:select path="country">
			<form:options items="${student.countryOptions }"></form:options>
		</form:select>
		<br>
		<br>

	Favourite Language:
	Java <form:radiobutton path="favouriteLanguage" value="Java" />
	C# <form:radiobutton path="favouriteLanguage" value="C#" />
	PHP <form:radiobutton path="favouriteLanguage" value="PHP" />
	Ruby <form:radiobutton path="favouriteLanguage" value="Ruby" />

		<br>
		<br>
		
	Operation Systems: 
	Linux <form:checkbox path="operatingSystem" value="Linux" />	
	MAC OS <form:checkbox path="operatingSystem" value="MAC OS" />
	Windows <form:checkbox path="operatingSystem" value="Windows" />
		<br>
		<br>

		<input type="submit" value="Submit" />

	</form:form>
</body>
</html>
