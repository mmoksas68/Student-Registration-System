$('#hideButton').on('click', function() {
    console.log("1")
    $('#smallStudentInfo').addClass('d-none')
    $('#hideButton').addClass('d-none')
    $('#showButton').removeClass('d-none')
});

$('#showButton').on('click', function() {
    console.log("2")
    $('#smallStudentInfo').removeClass('d-none')
    $('#hideButton').removeClass('d-none')
    $('#showButton').addClass('d-none')
});

let selectedSchools = []

$('#selection').on('click', function() {
    let newSelections = []
    let counter = 1
    for(i=0; i<7;i++){
        if($('#check_'+i).is(":checked") && counter<4){
            newSelections[counter] = new Map()
            newSelections[counter].set("name",  $('#name_'+ i).text())
            newSelections[counter].set("semester", $('#semester_'+ i).text())
            counter = counter+1
        }
    }
    selectedSchools = newSelections
    list(selectedSchools)
});

$('#rank_button_1').click(function () {
    changeRank(1,2)
})

$('#rank_button_2').click(function () {
    changeRank(1,2)
})

$('#rank_button_3').click(function () {
    changeRank(2,3)
})

$('#rank_button_4').click(function () {
    changeRank(2,3)
})

function changeRank(item1, item2){
    if (selectedSchools[item1].get("name") !== "" && selectedSchools[item2].get("name") !== ""){
        let tempName = selectedSchools[item1].get("name")
        let tempSemester = selectedSchools[item1].get("semester")
        selectedSchools[item1].set("name", selectedSchools[item2].get("name"))
        selectedSchools[item1].set("semester", selectedSchools[item2].get("semester"))
        selectedSchools[item2].set("name", tempName)
        selectedSchools[item2].set("semester", tempSemester)
    }
    list(selectedSchools)
}

function list(selectedSchools) {
    for (i=1; i<=3; i++){
        $('#rank_' + i + "_name").text(selectedSchools[i].get("name"))
        $('#rank_' + i + "_semester").text(selectedSchools[i].get("semester"))
        $('#rank_' + i + "_name").val(selectedSchools[i].get("name"))
        $('#rank_' + i + "_semester").val(selectedSchools[i].get("semester"))
    }
}
