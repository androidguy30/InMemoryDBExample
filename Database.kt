package com.razorpay.bebettatest

data class Database(
    private val database: HashMap<String, Table> = hashMapOf()
) {
    fun createTable(tableName: String) {
        database.putIfAbsent(tableName, Table())
    }

    fun deleteTable(tableName: String) {
        database.remove(tableName)
    }

}