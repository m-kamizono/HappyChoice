/** 食品リスト画面.js */
function foodId(num) {
    document.foodListForm.foodId.value = num;
    document.foodListForm.submit();
}

function ascdscFood(foodList) {

    var sortVal = document.getElementById('foodlist_sort').value;
    if (sortVal == '') return;

    var sortTmps = sortVal.split(',');
    if (sortTmps.length < 2) return;

    var isAsc = (sortTmps[0] > sortTmps[1]); // 今が降順ならtrue ⇒昇順にする

    var asc = document.getElementById('ascFood');
    var dsc = document.getElementById('dscFood');

    var sortResult = '';
    var sortResultContent = '';
    if (isAsc) {
        asc.innerHTML = 'A';
        dsc.innerHTML = 'Z';

        for (var i=0; i<sortTmps.length; i++) {
            if (sortResult.length > 0) sortResult += ',';
            sortResult += i+'';
            sortResultContent += '<li id="foodlist_li_' + i + '">' + document.getElementById('foodlist_li_'+i).innerHTML + '</li>';
        }
    } else {
        asc.innerHTML = 'Z';
        dsc.innerHTML = 'A';

        for (var i=(sortTmps.length-1); i>=0; i--) {
            if (sortResult.length > 0) sortResult += ',';
            sortResult += i+'';
            sortResultContent += '<li id="foodlist_li_' + i + '">' + document.getElementById('foodlist_li_'+i).innerHTML + '</li>';
        }
    }

    document.getElementById('foodlist_sort').value = sortResult;
    document.getElementById('foodlist_ul').innerHTML = sortResultContent;
}
