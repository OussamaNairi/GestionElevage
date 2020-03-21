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
                    <h1 class="page-header">Ajouter un Bovin</h1>
                    <div class="container col-md-10 col-md-offset-1">
<div class="container col-md-8 col-md-offset-2 col-sx-12">
<div class="panel panel-primary">
<div class="panel-heading">Saisie d'un bovin</div>
<div class="panel-body">
<div class="form-group">
<label>ID :</label>
<label>${animal.id}</label>
</div>
<div class="form-group">
<label>Matricule :</label>
<label>${animal.matricule}</label>
</div>
<div class="form-group">
<label>Nom :</label>
<label>${animal.nom}</label>
</div>
<div class="form-group">
<label>Poids :</label>
<label>${animal.poids}</label>
</div>
<div class="form-group">
<label>Nombre Enfant :</label>
<label>${animal.nombreenfant}</label>
</div>
<div class="form-group">
<label>Sexe :</label>
<label>${animal.sexe}</label>
</div>
<div class="form-group">
<label>Race :</label>
<label>${animal.race}</label>
</div>
<div class="form-group">
<label>Type :</label>
<label>${animal.type}</label>
</div>
<div class="form-group">
<label>Nombre de Lactation :</label>
<label>${animal.nombrelactation}</label>
</div>
<div class="form-group">
<label>Nombre de Velage :</label>
<label>${animal.nombrevelage}</label>
</div>
</div>
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