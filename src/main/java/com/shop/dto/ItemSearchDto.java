package com.shop.dto;

import com.shop.constant.ItemSellStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemSearchDto {

    private String searchDateType;

    private ItemSellStatus searchSellStatus;

    private String searchBy; //어떤 유형으로 조회할 지(itemNm 상품명/ createdBy 상품 등록자 아이디)

    private String searchQuery = "";
}
