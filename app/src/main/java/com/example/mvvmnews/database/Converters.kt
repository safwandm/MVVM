package com.example.mvvmnews.database

import androidx.room.TypeConverter
import com.example.mvvmnews.model.Source

class Converters {

    @TypeConverter
    fun fromsource(souce: Source): String{
        return souce.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}