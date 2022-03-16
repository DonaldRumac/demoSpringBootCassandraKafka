package com.example.demo.rest.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.rest.entity.ArchiveRecord;

@Repository
public interface IArchiveRepository extends CrudRepository<ArchiveRecord, UUID>{
	
}
