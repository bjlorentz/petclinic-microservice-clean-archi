package fr.lorentz.petclinic.pet.usecase

import fr.lorentz.petclinic.pet.response.PetResponse

interface ListPetsUseCase {
    fun listPets() : List<PetResponse>
}