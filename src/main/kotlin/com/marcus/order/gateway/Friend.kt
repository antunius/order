package com.marcus.order.gateway

data class Friend(val id: Int, val name: String)

data class Person(
    val _id: String,
    val index: Int,
    val guid: String,
    val isActive: Boolean,
    val balance: String,
    val picture: String,
    val age: Int,
    val eyeColor: String,
    val name: String,
    val gender: String,
    val company: String,
    val email: String,
    val phone: String,
    val address: String,
    val about: String,
    val registered: String,
    val latitude: Double,
    val longitude: Double,
    val tags: List<String>,
    val friends: List<Friend>,
    val greeting: String,
    val favoriteFruit: String
)
