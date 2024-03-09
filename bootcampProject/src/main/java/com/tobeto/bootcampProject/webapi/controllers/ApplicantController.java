package com.tobeto.bootcampProject.webapi.controllers;

import com.tobeto.bootcampProject.business.abstracts.ApplicantService;
import com.tobeto.bootcampProject.business.requests.create.applicants.CreateApplicantRequest;
import com.tobeto.bootcampProject.business.responses.create.applicants.CreateApplicantResponse;
import com.tobeto.bootcampProject.business.responses.get.applicants.GetAllApplicantResponse;
import com.tobeto.bootcampProject.business.responses.get.applicants.GetApplicantResponse;
import com.tobeto.bootcampProject.core.utilities.results.DataResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applicants")
public class ApplicantController extends BaseController {

    private ApplicantService applicantService;

    @PostMapping()
    public ResponseEntity<?> add(@RequestBody CreateApplicantRequest request) {
        DataResult<CreateApplicantResponse> result = applicantService.add(request);

        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);

    }

    @GetMapping("getall")
    public ResponseEntity<?> getAll() {
        return handleDataResult(applicantService.getAll());
    }

    @GetMapping("getbyid/{id}")
    public DataResult<GetApplicantResponse> getById(@PathVariable int id) {
        return applicantService.getById(id);
    }

}


