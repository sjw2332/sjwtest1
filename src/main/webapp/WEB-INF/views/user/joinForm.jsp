<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="../layout/header.jsp" %>

	<div class="container" style="margin-top: 100px;">
		<form action="/join" method="post">
			<div class="form-group">
				<input type="text"
					class="form-control" id="username" placeholder="Enter account"
					name="username">
			</div>
			<div class="form-group">
				 <input type="password"
					class="form-control" id="password" placeholder="Enter password"
					name="password">
			</div>
			<div class="form-group">
				<input type="email"
					class="form-control" id="email" placeholder="Enter email"
					name="email">
			</div>
	
			<button type="submit" class="btn btn-primary">회원가입</button>
		</form>
	</div>

<%@include file="../layout/footer.jsp" %>