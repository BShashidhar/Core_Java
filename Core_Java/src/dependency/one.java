package dependency;

public class one {
	int id;
	public void f1(){
		two obj;
		obj=new two();
		obj.get();
	}
	public static void main(String[] args){
		one o=new one();
		o.f1();
	}
}
