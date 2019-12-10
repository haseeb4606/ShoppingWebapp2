<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Product Entry</title>
</head>
<body>

	<form:form id="loginForm" modelAttribute="Object" action="Received"
		method="post">

		<table align="center">
			<tr>
				<td><form:label path="itemName">item Name : </form:label></td>
				<td><form:input path="itemName" name="itemname" id="itemName" />
				</td>
			</tr>
			<tr>
				<td><form:label path="department">Department : </form:label></td>
				<td><form:input path="department" name="department"
						id="department" /></td>
			</tr>
			<tr>
				<td><form:label path="descriptions">Descriptions :</form:label></td>
				<td><form:input path="descriptions" name="descriptions"
						id="descriptions" /></td>
			</tr>

			<tr>
				<td><form:label path="itemNumber">Item Number :</form:label></td>
				<td><form:input path="itemNumber" name="itemNumber"
						id="itemNumber" /></td>
			</tr>
			<tr>
				<td></td>
				<td align="left"><form:button id="save" name="save">Save</form:button>
				</td>
			</tr>
			<tr></tr>
		</table>
	</form:form>

</body>
</html>