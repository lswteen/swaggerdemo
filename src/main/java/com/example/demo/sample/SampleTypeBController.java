package com.example.demo.sample;

import com.example.demo.domain.request.SampleRequest;
import com.example.demo.domain.response.GenericCollectionResponse;
import com.example.demo.domain.response.SampleResponse;
import com.example.demo.service.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SampleTypeBController implements SampleTypeBControllerApi {
    private final SampleService sampleService;

    public ResponseEntity<GenericCollectionResponse<SampleResponse>> getSample(@PathVariable long index){
        return ResponseEntity.ok(sampleService.getSamples(
                SampleRequest.builder()
                        .index(index)
                        .build()
        ));
    }
}
