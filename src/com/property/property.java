package com.property;

public class property {

	private String id;
	private String name;
	private String location;
	private String price;
	private String type;
	private String features;
	public property(String id, String name, String location, String price, String type, String features) {

		this.id = id;
		this.name = name;
		this.location = location;
		this.price = price;
		this.type = type;
		this.features = features;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	public String getPrice() {
		return price;
	}
	public String getType() {
		return type;
	}
	public String getFeatures() {
		return features;
	}
	
	}
	
	

