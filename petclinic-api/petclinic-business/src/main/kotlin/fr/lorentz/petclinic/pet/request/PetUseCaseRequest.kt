package fr.lorentz.petclinic.pet.request

import fr.lorentz.petclinic.pet.entity.Pet

data class PetUseCaseRequest(val id: Int? = null, val name: String, val species: String, val birthYear: Int)

fun PetUseCaseRequest.toBusiness(): Pet {
    return Pet(id = this.id,
            name = this.name,
            species = this.species,
            birthYear = this.birthYear)
}