package com.misiontic.proyecto.room_db
import androidx.room.*
import com.misiontic.proyecto.Entities.Usuario

@Dao
interface UsuarioDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(u: Usuario): Long

    @Update
    suspend fun update(u: Usuario)

    @Delete
    suspend fun delete(u: Usuario)
}