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
                    <h1 class="page-header">Modifer le Bovin</h1>
                    <div class="container col-md-10 col-md-offset-1">
<div class="container col-md-8 col-md-offset-2 col-sx-12">
<div class="panel panel-primary">
<div class="panel-heading">Modification d'un Bovin</div>
<div class="panel-body">
<form action="UpdateAnimal.php" method="post">
<div class="form-group">
<label class="control-label">ID</label>
<input type="text" name="id"  class="form-control" value="${animal.id}" required="required"/>
<span></span>
</div>
<div class="form-group">
<label class="control-label">Matricule</label>
<input type="text" name="matricule"  class="form-control" value="${animal.matricule}" required="required"/>
<span></span>
</div>
<div class="form-group">
<label class="control-label">Nom</label>
<input type="text" name="nom" class="form-control"  value="${animal.nom}"  />
<span></span>
</div>
<div class="form-group">
<label class="control-label">Poids</label>
<input type="text" name="poids" class="form-control" value="${animal.poids}"  />
<span></span>
</div>
<div class="form-group">
<label class="control-label">Nombre Enfants</label>
<input type="text" name="nombreenfant" class="form-control"  value="${animal.nombreenfant}" />
<span></span>
</div>

<div class="form-group">
<label class="control-label">Sexe</label>
<input type="text" name="sexe" class="form-control"  value="${animal.sexe}" />
<span></span>
</div>
<div class="form-group">
<label class="control-label">Race</label>
<select class="form-control" name="race" >
  <option selected >Open this select menu</option>
 <option value="Angus noir">Angus noir</option>
  <option value="Angus rouge">Angus rouge</option>
   <option value="Blanc-bleu belge">Blanc-bleu belge</option>
    <option value="Blonde dAquitaine">Blonde dAquitaine</option>
     <option value="Charolais">Charolais</option>
      <option value="Dexter">Dexter</option>
        <option value="Galloway">Galloway</option>
       <option value="Gelbvieh">Gelbvieh</option>
        <option value="Hays converter">Hays converter</option>
         <option value="Hereford">Hereford</option>
          <option value="Highland">Highland</option>
           <option value="Limousin">Limousin</option>
</select>
</div>
<div class="form-group">
<label class="control-label">Type</label>
<select class="form-control" name="type" >
  <option selected >Open this select menu</option>
  <option value="lait">Lait</option>
  <option value="viande">Viande</option>
</select>
</div>
<div class="form-group">
<label class="control-label">Nombre Lactation</label>
<input type="text" name="nombrelactation" class="form-control" value="${animal.nombrelactation}"  />
<span></span>
</div>
<div class="form-group">
<label class="control-label">Nombre Velage</label>
<input type="text" name="nombrevelage" class="form-control"  value="${animal.nombrevelage}" />
<span></span>
</div>
<div>
<button type="submit" class="btn btn-primary">Save</button>
</div>
</form>
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