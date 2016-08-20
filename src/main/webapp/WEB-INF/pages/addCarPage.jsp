<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<html>
<head>
    <title>Add car</title>
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/CarBrandScript.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/CarScript.js"/>"></script>
    <link rel="stylesheet" href="<c:url value="/resources/css/addCarPage.css"/>">
    <style type="text/css">
        body {  background-image: url("<c:url value="/resources/pictures/bg.jpg" />");  }
    </style>
</head>
<body onload="getAllBrands(), getBrandsForCarAdding()">
<div id="navigation">
    <ul class="site-navigation">
        <li><a href="/CarShowRoom/main">Home</a></li>
        <li style="background-color: #471b77"><a href="/CarShowRoom/main/cars">Cars</a>
            <ul>
                <li><a href="#">
                    <img src="<c:url value="/resources/pictures/emblems/BMW.png"/> ">
                    <div class="emblemName">BMW</div>
                </a></li>
                <li><a href="#">
                    <img src="<c:url value="/resources/pictures/emblems/Ford.png"/> ">
                    <div class="emblemName">Ford</div>
                </a></li>
                <li><a href="#">
                    <img src="<c:url value="/resources/pictures/emblems/Volkswagen.png"/> ">
                    <div class="emblemName">Volkswagen</div>
                </a></li>
            </ul>
        </li>
        <li><a href="/CarShowRoom/main/buyer/">Buyers</a></li>
        <li><a href="/CarShowRoom/main/manager/">Managers</a></li>
        <li><a href="/CarShowRoom/main/manager/">Test drive</a></li>
        <li><a href="/CarShowRoom/main">News</a></li>
        <li><a href="/CarShowRoom/main">About us</a></li>
    </ul>
</div>
<form id="addCarForm">
    <div class="addingForm">
        <div class="text">Car brand
            <div class="inputField" id="carBrandForAdding"></div>
        </div>
        <div class="text">Car model
            <div class="inputField"><input type="text"  name="model" id="model"></div>
        </div>
        <div class="text">Release year
            <div class="inputField"><input type="text"  name="releaseYear" id="releaseYear"></div>
        </div>
        <div class="text">Engine capacity
            <div class="inputField"><input type="text" name="capacity" id="capacity"></div>
        </div>
        <div class="text">Horse power
            <div class="inputField"><input type="text" name="horsePower" id="horsePower"></div>
        </div>
        <div class="text">Drive of car
            <div class="inputField"><input type="text" name="driveOfCar" id="driveOfCar"></div>
        </div>
        <div class="text">Transmission
            <div class="inputField"><input type="text" name="transmission" id="transmission"></div>
        </div>
        <div class="text">Fuel consumption
            <div class="inputField"><input type="text" name="fuelConsumption" id="fuelConsumption"></div>
        </div>
        <div class="text"><input type="submit" onclick="addNewCar()" name ="addCar" value="add new car"/></div>
    </div>
</form>
</body>
</html>
