/*	이클립스 외부에서 환경변수 만들어주기
 1)윈도우: 내PC-속성-시스템-고급시스템설정-환경변수
 				-새로만들기-'CLASSPATH'입력-변수 값: .;lib
 	이렇게 설정해주고 명령프롬프트 껐다 킴-java ClasspathDemo2 하면 실행됨
 	
  2)리눅스: 터미널 입력: printenv 
  				수 많은 환경변수를 확인가능
  			환경변수 만들기 
  			지역환경변수: [환경변수]=[환경변수 내용]
  			전역환경변수: export [환경변수] = [환경변수 내용, 값]   
  			
  			환경변수 없애기: $unset [환경변수이름]  / unset [환경변수 이름] 
 */
package srcbin;

public class Envir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
