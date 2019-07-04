/** トップ画面.js */
function foodNum(num) {
    document.foodTypeForm.foodType.value = num;
    document.foodTypeForm.submit();
}

/** 検索結果がない場合のモーダル制御 */
function openModal() {
    var modal = document.getElementById('js-modal');
    if(!modal) return;
    // モーダルを表示させる
    modal.classList.add('is-show');

    var blackBg = document.getElementById('js-black-bg');
    var closeBtn = document.getElementById('js-close-btn');

    // 背景クリック
    closeModal(blackBg);
    // 閉じるボタンクリック
    closeModal(closeBtn);

    function closeModal(elem) {
	    if(!elem) return;
	    // 背景クリックか閉じるボタンクリックでイベント発動
	    elem.addEventListener('click', function() {
	  	  // モーダルを表示させない
	      modal.classList.remove('is-show');
	    })
	  }
}