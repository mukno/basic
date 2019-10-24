/**
 * jquery validation plugin 이용하여 폼 유효성 검증
 * 사용자가 원하는 메세지와 유효성을 지정할 수 있음
 * 
 */
$(function(){
	
	$("#signupForm").validate({
		//검증 규칙 작성
		rules:{//이름을 사용하여 규칙 지정
			username:{//필수로 입력되어야하며,2~4자리
				required:true,
				minlength:2,
				maxlength:4
			},
			password:{//필수입력,8~15자리
				required:true,
				rangelenght:[8,15],
				valiPwd:true
			},
			confirm_password:{//필수입력,8~15자리,이전비밀번호와 동일한 값
				required: true,
				rangelenght: [8,15],
				equalTo: "#password"
			},
			email:{//필수입력,
				required: true,
				email:true
			},
			topic:{
				required: "#newsletter:checked",
				minlength: 2
				
			},
			policy:{
				required: true
			}
		},
		//규칙에따른 메세지 작성
		messages:{
			username:{//필수로 입력되어야하며,2~4자리
				required:"이름은 필수요소입니다.",
				minlength:"이름은 최소 2자리여야합니다.",
				maxlength:"이름은 최대 4자리까지 허용합니다."
			},
			password:{//필수입력,8~15자리
				required:"비밀번호는 필수요소입니다.",
				rangelenght:"비밀번호는 8~15자리까지 허용합니다."
			},
			confirm_password:{//필수입력,8~15자리,이전비밀번호와 동일한 값
				required: "비밀번호는 필수요소입니다.",
				rangelenght: "비밀번호는 8~15자리까지 허용합니다.",
				equalTo: "이전 비밀번호와 다릅니다."
			},
			email:{//필수입력,
				required: "이메일은 필수요소입니다.",
				email:"이메일 형식을 확인하세요."
			},
			topic:"관심사를 적어도 2개는 표시해주세요.",
				
			policy:{
				required: "우리의 정책에 동의"
			}
			
			
			
		}
		
	});
	$("newsletter_topics").click(function(){
		var topics=$("#newsletter_topics");
		if(topics.css("display")=='none'){
			$("newsletter_topics").css("display","inline-block");
		}else{
			$("newsletter_topics").css("display","none");
			
		}
	});
	
	});//function종료
$.validator.addMethod("valiPwd",function(value){
	var regPwd=/(\w).{8,15}$/;
	return regPwd.test(value);
},'비밀번호는 숫자와 영문자의 조합으로 8~15자리를 사용합니다.');
	
	
	