<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sign Up</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-gradient bg-light">

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container">
        <a class="navbar-brand" href="index.jsp">MyApp</a>
        <div class="collapse navbar-collapse">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>
                <li class="nav-item"><a class="nav-link" href="signIn.jsp">Sign In</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container d-flex justify-content-center align-items-center" style="min-height: 90vh;">
    <div class="card shadow-lg p-4 w-100" style="max-width: 500px;">
        <h4 class="text-center mb-4 text-success">Sign Up</h4>
        <form action="signup" method="post">
            <div class="mb-3">
                <label for="emailInput" class="form-label">Email Address</label>
                <input type="email" class="form-control" id="emailInput" name="emaiEmail" placeholder="Enter email" value="${dto.email}">

            </div>
            <div class="mb-3">
                <label for="username" class="form-label">User ID</label>
                <input type="number" class="form-control" id="username" name="userUser" placeholder="Enter user ID" value="${dto.userId}">

            </div>
            <div class="mb-3">
                <label for="password1" class="form-label">Password</label>
                <input type="password" class="form-control" id="password1" name="passwordPassword" placeholder="Enter password" value="${dto.password}">

            </div>
            <div class="mb-3">
                <label for="password2" class="form-label">Confirm Password</label>
                <input type="password" class="form-control" id="password2" name="conformConform" placeholder="Re-enter password" value="${dto.conformPassword}">

            </div>
            <button type="submit" class="btn btn-success w-100">Sign Up</button>
        </form>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>