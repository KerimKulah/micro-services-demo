package com.kerim.repository;

import com.kerim.document.UserProfile;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<UserProfile, Long> {

}
