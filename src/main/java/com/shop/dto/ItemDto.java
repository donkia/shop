package com.shop.dto;

import com.shop.constant.ItemSellStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
import java.time.LocalDateTime;

@Getter
@Setter

public class ItemDto {

    private Long id;

    private String itemNm;

    private int price;

    private String itemDetail;

    private String sellStatCd;

    private LocalDateTime regTime;
    private LocalDateTime updateTime;
}
