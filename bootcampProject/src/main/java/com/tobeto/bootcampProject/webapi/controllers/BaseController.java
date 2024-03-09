package com.tobeto.bootcampProject.webapi.controllers;

import com.tobeto.bootcampProject.business.responses.get.applicants.GetAllApplicantResponse;
import com.tobeto.bootcampProject.core.utilities.results.DataResult;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class BaseController {
    public ResponseEntity<?> handleDataResult(DataResult<?> dataResult){

        if(dataResult.isSuccess()){
            return ResponseEntity.ok(dataResult);
        }
        return ResponseEntity.badRequest().body(dataResult);


    }

}
