<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<html>
<head>
    <title>Add buyer</title>
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
    <link rel="stylesheet" href="<c:url value="/resources/css/addBuyerPage.css"/>">
    <style type="text/css">
        body {  background-image: url("<c:url value="/resources/pictures/bg.jpg" />");  }
    </style>
</head>
<body>
<div id="navigation">
    <ul class="site-navigation">
        <li><a href="/CarShowRoom/main">Home</a></li>
        <li style="background-color: #471b77"><a href="?CarShowRoom/main/cars">Cars</a>
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
</body>
</html>