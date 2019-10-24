<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" >

<head>
  <meta charset="UTF-8">
  <title>Multi Level Sidebar Bootstrap Nav List</title>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">

  <link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css'>

      <link rel="stylesheet" href="css/bar.css">

  
</head>

<body>

  
<div class="container" style="float:left">

	<div class="row">
		<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
			<div class="page-header">
				<h2>Side Bar</h2>
			</div>
		</div>
	</div>

	<div class="row">

		<div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
			
		<nav id="column_left">	
		<ul class="nav nav-list">
		  	<li><a>Dashboard</a></li>	
		  	<li>
		    	<a class="accordion-heading" data-toggle="collapse" data-target="#submenu1">
		      		<span class="nav-header-primary">Menu Link <span class="pull-right"><b class="caret"></b></span></span>
		    	</a>

			    <ul class="nav nav-list collapse" id="submenu1">
				    <li>
				      	<a class="accordion-heading" data-toggle="collapse" data-target="#submenu2">Sub Menu Link <span class="pull-right"><b class="caret"></b></span></a>
				      	<ul class="nav nav-list collapse" id="submenu2">
				      		<li><a href="#" title="Title">Sub Sub Menu Link</a></li>
				      		<li><a href="#" title="Title">Sub Sub Menu Link</a></li>
				      	</ul>
				    </li>
			    </ul>
		  	</li>

		</ul>

		</nav>

		</div>

		<div class="col-lg-9 col-md-9 col-sm-12 col-xs-12">


		</div>

	</div>

</div>


<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
  
  

</body>

</html>
