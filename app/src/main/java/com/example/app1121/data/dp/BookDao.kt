package com.example.app1121.data.dp

import com.example.app1121.data.dp.Book

/**
 *@Description
 *@Author PC
 *@QQ 1578684787
 */
interface BookDao {
    var bookList:MutableList<Book>
    fun getBooks():List<Book>
    fun addBook(book: Book)
}