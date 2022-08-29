package com.example.demo.domain.mock;

import com.example.demo.domain.element.SampleInformation;
import com.example.demo.domain.response.SampleResponse;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class MockSampleData {

    public static SampleResponse mockSample(){
        return SampleResponse.builder()
                .index(1)
                .sampleInformation(SampleInformation.builder()
                        .userId("sampleUser01")
                        .price(9872)
                        .title("테스트샘플제목입니다.")
                        .build())
                .mockStrings(List.of("aa","bb"))
                .mockNumbers(List.of(100,200))
                .regDate(LocalDate.now())
                .regDateTime(LocalDateTime.now())
                .build();
    }

    public static List<SampleResponse> mockSamples(){
        return List.of(mockSample(),mockSample(),mockSample(),mockSample(),mockSample());
    }
}
