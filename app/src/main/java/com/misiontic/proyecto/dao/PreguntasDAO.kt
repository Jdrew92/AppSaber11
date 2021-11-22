package com.misiontic.proyecto.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.misiontic.proyecto.model.Pregunta


@Dao
interface PreguntasDAO {
    //Generamos las operaciones de la BDs

    //Select
    @Query( "SELECT * FROM pregunta")
    fun getAll() : LiveData<List<Pregunta>>

    @Query ( "SELECT * FROM pregunta where materia = :materia")
    fun getItemsXMateria(materia: String) : List<Pregunta>

    @Query ( "SELECT * FROM pregunta WHERE id = :id")
    fun getPregunta( id: Int) : Pregunta

    @Insert
    fun insert(pregunta: Pregunta)

    @Update
    fun actualizar(pregunta: Pregunta)

    @Delete
    fun eliminar(pregunta: Pregunta)
}