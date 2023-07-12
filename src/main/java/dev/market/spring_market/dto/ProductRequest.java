package dev.market.spring_market.dto;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ProductRequest {
	@NotNull @Size(min = 1, max = 45)
    private String title;

	@NotNull
	private int price;

	@Size(min = 0, max = 255)
    private String contents;


	private List<ProductImgReqRes> productImages;
    
    @NotNull
    private Long categoryId;
    
    @Builder
    public ProductRequest(@NotNull @Size(min = 1, max = 45) String title, @NotNull int price,
    		@Size(min = 0, max = 255) String contents, List<ProductImgReqRes> productImages, @NotNull Long categoryId) {
    	super();
    	this.title = title;
    	this.price = price;
    	this.contents = contents;
    	this.productImages = productImages;
    	this.categoryId = categoryId;
    }
}
