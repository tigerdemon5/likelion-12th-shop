package com.likelion12th.shop.dto;

import com.likelion12th.shop.entity.Order;
import com.likelion12th.shop.entity.OrderItem;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

@Getter
@Setter
public class OrderItemDto {
    private Long itemId;
    private String itemName;
    private Integer itemPrice;
    private Integer count;
    private int totalPrice;

    private static ModelMapper modelMapper = new ModelMapper();

    public static OrderItemDto of(OrderItem orderitem){
        OrderItemDto orderItemDto = modelMapper.map(orderitem, OrderItemDto.class);
        return orderItemDto;
    }
}