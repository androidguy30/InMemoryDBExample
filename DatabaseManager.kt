package com.razorpay.bebettatest

import android.provider.ContactsContract.Data

class DatabaseManager {

   private val databaseCollection: HashMap<String,Database> = hashMapOf()

    @Synchronized
    fun createDatabase(name: String){
        databaseCollection.putIfAbsent(name, Database())
    }

    fun getDatabase(name: String): Database?{
        return databaseCollection.get(name)
    }

    @Synchronized
    fun deleteDatabase(name: String){
        databaseCollection.remove(name)
    }

    @Synchronized
    fun printData(){
        print("Print all data in Hashmap - $Gson().toJson(databaseCollection)")
    }

}

    fun main(){
        val databaseManager = DatabaseManager()
        databaseManager.createDatabase("Test")
    }