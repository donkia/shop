package com.shop.dto;

import com.shop.entity.Item;
import com.shop.entity.ItemImg;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

/** 상품 이미지에 대한 데이터를 전달할 Dto
 * */
@Getter
@Setter
public class ItemImgDto {

    private Long id;

    private String imgName; //이미지 파일명
    private String oriImgName; //원본 이미지 파일명
    private String imgUrl; // 이미지 조회 경로
    private String repimgYn; // 대표 이미지 여부

    /** ModelMapper는 서로 다른 클래스의 값을 필드의 이름과 자료형이 같으면 
     * getter, setter를 통해 값을 복사해서 객체를 반환
     * */
    private static ModelMapper modelMapper = new ModelMapper();

    public static ItemImgDto of(ItemImg itemImg) {
        return modelMapper.map(itemImg, ItemImgDto.class);
    }

}
