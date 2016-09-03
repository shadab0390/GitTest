import java.util.ArrayList;

public class Person {

	private String name ;
	private String sex;
	private int ht;
	private int wt ;
	
	private ArrayList<Person> relatives = new ArrayList<>(); 
	
	public Person(String name,String sex,int ht , int wt , ArrayList<Person> relatives )
	{
		this.name = name;
		this.sex = sex;
		this.ht = ht ;
		this.wt = wt;
		this.relatives = relatives ;
	}

	public ArrayList<Person> getRelatives() {
		return relatives;
	}

	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}

	public int getHt() {
		return ht;
	}

	public int getWt() {
		return wt;
	}
	
	
}
