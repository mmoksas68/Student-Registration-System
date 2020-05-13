
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