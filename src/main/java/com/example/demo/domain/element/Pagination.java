package com.example.demo.domain.element;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.Min;

@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "공통 페이징")
public class Pagination {
    @Schema(description = "페이지 번호", example = "1")
    @Min(1)
    protected int pageIndex;

    @Schema(description = "페이지 열 개수", example = "10")
    protected int pageRowSize;
}
