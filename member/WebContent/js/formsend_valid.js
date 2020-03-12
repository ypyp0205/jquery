/**
 * 정규식을 이용한 데이타 검증
 * 비교문자값.match('정규식') :
 * 정규식.test(비교문자값) : 문자값이 정규식에 맞느냐?
 * 					 : 결과값 true, false로 리턴
 * 
 *  
 *  
 *  
 *  
 *  
 */

function sendProc(){
	
	f = document.ff;
	
	//id는 영문자로 시작한다, 숫자를 조합해서 8~12사이로 한다.\
	
	idvalue =  f.id.value;
	idlen = idvalue.trim().length;
	
	if(idlen == 0){
		alert("아이디를 입력하세요");
		return false;
		
	}
	if(idlen < 8 || idlen > 12){
		alert("아이디는 8 ~12글자 입니다.");
		return false;
		}
	
	idreg = /^[a-zA-Z][0-9a-zA-Z]{7,11}$/;
		if(!(idreg.test(idvalue))){
			alert("아이디 형식오류");
			return false;
		}
	//--------------------------------------------------------------------
	//이름
	namevalue = f.name.value;
	namelen = namevalue.trim().length;
	if(namelen == 0){
		alert("name입력");
		return false;
	}
	namereg = /^[가-힣]+|^[a-zA-Z]+/
	if(namereg.test(namevalue)){
		rkor = /^[가-힣]+$/;
		reng = /^[a-zA-Z]+$/;
		
		if(rkor.test(namevalue)){
			if(namelen < 2 || namelen > 5){
				alert("한글이름은 2~5입니다");
				return false;
			}
			
		}else if(reng.test(namevalue)){
			if(namelen < 10 || namelen > 20){
				alert("영문이름은 10~20 입니다");
				return false;
			}
			
		}else{
			alert("이름형식오류");
			return false;
		}
		
	}else{
		alert("이름형식오류");
		return false;
	}
	//--------------------------------------------------------------
	//비밀번호-영문, 숫자, 특수문자가 반드시 한글자 이상 포함
	
	//전방탐색
	// \w(숫자,문자) + (?=str찾는 문자열) --> str을 찾아서 , str기준으로 앞에 한번이상 나오는 문자나 숫자를 검색
	//str을 기준으로 앞에 나타나는 문자나 숫자가 없다면 Str로 시작한다.
	passvalue = f.pass.value;
	passlen = passvalue.trim().length;
	
	pass2 = f.pass2.value.trim();
	if(passvalue == pass2){
		alert("비밀번호가 일치하지 않습니다");
		return false;
	}
	
	if(passlen == 0){
		alert("비밀번호를 입력");
		return false;
	}
	if(passlen < 8 || passlen > 12){
		alert("비밀번호는 8 ~ 12입니다.");
		return false;
	}
	
	passreg = /^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8,12}$/;
	if(!(passreg.test(passvalue))){
		alert("비밀번호 형식오류");
		return false;
	}
	//---------------------------------------------------------------------------
	//전화번호
	telvalue = f.tel.value;
	tellen = telvalue.trim().length;
	
	if(tellen == 0){
		alert("전화번호 입력하세요");
		return false;
	}
	telreg = /^\d{3}-\d{4}-\d{4}$/;
	if(!(telreg.test(telvalue))){
		alert("전화번호 형식오류");
		return false;
	}

	//-----------------------------------------------------------------------------
	//이메일
	mailvalue = f.mail.value;
	maillen = mailvalue.trim().length;
	
	if(maillen == 0){
		alert("이메일 입력");
		return false;
	}
	mailreg = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/;
	if(!(mailreg.test(mailvalue))){
		alert("이메일형식오류");
		return false;
	}
	
	return true;
}