package com.razorpay.bebettatest

object InMemoryHelper {

    fun isEntityValid(value: Any?,isRequired:Boolean): Boolean {
        if (!(value is Int || value is String)) {
            return false
        }

        if (value is Int) {
            val tempValue = value
            if (tempValue !in -100..100) {
                return false
            }
        } else {
            // Assuming that isRequired is true then the checks should run else should be skipped.
            if(!isRequired) {
                val tempValue = value as String
                if (tempValue.length > 20) {
                    return false
                }
            }
        }
        return true
    }

}