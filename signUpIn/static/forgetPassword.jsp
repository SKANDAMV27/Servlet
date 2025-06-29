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
        <h4 class="text-center mb-4 text-primary">Email Validiation</h4>
        <form action="conform" method="post">
            <div class="mb-3">
                <span style="color:green">${err10}</span>
                <span style="color:red">${err11}</span>
                <span style="color:red">${err11}</span>
                <label for="emaiID" class="form-label">Email Id(For Validiation)</label>
                <input type="email" class="form-control" id="emaiID" name="emailEmail" placeholder="Enter your Email Id" value="${dto.email}">

            </div>
            <button type="submit" class="btn btn-primary w-100">Check</button>

        </form>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
