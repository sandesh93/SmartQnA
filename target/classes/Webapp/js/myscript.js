$(document).ready(function() {
    $('select').material_select();
 });

function myFunction() {
    document.getElementById("demo").innerHTML = "Hello World";
}

 $(document).ready(function(){
    $('ul.tabs').tabs();
	onShow : true;
	swipeable: true;
	responsiveThreshold :true;
  });
       

$('#chat_message').val('New Text');


$('#chat_message').trigger('autoresize')

