/** 食品リスト画面.js */
function foodId(num) {
	// TODO: foodListFormの名前を変えるとイベント起動しなくなる
    document.foodListForm.foodId.value = num;
    document.foodListForm.submit();
}

function ascdscFood(foodList) {
    var asc = document.getElementById('ascFood');
    var dsc = document.getElementById('dscFood');
    if (asc.innerHTML == 'A' || dsc.innerHTML == 'Z') {
        asc.innerHTML = 'Z';
        dsc.innerHTML = 'A';
    } else {
        asc.innerHTML = 'A';
        dsc.innerHTML = 'Z';
    }
}
