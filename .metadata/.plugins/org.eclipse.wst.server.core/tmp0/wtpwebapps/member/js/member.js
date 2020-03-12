/**
 * 
 */
var regcheck = function () {
	//이름값
	vname = $('#name').val().trim();
	namelen = vname.trim().length;
	
	//이름 길이
	if(namelen < 2 || namelen > 5){
		alert("이름 2~5 사이입니다");
		return false;
	}
	
	
	//이름 정규식
	namereg = /^[가-힣]{2,4}|[a-zA-Z]{2,10}\s[a-zA-Z]{2,10}$/;
	if(!(namereg.test(vname))){
		alert("이름 형식 오류");
		return false;
	}
	
	//-------------------------------------------------------------
	//비밀번호
	vpass = $('#pass').val().trim();
	passlen = vpass.trim().length;
	
	
	//비밀번호 길이
	if(passlen < 6 || passlen > 21){
		alert("비밀번호 형식 오류");
		return false;
	}
	
	
	//비밀번호 정규식
	//조건1. 6~20 영문 대소문자
	//조건2. 최소 1개의 숫자 혹은 특수 문자를 포함해야 함
	passreg = /^(?=.*[a-zA-Z])((?=.*\d)|(?=.*\W)).{6,20}$/;
	if(!(passreg.test(vpass))){
		alert("비밀번호 형식 오류");
		return false;
	}
	//--------------------------------------------------------------------
	//생년 월일
	vday = $('#day').val().trim();
	daylen = vday.trim().length;
	
	
	//생년 월일정규식

	dayreg = /^(19[0-9][0-9]|20\d{2})-(0[0-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$/;
	if(!(dayreg.test(vday))){
		alert("생년월일 형식 오류");
		return false;
	}
	
	//--------------------------------------------------------------------
	//휴대폰
	vphon = $('#phon').val().trim();
	phonlen = vphon.trim().length;
	
	
	//휴대폰정규식

	phonreg = /^\d{3}-\d{3,4}-\d{4}$/;
	if(!(phonreg.test(vphon))){
		alert("휴대폰 번호 형식 오류");
		return false;
	}
	
	//--------------------------------------------------------------------
	//이메일
	vemail = $('#email').val().trim();
	emaillen = vemail.trim().length;
	
	
	//이메일 정규식

	emailreg = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;

	if(!(emailreg.test(vemail))){
		alert("이메일 형식 오류");
		return false;
	}
	
	//----------------------------------------------------------------------
	//빈항목 체크
	namevalue = $('#name').val().trim();
	namelen = namevalue.length;
	//공백체크
	if(namelen == 0){
		alert("이름을 입력하세여");
		return false;
	}
	

	dayvalue = $('#day').val().trim();
	daylen = dayvalue.length;

	if(daylen == 0){
		alert("생년월일을 입력하세여");
		return false;
	}
	
	passvalue = $('#pass').val().trim();
	passlen = dayvalue.length;

	if(passlen == 0){
		alert("비밀번호를 입력하세여");
		return false;
	}
	
	phonvalue = $('#phon').val().trim();
	phonlen = phonvalue.length;

	if(phonlen == 0){
		alert("핸드폰 번호를 입력하세여");
		return false;
	}
	
	emailvalue = $('#email').val().trim();
	emaillen = emailvalue.length;

	if(emaillen == 0){
		alert("email을 입력하세여");
		return false;
	}
	
	zipBtnvalue = $('#zip').val().trim();
	zipBtnlen = zipBtnvalue.length;

	if(zipBtnlen == 0){
		alert("우편번호를 입력하세여");
		return false;
	}
	
	addr1value = $('#addr1').val().trim();
	addr1len = addr1value.length;

	if(addr1len == 0){
		alert("주소 입력하세여");
		return false;
	}
	
	addr2value = $('#addr2').val().trim();
	addr2len = addr2value.length;

	if(addr2len == 0){
		alert("상세주소 입력하세여");
		return false;
	}
	
	return true;
	
	
}