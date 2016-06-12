package model;

public class GuitarSpec {
	private String builder;
	private String model;
	private String type;
	private String wood;
	
	public GuitarSpec(String builder, String model, String type, String wood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.setWood(wood);
	}

	public void setBuilder(String builder) {
		this.builder = builder;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setType(String type) {
		this.type = type;
	}
	public void setWood(String wood) {
		this.wood = wood;
	}

	
	public String getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public String getType() {
		return type;
	}
	public String getWood() {
		return wood;
	}

	public boolean matches(GuitarSpec otherSpec) {
	if(otherSpec.getType()!=null && !otherSpec.getType().equals(type)){
		return false;
	}
	if(otherSpec.getBuilder()!=null && !otherSpec.getBuilder().equals(builder)){
		return false;
	}
	if(otherSpec.getModel()!=null && !otherSpec.getModel().equals(model)){
		return false;
	}
	if(otherSpec.getWood()!=null && !otherSpec.getWood().equals(wood)){
		return false;
	}
	
	return true;	

	}

	
}
