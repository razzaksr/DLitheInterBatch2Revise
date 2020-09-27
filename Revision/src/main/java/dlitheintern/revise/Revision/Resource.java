package dlitheintern.revise.Revision;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Resource 
{
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="empID")
	private int id;
	private String name;
	private String lapModel;
	private double cost;
	public Resource() {}
	public Resource(int id, String name, String lapModel, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.lapModel = lapModel;
		this.cost = cost;
	}
	public Resource(String name, String lapModel, double cost) {
		super();
		this.name = name;
		this.lapModel = lapModel;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Resource [id=" + id + ", name=" + name + ", lapModel=" + lapModel + ", cost=" + cost + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLapModel() {
		return lapModel;
	}
	public void setLapModel(String lapModel) {
		this.lapModel = lapModel;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
}
