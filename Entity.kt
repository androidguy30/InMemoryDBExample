package com.razorpay.bebettatest

import java.lang.Exception

data class Entity(
    private val isRequired: Boolean = false,
    private  val value: Any?)
{
    init {
        if(isRequired && value == null){
            throw Exception("Required value cannot be null")
        }

        if(!InMemoryHelper.isEntityValid(value ?: null,isRequired)){
            throw Exception("Illegal data type")
        }
    }

}
