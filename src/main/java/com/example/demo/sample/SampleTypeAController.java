package com.example.demo.sample;

import com.example.demo.domain.request.SampleRequest;
import com.example.demo.domain.response.GenericCollectionResponse;
import com.example.demo.domain.response.SampleResponse;
import com.example.demo.service.SampleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SampleTypeAController {

    private final SampleService sampleService;

    @Operation(
            summary = "기능 단건 검색 TYPEA",
            parameters = {
                    @Parameter(name = "index", description = "일련번호", example = "89821"),
            },
            description = "메뉴에 대한 설명을 기록해 주세요"
    )
    @GetMapping("/sample/typea/{index}")
    public ResponseEntity<GenericCollectionResponse<SampleResponse>> getSample(@PathVariable long index){
        return ResponseEntity.ok(sampleService.getSamples(
                SampleRequest.builder()
                        .index(index)
                        .build()
        ));
    }
}
