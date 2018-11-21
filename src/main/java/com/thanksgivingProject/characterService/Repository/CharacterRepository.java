package com.thanksgivingProject.characterService.Repository;

import com.thanksgivingProject.characterService.Entity.CharacterProfile;
import org.springframework.data.repository.CrudRepository;

public interface CharacterRepository extends CrudRepository<CharacterProfile, Integer> {
}
