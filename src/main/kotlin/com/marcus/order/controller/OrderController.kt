package com.marcus.order.controller

import com.marcus.order.domain.Order
import com.marcus.order.gateway.Person
import com.marcus.order.gateway.RestaurantGatewayV2
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/order")
class OrderController(val restaurantGateway: RestaurantGatewayV2) {
    @PostMapping("v1")
    fun createOrderv1(@RequestBody order: Order): List<Person> {
        return restaurantGateway.send(order)
    }
}