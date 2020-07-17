package fr.lorentz.petclinic.pet.response

import fr.lorentz.petclinic.pet.entity.Pet

data class PetResponse(val id: Int, val name: String, val species: String, val birthYear: Int)

fun Pet.toResponse() : PetResponse {
    return PetResponse(
            id = this.id!!,
            name = this.name,
            species = this.species,
            birthYear = this.birthYear
    )
}