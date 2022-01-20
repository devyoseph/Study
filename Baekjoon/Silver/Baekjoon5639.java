import java.io.*;
public class Main {
	static class Node{
		int num;
		Node left, right;  //하위 노드를 생성
		
		Node(int num){
			this.num = num; //Class에는 parameter를 초기 설정으로 할 수 없으므로
            				//생성자(Constructor) 활용
		}
		
		void insert(int n) { // 내부 insert 메소드를 지속적으로 사용한다
			if(n<this.num) {
				if(left == null) {
					this.left = new Node(n);
				}else {
					this.left.insert(n);
				}
			}else {
				if(right == null) {
					this.right = new Node(n);
				}else {
					this.right.insert(n);
				}
			}
		}
	}
	
	static void postorder(Node node) {
		if(node==null) return;
		
		postorder(node.left);
		postorder(node.right);
		System.out.println(node.num);
	}
	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int top = Integer.parseInt(br.readLine());
	Node root = new Node(top); //맨 위의 값(top)을 루트 객체로 명명
	String s;
	while(true) {
		s = br.readLine();
		if(s==null || s.equals("")) break;
		root.insert(Integer.parseInt(s));
	}
	postorder(root);
}}
