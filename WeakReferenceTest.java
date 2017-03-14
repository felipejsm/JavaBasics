import java.lang.ref.WeakReference; 

class MyObject {
		public String phraseOfImpact;

		public double magicNumber;

		public MyObject(String p, double mn) {
			phraseOfImpact = p;
			magicNumber = mn;
			showMe();
		}
		public void showMe() {
			System.out.println("Phrase: "+phraseOfImpact+"\n"+
					   "Magic..."+magicNumber);
		}
}
public class WeakReferenceTest {
	
	public static void main(String[] args) {
		MyObject myObject = new MyObject("Hi there!",26d);
		WeakReference ref = new WeakReference<MyObject>(myObject);

		myObject = null;//kill the reference!
		while(ref.get() != null)
			System.gc();
	}
}
