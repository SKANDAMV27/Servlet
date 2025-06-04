<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Missing Person Report</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-primary mb-4">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">Police Station</a>
    </div>
</nav>

<div class="container">
    <h2 class="mb-4">Report a Missing Person</h2>
    <form action="missing" method="post">
        <div class="mb-3">
            <label for="missingPersonName" class="form-label">Missing Person Name</label>
            <input type="text" class="form-control" id="missingPersonName" name="missingPersonName" required>
        </div>
        <div class="mb-3">
            <label for="mobile" class="form-label">Complaintee Mobile</label>
            <input type="text" class="form-control" id="mobile" name="mobile" required>
        </div>
        <div class="mb-3">
            <label for="age" class="form-label">Missing Person Age</label>
            <input type="number" class="form-control" id="age" name="age" required>
        </div>
        <div class="mb-3">
            <label for="gender" class="form-label">Missing Person Gender</label>
            <select class="form-select" id="gender" name="gender" required>
                <option selected disabled>Select Gender</option>
                <option>Male</option>
                <option>Female</option>
                <option>Other</option>
            </select>
        </div>
        <div class="mb-3">
            <label for="address" class="form-label">Last Known Address</label>
            <input type="text" class="form-control" id="address" name="address" required>
        </div>
        <div class="mb-3">
            <label for="location" class="form-label">Last Seen Location</label>
            <input type="text" class="form-control" id="location" name="location" required>
        </div>
        <div class="mb-3">
            <label for="marks" class="form-label">Identification Marks</label>
            <input type="text" class="form-control" id="marks" name="marks">
        </div>
        <div class="mb-3">
            <label for="langKnown" class="form-label">Languages Known</label>
            <input type="text" class="form-control" id="langKnown" name="langKnown">
        </div>
        <button type="submit" class="btn btn-primary">Submit Report</button>
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
