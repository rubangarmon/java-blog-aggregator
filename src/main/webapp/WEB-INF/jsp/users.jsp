<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table class="table table-bordered table-hover table-striped">

	<thead>
		<tr>
			<th>ID</th>
			<th>User Name</th>
			<th>Email</th>
		</tr>
	</thead>

	<tbody>
		<c:forEach items="${users}" var="user">
			<tr>
				<td>${user.id}</td>
				<td>${user.name}</td>
				<td>${user.email}</td>
			</tr>

		</c:forEach>
	</tbody>

</table>