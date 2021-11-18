package com.misiontic.proyecto.dao
import androidx.room.*
import com.misiontic.proyecto.Entities.Usuario

@Dao
interface UsuarioDAO {
    @Query("SELECT * FROM Usuario")
    suspend fun getAllUsuarios(): List<Usuario>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(u: Usuario): Long

    @Update
    suspend fun update(u: Usuario)

    @Delete
    suspend fun delete(u: Usuario)
}