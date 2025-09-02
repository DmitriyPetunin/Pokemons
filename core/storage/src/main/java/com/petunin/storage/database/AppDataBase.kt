package com.petunin.storage.database

import androidx.room.Database
import com.petunin.storage.entity.PokemonEntity

@Database(
    entities = [PokemonEntity::class],
    version = 1,
    exportSchema = true
)
abstract class AppDataBase {

}