<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Home</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container">
        <a class="navbar-brand" href="index.jsp">MyApp</a>
        <div class="collapse navbar-collapse">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item"><a class="nav-link" href="signUp.jsp">Sign Up</a></li>
                <li class="nav-item"><a class="nav-link" href="signIn.jsp">Sign In</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container d-flex justify-content-center align-items-center" style="min-height: 80vh;">
    <div class="text-center">
        <h1 class="display-5 fw-bold text-dark">Welcome to MyApp!</h1>
        <p class="lead text-muted">Your secure portal to sign in or register a new account.</p>
        <div class="mt-4">
            <a href="signUp.jsp" class="btn btn-outline-success me-2">Sign Up</a>
            <a href="signIn.jsp" class="btn btn-outline-primary">Sign In</a>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
