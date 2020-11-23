package com.example.app1121.data.dp

import com.example.app1121.data.dp.dp.Database

/**
 *@Description
 *@Author PC
 *@QQ 1578684787
 */

class BookRepository private constructor(private val bookDao: BookDao){

    companion object{
        @Volatile private var instance: BookRepository? = null
        fun getInstance(dao: BookDao) = instance ?: synchronized(this){
            instance ?: BookRepository(dao).also { instance = it }
        }
    }

    fun getBooks(): List<Book>{
        return bookDao.getBooks()
    }

    fun addBook(book: Book){
        bookDao.addBook(book)
    }
}