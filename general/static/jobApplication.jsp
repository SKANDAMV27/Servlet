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
    <p>Please Fill The Form</p>
    <form action="jobApplication" method="post" >
        <div class="mb-3">
            <label for="name" class="form-label">Name</label>
            <input type="text" class="form-control" id="name" name="name" required>
        </div>
        <div class="mb-3">
            <label for="email" class="form-label">Email</label>
            <input type="email" class="form-control" id="email" name="email" required>
        </div>
        <div class="mb-3">
            <label for="education" class="form-label">Education</label>
            <select id="education" name="education">
                <option>select</option>
                <option>BE/B.Tech</option>
                <option>BCA</option>
                <option>MCA</option>
                <option>Bcom</option>
                <option>BBA</option>
                <option>B Form</option>
            </select>
        </div>
        <div class="mb-3">
            <label for="skills" class="form-label">Skills</label>
            <input type="text" class="form-control" id="skills" name="skills" required>
        </div>
        <div class="mb-3">
            <label for="salary" class="form-label">Expected Salary</label>
            <input type="text" class="form-control" id="salary" name="salary" required>
        </div>
        <div class="mb-3">
            <label for="experence" class="form-label">Experence</label>
            <select id="experence" name="experence">
                <option>select</option>
                <option>0</option>
                <option>1</option>
                <option>2</option>
                <option>3</option>
                <option>4</option>
            </select>
        </div>
        <button type="submit" class="btn btn-success">Submit Report</button>
    </form>

</div>

<!-- Bootstrap JS CDN -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>