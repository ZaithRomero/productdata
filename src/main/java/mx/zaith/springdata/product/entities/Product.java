package mx.zaith.springdata.product.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product {

	@Id
	private int id;
	
	private String name;
	
	@Column(name = "description")
	private String desc;
	
	private Double price;
	
	//Getters
	public int getId() 
	{
		return id;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public String getDesc() 
	{
		return desc;
	}
	
	public Double getPrice()
	{
		return price;
	}
	
	//Setters
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setDesc(String desc)
	{
		this.desc = desc;
	}
	
	public void setPrice(Double price)
	{
		this.price = price;
	}
	
	//Constructors
	public Product()
	{
		
	}
	
	public Product(int id, String name, String desc, Double price)
	{
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.price = price;
	}
}