<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Résumé Upload</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/app-resources/css/upload.css">
	</head>
	<body>
		<!--Nav Bar-->
		<nav class="navbar navbar-default">
			<div class="container-fluid">
				<div class="navbar-header">
					<a class="navbar-brand" href="#">Résumé Upload</a>
				</div>
			</div>
		</nav>
		<div class="container-fluid">
			<div class="container-fluid upload">
				<h1>Upload Your Résumé</h1>
				<form method="post" enctype="multipart/form-data" action="singleSave" id="my-resume">
					Résumé: <input type="file" name="file">
					<br /><br/>
					Description: <input type="text" name="desc"/>
					<br/><br/>
					<input type="submit" value="Upload" class="btn btn-primary">
					<br/><br/>
				</form>
			</div>
		</div>
	</body>
	<!--<script src="${pageContext.request.contextPath}/app-resources/js/dropzone.js"></script>-->
	<!--<script src="${pageContext.request.contextPath}/app-resources/js/dropzone-config.js"></script>-->
</html>