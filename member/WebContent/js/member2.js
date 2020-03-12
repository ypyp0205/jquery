/**
 * 
 */

var idcheck = function() {
	
	idvalue = $('#id').val().trim();
	idlen = idvalue.length;
	//공백체크
	
	if(idlen == 0){
		alert("아이디를 입력하세여");
		return false;
	}
	
	//길이 체크
	if(idlen < 4 || idlen > 12){
		alert("id 4~8사이로 입력");
		return false;
	}
	
	//형식체크
	idreg = /^[a-z]+[a-zA-Z0-9]{3,11}$/
	if(!(idreg.test(idvalue))){
		alert("id 형식오류");
		return false;
	}  
	
	return true;
	
}

var passcheck = function() {
	
	vpass = $('#pass').val().trim();
	passlen = vpass.trim().length;
	
	
	//비밀번호 길이
	if(passlen < 4 || passlen > 10){
		alert("비밀번호 형식 오류");
		return false;
	}
	
	
	//비밀번호 정규식
	//조건1. 6~20 영문 대소문자
	//조건2. 최소 1개의 숫자 혹은 특수 문자를 포함해야 함
	passreg = /^(?=.*[a-zA-Z])((?=.*[a-z])|(?=.[0~9])<?=.*[!@#$%^&*]).{4,10}$/;
	if(!(passreg.test(vpass))){
		alert("비밀번호 형식 오류");
		return false;
	}
	
	return true;
}

var pass2check = function() {
	vpass = $('#pass').val().trim();
	vpass2 = $('#pass2').val().trim();
	
	pass2len = vpass2.trim().length;
	
	if(pass2len <= 0){
		return false;
	}
	
	if(vpass != vpass2){
		return false;
	}
	
	return true;	
}

var bircheck = function() {
	birvalue = $('#bir').val().trim();
	birlen = birvalue.length;
	//공백체크
	
	if(birlen == 0){
		alert("생년월일을 입력하세요");
		return false;
	
	}
	
	return true;	
}


var emailcheck = function() {
	//이메일
	vemail = $('#email').val().trim();
	emaillen = vemail.trim().length;
	
	
	//이메일 정규식

	emailreg = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;

	if(!(emailreg.test(vemail))){
		alert("이메일 형식 오류");
		return false;
	}
	
	return true;	
}

var phoncheck = function() {
	//휴대폰
	vphon = $('#phon').val().trim();
	phonlen = vphon.trim().length;
	
	
	//휴대폰정규식

	phonreg = /^\d{3}-\d{3,4}-\d{4}$/;
	if(!(phonreg.test(vphon))){
		alert("휴대폰 번호 형식 오류");
		return false;
	}
	
	return true;	
}

var namecheck = function() {
	//이름값
	vname = $('#name').val().trim();
	namelen = vname.trim().length;
	
	//공백
	if(namelen == 0){
		alert("이름을 입력하세요");
		return false;
	}
	
	//이름 정규식
	namereg = /^[가-힣]+$|^[a-zA-Z]+$/;
	if(namereg.test(vname)){
		regkor = /^[가-힣]+$/;
		regeng = /^[a-zA-Z]+$/;
		if(regkor.test(vname)){
			if(namelen < 2 || namelen > 5){
				alert("한글은 2~5 글자 사이로 입력해 주세요");
				return false;
			}
		}else{
				if(namelen < 5 || namelen > 10){
					alert("영문은 5~10 글자 사이로 입력해 주세요");
					return false;
				}
		}
	}else{
		alert("이름 형식 오류");
		return false;
	}
	return true;
	
}