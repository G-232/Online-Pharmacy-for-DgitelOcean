package com.example.onlinemedicine.dto.order.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderBucketRequestDto {
    private UUID ownerId;
    private Double price;
    private List<OrderProductRequestDto> orderProductRequestDtos;
}
