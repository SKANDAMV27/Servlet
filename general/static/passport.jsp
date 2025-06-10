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
    <form action="passport" method="post" >
        <div class="mb-3">
            <label for="nameID" class="form-label">Applicant Name</label>
            <input type="text" class="form-control" id="nameID" name="name" required>
        </div>
        <div class="mb-3">
            <label for="number" class="form-label">AAdhar No</label>
            <input type="number" class="form-control" id="number" name="number" required>
        </div>
        <div class="mb-3">
            <label for="address" class="form-label">Address</label>
            <input type="text" class="form-control" id="address" name="address" required>
        </div>
        <div class="mb-3">
            <label for="PanNo" class="form-label">Pan Number</label>
            <input type="text" class="form-control" id="PanNo" name="PanNo" required>
        </div>
        <div class="mb-3">
            <label for="country" class="form-label">Country</label>
            <input type="text" class="form-control" id="country" name="Country" required>
        </div>
        <div class="mb-3">
            <label for="state" class="form-label">State</label>
            <input type="text" class="form-control" id="state" name="state" required>
        </div>
        <div class="mb-3">
            <label for="city " class="form-label">City </label>
            <input type="text" class="form-control" id="city " name="city " required>
        </div>
        <div class="mb-3">
            <label for="pinCode" class="form-label">PinCode</label>
            <input type="number"  class="form-control" id="pinCode" name="pinCode" required>
        </div>
        <div class="mb-3">
            <label for="passportType " class="form-label">PassportType</label>
            <select class="form-control" id="passportType " name="passportType " >
                <option>Select</option>
                <option>Ordinary Passport (Blue)</option>
                <option>Diplomatic Passport (Maroon)</option>
                <option>Official Passport (White)</option>
                <option>Emergency Certificate (Grey)</option>
                <option>Immigration Check Required Passport (Orange)</option>
                <option>e-Passport (Electronic Passport)</option>
            </select>
        </div>
        <div class="mb-3">
            <label for="refernce" class="form-label">Payment Reference No</label>
            <input type="number"  class="form-control" id="refernce" name="refernce" required>
        </div>
        <button type="submit" class="btn btn-success">Submit Report</button>
    </form>

</div>

<!-- Bootstrap JS CDN -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>