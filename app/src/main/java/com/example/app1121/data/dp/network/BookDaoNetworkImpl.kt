package com.example.app1121.data.dp.network

import com.example.app1121.data.dp.BookDao
import com.example.app1121.data.dp.Book

/**
 *@Description
 *@Author PC
 *@QQ 1578684787
 */
class BookDaoNetworkImpl: BookDao {
    override var bookList: MutableList<Book> = mutableListOf()

    override fun getBooks(): List<Book> {
        return bookList
    }

    override fun addBook(book: Book) {
        bookList.add(book)
    }

}