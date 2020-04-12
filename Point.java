class Point {
	String id
	double x,y;
	string colour;

	public Point(String id, double x, double y, string colour) {
		this.id = id;
		this.x = x;
		this.y = y;
		this.colour = colour;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setColour(string colour) {
		this.colour = colour;
	}

	public String getId() {
		return id;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public string getColour() {
		return colour;
	}

	public void move (char xDirection, char yDirection) {
		int newX, newY;
		if(xDirection == 'R')
			 newX = getX()+1;
		if(xDirection == 'L')
			 newX = getX()-1;
		if(yDirection == 'U')
			 newY = getY()+1;
		if(yDirection == 'D')
			 newY = getY()-1;
	}

	public void draw () {
		system.out.println(getX(), getY());
	}
}