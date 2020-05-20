
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


$('#list').click(function () {
    hide()
    for (i =0; i<20; i++){
        if($('#customRadio'+i).is(':checked') ){
            let course = $('#customRadio'+i).val()
            $("." + course).removeClass('d-none')
        }

    }
})

function hide(){
    $(".hide").addClass('d-none')
}
