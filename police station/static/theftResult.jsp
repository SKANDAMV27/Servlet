<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Theft Report Result</title>
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

<div class="container">
    <h2 class="mb-4">Theft Report Submitted</h2>
    <div class="card">
        <div class="card-body">
            <p><strong>Name:</strong> ${name}</p>
            <p><strong>Mobile:</strong> ${mobile}</p>
            <p><strong>Age:</strong> ${age}</p>
            <p><strong>Address:</strong> ${address}</p>
            <p><strong>Location of Theft:</strong> ${location}</p>
            <p><strong>Item Lost:</strong> ${item}</p>
            <p><strong>Date of Theft:</strong> ${lostOn}</p>
        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
