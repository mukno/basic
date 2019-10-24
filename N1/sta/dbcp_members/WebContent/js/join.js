/**
 * joinForm.jsp의 폼 유효성 검증
 * userid:아이디는 숫자,영 대소문자를 이용해서 5~12자리
 * password:비밀번호는 숫자,영대소문자,특수무자를 이용해서 8~15 
 * confirm_password:password규칙동일,password입력값 동일여부확인
 * email:이메일규칙에 맞는지 확인
 * name:필수지정,2~4자리 허용
 * gender :필수지정
 */
$(function(){
	
	$("#joinform").validate({
		rules:{//규칙지정
			userid:{
				required: true,
				maxlength: 12,
				minlength: 5,
				valiid:true
			},
			password:{
				required:true,
				rangelenght:[8,15],
				valiPwd:true
				
			},
			confirm_password:{
				required: true,
				rangelenght: [8,15],
				equalTo: "#password"
				
				
			},
			email:{
				required: true,
				email:true
				
			},
			name:{
				required: true,
				maxlength: 4,
				minlength: 2
				
			},
			gender:{
				required: true,
				
			}
			
			
		},
		messages:{//규칙 오류 메세지
			userid:{
				required: "아이디가 빈칸입니다",
				maxlength: "아이디는 최대 12자리여야 합니다..",
				minlength: "아이디는 최소 5자리여야 합니다..",
				valiid:"아이디는 영대소문자로 해야합니다."
			},
			password:{
				required:"비밀번호가 빈칸입니다.",
				rangelenght:"비밀번호는 8~15자리여야 합니다..",
				valipwd:"비밀번호는 영대소문자특수문자로 해야합니다."
				
			},
			confirm_password:{
				required: "비밀번호 확인이 빈칸입니다.",
				rangelenght: "비밀번호는 8~15자리여야 합니다..",
				equalTo: "비밀번호와 맞지않습니다."
				
				
			},
			email:{
				required: "이메일이 빈칸입니다.",
				email:"이메일 형식과 맞지않습니다."
				
			},
			name:{
				required: "비밀번호 확인이 빈칸입니다.",
				maxlength: "이름은 최대 4자리여야 합니다..",
				minlength: "이름은 최소 2자리여야 합니다.."
				
			},
			gender:{
				required: "성별이 빈칸입니다."
				
			}
			
			
			
		},
		errorPlacement:function(error,element){
			//에러메시지 위치 지정
			$(element).closest("form").find("small[id='"+element.attr("id")+"']")
			.append(error);
		}
		
	});
	
})
$.validator.addMethod("valiid",function(value){
	var regid=/(\w).{5,12}$/;
	return regid.test(value);
},'아이디는 숫자와 영문자의 조합으로 5~12자리를 사용합니다.');

$.validator.addMethod("valiPwd",function(value){
	var regPwd=/(?=.*[A-Za-z])(?=.*\d)(?=.*[!@#$%^&*]).{8,15}/;
	return regPwd.test(value);
},'비밀번호는 숫자와 영문자와 특수문자의 조합으로 8~15자리를 사용합니다.');
