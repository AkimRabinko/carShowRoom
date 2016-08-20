/**
 * Created by Akim_Rabinko on 17.08.2016.
 */
function getAllBrands() {
    $.ajax({
        type: 'GET',
        url: '/CarShowRoom/carbrand/getall',
        data: JSON,
        contentType: 'application/json',
        mimeType: 'application/json',
        success: function (data) {
            var items="" ;
            $.each(data, function (id, carBrand) {
                items += "<li><a href=\"/CarShowRoom/carbrand/getall/" + carBrand.brandOfCar + "\">" +
                "<img src='/CarShowRoom/resources/pictures/emblems/" + carBrand.brandOfCar + ".png'>" +
                "<div class='emblemName'>" + carBrand.brandOfCar + "</div> </a></li>";
            });
            $('#carBrands').html(items);
        }
    });
}


function getBrandsForCarAdding() {
    $.ajax({
        type: 'GET',
        url: '/CarShowRoom/carbrand/getall',
        data: JSON,
        contentType: 'application/json',
        mimeType: 'application/json',
        success: function (data) {
            var items = "<select  style='width: auto ; height: auto; border: none;' id=\"selectedCarBrand\" class=\"text\""
                + "style=\"height: auto;\">";
                $.each(data, function (id, carBrand) {
                    items += "<option value=\" " + carBrand.brandOfCar + "\">" +  carBrand.brandOfCar   +  "</option>";
                });
                items+= "</select>";
                $('#carBrandForAdding').html(items);
            }
        });
    }