package com.example.demo.service;

import com.example.demo.domain.mock.MockSampleData;
import com.example.demo.domain.request.SampleRequest;
import com.example.demo.domain.response.GenericCollectionResponse;
import com.example.demo.domain.response.SampleResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SampleService {
    public GenericCollectionResponse<SampleResponse> getSamples(SampleRequest sampleRequest){
        return GenericCollectionResponse.<SampleResponse>builder()
                .pageIndex(sampleRequest.getPageIndex())
                .pageRowSize(sampleRequest.getPageRowSize())
                .totalCount(MockSampleData.mockSamples().size())
                .collection(MockSampleData.mockSamples())
                .build();
    }
}
