
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">Order Form</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">

                <li class="nav-item">
                    <a class="nav-link" href="Product.jsp">Product Details</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link disabled" aria-disabled="true">Disabled</a>
                </li>
            </ul>
            <form class="d-flex" role="search">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search"/>
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>
<h1>Costomer Details!</h1>
<p>Fill The Form</p>
<span>
    <form action="customer" method="post">
        <diV>
        <label for="nameId">Name</label>
            <input type="text" id="nameId" name="nameName" placeholder="Enter The Name">
        </diV>
        <div>
            <label for="emailId">Email</label>
            <input type="email" id="emailId" name="emailEmail" placeholder="Enter The Email ID">
        </div>
        <div>
            <label for="mobileId">Mobile Number</label>
            <input type="number" id="mobileId" name="mobileMobile" placeholder="Enter The Mobile Number">
        </div>
        <div>
            <label for="houseId">House Number/Name</label>
            <input type="text" id="houseId" name="houseHouse" placeholder="Enter The House Number Or Name">
        </div>
        <div>
            <label for="areaId">Area</label>
            <input type="text" id="areaId" name="areaArea" placeholder="Enter The Area Name">
        </div>
        <div>
            <label for="cityId">City</label>
            <input type="text" id="cityId" name="cityCity" placeholder="Enter The City Name">
        </div>
        <div>
            <label for="pincodeId">PinCode</label>
            <input type="number" id="pincodeId" name="pincodePincode" placeholder="Enter The Pincode">
        </div>
        <div>
            <label for="dateId">Date</label>
            <input type="date" id="dateId" name="dateDate" placeholder="Enter The Date To Order">
        </div>
        <button type="submit" style="color:green">Submit</button>
    </form>
</span>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js" integrity="sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q" crossorigin="anonymous"></script>
</body>
</html>