<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="../layout/header.jsp" %>

	<div class="container" style="margin-top: 100px;">
		<form action="/login" method="post">
			<div class="form-group">
				<input type="text"
					class="form-control" id="username" placeholder="Enter account"
					name="username" required>
			</div>
			<div class="form-group">
				<input type="password"
					class="form-control" id="password" placeholder="Enter password"
					name="password" required>
			</div>
	
			<button type="submit" class="btn btn-primary">로그인</button>
		</form>
	</div>

<%@include file="../layout/footer.jsp" %>