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
        <form action="birthApplication" method="post" >
            <div class="mb-3">
                <label for="birth" class="form-label">Birth Id</label>
                <input type="number" class="form-control" id="birth" name="birth" required>
            </div>
            <div class="mb-3">
                <label for="name" class="form-label">Hospital Name</label>
                <select class="form-control" id="name" name="name" required>
                    <option>Select</option>
                    <option>Jayachamarajendra Government Hospital</option>
                    <option>Melige Hospital</option>
                    <option>Sri Krishna Hospital</option>
                    <option>Anuradha Hospital</option>
                </select>

            </div>
            <div class="mb-3">
                <label for="father" class="form-label">Father Name</label>
                <input type="text" class="form-control" id="father" name="father" placeholder="Father Name" required>
            </div>
            <div class="mb-3">
                <label for="mother" class="form-label">Mother Name</label>
                <input type="text" class="form-control" id="mother" name="mother" required>
            </div>
            <div class="mb-3">
                <label for="date" class="form-label">Date and Time</label>
                <input type="datetime-local" class="form-control" id="date" name="date" required>
            </div>
            <div class="mb-3">
                <label for="doctor" class="form-label">Doctor Name</label>
                <input type="text" class="form-control" id="doctor" name="doctor" required>
            </div>
            <div class="mb-3">
                <label for="nurse" class="form-label">Nurse Name</label>
                <input type="text" class="form-control" id="nurse" name="nurse" required>
            </div>
            <div class="mb-3">
                <label for="hospital" class="form-label">Type Of Hospital</label>
                <select id="hospital" name="hospital" >
                    <option>Select</option>
                    <option>Government</option>
                    <option>Clinic</option>
                    <option>Community</option>
                    <option>General</option>
                    <option>Technical</option>
                </select>
            </div>

            <button type="submit" class="btn btn-success">Submit Report</button>
        </form>

    </div>


<!-- Bootstrap JS CDN -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>