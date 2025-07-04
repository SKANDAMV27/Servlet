<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sign In</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-gradient bg-light">

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container">
        <a class="navbar-brand" href="index.jsp">MyApp</a>
        <div class="collapse navbar-collapse">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>
                <li class="nav-item"><a class="nav-link" href="signUp.jsp">Sign Up</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container d-flex justify-content-center align-items-center" style="min-height: 90vh;">
    <div class="card shadow-lg p-4 w-100" style="max-width: 400px;">
        <h4 class="text-center mb-4 text-primary">Sign In</h4>
        <form action="signIn" method="post">
            <div class="mb-3">
                <label for="IdUser" class="form-label">User ID</label>
                <input type="text" class="form-control" id="IdUser" name="idID" placeholder="Enter your user ID" value="${dto.userId}">
                <div class="text-danger">${erro7}</div>
            </div>
            <div class="mb-3">
                <label for="exampleInputPassword1" class="form-label">Password</label>
                <input type="password" class="form-control" id="exampleInputPassword1" name="passWord" placeholder="Enter your password" value="${dto.password}">
            </div>
            <div class="mb-3 text-end">
                <a href="forgetPassword.jsp" class="text-decoration-none small">Forgot Password?</a>
            </div>
            <button type="submit" class="btn btn-primary w-100">Sign In</button>
            <div class="text-success mt-3 text-center">${error8}</div>
        </form>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
