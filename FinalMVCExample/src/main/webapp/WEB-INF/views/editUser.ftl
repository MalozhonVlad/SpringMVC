<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>



<form name="user" action="/updateUser" method="post">
    <p>Id</p>
    <input title="Name" type="text" name="id" value="${user.id}">
    <p>Name</p>
    <input title="Name" type="text" name="name" value="${user.name}">
    <p>Emeil</p>
    <input title="Emeil" type="text" name="emeil" value="${user.emeil}">
    <p>Age</p>
    <input title="Age" type="text" name="age" value="${user.age}">
    <input type="submit" value="OK">
</form>


</body>
</html>