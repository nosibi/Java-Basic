package InnerInterface_02;

class Button{
	OnClickListener ocl;
	void setOnClickListener(OnClickListener ocl) {
		this.ocl = ocl;
	}
	interface OnClickListener{
		public abstract void onClick();
	}
	void onClick() {
		ocl.onClick();
	}
}

public class InnerInterface_2 {
	public static void main(String[] args) {
		Button btn1 = new Button();
		btn1.setOnClickListener(new Button.OnClickListener() {
			public void onClick() {
				System.out.println("OnClickListener");
			}
		});
		
		btn1.onClick();
	}

}
