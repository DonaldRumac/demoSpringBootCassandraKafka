package com.example.demo.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.rest.entity.ArchiveRecord;
import com.example.demo.rest.repository.IArchiveRepository;

@Service
public class ArchiveService implements IArhiveService{

	@Autowired
	private IArchiveRepository archiveRepository;

	@Override
	public List<ArchiveRecord> findAll() {
		return (List<ArchiveRecord>) archiveRepository.findAll();
	}
	
	
	
	
//	@Override
//	public List<ArchiveRecord> findAll() {
//		//TODO za sada mockup bez baze
//		ArchiveRecord rec1 = new ArchiveRecord(UUID.randomUUID(), "prvi");
//		ArchiveRecord rec2 = new ArchiveRecord(UUID.randomUUID(), "drugi");
//		return List.of(rec1,rec2);
//	}
}