<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Driving License`Application Portal</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">Application Home</a>
        <a class="navbar-brand" href="birthCertificate.jsp">Birth Certificate</a>
        <a class="navbar-brand" href="deathCertificate.jsp">Death Certificate</a>
        <a class="navbar-brand" href="drivingLicense.jsp">Driving License</a>
        <a class="navbar-brand" href="jobApplication.jsp">Job Application</a>
        <a class="navbar-brand" href="marriageCertificate.jsp">Marriage Certificate</a>
        <a class="navbar-brand" href="passport.jsp">passport Appliocation</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarNav" aria-controls="navbarNav"
                aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
    </div>
</nav>
<div class="container mt-5">
    <h1>Welcome to the Application Portal</h1>
    <p>Please choose an option.</p>
    <form action="drivingLicenseApplication" method="post" >
        <div class="mb-3">
            <label for="nameid" class="form-label">Name</label>
            <input type="text" class="form-control" id="nameid" name="name" required>
        </div>
        <div class="mb-3">
            <label for="adress" class="form-label">Address</label>
            <input type="text" class="form-control" id="adress" name="adress" required>
        </div>
        <div class="mb-3">
            <label for="dateid" class="form-label">Applied Date</label>
            <input type="datetime-local" class="form-control" id="dateid" name="date" placeholder="Applied Date" required>
        </div>
        <div class="mb-3">
            <label for="mobile" class="form-label">Mobile Number</label>
            <input type="number" class="form-control" id="mobile" name="mobile" required>
        </div>
        <div class="mb-3">
            <label for="type" class="form-label">Vehicles Type</label>
            <select class="form-control" id="type" name="type" required>
                <option>Select</option>
                <option>Two/Four Wheeler</option>
                <option>Two Wheeler</option>
                <option>Four Wheeler</option>
                <option>Two/Four/six/Three Wheeler</option>
                <option>Three Wheeler</option>
                <option>Six Wheeler</option>
                <option>Heavy License</option>
                <option>Renewale</option>
            </select>
        </div>
        <button type="submit" class="btn btn-success">Submit Report</button>
    </form>

</div>

<!-- Bootstrap JS CDN -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>