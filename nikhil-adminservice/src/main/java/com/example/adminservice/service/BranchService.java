package com.example.adminservice.service;

import java.util.List;

import com.example.adminservice.models.Branch_master;

public interface BranchService {
	public Branch_master createBranch();
	public String DeleteBranch();
	public List<Branch_master> listAllBranch();
}
