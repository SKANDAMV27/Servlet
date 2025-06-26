<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign In</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<nav class="navbar navbar-expand-lg navbar-dark bg-primary mb-4">
    <div class="container">
        <a class="navbar-brand" href="index.jsp">MyApp</a>
        <div class="collapse navbar-collapse">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link" href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="signUp.jsp">Sign Up</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="container col-md-6 bg-white p-4 rounded shadow-sm">
    <h3 class="mb-4 text-center text-primary">Sign In</h3>

    <form action="signIn" method="post">
        <div class="mb-3">

            <span style="color:green">${error8}</span>
            <label for="IdUser" class="form-label">User ID</label>
            <span style="color:red">${erro7}</span>
            <input type="text" class="form-control" id="IdUser" placeholder="Enter User ID" name="idID" value="${dto.userId}">
        </div>
        <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">Password</label>
            <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Enter Password" name="passWord" value="${dto.password}">
        </div>


        <button type="submit" class="btn btn-primary w-100">Sign In</button>
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
