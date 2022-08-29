package com.example.demo.domain.request;

import com.example.demo.domain.element.Pagination;
import com.example.demo.domain.element.SampleInformation;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Collections;
import java.util.List;

@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "샘플 request")
public class SampleRequest extends Pagination {
    @Schema(description = "일련번호", example = "89998121")
    private long index;

    @Schema(description = "업직종", example = "[\"1121\", \"1131\"]")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Builder.Default
    private List<String> parts = Collections.emptyList();

    @Schema(description = "샘플정보")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private SampleInformation sampleInformation;
}
