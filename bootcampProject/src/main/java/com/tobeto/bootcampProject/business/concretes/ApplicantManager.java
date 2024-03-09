package com.tobeto.bootcampProject.business.concretes;

import com.tobeto.bootcampProject.business.abstracts.ApplicantService;
import com.tobeto.bootcampProject.business.requests.create.applicants.CreateApplicantRequest;
import com.tobeto.bootcampProject.business.responses.create.applicants.CreateApplicantResponse;
import com.tobeto.bootcampProject.business.responses.get.applicants.GetAllApplicantResponse;
import com.tobeto.bootcampProject.business.responses.get.applicants.GetApplicantResponse;
import com.tobeto.bootcampProject.core.utilities.mapping.ModelMapperService;
import com.tobeto.bootcampProject.core.utilities.results.DataResult;
import com.tobeto.bootcampProject.core.utilities.results.SuccessDataResult;
import com.tobeto.bootcampProject.dataaccess.abstracts.ApplicantRepository;
import com.tobeto.bootcampProject.entities.concretes.Applicant;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class ApplicantManager implements ApplicantService {
    private ApplicantRepository applicantRepository;
    private ModelMapperService mapperService;
    @Override
    public DataResult<CreateApplicantResponse> add(CreateApplicantRequest request) {
        Applicant applicant = mapperService.forRequest().map(request,Applicant.class);
        applicant.setCreatedDate(LocalDateTime.now());
        applicantRepository.save(applicant);

        CreateApplicantResponse response = mapperService.forResponse()
                .map(applicant, CreateApplicantResponse.class);
        return new SuccessDataResult<CreateApplicantResponse>(response,"Başarıyla eklendi.");
    }

    @Override
    public DataResult<List<GetAllApplicantResponse>> getAll() {
        List<Applicant> applicants = applicantRepository.findAll();
        List<GetAllApplicantResponse> applicantResponses =
                applicants.stream().map(applicant -> mapperService.forResponse().map
                        (applicant,GetAllApplicantResponse.class))
                        .collect(Collectors.toList());
        return new SuccessDataResult<List<GetAllApplicantResponse>>(applicantResponses,"Listelendi.");
    }

    @Override
    public DataResult<GetApplicantResponse> getById(int id) {
        Applicant applicant = applicantRepository.getById(id);
        GetApplicantResponse response =
                mapperService.forResponse().map(applicant, GetApplicantResponse.class);

        return new SuccessDataResult<GetApplicantResponse>(response, "Aday getirildi.");
    }
}