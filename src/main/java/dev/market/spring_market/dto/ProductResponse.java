package dev.market.spring_market.dto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ProductResponse {

    private String title;

    private int price;

    private String contents;

    private LocalDateTime createdAt;

    private List<ProductImgReqRes> productImages;

    private Long categoryId;
}
