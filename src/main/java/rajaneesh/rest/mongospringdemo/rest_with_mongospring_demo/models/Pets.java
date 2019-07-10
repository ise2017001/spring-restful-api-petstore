package rajaneesh.rest.mongospringdemo.rest_with_mongospring_demo.models;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Pets {
	
	//id annotation to denote _id attribute is 
	@Id
	public ObjectId _id;
	
	public String name;
	public String species;
	public String breed;
	
	public Pets() {}
	
	public Pets(ObjectId _id, String name, String species, String breed) {
		this._id = _id;
		this.name = name;
		this.breed = breed;
		this.species = species;
	}

	public String get_id() {
		return _id.toHexString();
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	
	
}
