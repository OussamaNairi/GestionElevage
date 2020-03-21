<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Animals</title>

 <!-- Core CSS - Include with every page -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="font-awesome/css/font-awesome.css" rel="stylesheet">

    <!-- Page-Level Plugin CSS - Dashboard -->
    <link href="css/plugins/morris/morris-0.4.3.min.css" rel="stylesheet">
    <link href="css/plugins/timeline/timeline.css" rel="stylesheet">

    <!-- SB Admin CSS - Include with every page -->
    <link href="css/sb-admin.css" rel="stylesheet">
    
</head>
<body>
<%@include file="header.jsp" %>
<div id="wrapper">
   <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Liste des Bovins</h1>
                    <div class="container col-md-10 col-md-offset-1">
<div class="panel panel-primary">
<div class="panel-heading">Recherche des Bovins</div>
<div class="panel-body">
<form action="chercher.php" method="get">
<label>Mot Cle</label>
<input type="text" name="motCle" value="${model.motCle}"/>
<button type="submit" class="btn btn-primary">Chercher</button> 
</form>
<table class="table table-striped">
<tr>
<th>ID</th><th>Matricule</th><th>Nom</th><th>Poids</th><th>Nombre Enfant</th><th>Sexe</th><th>Race</th><th>Type</th><th>Nombre de Lactation</th><th>Nombre de Velage</th><th>Action</th><th></th>
</tr>
<c:forEach items="${model.animals}" var="a" >

<tr>
<td>${a.id}</td>
<td>${a.matricule}</td>
<td>${a.nom}</td>
<td>${a.poids}</td>
<td>${a.nombreenfant}</td>
<td>${a.sexe}</td>
<td>${a.race}</td>
<td>${a.type}</td>
<td>${a.nombrelactation}</td>
<td>${a.nombrevelage}</td>

<td><a onclick ="return confirm('Etes vous sure ?')" href="Supprime.php?id=${a.id}"><span class="glyphicon glyphicon-trash" style="color:red"></span></a></td>
<td><a href="Edit.php?id=${a.id}"><span class="glyphicon glyphicon-cog" style="color:green"></span></a></td>

</tr>
</c:forEach>
</table>
</div>
</div>
</div>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
        </div>
          </div>

 <!-- Core Scripts - Include with every page -->
    <script src="js/jquery-1.10.2.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/plugins/metisMenu/jquery.metisMenu.js"></script>

    <!-- Page-Level Plugin Scripts - Dashboard -->
    <script src="js/plugins/morris/raphael-2.1.0.min.js"></script>
    <script src="js/plugins/morris/morris.js"></script>

    <!-- SB Admin Scripts - Include with every page -->
    <script src="js/sb-admin.js"></script>

    <!-- Page-Level Demo Scripts - Dashboard - Use for reference -->
    <script src="js/demo/dashboard-demo.js"></script>


</body>
</html>