<%-- 
    Document   : Loginpage
    Created on : Nov 15, 2018, 3:42:08 PM
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
        <title>Login Page</title>
    </head>
    <body>
        
        
       <form action="Login" method="post">
           <br><br><br><br>
        <div class="container">
    <div class="row">
		<div class="col-md-4 col-md-offset-4">
    		<div class="panel panel-default">
			  	<div class="panel-heading">
			    	<h2 class="center-block" >Please login</h2>
			 	</div>
			  	<div class="panel-body">
			    	<form accept-charset="UTF-8" role="form">
                             <fieldset>
			    	  	<div class="form-group">
			    		    <input type="email"  class="form-control" placeholder="E-mail" name="email" required>
			    		</div>
			    		<div class="form-group">
			    			<input  class="form-control" placeholder="Password" name="password" type="password" required>
			    		</div>
			    		
			    		<input class="btn btn-lg btn-success btn-block" type="submit" value="Login">
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
