package com.shop.repository;

import com.shop.dto.CartDetailDto;
import com.shop.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    CartItem findByCartIdAndItemId(Long cartId, Long itemId);

    /** DTO로 반환 할 때, 생성자를 이용해서 new 키워드, 해당 DTO의 패키지, 클래스명을 적어줌
     *  또한 생성자의 파라미터 순서는 DTO 클래스에 명시한 순으로 넣어야 함
     * */
    @Query("select new com.shop.dto.CartDetailDto(ci.id, i.itemNm, i.price, ci.count, im.imgUrl)"
            + "from CartItem ci, ItemImg im join ci.item i where ci.cart.id = :cartId"
            + " and im.item.id = ci.item.id and im.repimgYn = 'Y' order by ci.regTime desc")
    List<CartDetailDto> findCartDetailDtoList(Long cartId);
}
