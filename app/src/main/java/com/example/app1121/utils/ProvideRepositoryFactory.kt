package com.example.app1121.utils

import com.example.app1121.data.dp.BookRepository
import com.example.app1121.data.dp.dp.Database

/**
 *@Description
 *@Author PC
 *@QQ 1578684787
 */
object ProvideRepositoryFactory {
    fun getRepository():BookRepository{
        val dao = Database.getInstance().bookDao
        return BookRepository.getInstance(dao)
    }
}