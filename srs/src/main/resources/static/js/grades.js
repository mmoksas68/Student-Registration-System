
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
