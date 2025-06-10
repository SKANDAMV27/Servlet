<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Death Certificate Application Portal</title>
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
    <form action="deathApplication" method="post" >
        <div class="mb-3">
            <label for="nameid" class="form-label">Name</label>
            <input type="text" class="form-control" id="nameid" name="name" required>
        </div>
        <div class="mb-3">
            <label for="cause" class="form-label">Cause</label>
            <input type="text" class="form-control" id="cause" name="cause" required>
        </div>
        <div class="mb-3">
            <label for="dateid" class="form-label">Date and Time</label>
            <input type="datetime-local" class="form-control" id="dateid" name="date" placeholder="Death Date" required>
        </div>
        <div class="mb-3">
            <label for="age" class="form-label">Age At death</label>
            <input type="number" class="form-control" id="age" name="age" required>
        </div>
        <div class="mb-3">
            <label for="certified" class="form-label">Certified By</label>
            <input type="text" class="form-control" id="certified" name="certified" required>
        </div>
        <div class="mb-3">
            <label for="hospitalid" class="form-label">Hospital Name</label>
            <input type="text" class="form-control" id="hospitalid" name="hospital" required>
        </div>
        <div class="mb-3">
            <label for="death" class="form-label"> Manner Of Death</label>
            <input type="text" class="form-control" id="death" name="death" required>
        </div>
        <div class="mb-3">
            <label for="gender" class="form-label">Gender</label>
            <select id="gender" name="gender" >
                <option>Select</option>
                <option>Male</option>
                <option>Female</option>
            </select>
        </div>
        <div class="mb-3">
            <label for="marks" class="form-label">Marks</label>
            <input type="text" class="form-control" id="marks" name="marks" required>
        </div>

        <button type="submit" class="btn btn-success">Submit Report</button>
    </form>

</div>

<!-- Bootstrap JS CDN -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>