package com.tobeto.bootcampProject.business.abstracts;

import com.tobeto.bootcampProject.business.requests.create.applicants.CreateApplicantRequest;
import com.tobeto.bootcampProject.business.responses.create.applicants.CreateApplicantResponse;
import com.tobeto.bootcampProject.business.responses.get.applicants.GetAllApplicantResponse;
import com.tobeto.bootcampProject.business.responses.get.applicants.GetApplicantResponse;
import com.tobeto.bootcampProject.core.utilities.results.DataResult;

import java.util.List;

public interface ApplicantService {
  DataResult <CreateApplicantResponse> add(CreateApplicantRequest request);

   DataResult<List<GetAllApplicantResponse>>getAll();

   //GetApplicantResponse getById(int id);//ÖNCEKİ KOD
   //dataresult ile sarmallandı türü dataresult oldu.Bir data dönücek.
  DataResult <GetApplicantResponse> getById(int id);


}
