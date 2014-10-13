
public class This {
	
	public class Rectangle{
		
		private int x, y, width, height;
		
		public Rectangle() {
			this(0, 0, 1, 1);
		}
		
		public Rectangle(int width, int height) {
			this(0, 0, width, height);
		}
		
		public Rectangle(int x, int y, int height, int width) {
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
		}
	}

}
