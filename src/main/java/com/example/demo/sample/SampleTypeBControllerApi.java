package com.example.demo.sample;

import com.example.demo.domain.response.GenericCollectionResponse;
import com.example.demo.domain.response.SampleResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Tag(name = "대메뉴 > 하위메뉴B", description = "메뉴 기능을 제공합니다.")
public interface SampleTypeBControllerApi {
    @Operation(
            summary = "기능 단건 검색 TYPEB",
            parameters = {
                    @Parameter(name = "index", description = "일련번호", example = "89821"),
            },
            description = "메뉴에 대한 설명을 기록해 주세요"
    )
    @GetMapping("/sample/typeb/{index}")
    public ResponseEntity<GenericCollectionResponse<SampleResponse>> getSample(@PathVariable long index);
}
