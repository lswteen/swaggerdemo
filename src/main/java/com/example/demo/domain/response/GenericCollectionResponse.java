package com.example.demo.domain.response;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GenericCollectionResponse <T> implements Serializable {

    // 페이지 번호
    private int pageIndex;

    // 페이지 열 개수
    private int pageRowSize;

    // 총 개수
    private int totalCount;

    // Collection
    private List<T> collection;
}
