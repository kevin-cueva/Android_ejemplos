package com.example.recyclerview
import com.example.recyclerview.SuperHero

/*Esta clase es para poder acceder a la lista desde la actividad
* Continene un companion object para poder acceder a los elementos
* desde otro script*/
class SuperHeroPrivider {
    companion object{
        val superHeroList = listOf<SuperHero>(
            SuperHero(
                "KotlinMan",
                "Jetbrains",
                "AristiDevs",
                "https://cursokotlin.com/wp-content/uploads/2020/07/cursoheaderfb-300x150.jpg"
            ),
            SuperHero(
                "KotlinMan",
                "Jetbrains",
                "AristiDevs",
                "https://cursokotlin.com/wp-content/uploads/2020/07/suscr%c3%adbete-300x169.jpg"
            )
        )
    }
}