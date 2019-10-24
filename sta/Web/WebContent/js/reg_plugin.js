/**
 * jquery validation plugin이용하여 폼 유효성 검증
 * 사용자가 원하는 메세지와 유효성을 지정할 수 있음
 * 
 * register_jquery_validate.html유효성 검사.
 */
$(function(){
	$("#join").validate({
		rulse:{
			userid:{
				required: true,
				maxlength: 12,
				minlength: 6
			},
			userpw:{
				required: true,
				rangelenght: [8,15]
			},
			confirmpwd:{
				required: true,
				equalTo: "#userpw"
			},
			gender:{
				
				requried:true
			},
			email:{
				required: true,
				email: true
			},
			mobile:{
				required: true,
			},
			hobby:{
				
				requried:true
			}
		},
	message:{
		userid:{
			required: "이름은 필수요소입니다.",
			maxlength: "이름은 최소 2자리여야합니다.",
			minlength: "이름은 최대 4자리까지 허용합니다."
		},
		userpw:{
			required:"비밀번호는 필수요소입니다.",
			rangelenght:"비밀번호는 8~15자리까지 허용합니다."
		},
		confirmpwd:{
			required: "비밀번호는 필수요소입니다.",
			rangelenght: "비밀번호는 8~15자리까지 허용합니다.",
			equalTo: "이전 비밀번호와 다릅니다."
		},
		gender:{
			requried:"성별은필수요소입니다."
			
		},
		email:{
			required: "이메일은 필수요소입니다.",
			email:"이메일 형식을 확인하세요."
		},
		mobile:{
			required: "핸드폰 번호는 필수요소입니다."
		},
		hobby:{
			requried:"취미는필수요소입니다."
			
		}
		
	}
		
		
	});
});//function종료
