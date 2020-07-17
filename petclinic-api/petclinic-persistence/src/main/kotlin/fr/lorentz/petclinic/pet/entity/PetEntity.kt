package fr.lorentz.petclinic.pet.entity

import javax.persistence.*

@Entity
@Table(name = "pet")
@SequenceGenerator(name="pet_sequence", initialValue=1, allocationSize = 1)
data class PetEntity(
        @Id @Column(name = "id") @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pet_sequence") val id: Int?,
        @Column(name = "name") val name: String,
        @Column(name = "species") val species: String,
        @Column(name = "birth_year") val birthYear: Int
)

fun PetEntity.toBusiness() : Pet {
    return Pet(
            id = this.id,
            name = this.name,
            species = this.species,
            birthYear = this.birthYear
    )
}

fun Pet.toEntity() : PetEntity {
    return PetEntity(
            id = this.id,
            name = this.name,
            species = this.species,
            birthYear = this.birthYear
    )
}