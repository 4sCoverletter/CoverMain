
     var aJsonArray = new Array();
     var form = new Object();
  			$.ajax({
                  url: " join",
                  type: "POST",
                  dataType: "json",          // ajax 통신으로 받는 타입
                  contentType: "application/json",  // ajax 통신으로 보내는 타입
                  data: JSON.stringify(form),
                  success: function(result){
                           // ajax 통신 성공 시 로직 수행
                      for(var i in result){
                    	  aJsonArray.push(i);
                      }
                  },
				  error: function(){
					alert("simpleWithObject err");
				  }
         });