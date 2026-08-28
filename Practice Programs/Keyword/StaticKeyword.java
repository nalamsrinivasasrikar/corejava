package myprogs.basics;
	class Exam{
		static int x = 200;
	}

	class Test extends Exam{
		static int y = 300;
		void access() {
			System.out.println(Test.y);
			System.out.println(Exam.x);
		}
	}
	public class StaticKeyword {
		public static void main(String[] args) {
			System.out.println(Exam.x);
			Test t = new Test();
			t.access();
		}
	}

