$('#modalPush').on('show.bs.modal', function (event) { // myModal 윈도우가 오픈할때 아래의 옵션을 적용
  var button = $(event.relatedTarget) // 모달 윈도우를 오픈하는 버튼
  var emailTxt = button.data('email') // 버튼에서 data-title 값을 titleTxt 변수에 저장
  var platformTxt = button.data('platform')
  var modal = $(this)
  modal.find('.modal-email').text(emailTxt)// 모달위도우에서 .modal-title을 찾아 titleTxt 값을 치환
  modal.find('.modal-platform').text(platformTxt)
 
});