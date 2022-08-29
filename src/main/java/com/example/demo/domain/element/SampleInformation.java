package com.example.demo.domain.element;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "샘플 informaion")
public class SampleInformation {
    @Schema(description = "가격", example = "1000")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer price;

    @Schema(description = "제목", example = "테스트샘플제목입니다.")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String title;

    @Schema(description = "유저ID", example = "sampleUser01")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String userId;
}
