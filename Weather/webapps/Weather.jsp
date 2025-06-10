<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Weather Report Portal</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<!--<nav class="navbar navbar-expand-lg navbar-dark bg-primary">-->
<!--    <div class="container-fluid">-->
<!--        <a class="navbar-brand" href="index.jsp">Weather Details</a>-->
<!--        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"-->
<!--                data-bs-target="#navbarNav" aria-controls="navbarNav"-->
<!--                aria-expanded="false" aria-label="Toggle navigation">-->
<!--            <span class="navbar-toggler-icon"></span>-->
<!--        </button>-->

<!--        <div class="collapse navbar-collapse" id="navbarNav">-->
<!--            <ul class="navbar-nav ms-auto">-->
<!--                <li class="nav-item">-->
<!--                    <a class="nav-link" href="theft.jsp">Details</a>-->
<!--                </li>-->
<!--            </ul>-->
<!--        </div>-->
<!--    </div>-->
<!--</nav>-->

<div class="container mt-4">
    <h2 class="mb-3">Weather Report Form</h2>
    <p>Please fill out the form below:</p>
    <form action="weatherServlet" >
        <div class="mb-3">
            <label for="location" class="form-label">Location Name</label>
            <input type="text" class="form-control" id="location" name="location" required>
        </div>
        <div class="mb-3">
            <label for="capturedBy" class="form-label">Captured By</label>
            <input type="text" class="form-control" id="capturedBy" name="capturedBy" required>
        </div>
        <div class="mb-3">
            <label for="temperature" class="form-label">Temperature (°C)</label>
            <input type="number" class="form-control" id="temperature" name="temperature" required>
        </div>
        <div class="mb-3">
            <label for="reportDate" class="form-label">Reported Date</label>
            <input type="date" class="form-control" id="reportDate" name="reportDate" required>
        </div>
        <button type="submit" class="btn btn-success">Submit Report</button>
    </form>
</div>

<!-- Bootstrap JS CDN -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
