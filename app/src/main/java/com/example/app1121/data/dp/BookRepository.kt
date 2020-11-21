package com.example.app1121.data.dp

import com.example.app1121.data.dp.dp.Database

/**
 *@Description
 *@Author PC
 *@QQ 1578684787
 */
//不要睡觉不要睡觉 不要走神不要走神
class BookRepository private constructor(){
    //val bookDao = Network.getInstance().bookDao
    private val bookDao = Database.getInstance().bookDao

    companion object{
        @Volatile private var instance: BookRepository? = null
        fun getInstance() = instance ?: synchronized(this){
            instance ?: BookRepository().also { instance = it }
        }
    }

    fun getBooks(): List<Book>{
        return bookDao.getBooks()
    }

    fun addBook(book: Book){
        bookDao.addBook(book)
    }
}