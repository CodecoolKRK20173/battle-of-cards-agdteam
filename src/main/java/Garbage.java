public class Garbage {
	private String name;
	private int smell;
	private int design;
	private int recyclingTime;
	private int junkValue;
	private int weight;

	public Garbage(){
		System.out.println("Delete after check !!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}

	public Garbage(String name, int smell, int design, int recyclingTime, int junkValue, int weight) {
		this.name = name;
		this.smell = smell;
		this.design = design;
		this.recyclingTime = recyclingTime;
		this.junkValue = junkValue;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSmell() {
		return smell;
	}

	public void setSmell(int smell) {
		this.smell = smell;
	}

	public int getDesign() {
		return design;
	}

	public void setDesign(int design) {
		this.design = design;
	}

	public int getRecyclingTime() {
		return recyclingTime;
	}

	public void setRecyclingTime(int recyclingTime) {
		this.recyclingTime = recyclingTime;
	}

	public int getJunkValue() {
		return junkValue;
	}

	public void setJunkValue(int junkValue) {
		this.junkValue = junkValue;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
