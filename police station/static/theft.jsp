<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Theft Report</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">Crime Report Portal</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarNav" aria-controls="navbarNav"
                aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link active" href="theft.jsp">Theft</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="missingPerson.jsp">Missing Person</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div class="container mt-5">
    <h2 class="mb-4 text-center">Report a Theft</h2>
    <form action="theft" method="post">
        <div class="mb-3">
            <label for="name" class="form-label">Name</label>
            <input type="text" class="form-control" id="name" name="name" required />
        </div>
        <div class="mb-3">
            <label for="mobile" class="form-label">Mobile</label>
            <input type="tel" class="form-control" id="mobile" name="mobile" pattern="[0-9]{10}" required />
        </div>
        <div class="mb-3">
            <label for="age" class="form-label">Age</label>
            <input type="number" class="form-control" id="age" name="age" min="0" required />
        </div>
        <div class="mb-3">
            <label for="address" class="form-label">Address</label>
            <textarea class="form-control" id="address" name="address" rows="2" required></textarea>
        </div>
        <div class="mb-3">
            <label for="location" class="form-label">Location of Theft</label>
            <input type="text" class="form-control" id="location" name="location" required />
        </div>
        <div class="mb-3">
            <label for="item" class="form-label">Item Lost</label>
            <input type="text" class="form-control" id="item" name="item" required />
        </div>
        <div class="mb-3">
            <label for="lostOn" class="form-label">Date of Theft</label>
            <input type="date" class="form-control" id="lostOn" name="lostOn" required />
        </div>
        <button type="submit" class="btn btn-primary w-100">Submit Report</button>
    </form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
