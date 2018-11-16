<%-- 
    Document   : RegisterPage
    Created on : Nov 15, 2018, 3:42:20 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <title>Register</title>
    </head>
    <body>
         <form action="Register" method="post">
           <br><br><br><br>
        <div class="container">
    <div class="row">
		<div class="col-md-4 col-md-offset-4">
    		<div class="panel panel-default">
			  	<div class="panel-heading">
			    	<h1 class="center-block" >Register</h1>
			 	</div>
			  	<div class="panel-body">
			    	<form accept-charset="UTF-8" role="form">
                             <fieldset>
			    	  	<div class="form-group">
			    		    <input  class="form-control" placeholder="E-mail" name="email" type="text" required>
			    		</div>
			    		<div class="form-group">
			    			<input  class="form-control" placeholder="Password" name="password" type="password" required>
			    		</div>
                                 <div class="form-group">
			    			<input  class="form-control" placeholder="Firstname" name="firstname" type="text" required>
			    		</div>
                                 <div class="form-group">
			    			<input  class="form-control" placeholder="Lastname" name="lastname" type="text" required>
			    		</div>
                                 <div class="form-group">
			    			<input  class="form-control" placeholder="Username" name="username" type="text" required >
			    		</div>
			    		<div class="form-group">
			    			<input  class="form-control" placeholder="Address" name="address" type="text" required>
			    		</div>
			    		<input class="btn btn-lg btn-success btn-block" type="submit" value="Register">
			    	</fieldset>
			      	</form>
			    </div>
			</div>
		</div>
	</div>
</div>
            </form>
    </body>
</html>

