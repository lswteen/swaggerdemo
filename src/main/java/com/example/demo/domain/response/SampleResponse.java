package com.example.demo.domain.response;

import com.example.demo.domain.constant.DateTimeConstant;
import com.example.demo.domain.element.SampleInformation;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "샘플 Response")
public class SampleResponse {

    @Schema(description = "일련번호", example = "89998121")
    private long index;

    @Schema(description = "샘플정보")
    private SampleInformation sampleInformation;

    @Schema(description = "리스트", example = "[\"sampleAAA\", \"sampleBBB\"]")
    @Builder.Default
    private List<String> mockStrings = Collections.emptyList();

    @Schema(description = "리스트", example = "[\"100\", \"200\"]")
    @Builder.Default
    private List<Integer> mockNumbers = Collections.emptyList();

    @Schema(description = "생성일 날짜", example = "2022-08-08", type = "string")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DateTimeConstant.DEFAULT_DATE, timezone = DateTimeConstant.DEFAULT_ZONE)
    private LocalDate regDate;

    @Schema(description = "생성일 날짜시간", example = "2022-11-11 11:39:58", type = "string")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DateTimeConstant.DEFAULT_PATTERN, timezone = DateTimeConstant.DEFAULT_ZONE)
    private LocalDateTime regDateTime;
}
