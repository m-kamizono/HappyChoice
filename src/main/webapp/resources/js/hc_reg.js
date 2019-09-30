/** 食品登録画面.js */
function setFoodId(id, i) {
    document.foodForm.foodId.value = id;
    var result  = document.getElementsByName('foodImg')[i].files[0];
    //FileReaderのインスタンスを作成する
    var reader = new FileReader();
    //画像ファイルの中身を取得する
    reader.readAsDataURL( result );
    //ファイルの中身を取得後に処理を行う
    reader.addEventListener( 'load', function() {
        document.foodForm.foodImgFile.value = reader.result;
    });
    document.foodForm.submit();
}
