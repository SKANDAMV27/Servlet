<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Application Portal</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">Application Home</a>
    </div>
</nav>
<div class="container mt-5">
    <h1>Welcome to the Application Portal</h1>
    <p>Please choose an option.</p>
    <pre>
    <a class="btn btn-primary" href="birthCertificate.jsp">Birth Certificate</a>
    <a class="btn btn-primary" href="deathCertificate.jsp">Death Certificate</a>
    <a class="btn btn-primary" href="drivingLicense.jsp">Driving License</a>
    <a class="btn btn-primary" href="jobApplication.jsp">Job Application</a>
    <a class="btn btn-primary" href="marriageCertificate.jsp">Marriage Certificate</a>
    <a class="btn btn-primary" href="passport.jsp">passport Appliocation</a>

    <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
            data-bs-target="#navbarNav" aria-controls="navbarNav"
            aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    </pre>
</div>

<!-- Bootstrap JS CDN -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>