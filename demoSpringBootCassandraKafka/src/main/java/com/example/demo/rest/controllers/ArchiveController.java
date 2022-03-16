package com.example.demo.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.rest.entity.ArchiveRecord;
import com.example.demo.rest.services.IArhiveService;

@RestController
public class ArchiveController {

	@Autowired
	private IArhiveService archiveService;
	
	@RequestMapping("/api/v1/ping")
	public String ping() {
		return "Pong";
	}
	
	@RequestMapping("/api/v1/getAllRecords")
	public List<ArchiveRecord> getAllArchiveRecords(){
		return archiveService.findAll();		
	}
	
}
