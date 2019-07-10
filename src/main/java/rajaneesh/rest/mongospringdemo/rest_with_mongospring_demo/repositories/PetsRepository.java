package rajaneesh.rest.mongospringdemo.rest_with_mongospring_demo.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import rajaneesh.rest.mongospringdemo.rest_with_mongospring_demo.models.Pets;


//it is not required to implement these queries manually, spring boot 
//repository naming conventions  and mongo repository will intelligently construct queries at runtime
public interface PetsRepository extends MongoRepository<Pets, String> {
	Pets findBy_id(ObjectId _id);
}

