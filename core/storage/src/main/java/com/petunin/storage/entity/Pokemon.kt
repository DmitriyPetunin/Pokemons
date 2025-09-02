package com.petunin.storage.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.petunin.storage.entity.PokemonEntity.Companion.POKEMON_TABLE_NAME


@Entity(
    tableName = POKEMON_TABLE_NAME,
)
class PokemonEntity(
    @PrimaryKey
    val id: Int,
    val name: String,
    val image_url: String

) {
    companion object{
        const val POKEMON_TABLE_NAME = "pokemon"
    }
}