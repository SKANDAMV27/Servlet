<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign Up</title>
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
                    <a class="nav-link" href="signIn.jsp">Sign In</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="container col-md-6 bg-white p-4 rounded shadow-sm">
    <h3 class="mb-4 text-center text-primary">Sign Up</h3>

    <form action="signup" method="post">
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Email address</label>
            <input type="email" class="form-control" id="exampleInputEmail1" name="emaiEmail" placeholder="Enter Email" value="${dto.email}">
            <div class="text-danger">${error}</div>
            <div class="text-danger">${error6}</div>
            <div class="text-success">${correct}</div>
        </div>

        <div class="mb-3">
            <label for="username" class="form-label">User ID</label>
            <input type="number" class="form-control" id="username" name="userUser" placeholder="Enter User ID" value="${dto.userId}">
            <div class="text-danger">${error1}</div>
            <div class="text-danger">${error5}</div>
        </div>

        <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">Password</label>
            <input type="password" class="form-control" id="exampleInputPassword1" name="passwordPassword" placeholder="Enter Password" value="${dto.password}">
            <div class="text-danger">${error3}</div>
        </div>

        <div class="mb-3">
            <label for="exampleInputPassword2" class="form-label">Confirm Password</label>
            <input type="password" class="form-control" id="exampleInputPassword2" name="conformConform" placeholder="Re-enter Password" value="${dto.conformPassword}">
            <div class="text-danger">${error4}</div>
        </div>

        <button type="submit" class="btn btn-success w-100">Sign Up</button>
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
