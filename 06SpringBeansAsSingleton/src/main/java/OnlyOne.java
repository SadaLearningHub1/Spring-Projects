
public class OnlyOne {
	private static OnlyOne onlyone;
	private OnlyOne() {
	}
	public static OnlyOne getInstance() {
		if(onlyone==null) {
			onlyone = new OnlyOne();
		}
		return onlyone;
	}

}
