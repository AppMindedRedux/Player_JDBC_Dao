package be.intecbrussel.JDBC_Player_demo;


public class Player {
	
	private int id;
	private String name;
	private String position;
	
	public Player() {
		
	}

	public Player(String name, String position) {
		super();
		this.name = name;
		this.position = position;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Player [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", position=");
		builder.append(position);
		builder.append("]");
		return builder.toString();
	}

	
}
