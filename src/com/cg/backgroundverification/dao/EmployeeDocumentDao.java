package com.cg.backgroundverification.dao;

import com.cg.backgroundverification.dto.EmployeeDocumentDto;

public interface EmployeeDocumentDao 
{
	void uploadDocument(EmployeeDocumentDto e);
	void viewstatus(EmployeeDocumentDto e);

}
