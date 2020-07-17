package fr.lorentz.resources

import fr.lorentz.petclinic.pet.response.PetResponse

data class PetResource(val id: Int, val name: String, val species: String, val birthYear: Int)

fun PetResponse.toResource(): PetResource {
    return PetResource(
            id = this.id,
            name = this.name,
            species = this.species,
            birthYear = this.birthYear
    )
}