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
        <h4 class="text-center mb-4 text-primary">Reset Password</h4>
        <form action="ResetPassword" method="post">
            <div class="mb-3">
                <span style="color:red">${err10}</span>
                <span style="color:green">${err12}</span>

                <label for="password" class="form-label">password</label>
                <input type="password" class="form-control" id="password" name="passworPassword" placeholder="Enter The Password" value="${dto.password}">
            </div>
            <div class="mb-3">
                <label for="conformPassword" class="form-label">conform password</label>
                <input type="password" class="form-control" id="conformPassword" name="passworConform" placeholder="Enter The Conform Password" value="${dto.conformPassword}">
            </div>
            <button type="submit" class="btn btn-primary w-100" >Sign In</button>

        </form>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
