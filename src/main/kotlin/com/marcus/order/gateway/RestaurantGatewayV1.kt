package com.marcus.order.gateway

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PostMapping

@FeignClient("restaurantv1", url = "$/{restaurant}")
interface RestaurantGatewayV1 {
    @PostMapping()
    fun send()
}