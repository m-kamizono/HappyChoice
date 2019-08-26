/** トップ画面.js */
function foodTypeNum(num) {
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
/** 検索バリデーションチェック */
function valid() {
    var searchVal = document.getElementById('searchWord').value;
    var searchAl = document.getElementById('searchAlert');
    var alertWord = 'の入力はできないぞ';
    // 検索ワードがだったら
    if (searchVal == '') {
        searchAl.innerHTML = '検索文字を入力してね';
        return;
    }

    // 一部漢字をひらがな変換
    var val = cngHira(searchVal);

    // 漢字チェック
    var kanChk = /([\u{3005}\u{3007}\u{303b}\u{3400}-\u{9FFF}\u{F900}-\u{FAFF}\u{20000}-\u{2FFFF}][\u{E0100}-\u{E01EF}\u{FE00}-\u{FE02}]?)/mu;
    if (val.match(kanChk)) {
        searchAl.innerHTML = '漢字' + alertWord;
        return;
    }
    // 半角チェック
    if (val.match(/[\uFF65-\uFF9F]/g)) {
        searchAl.innerHTML = '半角文字' + alertWord;
        return;
    }
    // 半角全角英語チェック
    if (val.match(/[A-Za-z]/g) || val.match(/[Ａ-Ｚａ-ｚ]/g)) {
        searchAl.innerHTML = '英語' + alertWord;
        return;
    }
    // 記号チェック
    var kigoChk = new RegExp(/[!"#$%&'()\*\+\-\.,\/:;<=>?@\[\\\]^_`{|}~！”＃＄％＆’（）＊＋．，、：；＜＝＞？＠＾＿‘｛｜｝～￥]/g);
    if (val.match(kigoChk)){
        searchAl.innerHTML = '記号' + alertWord;
        return;
    }

    document.foodListForm.searchWord.value = val;
    document.foodListForm.submit();

}

/** 漢字をひらがなに変換 */
function cngHira(searchVal) {
    var kanji = [
        '肉',
        '丼'
    ];

    var hira = [
        'にく',
        'どん'
    ];

    for (var i = 0; i <= kanji.length; i++) {
        // 対象の漢字をひらがなに変換
       if (searchVal.includes(kanji[i])) {
            // 正規表現用オブジェクトを生成
            // 使用することで、すべての対象文字列を置換
            var regExp = new RegExp(kanji[i], "g");
            searchVal = searchVal.replace(regExp, hira[i]);
            alert(searchVal);
        }
    }
    return searchVal;
}