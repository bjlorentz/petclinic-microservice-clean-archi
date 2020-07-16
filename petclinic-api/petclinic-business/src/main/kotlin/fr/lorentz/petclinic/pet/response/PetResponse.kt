package fr.lorentz.petclinic.pet.response

import fr.lorentz.petclinic.pet.entity.Pet

data class PetResponse(val id: Int, val name: String)

fun Pet.toResponse() : PetResponse {
    return PetResponse(
            id = this.id,
            name = this.name
    )
}