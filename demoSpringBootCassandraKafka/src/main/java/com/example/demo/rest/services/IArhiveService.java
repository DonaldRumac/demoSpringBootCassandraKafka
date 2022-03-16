package com.example.demo.rest.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.rest.entity.ArchiveRecord;

@Service
public interface IArhiveService {

	public List<ArchiveRecord> findAll();
}
