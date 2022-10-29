package com.project.repo;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.project.entity.CoTriggerEntity;

public interface CoTriggerRepo extends JpaRepository<CoTriggerEntity, Serializable>{

}
