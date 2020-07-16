package fr.lorentz.petclinic.pet.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "pet")
data class PetEntity(
        @Id @Column(name = "id") val id: Int,
        @Column(name = "name") val name: String)

fun PetEntity.toBusiness() : Pet {
    return Pet(
            id = this.id,
            name = this.name
    )
}