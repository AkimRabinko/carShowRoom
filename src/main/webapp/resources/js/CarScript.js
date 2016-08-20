/**
 * Created by Akim_Rabinko on 17.08.2016.
 */
function addNewCar() {
    var carBrand =  $('#selectedCarBrand option:selected').val();;
    var carModel = $('#model').val();
    var releaseYear = $('#releaseYear').val();
    var capacity = $('#capacity').val();
    var horsePower = $('#horsePower').val();
    var driveOfCar = $('#driveOfCar').val();
    var transmission = $('#transmission').val();
    var fuelConsumption = $('#fuelConsumption').val();
    var JSONObject = {"carBrand" : carBrand, "modelOfCar" : carModel,
        "yearOfRelease" : releaseYear, "engineCapacity" : capacity ,
        "horsePower" : horsePower ,"driveOfCar" : driveOfCar,
        "transmission" : transmission,"fuelConsumption" : fuelConsumption};
    $.ajax({
        type: 'POST',
        contentType: 'application/json',
        url: '/CarShowRoom/car/addnew',
        data: JSON.stringify(JSONObject),
        dataType: 'json',
        success: function(data) {
            $("#addCarForm")[0].reset();
        }
    });
}

function getAllCars() {
    $.ajax({
        type: 'GET',
        url: '/CarShowRoom/car/getall',
        data: JSON,
        contentType: 'application/json',
        mimeType: 'application/json',
        success: function (data) {
            var items = "";
            $.each(data, function (id, car) {
                items += "<div class='carBlock'"
                    + "<div id='carsInfoBlock'><div class='carsInfo'>Car : " + car.carBrand + " " + car.modelOfCar + "</div>"
                    + "<div class='carsInfo'>Release year : " + car.yearOfRelease + "</div>"
                    + "<div class='carsInfo'>Capacity : " + car.engineCapacity + " L</div>"
                    + "<div class='carsInfo'>Horse Power : " + car.horsePower + "</div>"
                    + "<div class='carsInfo'>Car drive : " + car.driveOfCar + "</div>"
                    + "<div class='carsInfo'>Transmission : " + car.transmission + "</div>"
                    + "<div class='carsInfo'>Fuel consumption : " + car.fuelConsumption + " (L/100km)</div></div>"
                    + "<div class='carImage'><img style='width: 310px; height: 200px; margin: 0px; position: static' src='/CarShowRoom/resources/pictures/cars/" + car.modelOfCar + ".jpg'></div></div>";
            });
            $('#allCars').html(items);
        }
    });
}
