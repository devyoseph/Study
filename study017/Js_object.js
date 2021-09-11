let million = 1e7;
console.log(million);

let nano = 2.5e-3;
//1 * (10의 -9승)
console.log(nano);

let hexa = 0xfff;
console.log(hexa);

let octa = 0o311;
console.log(octa);

let bina = 0b1111;
console.log(bina);

let a = 0.1234;
console.log( a.toFixed(3) );
//소수점 3자리까지 표기

console.log( a.toFixed(6) );
//초과한 값은 0으로 채운다

console.log( Number(a.toFixed(3)) );
//문자열이 결과값이므로 형 변환

console.log( +a.toFixed(6) );
//간단하게 더하기 기호만 붙여도 형 변환

let b = 255;
console.log( b.toString(2) );
console.log( b.toString(8) );
console.log( b.toString(16) );

console.log( 320..toString(2) );
console.log( 0.2345.toFixed(2) );

console.log( (320).toString(2) );
//소괄호 안에 넣는 방법도 있다

console.log(123.123.toFixed(0));
console.log(1.23e2);

console.log(Math.abs(-5));
console.log(Math.max(-1,-5,2,4,7,2));
console.log(Math.min(-1,-5,2,4,7,2));

let sum = 0.1 + 0.2;
console.log( sum );

console.log( sum.toFixed(1) );

let str = 'Chemistry';
console.log( str.length);
console.log( str[3] );
console.log( str.charAt(3) );
console.log( str.indexOf('e'));
console.log( str.toUpperCase());
console.log( str.slice( 2,5 ) );
console.log( str.slice( 2) );


for( let x of str ){
  console.log( x );
}

let lyrics = "[재석]너에게 나 하고 싶었던 말 고마워 미안해 함께 있어서 할 수 있어서 웃을 수 있어[준하] 정말 고마웠어 내 손을 놓지 않아줘서 힘을 내볼게 함께 있다면 두렵지 않아[홍철] 내가 늘 웃으니까 내가 우습나 봐 하지만 웃을 거야 날 보고 웃는 너 좋아[명수] 자꾸만 도망치고 싶은데 저 화려한 큰 무대 위에 설 수 있을까? 자신 없어..[하하] 지금까지 걸어온 이 길을 의심하지는 마 잘못 든 길이 때론 지도를 만들었잖아[형돈] 혼자 걷는 이 길이 막막하겠지만 느리게 걷는 거야 천천히 도착해도 돼[길] 술 한 잔 하자는 친구의 말도 의미 없는 인사처럼 슬프게 들릴 때 날 찾아와";

let hyungdon = null;

// 코드를 작성해 주세요.
 let start = 0;
  let end = 0;
//console.log(lyrics.length);  길이: 325
for(i=0; i<325; i++){
  if(lyrics[i]=="[" && lyrics[i+1]=="형" && lyrics[i+2]=="돈"){
    start = i;
  //console.log(start); :236
  }
   if(lyrics[i]=="[" && lyrics[i+1]=="길"){
    end = i;
  //  console.log(end); : 279
  
  }
hyungdon = lyrics.slice(start,end);
}
// 테스트 코드
console.log(hyungdon);

console.log( str.indexOf('is'));

let obj = { korea : '안녕' };
//객체를 하나 만들었다

let obj2 = obj;
//다른 객체를 만들고 obj와 같다고 한다

obj2.usa = 'hi';
//복사한 객체에 프로퍼티 추가

console.log( obj );
//원본 출력
//분명히 복사한 객체에 값을 넣었는데
//원본에도 보인다

//이유는?
//객체는 주소만 공유하기 때문(참조)

let x = ['Kim', 'Na', 'Park', 'Lee'];
let y = x;

y.push('Lim');

console.log(y);
x[4] = 'Sung';
console.log(y);

let m = {
    numbers: [0, 1, 2, 3],
    title: 'AAA'
  };
  console.log(m);
  let n = m.numbers;
  let o = m.title;
   
  m.numbers.unshift(4);
  m.title = 'BBB';
  
  console.log(n);
  console.log(o);

  let obj3 = [ 1, 2, 3 ];
let obj4 = obj3.slice( ) ;

obj3.push(0);
//원본에 값을 넣는다

console.log(obj4);
//복제한 얘를 살펴본다


let repl ={};
for( let key in obj ){
    repl[key] = obj[key];
   }

const s = { home: 'Korea' };
s.year = 2021;

console.log( s );

