<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<body>

<h2>Student Confirmation</h2>

The student is confirmed: ${student.firstName} ${student.lastName}
<br><br>

Country: ${student.country}

<br><br>

Favorite Language: ${student.favoriteLanguage}

<br><br>

Operating Systems:

	<ul>
		<c:forEach var="temp" items="${student.operatingSystems}">		
			<li> ${temp} </li>
		</c:forEach>
	</ul>
	
<br><br>

</body>

</html>
