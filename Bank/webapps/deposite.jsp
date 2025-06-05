<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bank Server</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
  </head>
  <body>
  <ul class="nav nav-pills">
  <nav class="navbar bg-dark border-bottom border-body" data-bs-theme="dark">
      <!-- Navbar content -->
    <li class="nav-item">
      <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
    </li>
    <li class="nav-item">
          <a class="nav-link" href="deposite.jsp">Deposite</a>
        </li>
    <li class="nav-item">
      <a class="nav-link" href="withdraw.jsp">Withdraw</a>
    </li>

  </ul>
  </nav>
    <h1>Wellcome to Online Banking</h1>
<div class="container">
    <h2 class="mb-4">Details For Deposite</h2>
    <form action="deposite" method="post">
        <div class="mb-3">
            <label for="accountHolderName" class="form-label">Account Holder Name</label>
            <input type="text" class="form-control" id="accountHolderName" name="accountHolderName" required>
        </div>
        <div class="mb-3">
            <label for="mobile" class="form-label">Account Number</label>
            <input type="text" class="form-control" id="mobile" name="mobile" required>
        </div>
        <div class="mb-3">
            <label for="age" class="form-label">Mobile Number</label>
            <input type="number" class="form-control" id="age" name="age" required>
        </div>
        <div class="mb-3">
            <label for="gender" class="form-label">Payment Method</label>
            <select class="form-select" id="gender" name="gender" required>
                <option selected disabled>Select The Payment Method</option>
                <option>Google Pay</option>
                <option>Phone Pay</option>
                <option>Paytm</option>
                <option>Card</option>
            </select>
        </div>
        <div class="mb-3">
            <label for="address" class="form-label">Enter The Amount To Deposite</label>
            <input type="number" class="form-control" id="address" name="address" required>
        </div>
        <div class="mb-3">
            <label for="location" class="form-label">Enter The Pin</label>
            <input type="password" class="form-control" id="location" name="location" required>
        </div>
        <button type="submit" class="btn btn-primary">Conform Payment</button>
    </form>
</div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
  </body>
</html>