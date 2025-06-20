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
        <a class="navbar-brand" href="index.jsp.jsp">Login</a>
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
    <form action="Form" method="post" >
        <div class="mb-3">
            <label for="name" class="form-label">Name</label>
            <input type="text" class="form-control" id="name" name="name" required>
        </div>
        <div class="mb-3">
            <label for="age" class="form-label">Age</label>
            <input type="text" class="form-control" id="age" name="age" required>
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
            <label for="adress" class="form-label">Adress</label>
            <input type="text" class="form-control" id="adress" name="adress" required>
        </div>


        <button type="submit" class="btn btn-success">Submit Report</button>
    </form>

</div>


<!-- Bootstrap JS CDN -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>