package com.marcus.order.gateway

import com.marcus.order.domain.Order
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PostMapping

@FeignClient("restaurantv2", url = "\${restaurantv2}/restaurant")
interface RestaurantGatewayV2 {
    @PostMapping("/order", consumes = ["application/json"])
    fun send(order: Order): List<Person>
}