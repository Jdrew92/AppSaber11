package com.misiontic.proyecto.database
import android.content.Context
import androidx.room.*
import com.misiontic.proyecto.Entities.Usuario
import com.misiontic.proyecto.dao.UsuarioDAO

@Database(entities = arrayOf(Usuario::class), version = 2)
abstract class Saber11Database:RoomDatabase() {
    abstract fun usuarioDao(): UsuarioDAO

    companion object{
        @Volatile
        private var INSTANCE: Saber11Database? = null

        fun getDatabase(context: Context): Saber11Database {
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(context.applicationContext,
                    Saber11Database::class.java,
                    "Saber11DB"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}