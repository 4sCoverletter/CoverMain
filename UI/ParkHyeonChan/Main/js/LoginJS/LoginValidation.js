function validate() {
	   var reName = /^[가-힣a-zA-Z]+$/;
       var re = /^[a-zA-Z0-9]{4,12}$/; // 아이디와 패스워드가 적합한지 검사할 정규식
       var re2 = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
       // 이메일이 적합한지 검사할 정규식

       var name = document.getElementById("userName");
       var email = document.getElementById("userEmail");
       var pw = document.getElementById("userPassword");
	   var pwr = document.getElementById("userPasswordRepeat");

       // ------------ 이메일 까지 -----------
	   if(name.value=="") {
           alert("이름을 입력해 주세요");
           name.focus();
           return false;
       }
	   
       if(email.value=="") {
           alert("이메일을 입력해 주세요");
           email.focus();
           return false;
       }
	   
	   if(pw.value=="") {
           alert("비밀번호를 입력해 주세요");
           pw.focus();
           return false;
       }
	   
	   if(pwr.value=="") {
           alert("비밀번호 확인을 입력해 주세요");
           pwr.focus();
           return false;
       }
	   
	   if(!check(reName,name,"이름은 영문 대소문자와 한글로 입력")) {
           return false;
       }

       if(!check(re,pw,"패스워드는 4~12자의 영문 대소문자와 숫자로만 입력")) {
		   pwr.value="";
           return false;
       }

       if(pw.value != pwr.value) {
           alert("비밀번호가 다릅니다. 다시 확인해 주세요.");
           join.checkpw.value = "";
           join.checkpw.focus();
           return false;
       }
	   
       if(!check(re2, email, "적합하지 않은 이메일 형식입니다.")) {
           return false;
       }

       alert("회원가입이 완료되었습니다.");
   }

   function check(re, what, message) {
       if(re.test(what.value)) {
           return true;
       }
       alert(message);
       what.value = "";
       what.focus();
       //return false;
}