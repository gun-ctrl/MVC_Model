package com.example.app1121.data.dp.network

/**
 *@Description
 *@Author PC
 *@QQ 1578684787
 */
class Network private constructor(){
    val bookDao =  BookDaoNetworkImpl()

    companion object{
        @Volatile private var instance: Network? = null
        fun getInstance() = instance ?: synchronized(this){
            instance ?: Network().also { instance = it }
        }
    }
}