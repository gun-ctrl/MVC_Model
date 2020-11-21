package com.example.app1121.data.dp.dp

/**
 *@Description
 *@Author PC
 *@QQ 1578684787
 */
class Database private constructor(){
    val bookDao = BookDaoDbImpl()
    companion object{
        //被volatile关键字修饰的变量是被禁止重排序的
        @Volatile private var instance: Database? = null
        fun getInstance() = instance ?: synchronized(this){
            instance ?: Database().also { instance = it }
        }
    }
}