
$('#hideButton').on('click', function() {
  $('#smallStudentInfo').addClass('d-none')
  $('#hideButton').addClass('d-none')
  $('#showButton').removeClass('d-none')
});

$('#showButton').on('click', function() {
  $('#smallStudentInfo').removeClass('d-none')
  $('#hideButton').removeClass('d-none')
  $('#showButton').addClass('d-none')
});



$('#hide-icon-1').on('click', function() {
  $('#grade-table-1').addClass('d-none')
  $('#hide-icon-1').addClass('d-none')
  $('#show-icon-1').removeClass('d-none')
});

$('#show-icon-1').on('click', function() {
  $('#grade-table-1').removeClass('d-none')
  $('#hide-icon-1').removeClass('d-none')
  $('#show-icon-1').addClass('d-none')
});

$('#hide-icon-2').on('click', function() {
  $('#grade-table-2').addClass('d-none')
  $('#hide-icon-2').addClass('d-none')
  $('#show-icon-2').removeClass('d-none')
});

$('#show-icon-2').on('click', function() {
  $('#grade-table-2').removeClass('d-none')
  $('#hide-icon-2').removeClass('d-none')
  $('#show-icon-2').addClass('d-none')
});


$('#hide-icon-3').on('click', function() {
  $('#grade-table-3').addClass('d-none')
  $('#hide-icon-3').addClass('d-none')
  $('#show-icon-3').removeClass('d-none')
});

$('#show-icon-3').on('click', function() {
  $('#grade-table-3').removeClass('d-none')
  $('#hide-icon-3').removeClass('d-none')
  $('#show-icon-3').addClass('d-none')
});
